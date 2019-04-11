package com.logixal.lobs.tpp.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.logixal.lobs.audit.Auditable;

@Entity
@Table(name="TPP_USER_SERVICE")
public class TPPUserService extends Auditable<String>{
	
	@EmbeddedId
	private TPPUserServiceId tppUserServiceId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID", insertable=false, updatable=false)
    private TPPUser tppUser;

	public TPPUserServiceId getTppUserServiceId() {
		return tppUserServiceId;
	}

	public void setTppUserServiceId(TPPUserServiceId tppUserServiceId) {
		this.tppUserServiceId = tppUserServiceId;
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
	
}
