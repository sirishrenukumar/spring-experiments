package com.netapp.ocum;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware{
	
	private Logger logger = Logger.getLogger(SpringBean.class);

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		logger.info("setApplicationContext");
		
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		
	}

}
