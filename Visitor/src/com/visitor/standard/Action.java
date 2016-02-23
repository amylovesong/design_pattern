package com.visitor.standard;

/**
 * 状态的抽象类
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Action {
	public abstract String getActionName();

	// 得到男人结论或反应
	public abstract void getManConclusion(Man concreteElementA);

	// 得到女人结论或反应
	public abstract void getWomanConclusion(Woman concreteElementB);
}
