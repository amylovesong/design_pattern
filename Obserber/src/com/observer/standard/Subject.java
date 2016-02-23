package com.observer.standard;

public interface Subject {

	/**
	 * ����
	 * 
	 * @param observer
	 *            ͬ��ʵ��
	 */
	void attach(Observer observer);

	/**
	 * ����
	 * 
	 * @param observer
	 *            ͬ��ʵ��
	 */
	void detach(Observer observer);

	/**
	 * ֪ͨ
	 */
	void notifyToObserver();

	String getAction();

	void setAction(String action);
}
