package com.example.springex.spring_demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCDIBusiness {

	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}
