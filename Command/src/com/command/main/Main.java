package com.command.main;

import com.command.template.Command;
import com.command.template.ConcreteCommand;
import com.command.template.Invoker;
import com.command.template.Receiver;

//import com.sun.command.Waiter;

public class Main {
	public static void main(String[] args) {

		/*********** 命令模式第一版（紧耦合） ***********/
		// Barbecuer boy = new Barbecuer();
		//
		// // 客户端程序与“烤肉串者”紧耦合，尽管简单，但却极为僵化，有许许多多的隐患
		// boy.bakeMutton();
		// boy.bakeMutton();
		// boy.bakeMutton();
		// boy.bakeChickenWing();
		// boy.bakeMutton();
		// boy.bakeMutton();
		// boy.bakeMutton();
		// boy.bakeChickenWing();

		/*********** 命令模式第二版（松耦合） ***********/
		// // 开店前的准备
		// // 烧烤店事先就找好了烤肉厨师、服务员和烤肉菜单，就等客户上门
		// Barbecuer boy = new Barbecuer();
		// Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		// Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		// Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		// Waiter girl = new Waiter();

		// // 开门营业
		// // 服务员根据用户要求，通知厨房开始制作
		// girl.setOrder(bakeMuttonCommand1);
		// girl.notify2Execute();
		// girl.setOrder(bakeMuttonCommand2);
		// girl.notify2Execute();
		// girl.setOrder(bakeChickenWingCommand1);
		// girl.notify2Execute();

		/*********** 命令模式第三版（松耦合后完善服务员的功能） ***********/
		// // 开门营业 顾客点菜
		// girl.setOrder(bakeMuttonCommand1);
		// girl.setOrder(bakeMuttonCommand2);
		// girl.setOrder(bakeChickenWingCommand1);
		//
		// // 点菜完毕，通知厨房
		// girl.notify2Execute();
		//
		// // 取消订单
		// girl.cancelOrder(bakeMuttonCommand1);
		// // 重新通知厨房
		// girl.notify2Execute();

		/*********** 命令模式模板 ***********/
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();

		i.setCommand(c);
		i.executeCommand();

	}

}
