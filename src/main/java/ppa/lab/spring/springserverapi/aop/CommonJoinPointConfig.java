package ppa.lab.spring.springserverapi.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import ppa.lab.spring.springserverapi.service.api.SimplePersonService;

@Component
public class CommonJoinPointConfig {
    private SimplePersonService simplePersonService;

    @Pointcut("execution(* ppa.lab.spring.springserverapi.service.api.SimplePersonService.*(..))")
    public void beforeSimplePersonService () {}
}
