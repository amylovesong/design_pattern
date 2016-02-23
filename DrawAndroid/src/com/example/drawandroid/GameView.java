package com.example.drawandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class GameView extends View implements Runnable {

	// 声明Paint对象
	private Paint mPaint = null;
	private DrawGraphics drawGraphics = null;

	public GameView(Context context) {
		super(context);
		// 构建对象
		mPaint = new Paint();
		// 开启线程
		new Thread(this).start();
	}

	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		// 设置画布为黑色背景
		// canvas.drawColor(Color.BLACK);
		// 消除锯齿
		mPaint.setAntiAlias(true);
		// 设置图形为空心
		mPaint.setStyle(Paint.Style.STROKE);
		// 绘制空心几何图形
		// 头部
		drawGraphics = new DrawHead();
		drawGraphics.draw(canvas);
		// 天线
		drawGraphics = new DrawAntenna();
		drawGraphics.draw(canvas);
		// 身体四肢
		drawGraphics = new DrawBody_Arms_Legs();
		drawGraphics.draw(canvas);
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
