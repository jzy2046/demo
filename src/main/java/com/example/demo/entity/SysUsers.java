package com.example.demo.entity;

import java.util.Date;

public class SysUsers {
    private Long userKy;

    private String loginId;

    private String password;

    private Date registertime;

    private String lastloginip;

    private Short failLoginNum;

    private Short status;

    private String name;

    private String deptId;

    private String mobile;

    private String phone;

    private String email;

    private String address;

    private Long csid;

    private Long jobId;

    private String recommcodes;

    private Integer manageFlag;

    private Long manageParents;

    public Long getUserKy() {
        return userKy;
    }

    public void setUserKy(Long userKy) {
        this.userKy = userKy;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public Short getFailLoginNum() {
        return failLoginNum;
    }

    public void setFailLoginNum(Short failLoginNum) {
        this.failLoginNum = failLoginNum;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getCsid() {
        return csid;
    }

    public void setCsid(Long csid) {
        this.csid = csid;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getRecommcodes() {
        return recommcodes;
    }

    public void setRecommcodes(String recommcodes) {
        this.recommcodes = recommcodes == null ? null : recommcodes.trim();
    }

    public Integer getManageFlag() {
        return manageFlag;
    }

    public void setManageFlag(Integer manageFlag) {
        this.manageFlag = manageFlag;
    }

    public Long getManageParents() {
        return manageParents;
    }

    public void setManageParents(Long manageParents) {
        this.manageParents = manageParents;
    }
}