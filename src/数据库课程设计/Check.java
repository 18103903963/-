package 数据库课程设计;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Check {
	boolean checkstu(String n)
	{
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";//test为你的数据库名
		  String userName="sa";//你的数据库用户名
		  String userPwd="123";//你的密码
		 try
		{
		    Class.forName(driverName);
		    System.out.println("加载驱动成功！");
		}catch(Exception e){
		    e.printStackTrace();
		    System.out.println("加载驱动失败！");
		}
		try{
		    System.out.println("连接数据库成功！");
		}catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.print("SQL Server连接失败！");
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
		  String userName="sa";//你的数据库用户名
		  String userPwd="123";//你的密码
		 try
		{
		    Class.forName(driverName);
		    System.out.println("加载驱动成功！");
		}catch(Exception e){
		    e.printStackTrace();
		    System.out.println("加载驱动失败！");
		}
		try{
		    System.out.println("连接数据库成功！");
		}catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.print("SQL Server连接失败！");
		}     
		  try {
		  Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			PreparedStatement ps = dbConn.prepareStatement("select * from Association where Association_ID=?");
			ps.setString(1,n);
			ResultSet Judge = ps.executeQuery();
			if (!Judge.next())//没找到返回true，否则返回false
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
		  String userName="sa";//你的数据库用户名
		  String userPwd="123";//你的密码
		 try
		{
		    Class.forName(driverName);
		    System.out.println("加载驱动成功！");
		}catch(Exception e){
		    e.printStackTrace();
		    System.out.println("加载驱动失败！");
		}
		try{
		    System.out.println("连接数据库成功！");
		}catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.print("SQL Server连接失败！");
		}     
		  try {
		  Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			PreparedStatement ps = dbConn.prepareStatement("select * from Activity where Activity_ID=?");
			ps.setString(1,n);
			ResultSet Judge = ps.executeQuery();
			if (!Judge.next())//没找到返回true，否则返回false
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
		  String userName="sa";//你的数据库用户名
		  String userPwd="123";//你的密码
		 try
		{
		    Class.forName(driverName);
		    System.out.println("加载驱动成功！");
		}catch(Exception e){
		    e.printStackTrace();
		    System.out.println("加载驱动失败！");
		}
		try{
		    System.out.println("连接数据库成功！");
		}catch(Exception e)
		{
		    e.printStackTrace();
		    System.out.print("SQL Server连接失败！");
		}     
		  try {
		  Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			PreparedStatement ps = dbConn.prepareStatement("select * from Student where Student_Academy=?");
			ps.setString(1,n);
			ResultSet Judge = ps.executeQuery();
			if (!Judge.next())//没找到返回true，否则返回false
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
