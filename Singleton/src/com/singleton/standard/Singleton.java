package com.singleton.standard;

public class Singleton {
	private static Singleton instance;
	// 程序运行时创建一个静态只读的进程辅助对象
	private static final Object syncRoot = new Object();

	private Singleton() {

	}

	/***************** 单例模式第一版 ******************/
	// public static Singleton getInstance() {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	//
	// return instance;
	// }

	/***************** 单例模式第二版 ******************/
	// /** 前面那个getInstance()方法未考虑多线程访问的问题，仍然有可能会创建多个实例 **/
	// public static Singleton getInstance() {
	//
	// // 在同一个时刻加了锁的那部分程序只有一个线程可以进入
	// synchronized (syncRoot) {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// }
	//
	// return instance;
	// }

	/***************** 单例模式第三版 ******************/
	/**
	 * 前面那个getInstance()方法虽然加了锁，但每次调用getInstance()方法时都需要synchronized，这种做法会影响性能，
	 * 所以再做改良————双重锁定
	 **/
	public static Singleton getInstance() {
		// 先判断实例是否存在，不存在再加锁处理
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
