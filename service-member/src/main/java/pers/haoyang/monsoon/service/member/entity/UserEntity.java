package pers.haoyang.monsoon.service.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@TableName("member_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId
	private Long id;
	/**
	 * 用户等级id
	 */
	private Long userLevelId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户密码（不能采用明文存储，采用密文，MDS加密之后的数据）
	 */
	private String userPassword;
	/**
	 * 用户真实名称
	 */
	private String userNickname;
	/**
	 * 手机号码
	 */
	private String mobilePhone;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 头像
	 */
	private String header;
	/**
	 * 性别
	 */
	private Integer gender;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 生日
	 */
	private Date gmtBirth;
	/**
	 * 用户个性签名
	 */
	private String signature;
	/**
	 * 用户来源
	 */
	private Integer userSource;
	/**
	 * 用户积分
	 */
	private Integer userIntegral;
	/**
	 * 用户成长值
	 */
	private Integer userGrowth;
	/**
	 * 启动状态（0-未启用、1-启用、2-封闭）
	 */
	private Integer status;
	/**
	 * 是否删除
	 */
	private Integer isDelete;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 最后修改时间
	 */
	private Date gmtModified;

	public UserEntity() {
	}

	public UserEntity(Long id, Long userLevelId, String userName, String userPassword, String userNickname, String mobilePhone, String email, String header, Integer gender, Integer age, Date gmtBirth, String signature, Integer userSource, Integer userIntegral, Integer userGrowth, Integer status, Integer isDelete, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userLevelId = userLevelId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userNickname = userNickname;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.header = header;
		this.gender = gender;
		this.age = age;
		this.gmtBirth = gmtBirth;
		this.signature = signature;
		this.userSource = userSource;
		this.userIntegral = userIntegral;
		this.userGrowth = userGrowth;
		this.status = status;
		this.isDelete = isDelete;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserLevelId() {
		return userLevelId;
	}

	public void setUserLevelId(Long userLevelId) {
		this.userLevelId = userLevelId;
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

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getGmtBirth() {
		return gmtBirth;
	}

	public void setGmtBirth(Date gmtBirth) {
		this.gmtBirth = gmtBirth;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Integer getUserSource() {
		return userSource;
	}

	public void setUserSource(Integer userSource) {
		this.userSource = userSource;
	}

	public Integer getUserIntegral() {
		return userIntegral;
	}

	public void setUserIntegral(Integer userIntegral) {
		this.userIntegral = userIntegral;
	}

	public Integer getUserGrowth() {
		return userGrowth;
	}

	public void setUserGrowth(Integer userGrowth) {
		this.userGrowth = userGrowth;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
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
