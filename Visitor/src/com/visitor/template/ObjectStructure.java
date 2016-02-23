package com.visitor.template;

import java.util.ArrayList;

/**
 * ��ö������Ԫ�أ������ṩһ���߲�Ľӿ�����������߷�������Ԫ��
 * 
 * @author sunxiaoling
 * 
 */
public class ObjectStructure {
	private ArrayList<Element> elements = new ArrayList<Element>();

	public void attach(Element element) {
		elements.add(element);
	}

	public void remove(Element element) {
		elements.remove(element);
	}

	public void accept(Visitor visitor) {
		for (Element element : elements) {
			element.accept(visitor);
		}
	}

}
