package com.panda.sky.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_user_info")
@NamedQuery(name = "TUserInfo.findAll",query="SELECT t FROM TUserInfo t")
public class TUserInfo implements Serializable{

	private static final long serialVersionUID = -2044756357862772106L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_password")
	private String userPassword;

	@Column(name = "old_user_password")
	private String old_user_password;

	@Column(name = "update_time")
	private String updateime;

	private String updater;

	private String creater;

	@Column(name = "create_time")
	private String createTime;

	private String remark;

	private int status;

	public TUserInfo() {

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getOld_user_password() {
		return old_user_password;
	}

	public void setOld_user_password(String old_user_password) {
		this.old_user_password = old_user_password;
	}

	public String getUpdateime() {
		return updateime;
	}

	public void setUpdateime(String updateime) {
		this.updateime = updateime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
