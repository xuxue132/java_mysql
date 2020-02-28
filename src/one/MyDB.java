//package one;
//import java.sql.*;
//public class MyDB {
//    public static void main(String[] args){
//        Connection con=null;
//        Statement stm=null;
//        ResultSet rs=null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myjava?useSSL=true&serverTimezone=GMT", "root", "tmm0326");
//            if(con!=null){
//                con.setAutoCommit(false);
//                stm=con.createStatement();
//                stm.executeUpdate("update student set StuName='Black' where StuCode='20180012002'");
//		      /*
//		      rs=stm.executeQuery("select * from Student");
//		      while(rs.next()){
//		    	  System.out.println(rs.getString("StuCode")+"  "+rs.getString("StuName"));
//		      }
//		      */
//                con.commit();
//            }
//        } catch (Exception e){
//            if(con!=null)
//                try {
//                    con.rollback();
//                } catch (SQLException e1) {
//                    e1.printStackTrace();
//                }
//            e.printStackTrace();
//        }finally{
//            if(con!=null)
//                try{
//                    con.close();
//                    con=null;
//                } catch (Exception e){
//                    e.printStackTrace();
//                }
//            if(stm!=null){
//                try {
//                    stm.close();
//                    stm=null;
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(rs!=null){
//                try{
//                    rs.close();
//                    rs=null;
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
