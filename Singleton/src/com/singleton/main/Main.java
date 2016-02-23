package com.singleton.main;

import com.singleton.standard.Singleton;

public class Main {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		if (instance1 == instance2) {
			System.out.println("两个对象是相同的实例");
		}
	}
}
