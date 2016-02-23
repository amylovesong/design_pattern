package com.state.standard;

/**
 * 晚间工作状态
 * 
 * @author sunxiaoling
 * 
 */
public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.isFinish()) {
			// 如果完成任务，则转入下班休息状态
			w.setState(new RestState());
			w.writeProgram();
		} else {
			if (w.getHour() < 21) {
				System.out.println("当前时间：" + w.getHour() + "点 加班，疲累之极");
			} else {
				// 超过21点，则转入睡眠状态
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}
}
