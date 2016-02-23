package com.bridge.main;

import com.bridge.standard.HandsetAddressList;
import com.bridge.standard.HandsetBrand;
import com.bridge.standard.HandsetBrandM;
import com.bridge.standard.HandsetBrandN;
import com.bridge.standard.HandsetGame;
import com.bridge.standard.addition.HandsetBrandS;
import com.bridge.standard.addition.HandsetMP3;
import com.bridge.template.Abstraction;
import com.bridge.template.ConcreteImplementorA;
import com.bridge.template.ConcreteImplementorB;
import com.bridge.template.RefinedAbstraction;

public class Main {
	public static void main(String[] args) {
		// HandsetNGame game = new HandsetNGame();
		// game.run();
		//
		// HandsetMGame game1 = new HandsetMGame();
		// game1.run();

		/*********** 松耦合的手机软件例子 ***********/
		// HandsetBrand ab;
		// ab = new HandsetBrandN();
		//
		// ab.setHandsetSoft(new HandsetGame());
		// ab.run();
		//
		// ab.setHandsetSoft(new HandsetAddressList());
		// ab.run();
		//
		// ab = new HandsetBrandM();
		//
		// ab.setHandsetSoft(new HandsetGame());
		// ab.run();
		//
		// ab.setHandsetSoft(new HandsetAddressList());
		// ab.run();
		//
		// // addition
		// ab = new HandsetBrandS();
		// ab.setHandsetSoft(new HandsetMP3());
		// ab.run();

		/*********** 桥接模式标准版 ***********/
		Abstraction ab = new RefinedAbstraction();

		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();

		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
	}
}
