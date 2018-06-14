package cn.tset.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 未完成
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableConfigServer
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
