package Controller;

import dao.DepartmentDao;
import dao.StudentDao;
import entity.Department;
import entity.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main (String []args) throws ParseException {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要操作的数据表：1.专业信息，2.学生信息");
        switch (scanner.nextInt()) {
            case 1:
                while (flag) {
                    DepartmentDao departmentDao = new DepartmentDao();
                    System.out.println("请输入需要执行的功能: 1.增加，2.删除，3.修改，4.查询，5.退出");
                    int index = scanner.nextInt();
                    switch (index) {
                        case 1:
                            System.out.println("请输入增加的专业编号和专业名称");
                            Department department = new Department();
                            department.setDepartmentId(scanner.next());
                            department.setDepartmentName(scanner.next());
                            departmentDao.insertDepartment(department);
                            break;
                        case 2:
                            System.out.println("请输入删除的专业编号");
                            Department department1 = new Department();
                            department1.setDepartmentId(scanner.next());
                            departmentDao.deleteDepartment(department1);
                            break;
                        case 3:
                            System.out.println("请输入修改的专业编号");
                            Department department2 = new Department();
                            department2.setDepartmentId(scanner.next());
                            System.out.println("请输入修改后的名称");
                            department2.setDepartmentName(scanner.next());
                            departmentDao.updateDepartment(department2);
                            break;
                        case 4:
                            System.out.println("请输入查询的专业编号");
                            Department department3 = new Department();
                            department3.setDepartmentId(scanner.next());
                            departmentDao.selectDepartment(department3);
                            break;
                        case 5:
                            System.out.println("退出");
                            flag = false;
                        default:break;
                    }
                }
                break;

            case 2:
                while (flag) {
                    StudentDao studentDao = new StudentDao();
                    System.out.println("请输入需要执行的功能: 1.增加，2.删除，3.修改，4.查询，5.退出");
                    int index = scanner.nextInt();
                    switch (index) {
                        case 1:
                            Student student = new Student();
                            System.out.println("请输入增加的学号");
                            student.setStuCode(scanner.next());
                            System.out.println("请输入增加的姓名");
                            student.setStuName(scanner.next());
                            System.out.println("请输入增加的性别");
                            student.setStuSex(scanner.nextInt());
                            System.out.println("请输入增加的生日");
                            String time = scanner.next();
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = format.parse(time);
                            student.setStuBirthday(date);
                            System.out.println("请输入增加的专业编号");
                            student.setDepartment(scanner.next());
                            studentDao.insertStudent(student);
                            break;
                        case 2:
                            System.out.println("请输入删除的学生学号");
                            Student student1 = new Student();
                            student1.setStuCode(scanner.next());
                            studentDao.deleteStudent(student1);
                            break;
                        case 3:
                            Student student2 = new Student();
                            System.out.println("请输入修改的学号");
                            student2.setStuCode(scanner.next());
                            System.out.println("请输入修改后的姓名");
                            student2.setStuName(scanner.next());
                            System.out.println("请输入修改后的性别");
                            student2.setStuSex(scanner.nextInt());
                            System.out.println("请输入修改后的生日");
                            String time1 = scanner.next();
                            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                            Date date1 = format1.parse(time1);
                            student2.setStuBirthday(date1);
                            System.out.println("请输入修改后的专业编号");
                            student2.setDepartment(scanner.next());
                            studentDao.updateStudent(student2);
                            break;
                        case 4:
                            System.out.println("请输入查询的学生学号");
                            Student student3 = new Student();
                            student3.setStuCode(scanner.next());
                            studentDao.selectStudent(student3);
                            break;
                        case 5:
                            System.out.println("退出");
                            flag = false;
                        default:break;
                    }
                }
                break;
            default:break;
        }

    }
}
