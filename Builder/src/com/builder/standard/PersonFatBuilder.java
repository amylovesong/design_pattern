package com.builder.standard;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class PersonFatBuilder extends PersonBuilder {

	public PersonFatBuilder(Canvas canvas, Paint paint) {
		super(canvas, paint);
	}

	@Override
	public void buildHead() {
		canvas.drawCircle(240, 100, 30, paint);
	}

	@Override
	public void buildBody() {
		RectF body = new RectF(200, 135, 280, 280);
		canvas.drawArc(body, 0, 360, true, paint);
	}

	@Override
	public void buildArmLeft() {
		canvas.drawLine(220, 135, 160, 260, paint);
	}

	@Override
	public void buildArmRight() {
		canvas.drawLine(260, 135, 320, 260, paint);
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
