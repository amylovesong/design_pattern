package com.command.standard;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.command.sun.BakeChickenWingCommand;
import com.command.sun.Command;

public class Waiter {
	// 增加存放具体命令的容器
	private ArrayList<Command> orders = new ArrayList<Command>();

	// 设置订单
	// 在客户提出请求时，对没货的烧烤进行回绝
	public void setOrder(Command command) {

		if (command instanceof BakeChickenWingCommand) {
			System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
		} else {
			orders.add(command);
			// 记录客户所点的烧烤的日志，以备算账收钱
			System.out.println("增加订单：" + command.getName() + "	时间："
					+ new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		}
	}

	// 取消订单
	public void cancelOrder(Command command) {
		orders.remove(command);
		System.out.println("取消订单：" + command.getName() + " 时间："
				+ new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
	}

	// 通知全部执行
	public void notify2Execute() {
		// 根据用户点好的烧烤订单通知厨房制作
		for (Command cmd : orders) {
			cmd.executeCommand();
		}
	}

}
