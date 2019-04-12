package com.logixal.lobs.tpp.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logixal.lobs.audit.aspect.Audit;
import com.logixal.lobs.tpp.model.TPPUser;
import com.logixal.lobs.tpp.model.TPPUserResponse;
import com.logixal.lobs.tpp.model.TPPUserService;
import com.logixal.lobs.tpp.model.TPPUserServiceId;
import com.logixal.lobs.tpp.repository.TPPUserRepository;

@Service
public class TPPUserServices {

	@Autowired
	private TPPUserRepository tppUserRepo;
	
	@Audit("tppUser")
	public TPPUserResponse register(TPPUser tppUser) {

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
