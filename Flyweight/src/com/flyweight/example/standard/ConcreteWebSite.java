package com.flyweight.example.standard;

//具体网站类
public class ConcreteWebSite extends WebSite {
	private String name = "";

	public ConcreteWebSite(String name) {
		this.name = name;
	}

	// 实现“use”方法
	@Override
	public void use(User user) {
		System.out.println("网站分类：" + name + " 用户：" + user.getName());
	}

}
