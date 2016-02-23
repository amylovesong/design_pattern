package com.proxy.standard;

import com.proxy.example.SchoolGirl;

public class Proxy implements GiveGift {
	Pursuit gg;

	public Proxy(SchoolGirl mm) {
		gg = new Pursuit(mm);
	}

	// ��ʵ�ַ�����ȥ���á�׷���ߡ������ط���
	@Override
	public void giveDolls() {
		gg.giveDolls();
	}

	@Override
	public void giveFlowers() {
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		gg.giveChocolate();
	}

}
