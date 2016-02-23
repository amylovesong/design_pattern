package com.example.drawandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class GameView extends View implements Runnable {

	// ����Paint����
	private Paint mPaint = null;
	private DrawGraphics drawGraphics = null;

	public GameView(Context context) {
		super(context);
		// ��������
		mPaint = new Paint();
		// �����߳�
		new Thread(this).start();
	}

	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		// ���û���Ϊ��ɫ����
		// canvas.drawColor(Color.BLACK);
		// �������
		mPaint.setAntiAlias(true);
		// ����ͼ��Ϊ����
		mPaint.setStyle(Paint.Style.STROKE);
		// ���ƿ��ļ���ͼ��
		// ͷ��
		drawGraphics = new DrawHead();
		drawGraphics.draw(canvas);
		// ����
		drawGraphics = new DrawAntenna();
		drawGraphics.draw(canvas);
		// ������֫
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
			// ʹ��postInvalidate ����ֱ�����߳��и��½���
			postInvalidate();
		}
	}

}
