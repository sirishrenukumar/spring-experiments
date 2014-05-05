package com.netapp.ocum;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringLifecycleCallbacksExample implements InitializingBean, DisposableBean {
	
	private Logger logger = Logger.getLogger(SpringLifecycleCallbacksExample.class);
	
	public void initialization() {
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	public void destruction() {
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	public void afterPropertiesSet() throws Exception {
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}
	public void destroy() throws Exception {
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@PreDestroy
	public void preDestroy() {
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
}
