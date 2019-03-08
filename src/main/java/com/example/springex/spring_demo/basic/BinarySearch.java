package com.example.springex.spring_demo.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)// or @Scope("prototype")
public class BinarySearch {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgo sortAlgo;
	
//	
//	
//	public BinarySearch(SortAlgo sa) {
//		super();
//		this.bubbleSortAlgo = sa;
//	}
//
//
//	public void setSa(SortAlgo sa) {
//		this.bubbleSortAlgo = sa;
//	}
//


	public int BinarySearching(int a[],int key)
	{
//		BubbleSortAlgo bsa=new BubbleSortAlgo();
		int num[]=sortAlgo.sort(a);
		System.out.println(sortAlgo);
		return 3;
		//just a quick code for example
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	@PreDestroy
	public void preDestroy(){
		logger.info(" hello preDestroy");
	}
	
}
