package com.abstract_factory.sun;

import com.abstract_factory.example.User;

/**
 * User�ӿڣ����ڿͻ��˷��ʣ������������ݿ���ʵ����
 * 
 * @author sunxiaoling
 * 
 */
public interface IUser {
	public void insert(User user);

	public User getUser(int id);
}
