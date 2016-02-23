package com.abstract_factory.sun;

/**
 * ʵ��IFactory��ʵ����SqlserverUser��ʵ����SqlserverDepartment
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
