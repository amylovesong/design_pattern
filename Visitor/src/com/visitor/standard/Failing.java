package com.visitor.standard;

/**
 * 失败
 * 
 * @author sunxiaoling
 * 
 */
public class Failing extends Action {

	@Override
	public String getActionName() {
		return "失败";
	}

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.getActionName()
				+ "时，闷头喝酒，谁也不用劝。");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.getActionName()
				+ "时，眼泪汪汪，谁也劝不了。");
	}

}
