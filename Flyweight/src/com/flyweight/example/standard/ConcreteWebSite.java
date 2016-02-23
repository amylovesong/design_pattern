package com.flyweight.example.standard;

//������վ��
public class ConcreteWebSite extends WebSite {
	private String name = "";

	public ConcreteWebSite(String name) {
		this.name = name;
	}

	// ʵ�֡�use������
	@Override
	public void use(User user) {
		System.out.println("��վ���ࣺ" + name + " �û���" + user.getName());
	}

}
