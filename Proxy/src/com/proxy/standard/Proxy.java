package com.proxy.standard;

import com.proxy.example.SchoolGirl;

public class Proxy implements GiveGift {
	Pursuit gg;

	public Proxy(SchoolGirl mm) {
		gg = new Pursuit(mm);
	}

	// 在实现方法中去调用“追求者”类的相关方法
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
