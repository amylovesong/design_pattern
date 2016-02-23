package com.visitor.example;

/**
 * “人”类，是“男人”和“女人”的抽象类
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Person {
	protected String action;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	// 得到结论或反应
	public abstract void getConclusion();
}
