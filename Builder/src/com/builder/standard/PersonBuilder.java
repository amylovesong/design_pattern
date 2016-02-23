package com.builder.standard;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class PersonBuilder {
	protected Canvas canvas;
	protected Paint paint;

	public PersonBuilder(Canvas canvas, Paint paint) {
		this.canvas = canvas;
		this.paint = paint;
	}

	public abstract void buildHead();

	public abstract void buildBody();

	public abstract void buildArmLeft();

	public abstract void buildArmRight();

	public abstract void buildLegLeft();

	public abstract void buildLegRight();

}
