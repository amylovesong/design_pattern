package com.observer.standard;

import java.util.ArrayList;

public class Secretary {
	/** 同事列表 */
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String action;

	/**
	 * 增加
	 * 
	 * @param observer
	 *            同事实例
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 移除
	 * 
	 * @param observer
	 *            同事实例
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 通知观察者
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
