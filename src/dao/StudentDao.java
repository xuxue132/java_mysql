package dao;

import db.DbUtil;
import entity.Student;

import java.text.SimpleDateFormat;

public class StudentDao {
    /**
     * 查询功能
     * **/
    public void selectStudent(Student student){
        try {
            String sql = "select * from student where StuCode='"+student.getStuCode()+"'";
            DbUtil.executeQuery(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 增加功能
     * **/
    public void insertStudent(Student student){
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "insert into student values('"+student.getStuCode()+"','"+student.getStuName()+"','"
                    +student.getStuSex()+"','"+format.format(student.getStuBirthday())+"','"+student.getDepartment()+"')";
            DbUtil.executeSql(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 删除功能
     * **/
    public void deleteStudent(Student student){
        try{
            String sql = "delete from student where StuCode='"+student.getStuCode()+"'";
            DbUtil.executeSql(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 修改功能
     * **/
    public void updateStudent(Student student){
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "update student set StuName='"+student.getStuName()+"'"+",StuSex='"+student.getStuSex()+"'"
                    +",StuBirthday='"+format.format(student.getStuBirthday())+"'"+",Department='"+student.getDepartment()+"'"
                    +" where StuCode= '"+student.getStuCode()+"'";
            DbUtil.executeSql(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
