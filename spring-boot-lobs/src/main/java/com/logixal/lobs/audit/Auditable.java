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
 * 10-Apr-2019	1.0			Jitendra		Initial Version.
 * ____________________________________________________________________________
*/
//-----------------------------------------------------------------------------
package com.logixal.lobs.audit;
//-----------------------------------------------------------------------------
import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//-----------------------------------------------------------------------------
@SuppressWarnings("hiding")
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class 
	Auditable<String> 
{
	//-------------------------------------------------------------------------
	@CreatedBy
    protected String CREATED_BY;
	
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date CREATED_DATE;
   
    @LastModifiedBy
    protected String UPDATED_BY;
    
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date UPDATED_DATE;
	//-------------------------------------------------------------------------
	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String p_CREATED_BY) {
		CREATED_BY = p_CREATED_BY;
	}

	public Date getCREATED_DATE() {
		return CREATED_DATE;
	}

	public void setCREATED_DATE(Date p_CREATED_DATE) {
		CREATED_DATE = p_CREATED_DATE;
	}

	public String getUPDATED_BY() {
		return UPDATED_BY;
	}

	public void setUPDATED_BY(String p_UPDATED_BY) {
		UPDATED_BY = p_UPDATED_BY;
	}

	public Date getUPDATED_DATE() {
		return UPDATED_DATE;
	}

	public void setUPDATED_DATE(Date p_UPDATED_DATE) {
		UPDATED_DATE = p_UPDATED_DATE;
	}
	//-------------------------------------------------------------------------
}
//-----------------------------------------------------------------------------
// End of file
//-----------------------------------------------------------------------------