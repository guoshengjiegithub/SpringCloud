package cn.test.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.test.springcloud.dao.DeptDao;
import cn.test.springcloud.entities.Dept;
import cn.test.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean addDept(Dept dept) {
		// TODO Auto-generated method stub
		return deptDao.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return deptDao.findAll();
	}

}
