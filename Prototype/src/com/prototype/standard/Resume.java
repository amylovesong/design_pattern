package com.prototype.standard;

import android.util.Log;

import com.prototype.utils.Utils;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;

	// 引用类型变量在浅复制时只复制了引用，即它指向原来的对象。对其修改就是对原对象的修改
	private WorkExperience work;

	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
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
	public void setWorkExperience(String workDate, String company) {
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	public void display() {
		Log.d(Utils.TAG, name + " " + sex + " " + age);
		Log.d(Utils.TAG, "工作经历：" + work.getWorkDate() + " " + work.getCompany());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
