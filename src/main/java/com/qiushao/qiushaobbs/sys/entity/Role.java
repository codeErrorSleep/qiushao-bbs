package com.qiushao.qiushaobbs.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.qiushao.qiushaobbs.common.core.domain.entity.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-08-07
 */
@TableName("sys_role")
public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /** 角色ID */
    private Long roleId;

    /** 角色名称 */
    private String roleName;

    /** 角色权限 */
    private String roleKey;

    /** 角色排序 */
    private Integer roleSort;

    /** 数据范围（1：所有数据权限；2：自定义数据权限；3：本部门数据权限；4：本部门及以下数据权限） */
    private String dataScope;
    /** 角色状态（0正常 1停用） */
    private String status;

    public Role() {
    }


    public Long getRoleId() {
        return this.roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getRoleKey() {
        return this.roleKey;
    }

    public Integer getRoleSort() {
        return this.roleSort;
    }

    public String getDataScope() {
        return this.dataScope;
    }

    public String getStatus() {
        return this.status;
    }

    public Role setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

    public Role setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public Role setRoleKey(String roleKey) {
        this.roleKey = roleKey;
        return this;
    }

    public Role setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
        return this;
    }

    public Role setDataScope(String dataScope) {
        this.dataScope = dataScope;
        return this;
    }

    public Role setStatus(String status) {
        this.status = status;
        return this;
    }

}
