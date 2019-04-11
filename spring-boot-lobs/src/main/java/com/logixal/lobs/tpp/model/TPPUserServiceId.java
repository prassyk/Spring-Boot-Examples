package com.logixal.lobs.tpp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TPPUserServiceId implements Serializable {

	private static final long serialVersionUID = -3322661567056184032L;

	@Column(name = "CLIENT_ID")
	private String clientId;
	
	@Column(name = "SERVICE_CODE")
	private String serviceCode;

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
	 * @return the serviceCode
	 */
	public String getServiceCode() {
		return serviceCode;
	}

	/**
	 * @param serviceCode the serviceCode to set
	 */
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
		
}
