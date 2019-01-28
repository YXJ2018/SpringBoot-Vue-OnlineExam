package com.exam.entity;

/**
 * 学生实体类
 */
public class Student {
    private Integer studentId;  //学号
    private String studentName; //姓名
    private String  grade;  //年级
    private String major; //专业
    private String clazz;   //专业
    private String institute;   //学院
    private String tel;     //电话号码
    private String email;   //邮箱
    private String pwd;     //密码
    private String cardId;  //身份证号码
    private String role;    //角色
    private String sex;     //性别

    public Student(Integer studentId, String studentName, String grade, String major, String clazz, String institute, String tel, String email, String pwd, String cardId, String role, String sex) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.major = major;
        this.clazz = clazz;
        this.institute = institute;
        this.tel = tel;
        this.email = email;
        this.pwd = pwd;
        this.cardId = cardId;
        this.role = role;
        this.sex = sex;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", clazz='" + clazz + '\'' +
                ", institute='" + institute + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", cardId='" + cardId + '\'' +
                ", role='" + role + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
