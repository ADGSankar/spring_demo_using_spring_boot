package com.example.springex.spring_demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springex.spring_demo.cdi.SomeCDIBusiness;

@SpringBootApplication
public class SpringCDIApplication {

	private static Logger logging = LoggerFactory.getLogger(SpringCDIApplication.class);
	
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = SpringApplication.run(SpringCDIApplication.class, args);
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
		
		logging.info("{} dao-{}",business,business.getSomeCdiDao());
	}

}
