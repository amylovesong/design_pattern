package com.mediator.template;

//�����н�����
public abstract class Mediator {
	// ����һ������ķ�����Ϣ�������õ�ͬ�¶���ͷ�����Ϣ
	public abstract void send(String message, Colleague colleague);
}
