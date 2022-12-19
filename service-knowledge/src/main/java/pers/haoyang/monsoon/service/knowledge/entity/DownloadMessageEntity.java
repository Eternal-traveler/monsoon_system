package pers.haoyang.monsoon.service.knowledge.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

/**
 * 资源下载表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@TableName("knowledge_download_message")
public class DownloadMessageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private Long id;

	/**
	 * 下载用户id
	 */
	private Long userId;

	/**
	 * 下载资源id
	 */
	private Long resourceId;

	/**
	 * 下载信息
	 */
	private String message;

	/**
	 * 下载创建时间
	 */
	private Date gmtCreate;


	/**
	 * 再次下载更新时间
	 */
	private Date gmtModified;

	public DownloadMessageEntity() {
	}

	public DownloadMessageEntity(Long id, Long userId, Long resourceId, String message, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userId = userId;
		this.resourceId = resourceId;
		this.message = message;
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

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	@Override
	public String toString() {
		return "DownloadMessageEntity{" +
				"id=" + id +
				", userId=" + userId +
				", resourceId=" + resourceId +
				", message='" + message + '\'' +
				", gmtCreate=" + gmtCreate +
				", gmtModified=" + gmtModified +
				'}';
	}
}
