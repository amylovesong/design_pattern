package com.chain_of_responsibility.example.refactor;

import com.chain_of_responsibility.example.Request;

//������
public abstract class Manager {
	protected String name;
	// �����ߵ��ϼ�
	protected Manager superior;

	public Manager(String name) {
		this.name = name;
	}

	// ���ù����ߵ��ϼ�
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	public abstract void requestApplications(Request request);
}
