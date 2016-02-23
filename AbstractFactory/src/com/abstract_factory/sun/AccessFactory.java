package com.abstract_factory.sun;

/**
 * 实现IFactory，实例化AccessUser。实例化AccessDepartment
 * 
 * @author sunxiaoling
 * 
 */
public class AccessFactory implements IFactory {

	@Override
	public IUser createIUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createIDepartment() {
		return new AccessDepartment();
	}

}
