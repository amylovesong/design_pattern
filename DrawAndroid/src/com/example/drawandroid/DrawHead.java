package com.example.drawandroid;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class DrawHead implements DrawGraphics {

	private Paint paint = null;
	private Paint paint_eye = null;

	public DrawHead() {
		paint = new Paint();
		paint_eye = new Paint();
	}

	@Override
	public void draw(Canvas canvas) {
		// ����Բ��(Բ��x��Բ��y���뾶r������p)
		paint_eye.setAntiAlias(true);
		paint.setAntiAlias(true);
		RectF rectF = new RectF(120, 60, 370, 240);
		paint_eye.setColor(Color.WHITE);
		paint.setColor(Color.GREEN);

		/**** ������� ****/
		// canvas.drawRect(rectF, paint);
		// paint.setColor(Color.BLUE);

		// canvas.drawArc(oval, startAngle, sweepAngle, useCenter, paint)
		// ��һ������ovalΪRectF���ͣ���Բ����ʾ����
		// startAngle��sweepAngle��Ϊfloat���ͣ��ֱ��ʾԲ����ʼ�ǶȺ�Բ������,3���ӷ���Ϊ0��
		// useCenter�����Ƿ���ʾԲ�ģ�boolean����
		// paintΪ����

		/**** Android ****/
		canvas.drawArc(rectF, 180, 180, true, paint);

		// canvas.drawCircle(float,float, float, Paint)
		// ǰ������������Բ�����꣬����������ΪԲ�뾶�����ĸ������ǻ��ʣ�
		// �����۾�
		canvas.drawCircle(190, 110, 18, paint_eye);
		canvas.drawCircle(300, 110, 18, paint_eye);
	}
}
