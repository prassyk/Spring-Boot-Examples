package com.logixal.lobs.audit.util;

import com.logixal.lobs.tpp.model.TPPUser;

public class Context {
	
	private String audit;
	
	private TPPUser tppUser;
	
	//private LobsUser lobsUser;
	
	//private BusinessUser businessUser;

	/**
	 * @return the audit
	 */
	public String getAudit() {
		return audit;
	}

	/**
	 * @param audit the audit to set
	 */
	public void setAudit(String audit) {
		this.audit = audit;
	}

	/**
	 * @return the tppUser
	 */
	public TPPUser getTppUser() {
		return tppUser;
	}

	/**
	 * @param tppUser the tppUser to set
	 */
	public void setTppUser(TPPUser tppUser) {
		this.tppUser = tppUser;
	}
/*
	public LobsUser getLobsUser() {
		return lobsUser;
	}

	public void setLobsUser(LobsUser lobsUser) {
		this.lobsUser = lobsUser;
	}

	public BusinessUser getBusinessUser() {
		return businessUser;
	}

	public void setBusinessUser(BusinessUser businessUser) {
		this.businessUser = businessUser;
	}
*/
}
