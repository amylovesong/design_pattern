package com.flyweight.example.sun;

//具体网站类
public class ConcreteWebSite extends WebSite {
	private String name = "";

	public ConcreteWebSite(String name) {
		this.name = name;
	}

	@Override
	public void use() {
		System.out.println("网站分类：" + name);
	}

}
