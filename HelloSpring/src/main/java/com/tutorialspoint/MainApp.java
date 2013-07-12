package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        GoodbyeWorld bye = (GoodbyeWorld) context.getBean("goodbyeWorld");

        System.out.println("Time to get to it:");
        System.out.print("\t");
        obj.getMessage();
        System.out.println("\t" + bye.getFarewellMessage());

    }

}