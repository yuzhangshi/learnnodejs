package com.creditharmony.loan.aops.aoplog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	 public static void main(String[] args) {  
	        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);  
	        UserService userService= applicationContext.getBean(UserService.class);  
	        userService.print();  
	        
	        TestDao testDao =applicationContext.getBean(TestDao.class);  
	        testDao.pringDao();
	    }  
}
