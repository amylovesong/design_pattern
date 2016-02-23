package com.visitor.standard;

/**
 * ����
 * 
 * @author sunxiaoling
 * 
 */
public class Amativeness extends Action {

	@Override
	public String getActionName() {
		return "����";
	}

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.getActionName()
				+ "ʱ�����²���ҲҪװ����");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.getActionName()
				+ "ʱ�����¶�ҲҪװ������");
	}

}
