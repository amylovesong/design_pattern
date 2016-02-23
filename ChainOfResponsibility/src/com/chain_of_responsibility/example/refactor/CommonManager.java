package com.chain_of_responsibility.example.refactor;

import com.chain_of_responsibility.example.Request;

//经理
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		// 经理所能有的权限就是可准许下属两天内的假期
		if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
			System.out.println(name + "：" + request.getRequestContent() + " 数量"
					+ request.getNumber() + " 被批准");
		} else {// 其余的申请都需要转到上级
			if (superior != null) {
				superior.requestApplications(request);
			}
		}
	}

}
