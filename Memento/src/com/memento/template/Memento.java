package com.memento.template;

/**
 * 备忘录类
 * 
 * @author sunxiaoling
 * 
 */
public class Memento {
	private String state;

	// Constructor，将相关数据导入
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		// 需要保存的数据属性，可以是多个
		return state;
	}
}
