package com.creditharmony.loan.aops.intercepor;

public class TargetImpl  implements Target {
    @Override
    public void execute() {
        System.out.println("execute");
    } 

}
