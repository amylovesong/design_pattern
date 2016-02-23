package com.state.sun;

/**
 * ������
 * 
 * @author sunxiaoling
 * 
 */
public class Work {
	private int hour;
	private boolean finish = false;

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

	public void writeProgram() {
		if (hour < 12) {
			System.out.println("��ǰʱ�䣺" + hour + "�� ���繤��������ٱ�");
		} else if (hour < 13) {
			System.out.println("��ǰʱ�䣺" + hour + "�� ���ˣ��緹�����������ݡ�");
		} else if (hour < 17) {
			System.out.println("��ǰʱ�䣺" + hour + "�� ����״̬����������Ŭ��");
		} else {
			if (finish) {
				System.out.println("��ǰʱ�䣺" + hour + "�� �°�ؼ���");
			} else {
				if (hour < 21) {
					System.out.println("��ǰʱ�䣺" + hour + "�� �Ӱ࣬ƣ��֮��");
				} else {
					System.out.println("��ǰʱ�䣺" + hour + "�� �����ˣ�˯���ˡ�");
				}
			}
		}
	}
}
