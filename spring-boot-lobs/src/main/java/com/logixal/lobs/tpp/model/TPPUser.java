package com.logixal.lobs.tpp.model;

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
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the clientDescription
	 */
	public String getClientDescription() {
		return clientDescription;
	}

	/**
	 * @param clientDescription the clientDescription to set
	 */
	public void setClientDescription(String clientDescription) {
		this.clientDescription = clientDescription;
	}

	/**
	 * @return the clientKey
	 */
	public String getClientKey() {
		return clientKey;
	}

	/**
	 * @param clientKey the clientKey to set
	 */
	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
	}

	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
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
	 * @return the redirectURI
	 */
	public String getRedirectURI() {
		return redirectURI;
	}

	/**
	 * @param redirectURI the redirectURI to set
	 */
	public void setRedirectURI(String redirectURI) {
		this.redirectURI = redirectURI;
	}

	/**
	 * @return the option1
	 */
	public String getOption1() {
		return option1;
	}

	/**
	 * @param option1 the option1 to set
	 */
	public void setOption1(String option1) {
		this.option1 = option1;
	}

	/**
	 * @return the option2
	 */
	public String getOption2() {
		return option2;
	}

	/**
	 * @param option2 the option2 to set
	 */
	public void setOption2(String option2) {
		this.option2 = option2;
	}

	/**
	 * @return the option3
	 */
	public String getOption3() {
		return option3;
	}

	/**
	 * @param option3 the option3 to set
	 */
	public void setOption3(String option3) {
		this.option3 = option3;
	}

	/**
	 * @return the ssaId
	 */
	public String getSsaId() {
		return ssaId;
	}

	/**
	 * @param ssaId the ssaId to set
	 */
	public void setSsaId(String ssaId) {
		this.ssaId = ssaId;
	}

	/**
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the isActive
	 */
	public String getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the tppUserService
	 */
	public List<TPPUserService> getTppUserService() {
		return tppUserService;
	}

	/**
	 * @param tppUserService the tppUserService to set
	 */
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
