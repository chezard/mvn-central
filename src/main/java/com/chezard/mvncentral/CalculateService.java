package com.chezard.mvncentral;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculateService {

    private static final Logger log = LoggerFactory.getLogger(CalculateService.class);

    public void calculate() {
        log.info("CalculateService.calculate() called");
    }

}
