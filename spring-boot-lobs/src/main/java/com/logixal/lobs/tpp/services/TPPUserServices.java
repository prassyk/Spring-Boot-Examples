package com.logixal.lobs.tpp.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logixal.lobs.tpp.models.TPPUser;
import com.logixal.lobs.tpp.models.TPPUserResponse;
import com.logixal.lobs.tpp.models.TPPUserService;
import com.logixal.lobs.tpp.models.TPPUserServiceId;
import com.logixal.lobs.tpp.repository.TPPUserRepository;
import com.logixal.lobs.tpp.repository.TPPUserServiceRepositroy;

@Service
public class TPPUserServices {

	@Autowired
	TPPUserRepository TPPUserRepo;
	
	@Autowired
	TPPUserServiceRepositroy tppuserservicerepo;
	
	public TPPUserResponse register(TPPUser tppuser) {

		tppuser.setClientId(tppuser.getClientName().substring(0, 2)
				+String.format("%04d", new Random().nextInt(10000)));
		tppuser.setClientKey(UUID.randomUUID().toString());
		tppuser.setIsActive("A");
		tppuser.setRegistrationDate(new Date());
		tppuser.setExpiryDate(getExpiryDate(new Date(), 365));
		
		String serviceName = tppuser.getScope();
		String[] serviceList = serviceName.split(",");
		List<TPPUserService> tppServiceList = new ArrayList<TPPUserService>();
		
		for(String sName : serviceList) {
			
			TPPUserServiceId tppId = new TPPUserServiceId();
			TPPUserService tppService = new TPPUserService();
			tppId.setServiceCode(sName);
			tppId.setClientId(tppuser.getClientId());
			tppService.setTppUserServiceId(tppId);
			tppServiceList.add(tppService);
		}
		
		tppuser.setTppUserService(tppServiceList);
		
		TPPUserResponse response =new TPPUserResponse();
		response.setClientId(tppuser.getClientId());
		response.setClientSecret(tppuser.getClientKey());
		response.setSetIssuedAt(tppuser.getRegistrationDate().toString());
		response.setSetParam(tppuser.getExpiryDate().toString());
		
		 TPPUserRepo.save(tppuser);
		 return response;
	}
	
 //------------------------------------------------------------------------------
	
	public static Date getExpiryDate(
	        Date date, int days){
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
	
		return cal.getTime();
	}
}
