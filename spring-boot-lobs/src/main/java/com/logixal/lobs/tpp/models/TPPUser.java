package com.logixal.lobs.tpp.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TPP_USER")
public class TPPUser {

	@NotNull
	@Id
	@Column(name="CLIENT_ID")
	private String clientId;
	
	@Column(name="CLIENT_NAME")
	private String clientName;
	
	@NotNull
	@Column(name="CLIENT_DESC")
	private String clientDescription;
	
	@Column(name="CLIENT_KEY")
	private String clientKey;
	
	@Column(name="REGISTRATION_DATE")
	private Date registrationDate;
	
	@Column(name="STATUS")
	private String status;
	
	@NotNull
	@Column(name="REDIRECT_URI")
	private String redirectURI;
	
	@Column(name="OPTION1")
	private String option1;
	
	@Column(name="OPTION2")
	private String option2;
	
	@Column(name="OPTION3")
	private String option3;
	
	@Column(name="SSA_ID")
	private String ssaId;
	
	@Column(name="ROLE_ID")
	private Long roleId;
	
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;
	
	@Column(name="IS_ACTIVE")
	private String isActive;
	
	@NotNull
	@OneToMany(mappedBy="tppUser", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<TPPUserService> tppUserService= new ArrayList<TPPUserService>();
	
	@Transient
	private String scope;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientDescription() {
		return clientDescription;
	}

	public void setClientDescription(String clientDescription) {
		this.clientDescription = clientDescription;
	}

	public String getClientKey() {
		return clientKey;
	}

	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRedirectURI() {
		return redirectURI;
	}

	public void setRedirectURI(String redirectURI) {
		this.redirectURI = redirectURI;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getSsaId() {
		return ssaId;
	}

	public void setSsaId(String ssaId) {
		this.ssaId = ssaId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public List<TPPUserService> getTppUserService() {
		return tppUserService;
	}

	public void setTppUserService(List<TPPUserService> tppUserService) {
		this.tppUserService = tppUserService;
	}

	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

}
