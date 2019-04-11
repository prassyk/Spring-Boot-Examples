package com.logixal.lobs.tpp.models;

public class TPPUserResponse {

	private String clientId;
	
	private String ClientSecret;
	
	private String setIssuedAt;
	
	private String setParam;

   //--------------------------------------------------------------------------
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return ClientSecret;
	}

	public void setClientSecret(String clientSecret) {
		ClientSecret = clientSecret;
	}

	public String getSetIssuedAt() {
		return setIssuedAt;
	}

	public void setSetIssuedAt(String setIssuedAt) {
		this.setIssuedAt = setIssuedAt;
	}

	public String getSetParam() {
		return setParam;
	}

	public void setSetParam(String setParam) {
		this.setParam = setParam;
	}
}
