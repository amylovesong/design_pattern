package com.command.sun;

//¿¾¼¦³áÃüÁî
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
		return "ÃüÁîÄ£Ê½.¿¾¼¦³á";
	}

}
