package com.visitor.standard;

/**
 * ʧ��
 * 
 * @author sunxiaoling
 * 
 */
public class Failing extends Action {

	@Override
	public String getActionName() {
		return "ʧ��";
	}

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.getActionName()
				+ "ʱ����ͷ�Ⱦƣ�˭Ҳ����Ȱ��");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.getActionName()
				+ "ʱ������������˭ҲȰ���ˡ�");
	}

}
