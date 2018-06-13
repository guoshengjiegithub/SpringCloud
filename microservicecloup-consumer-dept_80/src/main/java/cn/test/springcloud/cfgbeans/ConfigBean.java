package cn.test.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
// 相同于 applicationContext.xml
public class ConfigBean {

	@Bean
	@LoadBalanced	//负载均衡  ribbon 默认是轮询算法
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule(){
//		return new RoundRobinRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询
		return new RandomRule();
//		return new RetryRule(); //轮询,如果其中一个节点挂了,会再链接2次,下次就不会再访问了
	}

	// public UserService getUserService(){
	// return new UserServiceImpl();
	// }
	// <bean id="getUserService" class="...UserServiceImpl"/>
}
