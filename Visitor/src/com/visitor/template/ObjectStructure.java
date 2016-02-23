package com.visitor.template;

import java.util.ArrayList;

/**
 * 能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素
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
