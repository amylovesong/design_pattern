package com.mediator.example;

//美国。相当于ConcreteColleague1类
public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
	}

	// 声明
	public void declare(String message) {
		mediator.declare(message, this);
	}

	// 获得消息
	public void getMessage(String message) {
		System.out.println("美国获得对方消息：" + message);
	}

}
