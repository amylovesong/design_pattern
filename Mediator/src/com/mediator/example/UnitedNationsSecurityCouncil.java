package com.mediator.example;

//���Ϲ���ȫ���»�
public class UnitedNationsSecurityCouncil extends UnitedNations {
	private USA colleague1;
	private Iraq colleague2;

	// ���Ϲ�������˽����еĹ��ң�����ӵ�������������˵Ķ�������
	// ����
	public void setUSA(USA value) {
		colleague1 = value;
	}

	// ������
	public void setIraq(Iraq value) {
		colleague2 = value;
	}

	// ����
	// ��д��������������ʵ��������������ͨ��
	@Override
	public void declare(String message, Country colleague) {
		if (colleague == colleague1) {
			colleague2.getMessage(message);
		} else {
			colleague1.getMessage(message);
		}
	}

}
