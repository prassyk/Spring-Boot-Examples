/*
 * This source is part of the Logixal's Software Product. 
 * Copyright 2018, Logixal and/or its affiliates.  All rights reserved. 
 * 
 * No part of this work may be reproduced, stored in a retrieval system, 
 * adopted or transmitted in any form or by any means, electronic, mechanical, 
 * photographic, graphic, optic recording or otherwise, translated in any 
 * language or computer language, without the prior written permission 
 * of Logixal and/or its affiliates. 
 * 
 * Logixal Solutions Private Limited
 * 401-406, A Wing, Sagar Tech Plaza,
 * Sakinaka Junction,
 * Andheri-Kurla Road, Andheri East,
 * Mumbai - 400 072, India.
 * 
 * Modification History
 * 
 * Date			Version		Author			Description
 * ____________________________________________________________________________
 * 12-Apr-2019	1.0			Prasanna		Initial Version.
 * ____________________________________________________________________________
*/

package com.logixal.lobs.audit.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.logixal.lobs.audit.Auditable;

@Entity
@Table(name = "AUDIT_LOG")
public class AuditLog extends Auditable<String> {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="AUDIT_LOG_SEQ_GEN")
    @SequenceGenerator(name="AUDIT_LOG_SEQ_GEN", sequenceName="AUDIT_LOG_SEQ")
    @Column(name = "AUDIT_LOG_ID")
    private Long auditLogId;

    @Column(name = "CLIENT_ID")
    private String clientId;
    
    @Column(name = "BUSINESS_USER_ID")
    private String businessUserId;
    
    @Column(name = "LOBS_USER_ID")
    private Long lobsUserId;
    
    @Column(name = "STATUS")
    private String status;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "REQUEST_API")
    private String requestApi;
    
    @Column(name = "REQUEST")
    private String resquest;
    
    @Column(name = "RESPONSE")
    private String response;
    
    @Column(name = "ERROR_CODE")
    private String errorCode;
    
    @Column(name = "ERROR_DESC")
    private String errorDesc;
    
    @Column(name = "REQUEST_TIME")
    private Timestamp requestTime;
    
    @Column(name = "RESPONSE_TIME")
    private Timestamp responseTime;
    
    @Column(name = "TOKEN1")
    private String token1;
    
    @Column(name = "TOKEN2")
    private String token2;
    
    @Column(name = "TOKEN3")
    private String token3;

	/**
	 * @return the auditLogId
	 */
	public Long getAuditLogId() {
		return auditLogId;
	}

	/**
	 * @param auditLogId the auditLogId to set
	 */
	public void setAuditLogId(Long auditLogId) {
		this.auditLogId = auditLogId;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the businessUserId
	 */
	public String getBusinessUserId() {
		return businessUserId;
	}

	/**
	 * @param businessUserId the businessUserId to set
	 */
	public void setBusinessUserId(String businessUserId) {
		this.businessUserId = businessUserId;
	}

	/**
	 * @return the lobsUserId
	 */
	public Long getLobsUserId() {
		return lobsUserId;
	}

	/**
	 * @param lobsUserId the lobsUserId to set
	 */
	public void setLobsUserId(Long lobsUserId) {
		this.lobsUserId = lobsUserId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the requestApi
	 */
	public String getRequestApi() {
		return requestApi;
	}

	/**
	 * @param requestApi the requestApi to set
	 */
	public void setRequestApi(String requestApi) {
		this.requestApi = requestApi;
	}

	/**
	 * @return the resquest
	 */
	public String getResquest() {
		return resquest;
	}

	/**
	 * @param resquest the resquest to set
	 */
	public void setResquest(String resquest) {
		this.resquest = resquest;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorDesc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}

	/**
	 * @param errorDesc the errorDesc to set
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	/**
	 * @return the requestTime
	 */
	public Timestamp getRequestTime() {
		return requestTime;
	}

	/**
	 * @param requestTime the requestTime to set
	 */
	public void setRequestTime(Timestamp requestTime) {
		this.requestTime = requestTime;
	}

	/**
	 * @return the responseTime
	 */
	public Timestamp getResponseTime() {
		return responseTime;
	}

	/**
	 * @param responseTime the responseTime to set
	 */
	public void setResponseTime(Timestamp responseTime) {
		this.responseTime = responseTime;
	}

	/**
	 * @return the token1
	 */
	public String getToken1() {
		return token1;
	}

	/**
	 * @param token1 the token1 to set
	 */
	public void setToken1(String token1) {
		this.token1 = token1;
	}

	/**
	 * @return the token2
	 */
	public String getToken2() {
		return token2;
	}

	/**
	 * @param token2 the token2 to set
	 */
	public void setToken2(String token2) {
		this.token2 = token2;
	}

	/**
	 * @return the token3
	 */
	public String getToken3() {
		return token3;
	}

	/**
	 * @param token3 the token3 to set
	 */
	public void setToken3(String token3) {
		this.token3 = token3;
	}
    
}
