package com.creditharmony.loan.aops.aoplog;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LogMethodAfterReturningAdvice implements AfterReturningAdvice {
	private static Logger logger = Logger.getLogger(LogMethodAfterReturningAdvice.class);

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		logger.info(method.getName() + "执行结果为" + returnValue);
		System.out.println("结束");
	}

}
