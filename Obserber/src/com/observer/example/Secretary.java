package com.observer.example;

import java.util.ArrayList;

public class Secretary {
	/** 同事列表 */
	private ArrayList<StockObserver> observers = new ArrayList<StockObserver>();
	private String action;
	
	/**
	 * 增加
	 * @param observer 同事实例
	 */
	public void attach(StockObserver observer){
		observers.add(observer);
	}
	
	/**
	 * 通知观察者
	 */
	public void notifyToObserver(){
		for (StockObserver observer : observers) {
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
