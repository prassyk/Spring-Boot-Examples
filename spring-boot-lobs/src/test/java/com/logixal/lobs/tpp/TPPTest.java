package com.logixal.lobs.tpp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.logixal.lobs.tpp.model.TPPUser;
import com.logixal.lobs.tpp.service.TPPUserServices;


@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan(basePackages="com.logixal.lobs")
public class TPPTest {
	
	@Autowired
	TPPUserServices tppuserservice;
	
	@Test
	@Rollback
	public void RegisterTPP() throws Exception {
		
		TPPUser tppUser = new TPPUser();
		tppUser.setClientName("BING");
		tppUser.setClientDescription("Bing INC");
		tppUser.setRedirectURI("www.tppuser.com");
		tppUser.setScope("AC1");
		
		tppuserservice.register(tppUser);
   }
}