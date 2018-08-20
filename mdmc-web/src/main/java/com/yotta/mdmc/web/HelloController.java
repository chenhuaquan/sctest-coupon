/**
 * Copyright Yotta Ltd 2017-2018
 */
package com.yotta.mdmc.web;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author chenhuaquan
 *
 */
@RestController
public class HelloController {
	private final Logger logger = Logger.getLogger(getClass());
	
	
	@Autowired
	private Registration registration;

	@Autowired
	private DiscoveryClient client;
	
	@Value("${world.name}")
	private String wld;
	
	@GetMapping("/hello")
	public String index() {
		
		List<ServiceInstance> list = client.getInstances(registration.getServiceId());
		if (list != null && list.size() > 0) {
			ServiceInstance instance = list.get(0);
			logger.info("provider service, host = " + instance.getHost() + ", service_id = " + instance.getServiceId());
		}
		
		return "Hello " + wld;
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome " + wld;
	}
	

}
