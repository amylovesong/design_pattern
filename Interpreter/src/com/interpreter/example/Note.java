package com.interpreter.example;

/**
 * �����ࣨ�൱��ģ���е�TerminalExpression��
 * 
 * @author sunxiaoling
 * 
 */
public class Note extends Expression {

	@Override
	public void excute(String key, double value) {
		String note = "";

		// �����õ�key��C������1��do���������D������2��Re�����Դ�����
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
