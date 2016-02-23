package com.composite.standard;

import com.composite.util.Utils;

/**
 * 人力资源部 树叶节点
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
		System.out.println(name + " 员工招聘培训管理");
	}

}
