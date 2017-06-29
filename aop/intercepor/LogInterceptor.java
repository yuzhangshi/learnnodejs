package com.creditharmony.loan.aops.intercepor;


public class LogInterceptor implements Interceptor{
    @Override
    public void intercept(){
        System.out.println("日志记录开始");
    } 

}
