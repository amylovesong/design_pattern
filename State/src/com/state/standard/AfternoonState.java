package com.state.standard;

/**
 * ����Ͱ�����״̬��
 * 
 * @author sunxiaoling
 * 
 */
public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 17) {
			System.out.println("��ǰʱ�䣺" + w.getHour() + "�� ����״̬����������Ŭ��");
		} else {
			// ����17�㣬��ת����乤��״̬
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}
