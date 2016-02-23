package com.command.template;

//Receiver类，知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接受者
public class Receiver {
	public void action() {
		System.out.println("执行请求！");
	}
}
