package com.interpreter.example;

/**
 * 音阶类（相当于模板中的TerminalExpression）
 * 
 * @author sunxiaoling
 * 
 */
public class Scale extends Expression {

	@Override
	public void excute(String key, double value) {
		String scale = "";
		// 如果获得的key是O并且value是1则演奏低音，2则是中音，3则是高音
		switch ((int) value) {
		case 1:
			scale = "低音";
			break;
		case 2:
			scale = "中音";
			break;
		case 3:
			scale = "高音";
			break;

		default:
			break;
		}

		System.out.print(scale + " ");
	}
}
