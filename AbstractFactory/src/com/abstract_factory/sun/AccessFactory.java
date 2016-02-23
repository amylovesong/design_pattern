package com.abstract_factory.sun;

/**
 * ʵ��IFactory��ʵ����AccessUser��ʵ����AccessDepartment
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
