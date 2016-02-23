package com.adapter.standard;

/**
 * 外籍中锋
 * 
 * @author sunxiaoling
 * 
 */
public class ForeignCenter {
	private String name;

	// 外籍中锋类球员的姓名故意用属性而不是构造方法来区别与前三个球员类的不同
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 表明“外籍中锋”只懂得中文“jingong”
	public void jingong() {
		System.out.println("外籍中锋 " + name + " 进攻");
	}

	// 表明“外籍中锋”只懂得中文“fangshou”
	public void fangshou() {
		System.out.println("外籍中锋 " + name + " 防守");
	}
}
