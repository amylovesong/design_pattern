package com.iterator.template;

import java.util.ArrayList;

/**
 * 具体聚集类
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteAggregate extends Aggregate {
	// 声明一个IList范型变量，用于存放聚合对象
	private ArrayList<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	// 返回聚集总个数
	public int count() {
		return items.size();
	}

	// 声明索引器
	public Object get(int index) {
		return items.get(index);
	}

	public void set(int index, Object value) {
		items.add(index, value);
	}

}
