package com.chezard.mvncentral;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    private static final Logger log = LoggerFactory.getLogger(CalculateService.class);

    public static void calculate() {
        log.info("CalculateService.calculate() called");
    }

}
