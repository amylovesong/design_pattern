package com.builder.example;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class DrawPerson extends View implements Runnable {

	// 声明Paint对象
	private Paint paint = null;

	public DrawPerson(Context context) {
		super(context);
		// 构建对象
		paint = new Paint();
		// 开启线程
		new Thread(this).start();
	}

	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		// 消除锯齿
		paint.setAntiAlias(true);
		// 设置图形为空心
		// mPaint.setStyle(Paint.Style.STROKE);
		// 设置画笔颜色和宽度
		paint.setColor(Color.BLUE);
		paint.setStrokeWidth(5);

		// // person1
		// // 头
		// canvas.drawCircle(240, 100, 30, paint);
		// // body
		// RectF body = new RectF(220, 135, 260, 280);
		// canvas.drawRect(body, paint);
		// // arms
		// canvas.drawLine(220, 135, 180, 260, paint);
		// canvas.drawLine(260, 135, 300, 260, paint);
		// // legs
		// canvas.drawLine(220, 280, 175, 360, paint);
		// canvas.drawLine(260, 280, 305, 360, paint);

		// person2
		// 头
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

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			// 使用postInvalidate 可以直接在线程中更新界面
			postInvalidate();
		}
	}

}
