package com.builder.sun;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

@SuppressLint("DrawAllocation")
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
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(5);

		// // 瘦纸
		// PersonThinBuilder ptb = new PersonThinBuilder(canvas, paint);
		// ptb.build();

		// 胖纸
		PersonFatBuilder pfb = new PersonFatBuilder(canvas, paint);
		pfb.build();
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
