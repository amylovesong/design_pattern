package com.builder.sun;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class PersonFatBuilder {

	private Canvas canvas;
	private Paint paint;

	public PersonFatBuilder(Canvas canvas, Paint paint) {
		this.canvas = canvas;
		this.paint = paint;
	}

	public void build() {
		// ͷ
		canvas.drawCircle(240, 100, 30, paint);
		// body
		RectF body = new RectF(200, 135, 280, 280);
		canvas.drawArc(body, 0, 360, true, paint);
		// arms
		canvas.drawLine(220, 135, 160, 260, paint);
		canvas.drawLine(260, 135, 320, 260, paint);
		// legs
		canvas.drawLine(220, 280, 175, 360, paint);
		canvas.drawLine(260, 280, 305, 360, paint);
	}
}
