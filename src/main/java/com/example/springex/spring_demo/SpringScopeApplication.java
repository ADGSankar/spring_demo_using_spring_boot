package com.example.springex.spring_demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springex.spring_demo.basic.BinarySearch;
import com.example.springex.spring_demo.scope.PersonDAO;

@SpringBootApplication
public class SpringScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);
	
	public static void main(String[] args) {
//		BinarySearch bs=new BinarySearch(new QuickSortAlgo());
	
		ApplicationContext applicationContext = SpringApplication.run(SpringScopeApplication.class, args);
		PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2= applicationContext.getBean(PersonDAO.class);

		//		BinarySearch bs=applicationContext.getBean(BinarySearch.class);
//		BinarySearch bs1=applicationContext.getBean(BinarySearch.class);
//		System.out.println("\nbs  : "+bs);
//		System.out.println("bs1 : "+bs1);
//		int res=bs.BinarySearching(new int[] {1,2,3}, 3);
//		System.out.println("result is : "+res);
	  
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",personDao1.getJdbcConnection());
		LOGGER.info("{}",personDao1.getJdbcConnection());
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}

}
