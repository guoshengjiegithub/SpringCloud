package cn.test.springcloud.service;

import java.util.List;

import cn.test.springcloud.entities.Dept;

public interface DeptService {

	boolean addDept(Dept dept);

	Dept findById(Long id);

	List<Dept> findAll();
}
