package com.panda.sky.security.domain;

/**
 * security登录用户类
 * @author pcongda
 * @version 1.0
 */
public class UserDetail {

	private int userId;
	private String mobile;
	private String password;
	private String userName;
	private String idcard;
	private String sex;
    private String email;
    private String qq;
    private String weChat;
    private String avatarImgUrl;
    private String signImgUrl;
    private String address;

	public UserDetail(int userId, String mobile, String password, String userName, String idcard, String sex, String email, String qq, String weChat, String avatarImgUrl, String signImgUrl, String address) {
		this.userId = userId;
		this.mobile = mobile;
		this.password = password;
		this.userName = userName;
		this.idcard = idcard;
		this.sex = sex;
		this.email = email;
		this.qq = qq;
		this.weChat = weChat;
		this.avatarImgUrl = avatarImgUrl;
		this.signImgUrl = signImgUrl;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWeChat() {
		return weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	public String getAvatarImgUrl() {
		return avatarImgUrl;
	}

	public void setAvatarImgUrl(String avatarImgUrl) {
		this.avatarImgUrl = avatarImgUrl;
	}

	public String getSignImgUrl() {
		return signImgUrl;
	}

	public void setSignImgUrl(String signImgUrl) {
		this.signImgUrl = signImgUrl;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
