package com.visitor.standard;

/**
 * 男人
 * 
 * @author sunxiaoling
 * 
 */
public class Man extends Person {

	// 首先在客户程序中将具体状态作为参数传递给“男人”类完成一次分派，
	// 然后“男人”类调用作为参数的“具体状态”中的方法“男人反应”，
	// 同时将自己家（this）作为参数传递进去。这便完成了第二次分派
	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}

	@Override
	public String getName() {
		return "男人";
	}
}
