package com.flyweight.example.standard;

import java.util.Hashtable;

//网站工厂类
public class WebSiteFactory {
	private Hashtable<String, ConcreteWebSite> flyweights = new Hashtable<>();

	// 获得网站分类
	public WebSite getWebSiteCategory(String key) {
		if (!flyweights.contains(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return flyweights.get(key);
	}

	// 获得网站分类总数
	public int getWebSiteCount() {
		return flyweights.size();
	}
}
