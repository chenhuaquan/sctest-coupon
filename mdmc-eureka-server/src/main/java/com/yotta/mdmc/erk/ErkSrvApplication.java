/**
 * Copyright Yotta Ltd 2017-2018
 */
package com.yotta.mdmc.erk;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenhuaquan
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ErkSrvApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ErkSrvApplication.class).web(true).run(args);
	}
}
