package pers.haoyang.monsoon.service.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 积分变化历史记录
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@TableName("member_integral_change_history")
public class IntegralChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * user_id
	 */
	private Long userId;
	/**
	 * 改变的值（正负值计算）
	 */
	private Integer changeCount;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 积分来源【0--上传知识，1--管理员修改】
	 */
	private Integer integralSourceType;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 最后修改时间
	 */
	private Date gmtModified;

	public IntegralChangeHistoryEntity() {
	}

	public IntegralChangeHistoryEntity(Long id, Long userId, Integer changeCount, String note, Integer integralSourceType, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userId = userId;
		this.changeCount = changeCount;
		this.note = note;
		this.integralSourceType = integralSourceType;
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

	public Integer getChangeCount() {
		return changeCount;
	}

	public void setChangeCount(Integer changeCount) {
		this.changeCount = changeCount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getIntegralSourceType() {
		return integralSourceType;
	}

	public void setIntegralSourceType(Integer integralSourceType) {
		this.integralSourceType = integralSourceType;
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
