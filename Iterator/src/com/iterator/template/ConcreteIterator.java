package com.iterator.template;

/**
 * 具体迭代器类，继承Iterator
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteIterator extends Iterator {
	// 定义一个具体聚集对象
	private ConcreteAggregate aggregate;
	private int current = 0;

	// 初始化时将具体的聚集对象传入
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		// 得到聚集的第一个对象
		return aggregate.get(0);
	}

	// 得到聚集的下一个对象
	@Override
	public Object next() {
		Object ret = null;
		current++;
		if (current < aggregate.count()) {
			ret = aggregate.get(current);
		}
		return ret;
	}

	// 判断当前是否遍历到结尾，到结尾返回true
	@Override
	public boolean isDone() {
		return current >= aggregate.count();
	}

	// 返回当前的聚集对象
	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}

}
