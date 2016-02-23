package com.prototype.standard;

import android.util.Log;

import com.prototype.utils.Utils;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;

	// �������ͱ�����ǳ����ʱֻ���������ã�����ָ��ԭ���Ķ��󡣶����޸ľ��Ƕ�ԭ������޸�
	private WorkExperience work;

	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
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
		// TODO Auto-generated method stub
		return super.clone();
	}
}
