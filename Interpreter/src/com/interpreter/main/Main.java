package com.interpreter.main;

import java.util.ArrayList;

import com.interpreter.example.Expression;
import com.interpreter.example.Note;
import com.interpreter.example.PlayContext;
import com.interpreter.example.Scale;
import com.interpreter.template.AbstractExpression;
import com.interpreter.template.Context;
import com.interpreter.template.NonterminalExpression;
import com.interpreter.template.TerminalExpression;

public class Main {
	public static void main(String[] args) {
		/** 解释器模式模板 **/
		// Context context = new Context();
		// ArrayList<AbstractExpression> list = new ArrayList<>();
		// list.add(new TerminalExpression());
		// list.add(new NonterminalExpression());
		// list.add(new TerminalExpression());
		// list.add(new TerminalExpression());
		//
		// for (AbstractExpression exp : list) {
		// exp.interpret(context);
		// }

		/** 解释器模式之音乐解释器第一版 **/
		PlayContext context = new PlayContext();
		// 音乐-上海滩
		System.out.println("上海滩：");
		// context.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		Expression expression = null;
		// try {
		// while (context.getText().length() > 0) {
		// String str = context.getText().substring(0, 1);
		// // 当首字段是O时，则表达式实例化为音阶
		// if (str.equals("O")) {
		// expression = new Scale();
		// } else if (str.equals("C") || str.equals("D")
		// || str.equals("E") || str.equals("F")
		// || str.equals("G") || str.equals("A")
		// || str.equals("B") || str.equals("P")) {
		// expression = new Note();
		// }
		// expression.interpret(context);
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// System.out.println("e=" + e);
		// }

		/** 解释器模式之音乐解释器第二版（增加Speed类） **/
		context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		try {
			while (context.getText().length() > 0) {
				String str = context.getText().substring(0, 1);
				// 当首字段是O时，则表达式实例化为音阶
				if (str.equals("O")) {
					expression = new Scale();
				} else if (str.equals("T")) {
					expression = new Speed();
				} else if (str.equals("C") || str.equals("D")
						|| str.equals("E") || str.equals("F")
						|| str.equals("G") || str.equals("A")
						|| str.equals("B") || str.equals("P")) {
					expression = new Note();
				}
				expression.interpret(context);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("e=" + e);
		}
	}
}
