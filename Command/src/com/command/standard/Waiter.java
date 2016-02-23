package com.command.standard;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.command.sun.BakeChickenWingCommand;
import com.command.sun.Command;

public class Waiter {
	// ���Ӵ�ž������������
	private ArrayList<Command> orders = new ArrayList<Command>();

	// ���ö���
	// �ڿͻ��������ʱ����û�����տ����лؾ�
	public void setOrder(Command command) {

		if (command instanceof BakeChickenWingCommand) {
			System.out.println("����Ա������û���ˣ�������տ���");
		} else {
			orders.add(command);
			// ��¼�ͻ�������տ�����־���Ա�������Ǯ
			System.out.println("���Ӷ�����" + command.getName() + "	ʱ�䣺"
					+ new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		}
	}

	// ȡ������
	public void cancelOrder(Command command) {
		orders.remove(command);
		System.out.println("ȡ��������" + command.getName() + " ʱ�䣺"
				+ new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
	}

	// ֪ͨȫ��ִ��
	public void notify2Execute() {
		// �����û���õ��տ�����֪ͨ��������
		for (Command cmd : orders) {
			cmd.executeCommand();
		}
	}

}
