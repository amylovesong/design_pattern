package com.memento.standard;

/**
 * 角色状态存储箱
 * 
 * @author sunxiaoling
 * 
 */
public class RoleStateMemento {
	private int vit;
	private int atk;
	private int def;

	public RoleStateMemento(int vit, int atk, int def) {
		// 将生命力、攻击力、防御力存入状态存储箱对象中
		this.vit = vit;
		this.atk = atk;
		this.def = def;
	}

	// 生命力
	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	// 攻击力
	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	// 防御力
	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
}
