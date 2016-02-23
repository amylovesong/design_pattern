package com.mediator.template;

//同事对象1
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	// 发送消息时通常是中介者发送出去的
	public void send(String message) {
		mediator.send(message, this);
	}

	public void notify(String message) {
		System.out.println("同事1得到信息：" + message);
	}

}
