package com.abstract_factory.sun;

/**
 * 定义一个创建访问User表对象的抽象的工厂接口
 * 
 * @author sunxiaoling
 * 
 */
public interface IFactory {
	IUser createIUser();

	IDepartment createIDepartment();
}
