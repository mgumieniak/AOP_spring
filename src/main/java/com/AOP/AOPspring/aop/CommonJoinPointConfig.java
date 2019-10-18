package com.AOP.AOPspring.aop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.AOP.AOPspring.rest.exampleController.exception()) && @annotation(com.AOP.AOPspring.aop.TrackTime)")
    public void AuditLogLayerExecution(){}
}
