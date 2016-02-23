package com.visitor.standard;

/**
 * “人”的抽象类
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Person {
	// 接受。参数为“状态”对象
	public abstract void accept(Action visitor);

	public abstract String getName();
}
