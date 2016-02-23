package com.composite.template;

/**
 * ComponentΪ����еĶ��������ӿڣ����ʵ�����£�ʵ�������๲�нӿڵ�Ĭ����Ϊ������һ���ӿ����ڷ��ʺ͹���Component���Ӳ���
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Component {
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	// ͨ����add��remove�������ṩ���ӻ��Ƴ���Ҷ����֦�Ĺ���
	public abstract void add(Component c);

	public abstract void remove(Component c);

	public abstract void display(int depth);

}
