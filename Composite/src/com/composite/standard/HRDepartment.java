package com.composite.standard;

import com.composite.util.Utils;

/**
 * ������Դ�� ��Ҷ�ڵ�
 * 
 * @author sunxiaoling
 * 
 */
public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {

	}

	@Override
	public void remove(Company c) {

	}

	@Override
	public void display(int depth) {
		System.out.println(Utils.createString('-', depth) + name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + " Ա����Ƹ��ѵ����");
	}

}
