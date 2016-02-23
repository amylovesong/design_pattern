package com.singleton.standard.static_init;

//��ֹ�����������������ܻ�����ʵ����
public final class Singleton {
	private static final Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

}
