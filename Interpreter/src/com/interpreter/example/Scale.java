package com.interpreter.example;

/**
 * �����ࣨ�൱��ģ���е�TerminalExpression��
 * 
 * @author sunxiaoling
 * 
 */
public class Scale extends Expression {

	@Override
	public void excute(String key, double value) {
		String scale = "";
		// �����õ�key��O����value��1�����������2����������3���Ǹ���
		switch ((int) value) {
		case 1:
			scale = "����";
			break;
		case 2:
			scale = "����";
			break;
		case 3:
			scale = "����";
			break;

		default:
			break;
		}

		System.out.print(scale + " ");
	}
}
