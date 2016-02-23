package com.state.standard;

/**
 * 中午工作状态
 * 
 * @author sunxiaoling
 * 
 */
public class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 13) {
			System.out.println("当前时间：" + w.getHour() + "点 饿了，午饭；犯困，午休。");
		} else {
			// 超过13点，则转入下午工作状态
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}

}
