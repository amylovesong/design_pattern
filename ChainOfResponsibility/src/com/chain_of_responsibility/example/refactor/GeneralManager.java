package com.chain_of_responsibility.example.refactor;

import com.chain_of_responsibility.example.Request;

//总经理
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		// 总经理可准许下属任意天的假期
		if (request.getRequestType().equals("请假")) {
			System.out.println(name + "：" + request.getRequestContent() + " 数量"
					+ request.getNumber() + " 被批准");
		} else if (request.getRequestType().equals("加薪")
				&& request.getNumber() <= 500) {// 加薪在500以内没有问题
			System.out.println(name + "：" + request.getRequestContent() + " 数量"
					+ request.getNumber() + " 被批准");
		} else if (request.getRequestType().equals("加薪")
				&& request.getNumber() > 500) {// 超过500，就要考虑一下了
			System.out.println(name + "：" + request.getRequestContent() + " 数量"
					+ request.getNumber() + " 再说吧");
		}
	}
}
