package com.creditharmony.loan.aops.intercepor;

import java.lang.reflect.Proxy;
import java.util.Stack;

import org.junit.Test;

public class TestMain {

@Test
public void test3(){
	Stack<Interceptor> interceptorStack =new Stack<>();
    interceptorStack.add(new LogInterceptor());
    interceptorStack.add(new TransactionInterceptor()); 
    Target target = new TargetImpl();
    target = (Target) Proxy.newProxyInstance(target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),new TargetProxy(target,interceptorStack));
    target.execute();
}

}
