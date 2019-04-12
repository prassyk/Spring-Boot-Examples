/**
 * 
 */
package com.logixal.lobs.audit.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.logixal.lobs.audit.model.AuditLog;
import com.logixal.lobs.audit.repository.AuditLogRepository;
import com.logixal.lobs.audit.util.Context;
import com.logixal.lobs.audit.util.LobsThreadLocal;
import com.logixal.lobs.tpp.model.TPPUser;

@Aspect
@Component
public class AuditAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(AuditAspect.class);
	
	@Autowired
	private AuditLogRepository auditLogRepository;
	
	@AfterReturning(pointcut = "execution(* com.logixal.lobs..*.* (..)) && @annotation(auditAnnotation)")
	public void auditingAfterReturning(Audit auditAnnotation) {
		logger.debug("Start of auditingAfterReturning: " + auditAnnotation.value());
		Context ctx = LobsThreadLocal.get();
		
		if(!StringUtils.isEmpty(ctx) && "tppUser".equals(ctx.getAudit())) {
			logger.debug("Audit: " + ctx.getAudit());
			TPPUser tppUser = ctx.getTppUser();
			if(!StringUtils.isEmpty(tppUser)){
				AuditLog auditLog = new AuditLog();
				auditLog.setClientId(tppUser.getClientId());
				auditLog.setStatus("Complete");
				auditLog.setDescription(tppUser.getClientDescription());
				logger.debug("Saving " + ctx.getAudit() + " to AuditLog table.");
				auditLogRepository.save(auditLog);
			}
		}

		logger.debug("End of auditingAfterReturning: " + auditAnnotation.value());
	}

	@AfterThrowing(pointcut = "execution(* com.logixal.lobs..*.* (..)) && @annotation(auditAnnotation)")
	public void auditingAfterThrowing(Audit auditAnnotation) {
		logger.debug("Start of auditingAfterThrowing: " + auditAnnotation.value());
		Context ctx = LobsThreadLocal.get();
		
		if(!StringUtils.isEmpty(ctx) && "tppUser".equals(ctx.getAudit())) {
			logger.debug("Audit: " + ctx.getAudit());
			TPPUser tppUser = ctx.getTppUser();
			if(!StringUtils.isEmpty(tppUser)){
				AuditLog auditLog = new AuditLog();
				auditLog.setClientId(tppUser.getClientId());
				auditLog.setStatus("Complete");
				auditLog.setDescription(tppUser.getClientDescription());
				// Add code for error Code, error message
				auditLogRepository.save(auditLog);
			}
		}
		
		logger.debug("End of auditingAfterThrowing: " + auditAnnotation.value());
	}

		
}