package com.visitor.standard;

/**
 * 结婚状态类
 * 
 * @author sunxiaoling
 * 
 */
public class Marriage extends Action {

	@Override
	public String getActionName() {
		return "结婚";
	}

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.getActionName()
				+ "时，感慨道：恋爱游戏终结时，‘有妻徒刑’遥无期。");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.getActionName()
				+ "时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安。");
	}

}
