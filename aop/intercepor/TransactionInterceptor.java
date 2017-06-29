package com.creditharmony.loan.aops.intercepor;


public class TransactionInterceptor implements Interceptor {
    @Override
    public void intercept() {
        System.out.println("事务开启");
    } 

}
