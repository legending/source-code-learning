package com.legend.scls;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext();
        User user = (User) ctx.getBean("user1", User.class);
        System.out.println(user.getName());*/

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.setConfigLocation("beans.xml");
        ctx.refresh();
        User user = (User) ctx.getBean("user1", User.class);
        System.out.println(user.getName());

    }

}
