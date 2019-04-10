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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.logixal.lobs.audit.Auditable;
//-----------------------------------------------------------------------------
@Table(name = "MST_MENU")
@Entity
public class 
	Menu
extends
	Auditable<String>
{
	//-------------------------------------------------------------------------
    @Id
    @Column(name = "MENU_CODE")
    private String menuCode;

    @Column(name = "MENU_NAME")
    private String menuName;
    
    @OneToOne
    @JoinColumn(name = "USER_TYPE")
    private UserType userType;
    //-------------------------------------------------------------------------
	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
    //-------------------------------------------------------------------------
}
//-----------------------------------------------------------------------------
//End of file
//-----------------------------------------------------------------------------