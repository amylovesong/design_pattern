package com.command.sun;

//���⴮����
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	// ���������ִ࣬������ʱ��ִ�о������Ϊ
	@Override
	public void executeCommand() {
		receiver.bakeMutton();
	}

	@Override
	public String getName() {
		return "����ģʽ.�����⴮";
	}

}
