package pers.haoyang.monsoon.service.knowledge.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author haoyang
 * @create 2022-12-16 16:19
 * @Description 知识信息表
 */
@Data
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
    private Long memberUserId;
    /**
     * 文章类型id
     */
    private Long resourceTypeId;
    /**
     * 下载所需积分
     */
    private Integer points;
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
    private String password;
    /**
     * 是否为热门（0代表不是，1代表是）
     */
    private Integer isHot;
    /**
     * 状态 1代表未审核，2代表审核通过，3代表审核未通过
     */
    private Integer state;
    /**
     * 审核未通过理由
     */
    private String reason;
    /**
     * 审核时间
     */
    private Date checkDate;
    /**
     * 链接是否生效，0代表未失效，1代表已经失效
     */
    private Integer isUseful;
    /**
     * 点击次数
     */
    private Integer click;
    /**
     * 发布日期
     */
    private Date createTime;

}
