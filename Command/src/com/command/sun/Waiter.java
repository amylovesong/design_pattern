package com.command.sun;

//����Ա
public class Waiter {
	private Command command;

	// ���ö���
	// ����Ա�࣬���ù��û���Ҫʲô���⣬�������ǡ������ֻ�ܼ�¼������Ȼ��֪ͨ�����⴮�ߡ�ִ�м���
	public void setOrder(Command command) {
		this.command = command;
	}

	// ִ֪ͨ��
	public void notify2Execute() {
		command.executeCommand();
	}

}
