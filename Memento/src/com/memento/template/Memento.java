package com.memento.template;

/**
 * ����¼��
 * 
 * @author sunxiaoling
 * 
 */
public class Memento {
	private String state;

	// Constructor����������ݵ���
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		// ��Ҫ������������ԣ������Ƕ��
		return state;
	}
}
