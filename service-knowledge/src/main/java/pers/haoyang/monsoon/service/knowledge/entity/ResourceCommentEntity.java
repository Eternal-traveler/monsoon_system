package pers.haoyang.monsoon.service.knowledge.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 资源-评论表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@TableName("knowledge_resource_comment")
public class ResourceCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 资源评论id
	 */
	private Long id;
	/**
	 * 评论用户id
	 */
	private Long userId;
	/**
	 * 评论资源id
	 */
	private Long resourceId;
	/**
	 * 评论内容
	 */
	private String commentContent;
	/**
	 * 资源作者id
	 */
	private Long resourceAuthorId;
	/**
	 * 锚点url
	 */
	private String sharpUrl;
	/**
	 * 父评论id
	 */
	private Long originalCommentId;
	/**
	 * 状态(0-评论成功，1-评论失败)
	 */
	private Integer status;
	/**
	 * 评论IP
	 */
	private String ip;
	/**
	 * User-Agent(用户代理)
	 */
	private String ua;
	/**
	 * 回帖计数
	 */
	private Integer replyCount;
	/**
	 * 0-所有人可见，1-仅楼主和自己可见
	 */
	private Integer isVisible;
	/**
	 * 评论时间
	 */
	private Date gmtCreate;

	/**
	 * 评论更新时间
	 */
	private Date gmtModified;

	public ResourceCommentEntity() {
	}

	public ResourceCommentEntity(Long id, Long userId, Long resourceId, String commentContent, Long resourceAuthorId, String sharpUrl, Long originalCommentId, Integer status, String ip, String ua, Integer replyCount, Integer isVisible, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.userId = userId;
		this.resourceId = resourceId;
		this.commentContent = commentContent;
		this.resourceAuthorId = resourceAuthorId;
		this.sharpUrl = sharpUrl;
		this.originalCommentId = originalCommentId;
		this.status = status;
		this.ip = ip;
		this.ua = ua;
		this.replyCount = replyCount;
		this.isVisible = isVisible;
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

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Long getResourceAuthorId() {
		return resourceAuthorId;
	}

	public void setResourceAuthorId(Long resourceAuthorId) {
		this.resourceAuthorId = resourceAuthorId;
	}

	public String getSharpUrl() {
		return sharpUrl;
	}

	public void setSharpUrl(String sharpUrl) {
		this.sharpUrl = sharpUrl;
	}

	public Long getOriginalCommentId() {
		return originalCommentId;
	}

	public void setOriginalCommentId(Long originalCommentId) {
		this.originalCommentId = originalCommentId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUa() {
		return ua;
	}

	public void setUa(String ua) {
		this.ua = ua;
	}

	public Integer getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}

	public Integer getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(Integer isVisible) {
		this.isVisible = isVisible;
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
		return "ResourceCommentEntity{" +
				"id=" + id +
				", userId=" + userId +
				", resourceId=" + resourceId +
				", commentContent='" + commentContent + '\'' +
				", resourceAuthorId=" + resourceAuthorId +
				", sharpUrl='" + sharpUrl + '\'' +
				", originalCommentId=" + originalCommentId +
				", status=" + status +
				", ip='" + ip + '\'' +
				", ua='" + ua + '\'' +
				", replyCount=" + replyCount +
				", isVisible=" + isVisible +
				", gmtCreate=" + gmtCreate +
				", gmtModified=" + gmtModified +
				'}';
	}
}
