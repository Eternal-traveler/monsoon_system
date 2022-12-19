package pers.haoyang.monsoon.utils;

import java.io.Serializable;
import java.util.List;

/**
 * @author haoyang
 * @create 2022-12-16 16:45
 * @Description 分页工具类
 */
public class PageUtils implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    private Integer totalCount;
    /**
     * 每页显示行数
     */
    private Integer pageSize;
    /**
     * 总页数，是根据总行数和每页显示的行数计算的结果
     */
    private Integer totalPages;
    /**
     * 当前页数
     */
    private Integer pageNo;
    /**
     * 存放需要显示的实体类数据（列表数据）
     */
    private List<?> lists;

    public PageUtils(Integer totalCount, Integer pageSize, Integer totalPages, Integer pageNo, List<?> lists) {
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.pageNo = pageNo;
        this.lists = lists;
    }

    /**
     * 不需要对外提供totalPage总页数的set设值方法，因为totalPage是根据总行数和每页显示的行数求出来的
     * 对私有属性的封装
     */
    public List<?> getLists() {
        return lists;
    }

    public void setLists(List<?> lists) {
        this.lists = lists;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        // 总页数根据传入的总行数以及每页显示的行数，求出总页数
        this.totalPages = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize + 1);
    }

    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * 设置页码
     * @param pageNo 当前页数
     */
    public void setPageNo(Integer pageNo) {
        // 如果传入的页码为空或者小于0， 就默认为1
        if(pageNo == null || pageNo < 0) {
            this.pageNo = 1;
            // 如果当前页码数大于总页码数，就让当前页码数等于最大页码数
        }else if(pageNo > this.totalPages && this.totalPages > 0) {
            this.pageNo = this.totalPages;
        }else {
            this.pageNo = pageNo;
        }
    }

}
