package ���ݿ�γ����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Check {
	boolean checkstu(String n)
	{
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";//testΪ������ݿ���
		  String userName="sa";//������ݿ��û���
		  String userPwd="123";//�������
		 try
		{
		    Class.forName(driverName);
		    System.out.println("���������ɹ���");
		}catch(Exception e){
		    e.printStackTrace();
		    System.out.println("��������ʧ�ܣ�");
		}
		try{
		    System.out.println("�������ݿ�ɹ���");
		}catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.print("SQL Server����ʧ�ܣ�");
		}     
		  try {
		  Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			PreparedStatement ps = dbConn.prepareStatement("select *  from Student where Student_ID=?");
			ps.setString(1,n);
			ResultSet Judge = ps.executeQuery();
			if (!Judge.next())
			{
				return true;
			}
			else return false;
		  }catch(Exception ea){
				ea.printStackTrace();
				}
		  return true;
	}
	boolean checkasc(String n)
	{
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";
		  String userName="sa";//������ݿ��û���
		  String userPwd="123";//�������
		 try
		{
		    Class.forName(driverName);
		    System.out.println("���������ɹ���");
		}catch(Exception e){
		    e.printStackTrace();
		    System.out.println("��������ʧ�ܣ�");
		}
		try{
		    System.out.println("�������ݿ�ɹ���");
		}catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.print("SQL Server����ʧ�ܣ�");
		}     
		  try {
		  Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			PreparedStatement ps = dbConn.prepareStatement("select * from Association where Association_ID=?");
			ps.setString(1,n);
			ResultSet Judge = ps.executeQuery();
			if (!Judge.next())//û�ҵ�����true�����򷵻�false
			{
				return true;
			}
			else return false;
		  }catch(Exception ea){
				ea.printStackTrace();
				}
		  return true;
	}
	boolean checkact(String n)
	{
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";
		  String userName="sa";//������ݿ��û���
		  String userPwd="123";//�������
		 try
		{
		    Class.forName(driverName);
		    System.out.println("���������ɹ���");
		}catch(Exception e){
		    e.printStackTrace();
		    System.out.println("��������ʧ�ܣ�");
		}
		try{
		    System.out.println("�������ݿ�ɹ���");
		}catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.print("SQL Server����ʧ�ܣ�");
		}     
		  try {
		  Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			PreparedStatement ps = dbConn.prepareStatement("select * from Activity where Activity_ID=?");
			ps.setString(1,n);
			ResultSet Judge = ps.executeQuery();
			if (!Judge.next())//û�ҵ�����true�����򷵻�false
			{
				return true;
			}
			else return false;
		  }catch(Exception ea){
				ea.printStackTrace();
				}
		  return true;
	}
	boolean checkacd(String n)
	{
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";
		  String userName="sa";//������ݿ��û���
		  String userPwd="123";//�������
		 try
		{
		    Class.forName(driverName);
		    System.out.println("���������ɹ���");
		}catch(Exception e){
		    e.printStackTrace();
		    System.out.println("��������ʧ�ܣ�");
		}
		try{
		    System.out.println("�������ݿ�ɹ���");
		}catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.print("SQL Server����ʧ�ܣ�");
		}     
		  try {
		  Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			PreparedStatement ps = dbConn.prepareStatement("select * from Student where Student_Academy=?");
			ps.setString(1,n);
			ResultSet Judge = ps.executeQuery();
			if (!Judge.next())//û�ҵ�����true�����򷵻�false
			{
				return true;
			}
			else return false;
		  }catch(Exception ea){
				ea.printStackTrace();
				}
		  return true;
	}
}
