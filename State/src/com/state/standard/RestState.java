package com.state.standard;

/**
 * �°���Ϣ״̬
 * 
 * @author sunxiaoling
 * 
 */
public class RestState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println("��ǰʱ�䣺" + w.getHour() + "�� �°�ؼ���");
	}

}
