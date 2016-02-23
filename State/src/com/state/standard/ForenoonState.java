package com.state.standard;

/**
 * 上午工作状态
 * 
 * @author sunxiaoling
 * 
 */
public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 12) {
			System.out.println("当前时间：" + w.getHour() + "点 上午工作，精神百倍");
		} else {
			// 超过12点，则转入中午工作状态
			w.setState(new NoonState());
			w.writeProgram();
		}
	}
}
