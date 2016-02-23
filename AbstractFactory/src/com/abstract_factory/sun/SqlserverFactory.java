package com.abstract_factory.sun;

/**
 * 实现IFactory，实例化SqlserverUser。实例化SqlserverDepartment
 * 
 * @author sunxiaoling
 * 
 */
public class SqlserverFactory implements IFactory {

	@Override
	public IUser createIUser() {
		return new SqlserverUser();
	}

	@Override
	public IDepartment createIDepartment() {
		return new SqlserverDepartment();
	}

}
