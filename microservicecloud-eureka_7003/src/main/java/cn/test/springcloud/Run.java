package cn.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * .Eureka (you rui ka) 主管服务注册与发现  。采用了c-s设计架构,Eureka Server作为注册功能的服务器,他是服务注册中心。
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaServer  //Eureka服务端启动类，接受其他微服务注册进来
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
