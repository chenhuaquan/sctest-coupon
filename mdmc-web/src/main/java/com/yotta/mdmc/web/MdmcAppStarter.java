package com.yotta.mdmc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.yotta.mdmc.web")
@EntityScan("com.yotta.mdm.web")
@EnableAutoConfiguration
@EnableScheduling
public class MdmcAppStarter {

    private static final Logger logger = LoggerFactory.getLogger(MdmcAppStarter.class);

    public static void main(String[] args) {
        String className = MdmcAppStarter.class.getName();
        logger.info("application {} begin......", className);
        SpringApplication.run(MdmcAppStarter.class, args);
        logger.info(" application {} started finished.", className);
    }

}
