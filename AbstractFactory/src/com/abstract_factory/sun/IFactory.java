package com.abstract_factory.sun;

/**
 * ����һ����������User�����ĳ���Ĺ����ӿ�
 * 
 * @author sunxiaoling
 * 
 */
public interface IFactory {
	IUser createIUser();

	IDepartment createIDepartment();
}
