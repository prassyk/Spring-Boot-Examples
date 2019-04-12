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

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class 
	JpaConfig 
{

	@Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }

}