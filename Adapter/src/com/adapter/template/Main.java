package com.adapter.template;

import com.adapter.example.Center;
import com.adapter.example.Forwards;
import com.adapter.example.Guards;
import com.adapter.example.Player;
import com.adapter.standard.Translator;

public class Main {
	public static void main(String[] args) {
		// Target target = new Adapter();
		// // 对客户端来说，调用的就是Target的Request()
		// target.request();

		/************** 适配器模式第一版 ****************/
		Player b = new Forwards("巴蒂尔");
		b.attack();
		Player m = new Guards("麦克格雷迪");
		m.attack();

		// Player ym = new Center("姚明");
		// // 此处有问题，因为“姚明此时应该是听不懂教练的战术安排”
		// ym.attack();
		// ym.defense();

		/************** 适配器模式第二版 ****************/
		// 翻译者告诉姚明，教练要求你既要“进攻”又要“防守”
		Player ym = new Translator("姚明");
		ym.attack();
		ym.defense();
	}
}
