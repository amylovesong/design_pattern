package com.command.sun;

//烤肉串命令
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	// 具体命令类，执行命令时，执行具体的行为
	@Override
	public void executeCommand() {
		receiver.bakeMutton();
	}

	@Override
	public String getName() {
		return "命令模式.烤羊肉串";
	}

}
