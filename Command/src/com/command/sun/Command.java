package com.command.sun;

//��������
public abstract class Command {
	protected Barbecuer receiver;

	// ���������ֻ࣬��Ҫȷ�������⴮�ߡ���˭
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}

	// ִ������
	public abstract void executeCommand();

	// ������������������
	public abstract String getName();
}
