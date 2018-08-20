/**
 * Copyright Yotta Ltd 2017-2018
 */
package com.yotta.mdmc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenhuaquan
 *
 */
@Configuration
@EnableAutoConfiguration
@RestController
public class Application {

	@Value("${config.name}")
	String name = "World";
	
	@RequestMapping("/")
	public String home() {
		return "Hello " + name;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
