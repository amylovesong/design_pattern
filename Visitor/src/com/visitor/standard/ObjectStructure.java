package com.visitor.standard;

import java.util.ArrayList;

/**
 * 对象结构类。 由于总是需要“男人”和“女人”在不同状态的对比， 所以我们需要一个“对象结构”类来针对不同的“状态”遍历“男人”和“女人”， 得到不同的反应
 * 
 * @author sunxiaoling
 * 
 */
public class ObjectStructure {
	private ArrayList<Person> elements = new ArrayList<>();

	// 增加
	public void attach(Person element) {
		elements.add(element);
	}

	// 移除
	public void detach(Person element) {
		elements.remove(element);
	}

	// 查看显示(遍历方法)
	public void display(Action visitor) {
		for (Person e : elements) {
			e.accept(visitor);
		}
	}

}
