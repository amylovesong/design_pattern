package com.prototype.sun;

import android.util.Log;

import com.prototype.utils.Utils;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;

	public Resume(String name) {
		this.name = name;
	}

	/**
	 * 设置个人信息
	 * 
	 * @param sex
	 *            性别
	 * @param age
	 *            年龄
	 */
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 设置工作经历
	 * 
	 * @param timeArea
	 *            时间段
	 * @param company
	 *            公司名
	 */
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	public void display() {
		Log.d(Utils.TAG, name + " " + sex + " " + age);
		Log.d(Utils.TAG, "工作经历：" + timeArea + " " + company);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
