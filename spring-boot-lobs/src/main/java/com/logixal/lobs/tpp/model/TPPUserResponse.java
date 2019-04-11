package com.logixal.lobs.tpp.model;

public class TPPUserResponse {

	private String clientId;
	
	private String ClientSecret;
	
	private String setIssuedAt;
	
	private String setParam;

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
	 * @return the clientSecret
	 */
	public String getClientSecret() {
		return ClientSecret;
	}

	/**
	 * @param clientSecret the clientSecret to set
	 */
	public void setClientSecret(String clientSecret) {
		ClientSecret = clientSecret;
	}

	/**
	 * @return the setIssuedAt
	 */
	public String getSetIssuedAt() {
		return setIssuedAt;
	}

	/**
	 * @param setIssuedAt the setIssuedAt to set
	 */
	public void setSetIssuedAt(String setIssuedAt) {
		this.setIssuedAt = setIssuedAt;
	}

	/**
	 * @return the setParam
	 */
	public String getSetParam() {
		return setParam;
	}

	/**
	 * @param setParam the setParam to set
	 */
	public void setSetParam(String setParam) {
		this.setParam = setParam;
	}

}
