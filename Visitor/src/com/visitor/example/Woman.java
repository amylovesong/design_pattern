package com.visitor.example;

/**
 * ��Ů�ˡ���
 * 
 * @author sunxiaoling
 * 
 */
public class Woman extends Person {

	@Override
	public void getConclusion() {
		if (action.equals("�ɹ�")) {
			System.out.println("Ů��" + action + "ʱ����������һ�����ɹ������ˡ�");
		} else if (action.equals("ʧ��")) {
			System.out.println("Ů��" + action + "ʱ������������˭ҲȰ���ˡ�");
		} else if (action.equals("����")) {
			System.out.println("Ů��" + action + "ʱ�����¶�ҲҪװ������");
		}
	}

}
