package com.visitor.main;

import com.visitor.template.ConcreteElementA;
import com.visitor.template.ConcreteElementB;
import com.visitor.template.ConcreteVisitor1;
import com.visitor.template.ConcreteVisitor2;
import com.visitor.template.ObjectStructure;

public class Main {
	public static void main(String[] args) {
		/** ������ģʽ��һ�� **/
		// ArrayList<Person> persons = new ArrayList<>();
		//
		// Person man1 = new Man();
		// man1.setAction("�ɹ�");
		// persons.add(man1);
		// Person woman1 = new Woman();
		// woman1.setAction("�ɹ�");
		// persons.add(woman1);
		//
		// Person man2 = new Man();
		// man2.setAction("ʧ��");
		// persons.add(man2);
		// Person woman2 = new Woman();
		// woman2.setAction("ʧ��");
		// persons.add(woman2);
		//
		// Person man3 = new Man();
		// man3.setAction("����");
		// persons.add(man3);
		// Person woman3 = new Woman();
		// woman3.setAction("����");
		// persons.add(woman3);
		//
		// for (Person person : persons) {
		// person.getConclusion();
		// }

		/** ������ģʽ�ڶ��� **/
		// ObjectStructure o = new ObjectStructure();
		// // �ڶ���ṹ�м���Ҫ�Աȵġ����ˡ��͡�Ů�ˡ�
		// o.attach(new Man());
		// o.attach(new Woman());
		//
		// /*--- �鿴�ڸ���״̬�£������ˡ��͡�Ů�ˡ��ķ�Ӧ ---*/
		// // �ɹ�ʱ�ķ�Ӧ
		// Success v1 = new Success();
		// o.display(v1);
		//
		// // ʧ��ʱ�ķ�Ӧ
		// Failing v2 = new Failing();
		// o.display(v2);
		//
		// // ����ʱ�ķ�Ӧ
		// Amativeness v3 = new Amativeness();
		// o.display(v3);
		//
		// // ��������״̬�ķ�Ӧ
		// Marriage v4 = new Marriage();
		// o.display(v4);

		/** ������ģʽģ�� **/
		ObjectStructure o = new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());

		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();

		o.accept(v1);
		o.accept(v2);

	}
}
