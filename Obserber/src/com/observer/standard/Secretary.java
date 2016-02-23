package com.observer.standard;

import java.util.ArrayList;

public class Secretary {
	/** ͬ���б� */
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String action;

	/**
	 * ����
	 * 
	 * @param observer
	 *            ͬ��ʵ��
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * �Ƴ�
	 * 
	 * @param observer
	 *            ͬ��ʵ��
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * ֪ͨ�۲���
	 */
	public void notifyToObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
