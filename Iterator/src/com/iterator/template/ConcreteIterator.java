package com.iterator.template;

/**
 * ����������࣬�̳�Iterator
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteIterator extends Iterator {
	// ����һ������ۼ�����
	private ConcreteAggregate aggregate;
	private int current = 0;

	// ��ʼ��ʱ������ľۼ�������
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		// �õ��ۼ��ĵ�һ������
		return aggregate.get(0);
	}

	// �õ��ۼ�����һ������
	@Override
	public Object next() {
		Object ret = null;
		current++;
		if (current < aggregate.count()) {
			ret = aggregate.get(current);
		}
		return ret;
	}

	// �жϵ�ǰ�Ƿ��������β������β����true
	@Override
	public boolean isDone() {
		return current >= aggregate.count();
	}

	// ���ص�ǰ�ľۼ�����
	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}

}
