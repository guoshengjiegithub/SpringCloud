package cn.test.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@Data   //get and set 
@NoArgsConstructor //无参构造方法
@AllArgsConstructor//有参构造方法
@Accessors(chain=true)//使用链式方法 dept.setDeptno(1L).setDname("").setDb_source("");
public class Dept implements Serializable {

	private Long deptno; // 主键
	private String dname;// 部门名称
	private String db_source;// 来自哪个数据库

	
	public static void main(String[] args) {
		Dept dept=new Dept();
		dept.setDeptno(1L).setDname("").setDb_source("");
	}
}
