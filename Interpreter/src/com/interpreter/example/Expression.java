package com.interpreter.example;

/**
 * 表达式类（相当于模板中的AbstractExpression）
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Expression {
	// 解释器
	public void interpret(PlayContext context) {
		if (context.getText().length() == 0) {
			return;
		} else {
			// 获得演奏文本的第一个字符，作为playKey
			String playKey = context.getText().substring(0, 1);
			// 将playKey从演奏文本中移除
			context.setText(context.getText().substring(2));
			// 获得演奏文本中的参数值
			double playValue = Double.parseDouble(context.getText().substring(
					0, context.getText().indexOf(" ")));
			// 将playValue从演奏文本中移除
			context.setText(context.getText().substring(
					context.getText().indexOf(" ") + 1));

			excute(playKey, playValue);
		}
	}

	// 执行
	public abstract void excute(String key, double value);
}
