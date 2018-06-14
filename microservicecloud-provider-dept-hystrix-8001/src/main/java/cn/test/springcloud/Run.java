package cn.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册进Eureka服务中
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker //对Hystrix熔断器的支持
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}