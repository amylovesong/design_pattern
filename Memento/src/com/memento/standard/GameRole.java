package com.memento.standard;

/**
 * ��Ϸ��ɫ
 * 
 * @author sunxiaoling
 * 
 */
public class GameRole {
	// ������
	private int vit;
	// ������
	private int atk;
	// ������
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

	// ״̬��ʾ
	public void stateDisplay() {
		System.out.println("��ɫ��ǰ״̬��");
		System.out.println("������" + this.vit);
		System.out.println("��������" + this.atk);
		System.out.println("��������" + this.def);
		System.out.println();
	}

	// ��ó�ʼ״̬
	public void getInitState() {
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}

	// ս��
	public void Fight() {
		// ս������Ϸ�������Ϊ0
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}

	// �����������ɫ״̬������������Ϸ��ɫ������״ֵ̬ͨ��ʵ��������ɫ״̬�洢�䡱����
	// �����ɫ״̬
	public RoleStateMemento saveState() {
		return new RoleStateMemento(vit, atk, def);
	}

	// �������ָ���ɫ״̬���������ɽ��ⲿ�ġ���ɫ״̬�洢�䡱��״ֵ̬�ָ�����Ϸ��ɫ
	// �ָ���ɫ״̬
	public void recoveryState(RoleStateMemento memento) {
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}

}
