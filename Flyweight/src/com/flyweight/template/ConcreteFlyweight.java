package com.flyweight.template;

//ConcreteFlyweight�Ǽ̳�Flyweight�����ʵ��Flyweight�ӿڣ���Ϊ�ڲ�״̬���Ӵ洢�ռ�
public class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("����Flyweight��" + extrinsicstate);
	}

}
