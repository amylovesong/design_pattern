package com.mediator.example;

//�����ˡ��൱��ConcreteColleague2
public class Iraq extends Country {

	public Iraq(UnitedNations mediator) {
		super(mediator);
	}

	// ����
	public void declare(String message) {
		mediator.declare(message, this);
	}

	// �����Ϣ
	public void getMessage(String message) {
		System.out.println("�����˻�öԷ���Ϣ��" + message);
	}

}
