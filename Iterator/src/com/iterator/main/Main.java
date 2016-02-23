package com.iterator.main;

import com.iterator.template.ConcreteAggregate;
import com.iterator.template.ConcreteIteratorDesc;
import com.iterator.template.Iterator;

public class Main {
	public static void main(String[] args) {
		// �ۼ����󣬳����еĹ�����
		ConcreteAggregate a = new ConcreteAggregate();

		// �������ĳ˿�
		a.set(0, "����");
		a.set(1, "С��");
		a.set(2, "����");
		a.set(3, "����");
		a.set(4, "�����ڲ�Ա��");
		a.set(5, "С͵");

		// ��ƱԱ�������ȿ������ϳ�������Щ�ˣ��������˵���������
		// Iterator i = new ConcreteIterator(a);
		Iterator i = new ConcreteIteratorDesc(a);

		// �ӵ�һ���˿Ϳ�ʼ
		Object item = i.first();
		while (!i.isDone()) {
			// ����ǰ�ĳ˿͸�֪����Ʊ
			System.out.println(i.currentItem() + " ����Ʊ��");
			// ��һ�˿�
			i.next();
		}

	}
}
