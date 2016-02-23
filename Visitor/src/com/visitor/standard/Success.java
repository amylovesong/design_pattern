package com.visitor.standard;

/**
 * �ɹ�
 * 
 * @author sunxiaoling
 * 
 */
public class Success extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.getActionName()
				+ "ʱ����������һ��ΰ���Ů�ˡ�");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.getActionName()
				+ "ʱ����������һ�����ɹ������ˡ�");
	}

	@Override
	public String getActionName() {
		return "�ɹ�";
	}

}
