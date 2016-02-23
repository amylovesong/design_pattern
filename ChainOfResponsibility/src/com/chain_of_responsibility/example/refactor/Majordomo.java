package com.chain_of_responsibility.example.refactor;

import com.chain_of_responsibility.example.Request;

//总监
public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		// 总监所能有的权限就是可准许下属一周内的假期
		if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
			System.out.println(name + "：" + request.getRequestContent() + " 数量"
					+ request.getNumber() + " 被批准");
		} else {// 其余的申请都需要转到上级
			if (superior != null) {
				superior.requestApplications(request);
			}
		}
	}

}
