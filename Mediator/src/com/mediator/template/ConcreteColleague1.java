package com.mediator.template;

//ͬ�¶���1
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	// ������Ϣʱͨ�����н��߷��ͳ�ȥ��
	public void send(String message) {
		mediator.send(message, this);
	}

	public void notify(String message) {
		System.out.println("ͬ��1�õ���Ϣ��" + message);
	}

}
