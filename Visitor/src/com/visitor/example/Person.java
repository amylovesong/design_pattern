package com.visitor.example;

/**
 * ���ˡ��࣬�ǡ����ˡ��͡�Ů�ˡ��ĳ�����
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Person {
	protected String action;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	// �õ����ۻ�Ӧ
	public abstract void getConclusion();
}
