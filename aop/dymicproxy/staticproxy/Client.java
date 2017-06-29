package com.creditharmony.loan.aops.dymicproxy.staticproxy;

public class Client {
	 /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());  
        userManager.addUser("0111", "张三");  
    }  
}
