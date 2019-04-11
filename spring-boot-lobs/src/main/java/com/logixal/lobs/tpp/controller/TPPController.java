package com.logixal.lobs.tpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logixal.lobs.tpp.model.TPPUserResponse;
import com.logixal.lobs.tpp.model.TPPUser;
import com.logixal.lobs.tpp.service.TPPUserServices;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@CrossOrigin
@RestController
@RequestMapping("/registerTPP")
public class TPPController {
	
	@Autowired
	private TPPUserServices TPPUserService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST ,consumes = "application/json", produces = "application/json")
	@ApiOperation(value= "Initiates request for registering third party client with Open banking server")
	public ResponseEntity<TPPUserResponse> register(
			@RequestBody TPPUser tppUser,
			@ApiParam(name="clientName",value = "", required = true)  final String clientName,
	        @ApiParam(name="clientDesc",value = "", required = true)  final String clientDesc,
	        @ApiParam(name="redirectURI",value = "", required = true) final String redirectURI,
	        @ApiParam(name="type",value = "", required = false)  final String type,
	        @ApiParam(name="scope",value = "", required = true)  final String scope,
	        @ApiParam(name="createdBy",value = "", required = true)  final String createdBy,
	        @ApiParam(name="clientUrl",value = "", required = false)  final String client_url,
	        @ApiParam(name="tokenEndpointAuthMethod", value = "", required = false)  final String tokenEndpointAuthMethod){
			
			TPPUserResponse response = null;
			
			try {
				response =  TPPUserService.register(tppUser);
			    return ResponseEntity.status(HttpStatus.OK).body(response);
					
			} catch(Exception e) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response); 
		    }
	   }
}
