package com.visitor.standard;

/**
 * 成功
 * 
 * @author sunxiaoling
 * 
 */
public class Success extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.getActionName()
				+ "时，背后多半有一个伟大的女人。");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.getActionName()
				+ "时，背后大多有一个不成功的男人。");
	}

	@Override
	public String getActionName() {
		return "成功";
	}

}
