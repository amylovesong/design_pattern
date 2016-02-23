package com.observer.standard;

import java.util.ArrayList;

public class Boss implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String action;

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
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
