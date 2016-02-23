package com.state.standard;

public class Work {
	// ���ӵ㡱���ԣ�״̬ת��������
	private int hour;
	// ��������ɡ����ԣ��Ƿ����°������
	private boolean finish = false;
	private State current;

	public Work() {
		// ������ʼ��Ϊ���繤��״̬��������9�㿪ʼ�ϰ�
		current = new ForenoonState();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void setState(State state) {
		current = state;
	}

	public void writeProgram() {
		current.writeProgram(this);
	}
}
