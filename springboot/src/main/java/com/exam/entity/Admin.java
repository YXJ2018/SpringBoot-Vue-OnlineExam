package com.exam.entity;

public class Admin {
    private Integer adminId;    //id
    private String adminName;   //姓名
    private String sex;     //性别
    private String tel;     //手机号码
    private String email;   //电子邮箱
    private String pwd;     //密码
    private String cardId;  //身份证号码
    private int role;   //角色标志0管理员 1老师 2学生

    public Admin(Integer adminId, String adminName, String sex, String tel, String email, String pwd, String cardId, int role) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.sex = sex;
        this.tel = tel;
        this.email = email;
        this.pwd = pwd;
        this.cardId = cardId;
        this.role = role;
    }

    public Admin() {
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", cardId='" + cardId + '\'' +
                ", role=" + role +
                '}';
    }
}
