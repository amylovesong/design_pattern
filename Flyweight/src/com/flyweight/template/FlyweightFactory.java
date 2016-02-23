package com.flyweight.template;

import java.util.Hashtable;

//Flyweight����һ����Ԫ��������������������Flyweight��������Ҫ������ȷ������ع���Flyweight�����û�����һ��Flyweightʱ��FlyweightFactory�����ṩһ���Ѵ�����ʵ�����ߴ���һ������������ڵĻ���
public class FlyweightFactory {
	private Hashtable<String, ConcreteFlyweight> flyweights = new Hashtable<>();

	public FlyweightFactory() {
		// ��ʼ������ʱ������������ʵ��
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}

	// ���ݿͻ������󣬻�������ɵ�ʵ��
	public Flyweight getFlyweight(String key) {
		return flyweights.get(key);
	}

}
