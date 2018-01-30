package com.chy.springcloudadminclient;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringCloudAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAdminServerApplication.class, args);
	}




}
