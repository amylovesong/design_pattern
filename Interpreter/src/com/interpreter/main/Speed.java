package com.interpreter.main;

import com.interpreter.example.Expression;

//������
public class Speed extends Expression {

	@Override
	public void excute(String key, double value) {
		String speed;
		if (value < 500) {
			speed = "����";
		} else if (value >= 1000) {
			speed = "����";
		} else {
			speed = "����";
		}

		System.out.print(speed + " ");
	}
}
