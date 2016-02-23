package com.visitor.standard;

/**
 * 恋爱
 * 
 * @author sunxiaoling
 * 
 */
public class Amativeness extends Action {

	@Override
	public String getActionName() {
		return "恋爱";
	}

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.getActionName()
				+ "时，凡事不懂也要装懂。");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.getActionName()
				+ "时，遇事懂也要装不懂。");
	}

}
