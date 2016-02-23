package com.example.drawandroid;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class DrawBody_Arms_Legs implements DrawGraphics {

	private Paint paint = null;

	public DrawBody_Arms_Legs() {
		paint = new Paint();
	}

	@Override
	public void draw(Canvas canvas) {
		// 定义圆角矩形对象
		RectF rectF1 = new RectF(120, 170, 370, 500);
		RectF rectF2 = new RectF(40, 150, 90, 400);
		RectF rectF3 = new RectF(390, 150, 440, 400);
		RectF rectF4 = new RectF(140, 520, 200, 650);
		RectF rectF5 = new RectF(290, 520, 350, 650);
		paint.setAntiAlias(true);
		// 设置画笔颜色
		paint.setColor(Color.GREEN);
		// 在画布上绘制圆角矩形/圆弧/直线

		// body
		canvas.drawRoundRect(rectF1, 20, 20, paint);
		// arms
		canvas.drawRoundRect(rectF2, 20, 20, paint);
		canvas.drawRoundRect(rectF3, 20, 20, paint);
		// legs
		canvas.drawRoundRect(rectF4, 20, 20, paint);
		canvas.drawRoundRect(rectF5, 20, 20, paint);
	}
}
