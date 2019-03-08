package com.example.springex.spring_demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springex.spring_demo.basic.BinarySearch;

@SpringBootApplication
public class SpringDemoApplication {

//	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoApplication.class);
	
	public static void main(String[] args) {
//		BinarySearch bs=new BinarySearch(new QuickSortAlgo());
	
		/*
		 * ApplicationContext applicationContext =
		 * SpringApplication.run(SpringDemoApplication.class, args); PersonDAO
		 * personDao1 = applicationContext.getBean(PersonDAO.class); PersonDAO
		 * personDao2= applicationContext.getBean(PersonDAO.class);
		 */
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		BinarySearch bs1=applicationContext.getBean(BinarySearch.class);
		BinarySearch bs2=applicationContext.getBean(BinarySearch.class);
		System.out.println(bs1);
		System.out.println(bs2);
		int res=bs1.BinarySearching(new int[] {1,2,3}, 3);
		System.out.println(res);
	  
		
	}

}
