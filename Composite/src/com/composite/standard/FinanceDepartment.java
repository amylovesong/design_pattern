package com.composite.standard;

import com.composite.util.Utils;

/**
 * 财务部 叶子节点
 * 
 * @author sunxiaoling
 * 
 */
public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
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
		System.out.println(name + " 公司财务收支管理");
	}

}
