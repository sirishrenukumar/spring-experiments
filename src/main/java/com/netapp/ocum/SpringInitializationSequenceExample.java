package com.netapp.ocum;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringInitializationSequenceExample {
	
	class Car implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, MessageSourceAware{
		
		private Logger logger = Logger.getLogger(Car.class);
		
		@Autowired
		private Engine engine;
		
		@Autowired
		private Chassis chassis;
		
		Car() {
			logger.info("Car Constructor");
		}

		public void setMessageSource(MessageSource messageSource) {
			logger.info("setMessageSource");
			
		}

		public void setApplicationContext(ApplicationContext applicationContext)
				throws BeansException {
			logger.info("setApplicationContext");
			
		}

		public void setBeanFactory(BeanFactory beanFactory)
				throws BeansException {
			logger.info("setBeanFactory");
			
		}

		public void setBeanName(String name) {
			logger.info("setBeanName");
			
		}
		
		@PostConstruct
		public void init() {
			logger.info("init");
			
		}
	}
	class Engine {
		private Logger logger = Logger.getLogger(Engine.class);
		Engine() {
			logger.info("Engine Constructor");
		}
	}
	class Chassis {
		private Logger logger = Logger.getLogger(Chassis.class);
		Chassis() {
			logger.info("Chassiss Constructor");
		}
	}
	
	
	@Bean
	public Car car(){
		return new Car();
	}
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
	@Bean
	public Chassis chassis() {
		return new Chassis();
	}

}
