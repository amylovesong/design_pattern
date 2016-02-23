package com.chain_of_responsibility.example.refactor;

import com.chain_of_responsibility.example.Request;

//����
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		// ���������е�Ȩ�޾��ǿ�׼�����������ڵļ���
		if (request.getRequestType().equals("���") && request.getNumber() <= 2) {
			System.out.println(name + "��" + request.getRequestContent() + " ����"
					+ request.getNumber() + " ����׼");
		} else {// ��������붼��Ҫת���ϼ�
			if (superior != null) {
				superior.requestApplications(request);
			}
		}
	}

}
