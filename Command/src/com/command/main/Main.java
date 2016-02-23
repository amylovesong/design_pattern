package com.command.main;

import com.command.template.Command;
import com.command.template.ConcreteCommand;
import com.command.template.Invoker;
import com.command.template.Receiver;

//import com.sun.command.Waiter;

public class Main {
	public static void main(String[] args) {

		/*********** ����ģʽ��һ�棨����ϣ� ***********/
		// Barbecuer boy = new Barbecuer();
		//
		// // �ͻ��˳����롰���⴮�ߡ�����ϣ����ܼ򵥣���ȴ��Ϊ�������������������
		// boy.bakeMutton();
		// boy.bakeMutton();
		// boy.bakeMutton();
		// boy.bakeChickenWing();
		// boy.bakeMutton();
		// boy.bakeMutton();
		// boy.bakeMutton();
		// boy.bakeChickenWing();

		/*********** ����ģʽ�ڶ��棨����ϣ� ***********/
		// // ����ǰ��׼��
		// // �տ������Ⱦ��Һ��˿����ʦ������Ա�Ϳ���˵����͵ȿͻ�����
		// Barbecuer boy = new Barbecuer();
		// Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		// Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		// Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		// Waiter girl = new Waiter();

		// // ����Ӫҵ
		// // ����Ա�����û�Ҫ��֪ͨ������ʼ����
		// girl.setOrder(bakeMuttonCommand1);
		// girl.notify2Execute();
		// girl.setOrder(bakeMuttonCommand2);
		// girl.notify2Execute();
		// girl.setOrder(bakeChickenWingCommand1);
		// girl.notify2Execute();

		/*********** ����ģʽ�����棨����Ϻ����Ʒ���Ա�Ĺ��ܣ� ***********/
		// // ����Ӫҵ �˿͵��
		// girl.setOrder(bakeMuttonCommand1);
		// girl.setOrder(bakeMuttonCommand2);
		// girl.setOrder(bakeChickenWingCommand1);
		//
		// // �����ϣ�֪ͨ����
		// girl.notify2Execute();
		//
		// // ȡ������
		// girl.cancelOrder(bakeMuttonCommand1);
		// // ����֪ͨ����
		// girl.notify2Execute();

		/*********** ����ģʽģ�� ***********/
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();

		i.setCommand(c);
		i.executeCommand();

	}

}
