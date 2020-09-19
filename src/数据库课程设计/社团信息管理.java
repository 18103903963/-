package 数据库课程设计;

import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 社团信息管理 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					社团信息管理 frame = new 社团信息管理();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public 社团信息管理() {
		setTitle("\u793E\u56E2\u4FE1\u606F\u7BA1\u7406");
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton 创建社团 = new JButton("\u521B\u5EFA\u793E\u56E2");
		JButton 下一步 = new JButton("\u4E0B\u4E00\u6B65");
		JButton 返回 = new JButton("\u8FD4\u56DE");
		JButton 查询按钮 = new JButton("\u8FDB\u884C\u67E5\u8BE2");
		JTextPane 社团编号 = new JTextPane();
		JLabel 提示 = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8981\u64CD\u4F5C\u7684\u793E\u56E2\u7F16\u53F7");
		
		JLabel 查找提示 = new JLabel("\u67E5\u627E\u5230\u5982\u4E0B\u4FE1\u606F\uFF1A");
		
		JScrollPane 滚动条 = new JScrollPane();
		滚动条.setBounds(10, 209, 414, 172);
		contentPane.add(滚动条);
		下一步.setVisible(false);
		JTextArea 查找信息 = new JTextArea();
		查找信息.setFont(new Font("宋体", Font.PLAIN, 15));
		查找信息.setForeground(Color.GREEN);
		查找信息.setBackground(Color.BLACK);
		滚动条.setViewportView(查找信息);
		查找提示.setFont(new Font("宋体", Font.PLAIN, 14));
		查找提示.setForeground(Color.CYAN);
		查找提示.setBounds(10, 178, 137, 16);
		contentPane.add(查找提示);
		提示.setForeground(Color.CYAN);
		提示.setFont(new Font("宋体", Font.PLAIN, 14));
		提示.setBounds(10, 26, 223, 16);
		contentPane.add(提示);
		
		社团编号.setFont(new Font("宋体", Font.PLAIN, 15));
		社团编号.setForeground(Color.YELLOW);
		社团编号.setBackground(Color.DARK_GRAY);
		社团编号.setBounds(10, 93, 267, 27);
		contentPane.add(社团编号);
		查找提示.setVisible(false);
		查找信息.setVisible(false);
		滚动条.setVisible(false);
		查询按钮.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ID = 社团编号.getText();
				try{
					查找信息.setText("");
					Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
					CallableStatement cstmt = dbConn.prepareCall("{call dbo.AssociationSearchByID(?)}");
					cstmt.setString(1,ID);
					ResultSet rs = cstmt.executeQuery();
					if(rs.next())
					{
						
						
						查找信息.append(rs.getString("result"));
						查找信息.append("\n");
						查找提示.setVisible(true);
						查找信息.setVisible(true);
						下一步.setVisible(true);
						滚动条.setVisible(true);
						
					}
					else
					{
						查找提示.setVisible(true);
						查找提示.setText("没有找到相关社团！ ");
						下一步.setVisible(false);
						查找信息.setVisible(false);
						滚动条.setVisible(false);
					}
					rs.close(); 
					}
					catch(Exception ea){
					ea.printStackTrace();
					}
			}
		});
		查询按钮.setBackground(Color.BLACK);
		查询按钮.setForeground(Color.CYAN);
		查询按钮.setFont(new Font("宋体", Font.PLAIN, 15));
		查询按钮.setBounds(319, 93, 105, 27);
		contentPane.add(查询按钮);
		
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				主界面 zjm = new 主界面();
				zjm.setVisible(true);
			}
		});
		返回.setForeground(Color.CYAN);
		返回.setFont(new Font("宋体", Font.PLAIN, 15));
		返回.setBackground(Color.BLACK);
		返回.setBounds(10, 402, 105, 27);
		contentPane.add(返回);
		
		下一步.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				修改社团信息 xg = new 修改社团信息 (社团编号.getText());
				xg.setVisible(true);
				setVisible(false);
			}
		});
		下一步.setForeground(Color.CYAN);
		下一步.setFont(new Font("宋体", Font.PLAIN, 15));
		下一步.setBackground(Color.BLACK);
		下一步.setBounds(319, 402, 105, 27);
		contentPane.add(下一步);
		
		
		创建社团.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				建立社团 jl = new 建立社团();
				setVisible(false);
				jl.setVisible(true);
			}
		});
		创建社团.setForeground(Color.CYAN);
		创建社团.setFont(new Font("宋体", Font.PLAIN, 15));
		创建社团.setBackground(Color.BLACK);
		创建社团.setBounds(319, 144, 105, 27);
		contentPane.add(创建社团);
	}
}
