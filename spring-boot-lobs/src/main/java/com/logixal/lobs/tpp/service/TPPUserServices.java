package com.logixal.lobs.tpp.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logixal.lobs.audit.aspect.Audit;
import com.logixal.lobs.audit.util.Context;
import com.logixal.lobs.audit.util.LobsThreadLocal;
import com.logixal.lobs.tpp.model.TPPUser;
import com.logixal.lobs.tpp.model.TPPUserResponse;
import com.logixal.lobs.tpp.model.TPPUserService;
import com.logixal.lobs.tpp.model.TPPUserServiceId;
import com.logixal.lobs.tpp.repository.TPPUserRepository;

@Service
public class TPPUserServices {

	private static final Logger logger = LoggerFactory.getLogger(TPPUserServices.class);

	@Autowired
	private TPPUserRepository tppUserRepo;
	
	@Transactional
	@Audit("tppUser")
	public TPPUserResponse register(TPPUser tppUser) throws Exception {
		
		logger.debug("Start of register()");
		Context ctx = new Context();
		ctx.setAudit("tppUser");
		ctx.setTppUser(tppUser);
		LobsThreadLocal.set(ctx);
		tppUser.setClientId(tppUser.getClientName().substring(0, 2)
				+String.format("%04d", new Random().nextInt(10000)));
		tppUser.setClientKey(UUID.randomUUID().toString());
		tppUser.setIsActive("Active");
		tppUser.setRegistrationDate(new Date());
		tppUser.setExpiryDate(getExpiryDate(new Date(), 365));
		
		String serviceName = tppUser.getScope();
		String[] serviceList = serviceName.split(",");
		List<TPPUserService> tppServiceList = new ArrayList<TPPUserService>();
		
		for(String sName : serviceList) {
			TPPUserServiceId tppId = new TPPUserServiceId();
			TPPUserService tppService = new TPPUserService();
			tppId.setServiceCode(sName);
			tppId.setClientId(tppUser.getClientId());
			tppService.setTppUserServiceId(tppId);
			tppServiceList.add(tppService);
		}
		
		tppUser.setTppUserService(tppServiceList);
		
		TPPUserResponse response =new TPPUserResponse();
		response.setClientId(tppUser.getClientId());
		response.setClientSecret(tppUser.getClientKey());
		response.setSetIssuedAt(tppUser.getRegistrationDate().toString());
		response.setSetParam(tppUser.getExpiryDate().toString());
		
		 tppUserRepo.save(tppUser);
		 logger.debug("End of register()");
		 return response;
	}
	
	public static Date getExpiryDate(
	        Date date, int days){
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}
}
