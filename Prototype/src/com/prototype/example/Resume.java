package com.prototype.example;

import com.prototype.utils.Utils;

import android.util.Log;

/**
 * ����
 * 
 * @author sunxiaoling
 * 
 */
public class Resume {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;

	public Resume(String name) {
		this.name = name;
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
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	public void display() {
		Log.d(Utils.TAG, name + " " + sex + " " + age);
		Log.d(Utils.TAG, "����������" + timeArea + " " + company);
	}

}
