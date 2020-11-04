package com.legend.scls;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) ctx.getBean("user1");
        System.out.println(user.getName());
    }

}
