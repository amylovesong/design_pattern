package com.iterator.main;

import com.iterator.template.ConcreteAggregate;
import com.iterator.template.ConcreteIteratorDesc;
import com.iterator.template.Iterator;

public class Main {
	public static void main(String[] args) {
		// 聚集对象，场景中的公交车
		ConcreteAggregate a = new ConcreteAggregate();

		// 新上来的乘客
		a.set(0, "大鸟");
		a.set(1, "小菜");
		a.set(2, "行李");
		a.set(3, "老外");
		a.set(4, "公交内部员工");
		a.set(5, "小偷");

		// 售票员出场，先看好了上车的是哪些人，即声明了迭代器对象
		// Iterator i = new ConcreteIterator(a);
		Iterator i = new ConcreteIteratorDesc(a);

		// 从第一个乘客开始
		Object item = i.first();
		while (!i.isDone()) {
			// 对面前的乘客告知请买票
			System.out.println(i.currentItem() + " 请买车票！");
			// 下一乘客
			i.next();
		}

	}
}
