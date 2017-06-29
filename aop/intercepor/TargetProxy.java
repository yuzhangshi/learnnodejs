package com.creditharmony.loan.aops.intercepor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Stack;

public class TargetProxy  implements InvocationHandler{
    private   Target target;
    private Stack<Interceptor> interceptorStack;
     
    public TargetProxy( Target target, Stack<Interceptor> interceptorStack) {
        this.target = target;
        this.interceptorStack = interceptorStack;
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        for(Interceptor interceptor:interceptorStack){
            interceptor.intercept();
        }
        return method.invoke(target, args);
    } 

}
