package com.example.springex.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}

	

}
