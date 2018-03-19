package com.wzy.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
  
@Aspect    //Aspct注解
@Component  //必须加上compoent,否则切面不会执行
public class CheckUser {  
  
    @Pointcut("execution(* com.wzy.service.*.find*(..))")  
    public void checkUser(){  
        System.out.println("**************The System is Searching Information For You****************");   //不会被执行
    }  
      
    @Pointcut("execution(* com.wzy.service.*.add*(..))")  
    public void checkAdd(){  
        System.out.println("**************<< Add User >> Checking.....***************");    //不会被执行
    }  
      
    @Before("checkUser()")  
    public void beforeCheck(){  
        System.out.println(">>>>>>>> 准备搜查用户..........");  
    }  
      
    @After("checkUser()")  
    public void afterCheck(){  
        System.out.println(">>>>>>>>　搜查用户完毕..........");  
    }  
  
    @Before("checkAdd()")  
    public void beforeAdd(){  
        System.out.println(">>>>>>>>　增加用户--检查ing..........");  
    }  
      
    @After("checkAdd()")  
    public void afterAdd(){  
        System.out.println(">>>>>>>>　增加用户--检查完毕！未发现异常!..........");  
    }  
}  