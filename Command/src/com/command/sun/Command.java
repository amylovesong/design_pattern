package com.command.sun;

//抽象命令
public abstract class Command {
	protected Barbecuer receiver;

	// 抽象命令类，只需要确定“烤肉串者”是谁
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}

	// 执行命令
	public abstract void executeCommand();

	// 附件方法：返回名称
	public abstract String getName();
}
