package pers.haoyang.monsoon.service.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 登陆记录表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@TableName("member_login_record")
public class LoginRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 登陆设备ip
	 */
	private String loginIp;
	/**
	 * 登陆设备UA
	 */
	private String loginUa;
	/**
	 * 登陆设备所在城市
	 */
	private String loginCity;
	/**
	 * 登陆设备操作系统
	 */
	private String loginOs;
	/**
	 * 登陆设备浏览器
	 */
	private String loginBrowser;
	/**
	 * 登陆设备/浏览器指纹
	 */
	private String loginDeviceId;
	/**
	 * 登陆类型（1-web，2-app）这个暂时这样记录
	 */
	private Integer loginType;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 最后修改时间
	 */
	private Date gmtModified;

	public LoginRecordEntity() {
	}

	public LoginRecordEntity(Long id, Long userId, String loginIp, String loginUa, String loginCity, String loginOs, String loginBrowser, String loginDeviceId, Integer loginType, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userId = userId;
		this.loginIp = loginIp;
		this.loginUa = loginUa;
		this.loginCity = loginCity;
		this.loginOs = loginOs;
		this.loginBrowser = loginBrowser;
		this.loginDeviceId = loginDeviceId;
		this.loginType = loginType;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public String getLoginUa() {
		return loginUa;
	}

	public void setLoginUa(String loginUa) {
		this.loginUa = loginUa;
	}

	public String getLoginCity() {
		return loginCity;
	}

	public void setLoginCity(String loginCity) {
		this.loginCity = loginCity;
	}

	public String getLoginOs() {
		return loginOs;
	}

	public void setLoginOs(String loginOs) {
		this.loginOs = loginOs;
	}

	public String getLoginBrowser() {
		return loginBrowser;
	}

	public void setLoginBrowser(String loginBrowser) {
		this.loginBrowser = loginBrowser;
	}

	public String getLoginDeviceId() {
		return loginDeviceId;
	}

	public void setLoginDeviceId(String loginDeviceId) {
		this.loginDeviceId = loginDeviceId;
	}

	public Integer getLoginType() {
		return loginType;
	}

	public void setLoginType(Integer loginType) {
		this.loginType = loginType;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
}
