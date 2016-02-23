package com.state.standard;

/**
 * ���繤��״̬
 * 
 * @author sunxiaoling
 * 
 */
public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 12) {
			System.out.println("��ǰʱ�䣺" + w.getHour() + "�� ���繤��������ٱ�");
		} else {
			// ����12�㣬��ת�����繤��״̬
			w.setState(new NoonState());
			w.writeProgram();
		}
	}
}
