package com.state.standard;

/**
 * 下午和傍晚工作状态类
 * 
 * @author sunxiaoling
 * 
 */
public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 17) {
			System.out.println("当前时间：" + w.getHour() + "点 下午状态还不错，继续努力");
		} else {
			// 超过17点，则转入晚间工作状态
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}
