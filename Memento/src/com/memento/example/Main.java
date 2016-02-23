package com.memento.example;

import com.memento.standard.GameRole;
import com.memento.standard.RoleStateCaretaker;
import com.memento.standard.RoleStateMemento;
import com.memento.template.Caretaker;
import com.memento.template.Originator;

public class Main {
	public static void main(String[] args) {
		/********** ����¼ģʽ��һ�� **********/
		/** �ͻ��˵�ְ��̫�󣬶�����Ϸ��ɫ��ϸ�ڶ���¶���˿ͻ��� **/
		// // ��սBossǰ
		// GameRole lixiaoyao = new GameRole();
		// // ��ó�ʼ��ɫ״̬
		// lixiaoyao.getInitState();
		// lixiaoyao.stateDisplay();
		//
		// // �������
		// GameRole backup = new GameRole();
		// // ͨ������Ϸ��ɫ������ʵ�����������
		// backup.setVit(lixiaoyao.getVit());
		// backup.setAck(lixiaoyao.getAck());
		// backup.setDef(lixiaoyao.getDef());
		//
		// // ��սBossʱ���������
		// lixiaoyao.Fight();
		// lixiaoyao.stateDisplay();
		//
		// // �ָ�֮ǰ״̬����������
		// lixiaoyao.setVit(backup.getVit());
		// lixiaoyao.setAck(backup.getAck());
		// lixiaoyao.setDef(backup.getDef());
		//
		// lixiaoyao.stateDisplay();

		/********** ����¼ģʽģ�� **********/
		/** ��Ҫ�����ϸ�ڸ���װ����Memento�У����������Ҫ���ı����ϸ��ʱ���Ͳ���Ӱ��ͻ����� **/
		// Originator o = new Originator();
		// // Originator��ʼ״̬��״̬����Ϊ��On��
		// o.setState("On");
		// o.show();
		//
		// Caretaker c = new Caretaker();
		// // ����״̬ʱ���������˺ܺõķ�װ����������Originator��ʵ��ϸ��
		// c.setMemento(o.createMemento());
		//
		// // Originator��״̬���Ը�Ϊ��Off��
		// o.setState("Off");
		// o.show();
		//
		// // �ָ�ԭ��ʼ״̬
		// o.setMemento(c.getMemento());
		// o.show();

		/********** ����¼ģʽ�ڶ��� **********/
		// ��սBossǰ
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();

		// �������
		// ��ʱ���ڷ�װ��Memento�У��������ǲ���֪����������Щ����Ľ�ɫ����
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(lixiaoyao.saveState());

		// ��սBossʱ���������
		lixiaoyao.Fight();
		lixiaoyao.stateDisplay();

		// �ָ�֮ǰ״̬
		lixiaoyao.recoveryState(stateAdmin.getMemento());
		lixiaoyao.stateDisplay();
	}
}
