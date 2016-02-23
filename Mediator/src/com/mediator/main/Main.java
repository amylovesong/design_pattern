package com.mediator.main;

import com.mediator.example.Iraq;
import com.mediator.example.USA;
import com.mediator.example.UnitedNations;
import com.mediator.example.UnitedNationsSecurityCouncil;
import com.mediator.template.ConcreteColleague1;
import com.mediator.template.ConcreteColleague2;
import com.mediator.template.ConcreteMediator;

public class Main {
	public static void main(String[] args) {
		/********** 中介者模式-模板 *********/
		// ConcreteMediator mediator = new ConcreteMediator();
		//
		// // 让两个具体同事类认识中介者对象
		// ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		// ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		//
		// // 让中介者认识各个具体同事类对象
		// mediator.setColleague1(colleague1);
		// mediator.setColleague2(colleague2);
		//
		// colleague1.send("吃过饭了吗？");
		// colleague2.send("没有呢，你打算请客？");

		/********** 中介者模式-联合国实例 *********/
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

		USA c1 = new USA(UNSC);
		Iraq c2 = new Iraq(UNSC);

		UNSC.setUSA(c1);
		UNSC.setIraq(c2);

		c1.declare("不准研制核武器，否则要发动战争！");
		c2.declare("我们没有核武器，也不怕侵略。");

	}

}
