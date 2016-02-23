package com.abstract_factory.sun;

import com.abstract_factory.example.User;

/**
 * User接口，用于客户端访问，解除与具体数据库访问的耦合
 * 
 * @author sunxiaoling
 * 
 */
public interface IUser {
	public void insert(User user);

	public User getUser(int id);
}
