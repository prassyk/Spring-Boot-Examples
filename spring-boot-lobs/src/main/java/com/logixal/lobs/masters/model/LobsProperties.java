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
 * 10-Apr-2019	1.0			Akshay		Initial Version.
 * ____________________________________________________________________________
*/
//-----------------------------------------------------------------------------
package com.logixal.lobs.masters.model;
//-----------------------------------------------------------------------------
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.logixal.lobs.audit.Auditable;
//-----------------------------------------------------------------------------
@Table(name = "MST_LOBS_PROPERTIES")
@Entity
public class 
	LobsProperties
extends
	Auditable<String>
{
	//-------------------------------------------------------------------------
    @Id
    @Column(name = "PROP_CODE")
    private String propCode;

    @Column(name = "PROP_VALUE")
    private String propValue;

    //-------------------------------------------------------------------------
	public String getPropCode() {
		return propCode;
	}

	public void setPropCode(String p_propCode) {
		propCode = p_propCode;
	}

	public String getPropValue() {
		return propValue;
	}

	public void setPropValue(String p_propValue) {
		propValue = p_propValue;
	}
}
//-----------------------------------------------------------------------------
// End of file
//-----------------------------------------------------------------------------