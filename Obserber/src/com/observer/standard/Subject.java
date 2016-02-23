package com.observer.standard;

public interface Subject {

	/**
	 * 增加
	 * 
	 * @param observer
	 *            同事实例
	 */
	void attach(Observer observer);

	/**
	 * 减少
	 * 
	 * @param observer
	 *            同事实例
	 */
	void detach(Observer observer);

	/**
	 * 通知
	 */
	void notifyToObserver();

	String getAction();

	void setAction(String action);
}
