package com.builder.sun;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

@SuppressLint("DrawAllocation")
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
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(5);

		// // ��ֽ
		// PersonThinBuilder ptb = new PersonThinBuilder(canvas, paint);
		// ptb.build();

		// ��ֽ
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
			// ʹ��postInvalidate ����ֱ�����߳��и��½���
			postInvalidate();
		}
	}

}
