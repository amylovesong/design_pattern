package com.state.standard;

public class Work {
	// “钟点”属性，状态转换的依据
	private int hour;
	// “任务完成”属性，是否能下班的依据
	private boolean finish = false;
	private State current;

	public Work() {
		// 工作初始化为上午工作状态，即上午9点开始上班
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
