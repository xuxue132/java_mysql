package entity;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String StuCode;
    private String StuName;
    private int StuSex;
    private Date StuBirthday;
    private String Department;

    public String getStuCode() {
        return StuCode;
    }

    public void setStuCode(String stuCode) {
        StuCode = stuCode;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public int getStuSex() {
        return StuSex;
    }

    public void setStuSex(int stuSex) {
        StuSex = stuSex;
    }

    public Date getStuBirthday() {
        return StuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        this.StuBirthday = stuBirthday;

    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
