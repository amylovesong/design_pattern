package com.adapter.template;

import com.adapter.example.Center;
import com.adapter.example.Forwards;
import com.adapter.example.Guards;
import com.adapter.example.Player;
import com.adapter.standard.Translator;

public class Main {
	public static void main(String[] args) {
		// Target target = new Adapter();
		// // �Կͻ�����˵�����õľ���Target��Request()
		// target.request();

		/************** ������ģʽ��һ�� ****************/
		Player b = new Forwards("�͵ٶ�");
		b.attack();
		Player m = new Guards("��˸��׵�");
		m.attack();

		// Player ym = new Center("Ҧ��");
		// // �˴������⣬��Ϊ��Ҧ����ʱӦ����������������ս�����š�
		// ym.attack();
		// ym.defense();

		/************** ������ģʽ�ڶ��� ****************/
		// �����߸���Ҧ��������Ҫ�����Ҫ����������Ҫ�����ء�
		Player ym = new Translator("Ҧ��");
		ym.attack();
		ym.defense();
	}
}
