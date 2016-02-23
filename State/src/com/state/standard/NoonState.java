package com.state.standard;

/**
 * ���繤��״̬
 * 
 * @author sunxiaoling
 * 
 */
public class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 13) {
			System.out.println("��ǰʱ�䣺" + w.getHour() + "�� ���ˣ��緹�����������ݡ�");
		} else {
			// ����13�㣬��ת�����繤��״̬
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}

}
