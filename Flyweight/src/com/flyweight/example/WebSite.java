package com.flyweight.example;

//��վ
public class WebSite {
	private String name = "";

	public WebSite(String name) {
		this.name = name;
	}

	public void use() {
		System.out.println("��վ���ࣺ" + name);
	}
}
