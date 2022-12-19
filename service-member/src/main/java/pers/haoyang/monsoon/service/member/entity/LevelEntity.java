package pers.haoyang.monsoon.service.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户等级表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@TableName("member_level")
public class LevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 等级名称
	 */
	private String levelName;
	/**
	 * 等级所需要的成长值
	 */
	private Integer growthIntegral;
	/**
	 * 是否为默认等级【0->不是，1->是】
	 */
	private Integer defaultLevel;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 最后修改时间
	 */
	private Date gmtModified;

	public LevelEntity() {
	}

	public LevelEntity(Long id, String levelName, Integer growthIntegral, Integer defaultLevel, String note, Date gmtCreate, Date gmtModified) {
		this.id = id;
		this.levelName = levelName;
		this.growthIntegral = growthIntegral;
		this.defaultLevel = defaultLevel;
		this.note = note;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Integer getGrowthIntegral() {
		return growthIntegral;
	}

	public void setGrowthIntegral(Integer growthIntegral) {
		this.growthIntegral = growthIntegral;
	}

	public Integer getDefaultLevel() {
		return defaultLevel;
	}

	public void setDefaultLevel(Integer defaultLevel) {
		this.defaultLevel = defaultLevel;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
