package com.techtransactions.info.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.techtransactions.info.bussiness.ChanduTechBussiness;

@Component
public class BussinessRunner implements  CommandLineRunner {

	@Autowired
	private ChanduTechBussiness chanduBissiness;
	@Override
	public void run(String... args) throws Exception {
		chanduBissiness.myBusiiness();		
	}

}
