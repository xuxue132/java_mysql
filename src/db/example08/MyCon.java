package db.example08;

import java.sql.Connection;
/**
 * ����״̬�����ݿ�����
 */
public class MyCon {
	
	public static final int FREE = 100; //��ǰ���ӿ���
	public static final int BUZY = 101; //��ǰ���ӷ�æ
	public static final int CLOSED = 102; //��ǰ���ӹر�
	
	private Connection con; //���е����ݿ�����
	private int state = FREE; //���ݿ����ӵ�ǰ״̬����ʼʱΪ����״̬
	
	public MyCon(Connection con){
		this.con = con;
	}
	// insert into student(code,name) values('2018090998','Tony')
	// update student set name='Tom' where code='2018090998'
	
	public Connection getCon() {
		return con;
	}
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
