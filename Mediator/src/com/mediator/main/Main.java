package com.mediator.main;

import com.mediator.example.Iraq;
import com.mediator.example.USA;
import com.mediator.example.UnitedNations;
import com.mediator.example.UnitedNationsSecurityCouncil;
import com.mediator.template.ConcreteColleague1;
import com.mediator.template.ConcreteColleague2;
import com.mediator.template.ConcreteMediator;

public class Main {
	public static void main(String[] args) {
		/********** �н���ģʽ-ģ�� *********/
		// ConcreteMediator mediator = new ConcreteMediator();
		//
		// // ����������ͬ������ʶ�н��߶���
		// ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		// ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		//
		// // ���н�����ʶ��������ͬ�������
		// mediator.setColleague1(colleague1);
		// mediator.setColleague2(colleague2);
		//
		// colleague1.send("�Թ�������");
		// colleague2.send("û���أ��������ͣ�");

		/********** �н���ģʽ-���Ϲ�ʵ�� *********/
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

		USA c1 = new USA(UNSC);
		Iraq c2 = new Iraq(UNSC);

		UNSC.setUSA(c1);
		UNSC.setIraq(c2);

		c1.declare("��׼���ƺ�����������Ҫ����ս����");
		c2.declare("����û�к�������Ҳ�������ԡ�");

	}

}
