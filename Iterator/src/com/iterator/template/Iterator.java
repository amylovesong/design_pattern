package com.iterator.template;

/**
 * 迭代器抽象类
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Iterator {
	// 定义得到开始对象、得到下一个对象、判断是否到结尾、当前对象等方法
	public abstract Object first();

	public abstract Object next();

	public abstract boolean isDone();

	public abstract Object currentItem();
}
