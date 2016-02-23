package com.abstract_factory.sun;

/**
 * 用与客户端访问，解除与具体数据库访问的耦合
 * 
 * @author sunxiaoling
 * 
 */
public interface IDepartment {
	public void insert(Department department);

	public Department getDepartment(int id);
}
