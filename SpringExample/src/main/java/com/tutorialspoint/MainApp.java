package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld helloA = (HelloWorld) context.getBean("helloWorld");
        helloA.setMessage("I'm object A");
        GoodbyeWorld byeA = (GoodbyeWorld) context.getBean("goodbyeWorld");
        byeA.setFarewellMessage("Later gator!");

        System.out.println("First set:");
        System.out.println("\t" + helloA.getMessage());
        System.out.println("\t" + byeA.getFarewellMessage());

        System.out.println("Second set:");

        HelloWorld helloB = (HelloWorld) context.getBean("helloWorld");
        GoodbyeWorld byeB = (GoodbyeWorld) context.getBean("goodbyeWorld");

        System.out.println("\t" + helloB.getMessage());
        System.out.println("\t" + byeB.getFarewellMessage());

    }

}