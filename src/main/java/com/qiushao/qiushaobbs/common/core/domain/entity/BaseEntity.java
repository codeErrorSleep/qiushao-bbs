package com.qiushao.qiushaobbs.common.core.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;


/**
*   基础的实体类
*@Author: qiuwenhao
*@date: 2020/8/7
*/
public class BaseEntity implements Serializable {
    /** 搜索值 */
    private String searchValue;
    /**创建时间*/
    private LocalDateTime createTime;
    /**更新时间*/
    private LocalDateTime updateTime;
    /**由谁创建的*/
    private String createBy;
    /**由随更新的*/
    private String updateBy;
    /**备注*/
    private String remark;
    /** 请求参数 */
    private Map<String, Object> params;


    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
