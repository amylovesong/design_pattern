package com.memento.standard;

/**
 * 角色状态管理类
 * 
 * @author sunxiaoling
 * 
 */
public class RoleStateCaretaker {
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}
}
