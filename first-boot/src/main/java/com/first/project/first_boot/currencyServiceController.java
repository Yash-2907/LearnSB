package com.first.project.first_boot;

import java.lang.module.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class currencyServiceController {
      @Autowired
      private currencyConfigurationService configurationService;
      
      @RequestMapping("/currency-service")
      private currencyConfigurationService getConfig() {
    	  return configurationService;
      }
}
