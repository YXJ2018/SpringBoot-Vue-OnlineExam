package com.exam.entity;

/**
 * 教师实体类
 */
public class Teacher {
    private Integer teacherId;      //编号
    private String  teacherName;     //姓名
    private String  institute;       //学院
    private String  sex;     //性别
    private String  tel;     //电话号码
    private String  email;      //邮箱
    private String  pwd;     //密码
    private String  cardId;     //身份证号码
    private String  type;   //职称
    private Integer  role;   //角色

    public Teacher() {
    }

    public Teacher(Integer teacherId, String teacherName, String institute, String sex, String tel, String email, String pwd, String cardId, String type, Integer role) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.institute = institute;
        this.sex = sex;
        this.tel = tel;
        this.email = email;
        this.pwd = pwd;
        this.cardId = cardId;
        this.type = type;
        this.role = role;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", institute='" + institute + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", cardId='" + cardId + '\'' +
                ", type='" + type + '\'' +
                ", role=" + role +
                '}';
    }
}
