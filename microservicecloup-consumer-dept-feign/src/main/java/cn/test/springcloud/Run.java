package cn.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"cn.test.springcloud"})
@ComponentScan("cn.test.springcloud")
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
