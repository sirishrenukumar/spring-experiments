package com.netapp.ocum;

import org.apache.log4j.Logger;

public class AnotherSpringBean{
	private Logger logger = Logger.getLogger(AnotherSpringBean.class);
	
	public void init() {
		
		logger.info("init");
		
	}
}
