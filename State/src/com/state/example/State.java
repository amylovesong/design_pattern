package com.state.example;

import com.state.standard.Work;

public class State {
	private static int hour = 0;// 钟点
	private static boolean workFinished = false;// 任务完成标记

	// 写程序方法
	public static void writeProgram() {
		if (hour < 12) {
			System.out.println("当前时间：" + hour + "点 上午工作，精神百倍");
		} else if (hour < 13) {
			System.out.println("当前时间：" + hour + "点 饿了，午饭；犯困，午休。");
		} else if (hour < 17) {
			System.out.println("当前时间：" + hour + "点 下午状态还不错，继续努力");
		} else {
			if (workFinished) {
				System.out.println("当前时间：" + hour + "点 下班回家了");
			} else {
				if (hour < 21) {
					System.out.println("当前时间：" + hour + "点 加班，疲累之极");
				} else {
					System.out.println("当前时间：" + hour + "点 不行了，睡着了。");
				}
			}
		}
	}

	public static void main(String[] args) {
		/****** 工作状态第一版，完全是面向过程的代码 ******/
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
		// // 任务完成，则可以下班，否则就得加班
		// workFinished = true;
		// // workFinished = false;
		// writeProgram();
		//
		// hour = 19;
		// writeProgram();
		// hour = 22;
		// writeProgram();
		/****** 工作状态第二版 ******/
		/****** 工作状态第三版 ******/
		// 紧急项目
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
