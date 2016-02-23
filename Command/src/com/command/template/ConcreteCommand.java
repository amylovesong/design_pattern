package com.command.template;

//具体的Command类，将一个接受者对象绑定于一个动作，调用接受者相应的操作，以execute
public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
