package pers.haoyang.monsoon.service.knowledge.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 资源消息表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@TableName("knowledge_resource_information")
public class ResourceInformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 消息id
	 */
	private Long id;
	/**
	 * 消息所属者id
	 */
	private Long userId;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 消息发送时间
	 */
	private Date gmtCreate;

	/**
	 * 消息更改时间
	 */
	private Date gmtModified;

	public ResourceInformationEntity() {
	}

	public ResourceInformationEntity(Long id, Long userId, String content, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userId = userId;
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		return "ResourceInformationEntity{" +
				"id=" + id +
				", userId=" + userId +
				", content='" + content + '\'' +
				", gmtCreate=" + gmtCreate +
				", gmtModified=" + gmtModified +
				'}';
	}
}
