package com.mediator.example;

//�������൱��ConcreteColleague1��
public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
	}

	// ����
	public void declare(String message) {
		mediator.declare(message, this);
	}

	// �����Ϣ
	public void getMessage(String message) {
		System.out.println("������öԷ���Ϣ��" + message);
	}

}
