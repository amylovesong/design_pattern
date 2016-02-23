package com.builder.standard;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class PersonThinBuilder extends PersonBuilder {

	public PersonThinBuilder(Canvas canvas, Paint paint) {
		super(canvas, paint);
	}

	@Override
	public void buildHead() {
		// ͷ
		canvas.drawCircle(240, 100, 30, paint);
	}

	@Override
	public void buildBody() {
		// body
		RectF body = new RectF(220, 135, 260, 280);
		canvas.drawRect(body, paint);
	}

	@Override
	public void buildArmLeft() {
		canvas.drawLine(220, 135, 180, 260, paint);
	}

	@Override
	public void buildArmRight() {
		canvas.drawLine(260, 135, 300, 260, paint);
	}

	@Override
	public void buildLegLeft() {
		canvas.drawLine(220, 280, 175, 360, paint);
	}

	@Override
	public void buildLegRight() {
		canvas.drawLine(260, 280, 305, 360, paint);
	}

}
