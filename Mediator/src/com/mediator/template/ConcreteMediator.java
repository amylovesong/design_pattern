package com.mediator.template;

//具体中介者类
public class ConcreteMediator extends Mediator {

	// 需要了解所有的具体同事对象
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;

	public ConcreteColleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public ConcreteColleague2 getColleague2() {
		return colleague2;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	@Override
	public void send(String message, Colleague colleague) {
		// 重写发送消息的方法，根据对象做出选择判断，通知对象
		if (colleague == colleague1) {
			colleague2.notify(message);
		} else {
			colleague1.notify(message);
		}
	}

}
