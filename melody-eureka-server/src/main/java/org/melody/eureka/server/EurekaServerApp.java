package org.melody.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  // 注册为eureka服务端
@SpringBootApplication
public class EurekaServerApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServerApp.class, args);
	}

}
