package cn.test.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.test.springcloud.entities.Dept;

/**
 * 添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
 * 
 * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id 也就是说这个接口是不支持重载的
 * 
 */
@Mapper
public interface DeptDao {
	// 加入@mapper和@insert注解后 可以不用写mapper.xml文件

	// @Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE());")
	boolean addDept(Dept dept);

	// @Select("select deptno,dname,db_source from dept where deptno=#{deptno};")
	Dept findById(Long id);

	// @Select("select deptno,dname,db_source from dept;")
	List<Dept> findAll();
}
