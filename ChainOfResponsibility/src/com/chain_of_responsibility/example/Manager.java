package com.chain_of_responsibility.example;

//������
public class Manager {
	protected String name;

	public Manager(String name) {
		this.name = name;
	}

	public void getResult(String managerLevel, Request request) {
		if (managerLevel.equals("����")) {
			if (request.getRequestType().equals("���")
					&& request.getNumber() <= 2) {
				System.out.println(name + "��" + request.getRequestContent()
						+ " ����" + request.getNumber() + " ����׼");
			} else {
				System.out.println(name + "��" + request.getRequestContent()
						+ " ����" + request.getNumber() + " ����Ȩ����");
			}
		} else if (managerLevel.equals("�ܼ�")) {
			if (request.getRequestType().equals("���")
					&& request.getNumber() <= 5) {
				System.out.println(name + "��" + request.getRequestContent()
						+ " ����" + request.getNumber() + " ����׼");
			} else {
				System.out.println(name + "��" + request.getRequestContent()
						+ " ����" + request.getNumber() + " ����Ȩ����");
			}
		} else if (managerLevel.equals("�ܾ���")) {
			if (request.getRequestType().equals("���")) {
				System.out.println(name + "��" + request.getRequestContent()
						+ " ����" + request.getNumber() + " ����׼");
			} else if (request.getRequestType().equals("��н")
					&& request.getNumber() <= 500) {
				System.out.println(name + "��" + request.getRequestContent()
						+ " ����" + request.getNumber() + " ����׼");
			} else if (request.getRequestType().equals("��н")
					&& request.getNumber() > 500) {
				System.out.println(name + "��" + request.getRequestContent()
						+ " ����" + request.getNumber() + " ��˵��");
			}
		}
	}
}
