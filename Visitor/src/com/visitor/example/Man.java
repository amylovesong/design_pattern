package com.visitor.example;

/**
 * �����ˡ���
 * 
 * @author sunxiaoling
 * 
 */
public class Man extends Person {

	@Override
	public void getConclusion() {
		if (action.equals("�ɹ�")) {
			System.out.println("����" + action + "ʱ����������һ��ΰ���Ů�ˡ�");
		} else if (action.equals("ʧ��")) {
			System.out.println("����" + action + "ʱ����ͷ�Ⱦƣ�˭Ҳ����Ȱ��");
		} else if (action.equals("����")) {
			System.out.println("����" + action + "ʱ�����²���ҲҪװ����");
		}
	}

}
