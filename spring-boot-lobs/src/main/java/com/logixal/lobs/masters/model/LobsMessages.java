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

package com.logixal.lobs.masters.model;
//-----------------------------------------------------------------------------
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.logixal.lobs.audit.Auditable;

@Table(name = "LOBS_MESSAGES")
@Entity
public class 
	LobsMessages
extends
	Auditable<String>
{
	//-------------------------------------------------------------------------
    @Id
    @Column(name = "LOBS_MESSAGE_CODE")
    private String messageCode;

    @Column(name = "LOBS_MESSAGE_NAME")
    private String messageName;
    //-------------------------------------------------------------------------
	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
    //-------------------------------------------------------------------------
}
//-----------------------------------------------------------------------------
// End of file
//-----------------------------------------------------------------------------