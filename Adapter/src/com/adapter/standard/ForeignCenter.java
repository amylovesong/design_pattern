package com.adapter.standard;

/**
 * �⼮�з�
 * 
 * @author sunxiaoling
 * 
 */
public class ForeignCenter {
	private String name;

	// �⼮�з�����Ա���������������Զ����ǹ��췽����������ǰ������Ա��Ĳ�ͬ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// �������⼮�з桱ֻ�������ġ�jingong��
	public void jingong() {
		System.out.println("�⼮�з� " + name + " ����");
	}

	// �������⼮�з桱ֻ�������ġ�fangshou��
	public void fangshou() {
		System.out.println("�⼮�з� " + name + " ����");
	}
}
