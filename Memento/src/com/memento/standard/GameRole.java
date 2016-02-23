package com.memento.standard;

/**
 * 游戏角色
 * 
 * @author sunxiaoling
 * 
 */
public class GameRole {
	// 生命力
	private int vit;
	// 攻击力
	private int atk;
	// 防御力
	private int def;

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAck() {
		return atk;
	}

	public void setAck(int ack) {
		this.atk = ack;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	// 状态显示
	public void stateDisplay() {
		System.out.println("角色当前状态：");
		System.out.println("体力：" + this.vit);
		System.out.println("攻击力：" + this.atk);
		System.out.println("防御力：" + this.def);
		System.out.println();
	}

	// 获得初始状态
	public void getInitState() {
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}

	// 战斗
	public void Fight() {
		// 战斗后游戏数据损耗为0
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}

	// 新增“保存角色状态”方法，将游戏角色的三个状态值通过实例化“角色状态存储箱”返回
	// 保存角色状态
	public RoleStateMemento saveState() {
		return new RoleStateMemento(vit, atk, def);
	}

	// 新增“恢复角色状态”方法，可将外部的“角色状态存储箱”中状态值恢复给游戏角色
	// 恢复角色状态
	public void recoveryState(RoleStateMemento memento) {
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}

}
