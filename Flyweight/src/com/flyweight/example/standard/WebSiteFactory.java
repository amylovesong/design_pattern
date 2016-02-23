package com.flyweight.example.standard;

import java.util.Hashtable;

//��վ������
public class WebSiteFactory {
	private Hashtable<String, ConcreteWebSite> flyweights = new Hashtable<>();

	// �����վ����
	public WebSite getWebSiteCategory(String key) {
		if (!flyweights.contains(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return flyweights.get(key);
	}

	// �����վ��������
	public int getWebSiteCount() {
		return flyweights.size();
	}
}
