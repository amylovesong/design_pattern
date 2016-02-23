package com.prototype.standard.finalversion;

import android.util.Log;

import com.prototype.utils.Utils;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;

	private WorkExperience work;

	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}

	private Resume(WorkExperience work) throws CloneNotSupportedException {
		this.work = (WorkExperience) work.clone();
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
		Resume resume = new Resume(this.work);
		resume.name = this.name;
		resume.sex = this.sex;
		resume.age = this.age;

		return resume;
	}
}
