package com.builder.sun;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class PersonThinBuilder {
	private Canvas canvas;
	private Paint paint;

	public PersonThinBuilder(Canvas canvas, Paint paint) {
		this.canvas = canvas;
		this.paint = paint;
	}

	public void build() {
		// ͷ
		canvas.drawCircle(240, 100, 30, paint);
		// body
		RectF body = new RectF(220, 135, 260, 280);
		canvas.drawRect(body, paint);
		// arms
		canvas.drawLine(220, 135, 180, 260, paint);
		canvas.drawLine(260, 135, 300, 260, paint);
		// legs
		canvas.drawLine(220, 280, 175, 360, paint);
		canvas.drawLine(260, 280, 305, 360, paint);
	}

}
