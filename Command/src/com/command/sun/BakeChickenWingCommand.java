package com.command.sun;

//����������
public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void executeCommand() {
		receiver.bakeChickenWing();
	}

	@Override
	public String getName() {
		return "����ģʽ.������";
	}

}
