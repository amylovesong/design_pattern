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
	 * ���ø�����Ϣ
	 * 
	 * @param sex
	 *            �Ա�
	 * @param age
	 *            ����
	 */
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	/**
	 * ���ù�������
	 * 
	 * @param timeArea
	 *            ʱ���
	 * @param company
	 *            ��˾��
	 */
	public void setWorkExperience(String workDate, String company) {
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	public void display() {
		Log.d(Utils.TAG, name + " " + sex + " " + age);
		Log.d(Utils.TAG, "����������" + work.getWorkDate() + " " + work.getCompany());
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
