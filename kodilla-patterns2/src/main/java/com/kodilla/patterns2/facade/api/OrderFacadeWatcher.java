package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns2.aop.calculator.Watcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void LogEvent() {
        LOGGER.info("Method processOrder() has been called");
    }
}
