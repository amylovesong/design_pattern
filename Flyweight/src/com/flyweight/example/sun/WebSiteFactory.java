package com.flyweight.example.sun;

import java.util.Hashtable;

//��վ����
public class WebSiteFactory {
	private Hashtable<String, ConcreteWebSite> flyweights = new Hashtable<>();

	// �����վ����
	public WebSite getWebSiteCategory(String key) {
		// �ж��Ƿ�����������������ڣ���ֱ�ӷ��أ��������ڣ���ʵ�������ٷ���
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
