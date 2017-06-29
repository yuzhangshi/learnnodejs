package com.creditharmony.loan.aops.dymicproxy;

public class UserManagerImplProxy implements UserManager{  
  
  
    private UserManager userManager;  
      
    public UserManagerImplProxy(UserManager userManager){  
        this.userManager = userManager;  
    }  
      
    @Override  
    public void addUser(String userId, String userName) {  
        try {  
            System.out.println("开始执行");  
            userManager.addUser(userId, userName);  
            System.out.println("执行成功！");  
        }catch(Exception e) {  
            e.printStackTrace();  
            System.out.println("执行失败！");  
        }             
    }  

}
