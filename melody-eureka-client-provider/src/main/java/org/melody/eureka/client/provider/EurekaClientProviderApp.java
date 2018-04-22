package org.melody.eureka.client.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient // 声明为euraeka客户端
@SpringBootApplication
public class EurekaClientProviderApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaClientProviderApp.class, args);
	}

}
