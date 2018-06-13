package cn.test.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.config.client.ConfigClientProperties.Discovery;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import cn.test.springcloud.entities.Dept;
import cn.test.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return service.addDept(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery() {
		//获取服务名称
		List<String> services = client.getServices();
		System.out.println("************"+services);
		List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
		for(ServiceInstance element:instances){
			System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
		}
		return this.client;
	}
	
	
}
