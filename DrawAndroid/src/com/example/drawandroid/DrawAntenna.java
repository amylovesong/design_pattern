package com.example.drawandroid;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class DrawAntenna implements DrawGraphics {

	private Paint paint = null;

	public DrawAntenna() {
		paint = new Paint();
	}

	@Override
	public void draw(Canvas canvas) {
		paint.setAntiAlias(true);
		// ����ֱ��
		paint.setColor(Color.GREEN);
		// ����������ϸ
		paint.setStrokeWidth(12);
		canvas.drawLine(120, 40, 170, 90, paint);
		canvas.drawLine(320, 90, 370, 40, paint);
	}
}
