package com.chain_of_responsibility.example.refactor;

import com.chain_of_responsibility.example.Request;

//管理者
public abstract class Manager {
	protected String name;
	// 管理者的上级
	protected Manager superior;

	public Manager(String name) {
		this.name = name;
	}

	// 设置管理者的上级
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	public abstract void requestApplications(Request request);
}
