package com.memento.template;

//管理者类
public class Caretaker {
	private Memento memento;

	// 得到备忘录
	public Memento getMemento() {
		return memento;
	}

	// 设置备忘录
	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
