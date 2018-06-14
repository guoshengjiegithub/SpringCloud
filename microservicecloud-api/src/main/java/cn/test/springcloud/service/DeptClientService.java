package cn.test.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.test.springcloud.entities.Dept;

/**
 * feign是一个声明式的web服务客户端,使用编写web服务客户端非常简单,只需一个接口和一个注解
 * 
 * @author Administrator
 *
 */
//@FeignClient(value="MICROSERVICECLOUD-DEPT")

//这里的方法出错了以后 去找DeptClientServiceFallbackFactory方法的create()
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	/**
	 * 根据@RequestMapping定义的地址去响应的provier中的controller中去找方法
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public Boolean add(Dept dept);
	
//	Eutrka 服务注册与发现
//	ribbon   负载均衡  Irule 自定义算法 extends  AbstractLoadBalancerRule 使用@loadBalanced
//	feign 声明式的web服务客户端, 相当于是restTemplete+
//	hystrix
}
