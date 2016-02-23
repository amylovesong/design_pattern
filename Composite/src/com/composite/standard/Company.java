package com.composite.standard;

/**
 * ��˾�� ���������
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Company {
	protected String name;

	public Company(String name) {
		this.name = name;
	}

	// ����
	public abstract void add(Company c);

	// �Ƴ�
	public abstract void remove(Company c);

	// ��ʾ
	public abstract void display(int depth);

	// ����ְ��
	public abstract void lineOfDuty();
}
