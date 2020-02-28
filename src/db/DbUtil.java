package db;

import db.example08.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
    public static ResultSet executeQuery(String sql) {
        boolean flag = true;
        MyCon myCon = ConPool.getIntance().getCon();
        try {
            Statement stm = myCon.getCon().createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                try {
                    System.out.println(rs.getString("Departid") + "   " + rs.getString("DepartName"));
                    flag = false;
                } catch (Exception e) {
                    System.out.println(rs.getString("StuCode") + "   "
                            + rs.getString("StuName") + "   "
                            + rs.getString("StuSex") + "   "
                            + rs.getString("StuBirthday") + "   "
                            + rs.getString("Department"));
                    flag = false;
                }
            }
            stm.close();
            if (flag) {
                System.out.println("查询失败，没有此数据！！");
                return null;
            } else
                System.out.println("操作成功");
            return rs;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static int executeSql(String sql) {
        MyCon myCon = ConPool.getIntance().getCon();
        try {
            Statement stm = myCon.getCon().createStatement();
            int rs = stm.executeUpdate(sql);
            System.out.println("操作成功");
            stm.close();
            return rs;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }
}
