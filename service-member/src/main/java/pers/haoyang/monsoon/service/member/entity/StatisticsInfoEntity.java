package pers.haoyang.monsoon.service.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户统计信息表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@TableName("member_statistics_info")
public class StatisticsInfoEntity implements Serializable {
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
	 * 发布资源数量
	 */
	private Integer resourceCount;
	/**
	 * 评价数量
	 */
	private Integer commentCount;
	/**
	 * 草稿数量
	 */
	private Integer draftCount;
	/**
	 * 登陆次数
	 */
	private Integer loginCount;
	/**
	 * 关注数量
	 */
	private Integer attendCount;
	/**
	 * 点赞数量
	 */
	private Integer likeCount;
	/**
	 * 粉丝数量
	 */
	private Integer fansCount;
	/**
	 * 收藏的资源数量
	 */
	private Integer collectResourceCount;
	/**
	 * 收藏的评论数量
	 */
	private Integer collectCommentCount;

	public StatisticsInfoEntity() {
	}

	public StatisticsInfoEntity(Long id, Long userId, Integer resourceCount, Integer commentCount, Integer draftCount, Integer loginCount, Integer attendCount, Integer likeCount, Integer fansCount, Integer collectResourceCount, Integer collectCommentCount) {
		this.id = id;
		this.userId = userId;
		this.resourceCount = resourceCount;
		this.commentCount = commentCount;
		this.draftCount = draftCount;
		this.loginCount = loginCount;
		this.attendCount = attendCount;
		this.likeCount = likeCount;
		this.fansCount = fansCount;
		this.collectResourceCount = collectResourceCount;
		this.collectCommentCount = collectCommentCount;
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

	public Integer getResourceCount() {
		return resourceCount;
	}

	public void setResourceCount(Integer resourceCount) {
		this.resourceCount = resourceCount;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public Integer getDraftCount() {
		return draftCount;
	}

	public void setDraftCount(Integer draftCount) {
		this.draftCount = draftCount;
	}

	public Integer getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public Integer getAttendCount() {
		return attendCount;
	}

	public void setAttendCount(Integer attendCount) {
		this.attendCount = attendCount;
	}

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	public Integer getFansCount() {
		return fansCount;
	}

	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}

	public Integer getCollectResourceCount() {
		return collectResourceCount;
	}

	public void setCollectResourceCount(Integer collectResourceCount) {
		this.collectResourceCount = collectResourceCount;
	}

	public Integer getCollectCommentCount() {
		return collectCommentCount;
	}

	public void setCollectCommentCount(Integer collectCommentCount) {
		this.collectCommentCount = collectCommentCount;
	}
}
