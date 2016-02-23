package com.memento.example;

import com.memento.standard.GameRole;
import com.memento.standard.RoleStateCaretaker;
import com.memento.standard.RoleStateMemento;
import com.memento.template.Caretaker;
import com.memento.template.Originator;

public class Main {
	public static void main(String[] args) {
		/********** 备忘录模式第一版 **********/
		/** 客户端的职责太大，而且游戏角色的细节都暴露给了客户端 **/
		// // 大战Boss前
		// GameRole lixiaoyao = new GameRole();
		// // 获得初始角色状态
		// lixiaoyao.getInitState();
		// lixiaoyao.stateDisplay();
		//
		// // 保存进度
		// GameRole backup = new GameRole();
		// // 通过“游戏角色”的新实例来保存进度
		// backup.setVit(lixiaoyao.getVit());
		// backup.setAck(lixiaoyao.getAck());
		// backup.setDef(lixiaoyao.getDef());
		//
		// // 大战Boss时，损耗严重
		// lixiaoyao.Fight();
		// lixiaoyao.stateDisplay();
		//
		// // 恢复之前状态，重新来玩
		// lixiaoyao.setVit(backup.getVit());
		// lixiaoyao.setAck(backup.getAck());
		// lixiaoyao.setDef(backup.getDef());
		//
		// lixiaoyao.stateDisplay();

		/********** 备忘录模式模板 **********/
		/** 把要保存的细节给封装在了Memento中，这样如果需要更改保存的细节时，就不用影响客户端了 **/
		// Originator o = new Originator();
		// // Originator初始状态，状态属性为“On”
		// o.setState("On");
		// o.show();
		//
		// Caretaker c = new Caretaker();
		// // 保存状态时，由于有了很好的封装，可以隐藏Originator的实现细节
		// c.setMemento(o.createMemento());
		//
		// // Originator的状态属性改为“Off”
		// o.setState("Off");
		// o.show();
		//
		// // 恢复原初始状态
		// o.setMemento(c.getMemento());
		// o.show();

		/********** 备忘录模式第二版 **********/
		// 大战Boss前
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();

		// 保存进度
		// 此时由于封装在Memento中，隐藏我们并不知道保存了哪些具体的角色数据
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(lixiaoyao.saveState());

		// 大战Boss时，损耗严重
		lixiaoyao.Fight();
		lixiaoyao.stateDisplay();

		// 恢复之前状态
		lixiaoyao.recoveryState(stateAdmin.getMemento());
		lixiaoyao.stateDisplay();
	}
}
