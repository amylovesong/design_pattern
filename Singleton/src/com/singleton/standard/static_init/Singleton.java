package com.singleton.standard.static_init;

//阻止发生派生（派生可能会增加实例）
public final class Singleton {
	private static final Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

}
