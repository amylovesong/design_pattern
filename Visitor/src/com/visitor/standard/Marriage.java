package com.visitor.standard;

/**
 * ���״̬��
 * 
 * @author sunxiaoling
 * 
 */
public class Marriage extends Action {

	@Override
	public String getActionName() {
		return "���";
	}

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.getActionName()
				+ "ʱ���п�����������Ϸ�ս�ʱ��������ͽ�̡�ң���ڡ�");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.getActionName()
				+ "ʱ����οԻ�����鳤��·�������������ձ�ƽ����");
	}

}
