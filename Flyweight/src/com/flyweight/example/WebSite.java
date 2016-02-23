package com.flyweight.example;

//ÍøÕ¾
public class WebSite {
	private String name = "";

	public WebSite(String name) {
		this.name = name;
	}

	public void use() {
		System.out.println("ÍøÕ¾·ÖÀà£º" + name);
	}
}
