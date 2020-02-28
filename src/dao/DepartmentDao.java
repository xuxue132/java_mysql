package dao;

import db.DbUtil;
import entity.Department;
import jdk.nashorn.internal.ir.RuntimeNode;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDao {
    /**
     * 删除功能
     * **/
   public void deleteDepartment(Department dept){
       try {
           String delSql="delete from department where Departid='"+dept.getDepartmentId()+"'";
           DbUtil.executeSql(delSql);
       }catch (Exception e){
           e.printStackTrace();
       }

   }
    /**
     * 修改功能
     * **/
   public void updateDepartment(Department dept){
       try {
           String delSql="update department set DepartName ='"+dept.getDepartmentName()+"'" +" where Departid='"+dept.getDepartmentId()+"'";
           DbUtil.executeSql(delSql);
       }catch (Exception e){
           e.printStackTrace();
       }
   }
    /**
     * 增加功能
     * **/
   public void insertDepartment(Department dept){
       try {
           String delSql="insert into department values('"+dept.getDepartmentId()+"','"+dept.getDepartmentName()+"')";
           DbUtil.executeSql(delSql);
       }catch (Exception e){
           e.printStackTrace();
       }
   }
    /**
     * 查询功能
     * **/
   public void selectDepartment(Department dept){
       try {
           String delSql="select * from department where Departid='"+dept.getDepartmentId()+"'";
           ResultSet re = DbUtil.executeQuery(delSql);
       }catch (Exception e){
           e.printStackTrace();
       }
   }
}
