package com.myco.service.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages={"com.myco"})
@ImportResource("classpath:/spring/context.xml")
public class ServiceTestConfig {

}