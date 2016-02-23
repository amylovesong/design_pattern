package com.composite.standard;

import java.util.ArrayList;

import com.composite.util.Utils;

/**
 * 具体公司类 实现接口 树枝节点
 * 
 * @author sunxiaoling
 * 
 */
public class ConcreteCompany extends Company {
	private ArrayList<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println(Utils.createString('-', depth) + name);

		for (Company component : children) {
			component.display(depth + 2);
		}
	}

	// 履行职责
	@Override
	public void lineOfDuty() {
		for (Company component : children) {
			component.lineOfDuty();
		}
	}

}
