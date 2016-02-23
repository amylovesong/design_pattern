package com.composite.standard;

/**
 * 公司类 抽象类或借口
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Company {
	protected String name;

	public Company(String name) {
		this.name = name;
	}

	// 增加
	public abstract void add(Company c);

	// 移除
	public abstract void remove(Company c);

	// 显示
	public abstract void display(int depth);

	// 履行职责
	public abstract void lineOfDuty();
}
