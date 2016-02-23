package com.visitor.standard;

import java.util.ArrayList;

/**
 * ����ṹ�ࡣ ����������Ҫ�����ˡ��͡�Ů�ˡ��ڲ�ͬ״̬�ĶԱȣ� ����������Ҫһ��������ṹ��������Բ�ͬ�ġ�״̬�����������ˡ��͡�Ů�ˡ��� �õ���ͬ�ķ�Ӧ
 * 
 * @author sunxiaoling
 * 
 */
public class ObjectStructure {
	private ArrayList<Person> elements = new ArrayList<>();

	// ����
	public void attach(Person element) {
		elements.add(element);
	}

	// �Ƴ�
	public void detach(Person element) {
		elements.remove(element);
	}

	// �鿴��ʾ(��������)
	public void display(Action visitor) {
		for (Person e : elements) {
			e.accept(visitor);
		}
	}

}
