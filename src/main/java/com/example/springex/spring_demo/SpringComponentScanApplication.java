package com.example.springex.spring_demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.springex.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("package com.example.springex.componentscan")
public class SpringComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);
	
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);
		ComponentDAO componentDao1 = applicationContext.getBean(ComponentDAO.class);
//		ComponentDAO componentDao2= applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",componentDao1);
//		LOGGER.info("{}",componentDao1.getComponentJdbcConnection());
//		LOGGER.info("{}",componentDao1.getComponentJdbcConnection());
//		LOGGER.info("{}",componentDao2);
//		LOGGER.info("{}",componentDao2.getComponentJdbcConnection());
//		LOGGER.info("{}",componentDao2.getComponentJdbcConnection());
	}

}
