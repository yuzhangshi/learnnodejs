package com.creditharmony.loan.aops.dymicproxy;

public class Client {
	 /** 
     * @param args 
     */  
    public static void main(String[] args) {  
    	LogHandler handler = new LogHandler();
        UserManager userManager =(UserManager) handler.newProxyInstance(new UserManagerImpl());
        userManager.addUser("op11", "张三");  
    }  
}
