package com.interpreter.example;

/**
 * 音符类（相当于模板中的TerminalExpression）
 * 
 * @author sunxiaoling
 * 
 */
public class Note extends Expression {

	@Override
	public void excute(String key, double value) {
		String note = "";

		// 如果获得的key是C则演奏1（do），如果是D则演奏2（Re），以此类推
		if (key.equals("C")) {
			note = "1";
		} else if (key.equals("D")) {
			note = "2";
		} else if (key.equals("E")) {
			note = "3";
		} else if (key.equals("F")) {
			note = "4";
		} else if (key.equals("G")) {
			note = "5";
		} else if (key.equals("A")) {
			note = "6";
		} else if (key.equals("B")) {
			note = "7";
		}

		System.out.print(note + " ");
	}
}
