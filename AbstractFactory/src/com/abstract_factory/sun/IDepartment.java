package com.abstract_factory.sun;

/**
 * ����ͻ��˷��ʣ������������ݿ���ʵ����
 * 
 * @author sunxiaoling
 * 
 */
public interface IDepartment {
	public void insert(Department department);

	public Department getDepartment(int id);
}
