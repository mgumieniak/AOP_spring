package com.AOP.AOPspring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class ExampleAspect {

//    @Before("execution(* com.AOP.AOPspring.rest.exampleController.exampleEndpoint())")
//    public void doBefore() {
//        log.info("ASPECT : BEFORE");
//    }
//
//    @Around("@annotation(com.AOP.AOPspring.aop.TrackTime)")
//    public void annptaton() {
//        log.info("ASPECT : ANNOTATION!");
//    }
//
//    @AfterThrowing(value = "execution(* com.AOP.AOPspring.rest.exampleController.exception())", throwing = "ex")
//    public void doRecoveryActions(IllegalArgumentException ex) {
//        log.info("Execute in ASPECT: " + ex.getMessage());
//    }

    @AfterThrowing(value = "com.AOP.AOPspring.aop.CommonJoinPointConfig.AuditLogLayerExecution()", throwing = "ex")
    public void annotationPlusException() {
        log.info("ONLY DOUBLE ASPECT: ");
    }
}

// AfterReturning