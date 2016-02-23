package com.iterator.template;

/**
 * 从后往前的具体迭代器
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteIteratorDesc extends Iterator {
	private ConcreteAggregate aggregate;
	private int current = 0;

	public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
		current = aggregate.count() - 1;
	}

	@Override
	public Object first() {
		return aggregate.get(aggregate.count() - 1);
	}

	@Override
	public Object next() {
		Object ret = null;
		current--;
		if (current >= 0) {
			ret = aggregate.get(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return current < 0;
	}

	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}

}
