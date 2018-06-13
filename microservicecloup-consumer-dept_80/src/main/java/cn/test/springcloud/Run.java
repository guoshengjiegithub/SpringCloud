package cn.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cn.test.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//MySelfRule类不可以在@CompoentScan注解包和自包中
@RibbonClient(name="MICROSERVICECLOUD-DEPT" ,configuration=MySelfRule.class)
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
