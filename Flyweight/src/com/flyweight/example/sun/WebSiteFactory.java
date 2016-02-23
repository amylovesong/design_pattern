package com.flyweight.example.sun;

import java.util.Hashtable;

//网站工厂
public class WebSiteFactory {
	private Hashtable<String, ConcreteWebSite> flyweights = new Hashtable<>();

	// 获得网站分类
	public WebSite getWebSiteCategory(String key) {
		// 判断是否存在这个对象，如果存在，则直接返回，若不存在，则实例化它再返回
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
