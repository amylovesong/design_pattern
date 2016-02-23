package com.chain_of_responsibility.example.refactor;

import com.chain_of_responsibility.example.Request;

//�ܾ���
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		// �ܾ����׼������������ļ���
		if (request.getRequestType().equals("���")) {
			System.out.println(name + "��" + request.getRequestContent() + " ����"
					+ request.getNumber() + " ����׼");
		} else if (request.getRequestType().equals("��н")
				&& request.getNumber() <= 500) {// ��н��500����û������
			System.out.println(name + "��" + request.getRequestContent() + " ����"
					+ request.getNumber() + " ����׼");
		} else if (request.getRequestType().equals("��н")
				&& request.getNumber() > 500) {// ����500����Ҫ����һ����
			System.out.println(name + "��" + request.getRequestContent() + " ����"
					+ request.getNumber() + " ��˵��");
		}
	}
}
