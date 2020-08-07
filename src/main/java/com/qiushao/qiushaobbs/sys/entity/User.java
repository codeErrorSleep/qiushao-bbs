package com.qiushao.qiushaobbs.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.qiushao.qiushaobbs.common.core.domain.entity.BaseEntity;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 		
 * </p>
 *
 * @author jobob
 * @since 2020-08-07
 */
@TableName("sys_user")
public class User extends BaseEntity {


    /** 用户ID */
    private Long userId;

    /** 部门ID */
    private Long deptId;

    /** 用户账号 */
    private String userName;

    /** 用户昵称 */
    private String nickName;

    /** 用户邮箱 */
    private String email;

    /** 手机号码 */
    private String phonenumber;
    /** 用户类型*/
    private String userType;
    /** 用户性别 */
    private String sex;
    /** 密码 */
    private String password;
    /** 帐号状态（0正常 1停用） */
    private String status;
    /** 最后登陆IP */
    private String loginIp;

    /** 最后登陆时间 */
    private Date loginDate;

    /** 角色对象 */
    private List<Role> roles;

    /** 角色组 */
    private Long[] roleIds;

    public User() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Long[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Long[] roleIds) {
        this.roleIds = roleIds;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public String getUserType() {
        return this.userType;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public String getSex() {
        return this.sex;
    }

    public String getPassword() {
        return this.password;
    }

    public String getStatus() {
        return this.status;
    }

    public String getLoginIp() {
        return this.loginIp;
    }

    public User setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public User setDeptId(Long deptId) {
        this.deptId = deptId;
        return this;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setStatus(String status) {
        this.status = status;
        return this;
    }

    public User setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

}
