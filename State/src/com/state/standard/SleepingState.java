package com.state.standard;

/**
 * ˯��״̬
 * 
 * @author sunxiaoling
 * 
 */
public class SleepingState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println("��ǰʱ�䣺" + w.getHour() + "�� �����ˣ�˯���ˡ�");
	}

}
