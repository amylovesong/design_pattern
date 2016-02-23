package com.singleton.standard;

public class Singleton {
	private static Singleton instance;
	// ��������ʱ����һ����ֻ̬���Ľ��̸�������
	private static final Object syncRoot = new Object();

	private Singleton() {

	}

	/***************** ����ģʽ��һ�� ******************/
	// public static Singleton getInstance() {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	//
	// return instance;
	// }

	/***************** ����ģʽ�ڶ��� ******************/
	// /** ǰ���Ǹ�getInstance()����δ���Ƕ��̷߳��ʵ����⣬��Ȼ�п��ܻᴴ�����ʵ�� **/
	// public static Singleton getInstance() {
	//
	// // ��ͬһ��ʱ�̼��������ǲ��ֳ���ֻ��һ���߳̿��Խ���
	// synchronized (syncRoot) {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// }
	//
	// return instance;
	// }

	/***************** ����ģʽ������ ******************/
	/**
	 * ǰ���Ǹ�getInstance()������Ȼ����������ÿ�ε���getInstance()����ʱ����Ҫsynchronized������������Ӱ�����ܣ�
	 * ��������������������˫������
	 **/
	public static Singleton getInstance() {
		// ���ж�ʵ���Ƿ���ڣ��������ټ�������
		if (instance == null) {
			synchronized (syncRoot) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

}
