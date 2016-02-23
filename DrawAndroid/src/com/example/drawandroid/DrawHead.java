package com.example.drawandroid;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class DrawHead implements DrawGraphics {

	private Paint paint = null;
	private Paint paint_eye = null;

	public DrawHead() {
		paint = new Paint();
		paint_eye = new Paint();
	}

	@Override
	public void draw(Canvas canvas) {
		// 绘制圆形(圆心x，圆心y，半径r，画笔p)
		paint_eye.setAntiAlias(true);
		paint.setAntiAlias(true);
		RectF rectF = new RectF(120, 60, 370, 240);
		paint_eye.setColor(Color.WHITE);
		paint.setColor(Color.GREEN);

		/**** 忍者神龟 ****/
		// canvas.drawRect(rectF, paint);
		// paint.setColor(Color.BLUE);

		// canvas.drawArc(oval, startAngle, sweepAngle, useCenter, paint)
		// 第一个参数oval为RectF类型，即圆弧显示区域
		// startAngle和sweepAngle均为float类型，分别表示圆弧起始角度和圆弧度数,3点钟方向为0度
		// useCenter设置是否显示圆心，boolean类型
		// paint为画笔

		/**** Android ****/
		canvas.drawArc(rectF, 180, 180, true, paint);

		// canvas.drawCircle(float,float, float, Paint)
		// 前两个参数代表圆心坐标，第三个参数为圆半径，第四个参数是画笔；
		// 两个眼睛
		canvas.drawCircle(190, 110, 18, paint_eye);
		canvas.drawCircle(300, 110, 18, paint_eye);
	}
}
