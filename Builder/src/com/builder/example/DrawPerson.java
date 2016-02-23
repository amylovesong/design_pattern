package com.builder.example;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class DrawPerson extends View implements Runnable {

	// ����Paint����
	private Paint paint = null;

	public DrawPerson(Context context) {
		super(context);
		// ��������
		paint = new Paint();
		// �����߳�
		new Thread(this).start();
	}

	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		// �������
		paint.setAntiAlias(true);
		// ����ͼ��Ϊ����
		// mPaint.setStyle(Paint.Style.STROKE);
		// ���û�����ɫ�Ϳ��
		paint.setColor(Color.BLUE);
		paint.setStrokeWidth(5);

		// // person1
		// // ͷ
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

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			// ʹ��postInvalidate ����ֱ�����߳��и��½���
			postInvalidate();
		}
	}

}
