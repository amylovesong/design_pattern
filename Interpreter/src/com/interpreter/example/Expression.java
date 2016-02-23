package com.interpreter.example;

/**
 * ���ʽ�ࣨ�൱��ģ���е�AbstractExpression��
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Expression {
	// ������
	public void interpret(PlayContext context) {
		if (context.getText().length() == 0) {
			return;
		} else {
			// ��������ı��ĵ�һ���ַ�����ΪplayKey
			String playKey = context.getText().substring(0, 1);
			// ��playKey�������ı����Ƴ�
			context.setText(context.getText().substring(2));
			// ��������ı��еĲ���ֵ
			double playValue = Double.parseDouble(context.getText().substring(
					0, context.getText().indexOf(" ")));
			// ��playValue�������ı����Ƴ�
			context.setText(context.getText().substring(
					context.getText().indexOf(" ") + 1));

			excute(playKey, playValue);
		}
	}

	// ִ��
	public abstract void excute(String key, double value);
}
