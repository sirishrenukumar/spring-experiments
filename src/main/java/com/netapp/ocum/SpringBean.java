package com.netapp.ocum;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor{
	
	private Logger logger = Logger.getLogger(SpringBean.class);

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		logger.info("setApplicationContext" +  applicationContext.getApplicationName());
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		logger.info("setBeanFactory");
	}

	public void setBeanName(String arg0) {
		logger.info("setBeanName");
	}

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		logger.info("postProcessAfterInitialization");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		logger.info("postProcessBeforeInitialization");
		return arg0;
	}
	
	
}
