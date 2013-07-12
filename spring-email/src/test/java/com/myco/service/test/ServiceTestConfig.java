package com.myco.service.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
//import org.springframework.context.annotation.Import;
//import org.springframework.context.annotation.Profile;
//import com.ancestry.dna.fulfillment.service.config.ServiceConfiguration;

@Configuration
@ComponentScan(basePackages={"com.myco"})
//@Import(ServiceConfiguration.class)
@ImportResource("classpath:/spring/context.xml")
//@Profile("dev")
public class ServiceTestConfig {

}