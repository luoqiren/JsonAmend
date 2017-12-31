package com.lqr.util;

import java.util.Date;

public class PmsUserInfos {

	private String userAcct; // �û��˻�
	private String userPassword; // �û�����
	private String userRole; // �û���ɫ,�洢��ʽ: R01,R02,R03
	private Date updatedDate; // ��������
	
	private Date startDate;
	private Date endDate;

	public PmsUserInfos() {
		
	}
	
	public String getUserAcct() {
		return userAcct;
	}

	public void setUserAcct(String userAcct) {
		this.userAcct = userAcct;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}