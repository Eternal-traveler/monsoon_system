package pers.haoyang.monsoon.service.knowledge.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 资源类型表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@TableName("knowledge_resource_type")
public class ResourceTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 类型id
	 */
	private Long id;
	/**
	 * 类型名称
	 */
	private String name;
	/**
	 * 标签uri
	 */
	private String uri;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 关联资源总数
	 */
	private Integer relationResourceCount;
	/**
	 * 排列顺序
	 */
	private Integer sortNum;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	public ResourceTypeEntity() {
	}

	public ResourceTypeEntity(Long id, String name, String uri, String description, Integer relationResourceCount, Integer sortNum, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.name = name;
		this.uri = uri;
		this.description = description;
		this.relationResourceCount = relationResourceCount;
		this.sortNum = sortNum;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRelationResourceCount() {
		return relationResourceCount;
	}

	public void setRelationResourceCount(Integer relationResourceCount) {
		this.relationResourceCount = relationResourceCount;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
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
		return "ResourceTypeEntity{" +
				"id=" + id +
				", name='" + name + '\'' +
				", uri='" + uri + '\'' +
				", description='" + description + '\'' +
				", relationResourceCount=" + relationResourceCount +
				", sortNum=" + sortNum +
				", gmtCreate=" + gmtCreate +
				", gmtModified=" + gmtModified +
				'}';
	}
}
