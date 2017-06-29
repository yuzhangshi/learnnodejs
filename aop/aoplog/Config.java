package com.creditharmony.loan.aops.aoplog;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.creditharmony.loan.aops.beannameautoproxy.MyMethodInterceptor;

@Configuration
public class Config {
	 //要创建代理的目标Bean  
    @Bean
    public TestDao testDao(){  
        return new TestDao();  
    }  
    //要创建代理的目标Bean  
    @Bean
    public UserService userService(){  
        return new UserServiceImpl();  
    }  
    //创建Advice或Advisor  
    @Bean  
    public Advice myMethodInterceptor(){  
        return new MyMethodInterceptor();  
    }  
    //创建Advice或Advisor  
    @Bean  
    public Advice logMethodBeforeAdvice(){  
        return new LogMethodBeforeAdvice();  
    }  
    
    //创建Advice或Advisor  
    @Bean  
    public Advice logMethodAfterReturningAdvice(){  
        return new LogMethodAfterReturningAdvice();  
    }  
    //使用BeanNameAutoProxyCreator来创建代理  
    @Bean  
    public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){  
        BeanNameAutoProxyCreator beanNameAutoProxyCreator=new BeanNameAutoProxyCreator();  
        //设置要创建代理的那些Bean的名字  
        beanNameAutoProxyCreator.setBeanNames("userService","testDao");  
      
        //设置拦截链名字(这些拦截器是有先后顺序的)  
        beanNameAutoProxyCreator.setInterceptorNames("logMethodBeforeAdvice","logMethodAfterReturningAdvice" );  
        return beanNameAutoProxyCreator;  
    }  
}
