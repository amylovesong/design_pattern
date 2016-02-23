package com.state.example;

import com.state.standard.Work;

public class State {
	private static int hour = 0;// �ӵ�
	private static boolean workFinished = false;// ������ɱ��

	// д���򷽷�
	public static void writeProgram() {
		if (hour < 12) {
			System.out.println("��ǰʱ�䣺" + hour + "�� ���繤��������ٱ�");
		} else if (hour < 13) {
			System.out.println("��ǰʱ�䣺" + hour + "�� ���ˣ��緹�����������ݡ�");
		} else if (hour < 17) {
			System.out.println("��ǰʱ�䣺" + hour + "�� ����״̬����������Ŭ��");
		} else {
			if (workFinished) {
				System.out.println("��ǰʱ�䣺" + hour + "�� �°�ؼ���");
			} else {
				if (hour < 21) {
					System.out.println("��ǰʱ�䣺" + hour + "�� �Ӱ࣬ƣ��֮��");
				} else {
					System.out.println("��ǰʱ�䣺" + hour + "�� �����ˣ�˯���ˡ�");
				}
			}
		}
	}

	public static void main(String[] args) {
		/****** ����״̬��һ�棬��ȫ��������̵Ĵ��� ******/
		// hour = 9;
		// writeProgram();
		// hour = 10;
		// writeProgram();
		// hour = 12;
		// writeProgram();
		// hour = 13;
		// writeProgram();
		// hour = 14;
		// writeProgram();
		//
		// hour = 17;
		// // ������ɣ�������°࣬����͵üӰ�
		// workFinished = true;
		// // workFinished = false;
		// writeProgram();
		//
		// hour = 19;
		// writeProgram();
		// hour = 22;
		// writeProgram();
		/****** ����״̬�ڶ��� ******/
		/****** ����״̬������ ******/
		// ������Ŀ
		Work emergencyProjects = new Work();
		emergencyProjects.setHour(9);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(10);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(12);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(13);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(14);
		emergencyProjects.writeProgram();

		emergencyProjects.setHour(17);
		emergencyProjects.setFinish(true);
		// emergencyProjects.setFinish(false);
		emergencyProjects.writeProgram();

		emergencyProjects.setHour(19);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(22);
		emergencyProjects.writeProgram();

	}
}
