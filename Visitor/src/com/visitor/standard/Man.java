package com.visitor.standard;

/**
 * ����
 * 
 * @author sunxiaoling
 * 
 */
public class Man extends Person {

	// �����ڿͻ������н�����״̬��Ϊ�������ݸ������ˡ������һ�η��ɣ�
	// Ȼ�����ˡ��������Ϊ�����ġ�����״̬���еķ��������˷�Ӧ����
	// ͬʱ���Լ��ң�this����Ϊ�������ݽ�ȥ���������˵ڶ��η���
	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}

	@Override
	public String getName() {
		return "����";
	}
}
