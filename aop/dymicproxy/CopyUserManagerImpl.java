package com.creditharmony.loan.aops.dymicproxy;

public class CopyUserManagerImpl  implements UserManager {  
  
    public void addUser(String userId, String userName) {  
          
        try {  
            //System.out.println("开始执行");  
            System.out.println("HelloWorld!");  
            //System.out.println("执行成功！");  
        }catch(Exception e) {  
            e.printStackTrace();  
            //System.out.println("执行失败！");  
            throw new RuntimeException();  
        }     
    }  
}
