package pers.haoyang.monsoon.service.knowledge.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 资源信息表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@TableName("knowledge_resource")
public class ResourceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private Long id;
	/**
	 * 资源名称
	 */
	private String resourceName;
	/**
	 * 发布人id
	 */
	private Long userId;
	/**
	 * 文章类型id
	 */
	private Long resourceTypeId;
	/**
	 * 下载所需积分
	 */
	private Integer integral;
	/**
	 * 摘要
	 */
	private String summary;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 链接
	 */
	private String link;
	/**
	 * 链接密码
	 */
	private String linkPassword;
	/**
	 * 是否为热门（0代表不是，1代表是）
	 */
	private Integer isHot;
	/**
	 * 状态 1代表未审核，2代表审核通过，3代表审核未通过
	 */
	private Integer status;
	/**
	 * 审核未通过理由
	 */
	private String failedReason;
	/**
	 * 审核时间
	 */
	private Date auditTime;
	/**
	 * 链接是否生效，0代表未失效，1代表已经失效
	 */
	private Integer isLinkUseful;
	/**
	 * 点击次数
	 */
	private Integer clickCount;
	/**
	 * 发布日期
	 */
	private Date gmtCreate;

	/**
	 * 修改日期
	 */
	private Date gmtModified;

	public ResourceEntity() {
	}

	public ResourceEntity(Long id, String resourceName, Long userId, Long resourceTypeId, Integer integral, String summary, String content, String link, String linkPassword, Integer isHot, Integer status, String failedReason, Date auditTime, Integer isLinkUseful, Integer clickCount, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.resourceName = resourceName;
		this.userId = userId;
		this.resourceTypeId = resourceTypeId;
		this.integral = integral;
		this.summary = summary;
		this.content = content;
		this.link = link;
		this.linkPassword = linkPassword;
		this.isHot = isHot;
		this.status = status;
		this.failedReason = failedReason;
		this.auditTime = auditTime;
		this.isLinkUseful = isLinkUseful;
		this.clickCount = clickCount;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getResourceTypeId() {
		return resourceTypeId;
	}

	public void setResourceTypeId(Long resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLinkPassword() {
		return linkPassword;
	}

	public void setLinkPassword(String linkPassword) {
		this.linkPassword = linkPassword;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getFailedReason() {
		return failedReason;
	}

	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public Integer getIsLinkUseful() {
		return isLinkUseful;
	}

	public void setIsLinkUseful(Integer isLinkUseful) {
		this.isLinkUseful = isLinkUseful;
	}

	public Integer getClickCount() {
		return clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
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
		return "ResourceEntity{" +
				"id=" + id +
				", resourceName='" + resourceName + '\'' +
				", userId=" + userId +
				", resourceTypeId=" + resourceTypeId +
				", integral=" + integral +
				", summary='" + summary + '\'' +
				", content='" + content + '\'' +
				", link='" + link + '\'' +
				", linkPassword='" + linkPassword + '\'' +
				", isHot=" + isHot +
				", status=" + status +
				", failedReason='" + failedReason + '\'' +
				", auditTime=" + auditTime +
				", isLinkUseful=" + isLinkUseful +
				", clickCount=" + clickCount +
				", gmtCreate=" + gmtCreate +
				", gmtModified=" + gmtModified +
				'}';
	}
}
