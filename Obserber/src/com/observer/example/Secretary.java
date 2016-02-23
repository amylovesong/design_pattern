package com.observer.example;

import java.util.ArrayList;

public class Secretary {
	/** ͬ���б� */
	private ArrayList<StockObserver> observers = new ArrayList<StockObserver>();
	private String action;
	
	/**
	 * ����
	 * @param observer ͬ��ʵ��
	 */
	public void attach(StockObserver observer){
		observers.add(observer);
	}
	
	/**
	 * ֪ͨ�۲���
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
