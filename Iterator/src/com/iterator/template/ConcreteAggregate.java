package com.iterator.template;

import java.util.ArrayList;

/**
 * ����ۼ���
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteAggregate extends Aggregate {
	// ����һ��IList���ͱ��������ڴ�žۺ϶���
	private ArrayList<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	// ���ؾۼ��ܸ���
	public int count() {
		return items.size();
	}

	// ����������
	public Object get(int index) {
		return items.get(index);
	}

	public void set(int index, Object value) {
		items.add(index, value);
	}

}
