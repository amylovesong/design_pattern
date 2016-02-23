package com.state.standard;

/**
 * ��乤��״̬
 * 
 * @author sunxiaoling
 * 
 */
public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.isFinish()) {
			// ������������ת���°���Ϣ״̬
			w.setState(new RestState());
			w.writeProgram();
		} else {
			if (w.getHour() < 21) {
				System.out.println("��ǰʱ�䣺" + w.getHour() + "�� �Ӱ࣬ƣ��֮��");
			} else {
				// ����21�㣬��ת��˯��״̬
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}
}
