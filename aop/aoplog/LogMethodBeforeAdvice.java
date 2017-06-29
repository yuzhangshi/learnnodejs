package com.creditharmony.loan.aops.aoplog;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class LogMethodBeforeAdvice implements MethodBeforeAdvice {

	private static Logger logger = Logger.getLogger(LogMethodBeforeAdvice.class);
	@Override
	public void before(Method arg0, Object[] arg1, Object target)
			throws Throwable {
		String args = "";
		if(arg1 != null) {
			for(int i = 0; i < arg1.length; ++i) {
				if(i != arg1.length - 1) {
					args += arg1[i] + ",";
				} else {
					args += arg1[i];
				}
			}
		}
		logger.info(arg0.getName() + "方法开始执行,参数为[" + args + "]");
System.out.println("开始");
	}

}
