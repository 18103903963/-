package 数据库课程设计;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class 建立社团 extends JFrame {

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
					建立社团 frame = new 建立社团();
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
	public 建立社团() {
		setTitle("\u5EFA\u7ACB\u793E\u56E2");
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
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u793E\u957F\u7684\u5B66\u53F7");
		label_1.setForeground(Color.CYAN);
		label_1.setFont(new Font("宋体", Font.PLAIN, 15));
		label_1.setBounds(10, 106, 120, 23);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u793E\u56E2\u7684\u7C7B\u578B");
		label_3.setForeground(Color.CYAN);
		label_3.setFont(new Font("宋体", Font.PLAIN, 15));
		label_3.setBounds(10, 155, 120, 23);
		contentPane.add(label_3);
		
		JLabel lblid = new JLabel("\u8BF7\u8F93\u5165\u793E\u56E2\u7684\u7F16\u53F7");
		lblid.setForeground(Color.CYAN);
		lblid.setFont(new Font("宋体", Font.PLAIN, 15));
		lblid.setBounds(10, 213, 120, 23);
		contentPane.add(lblid);
		
		JTextPane 社团名称 = new JTextPane();
		社团名称.setBackground(Color.DARK_GRAY);
		社团名称.setForeground(Color.PINK);
		社团名称.setFont(new Font("宋体", Font.PLAIN, 15));
		社团名称.setBounds(157, 47, 209, 25);
		contentPane.add(社团名称);
		
		JTextPane 社长学号 = new JTextPane();
		社长学号.setForeground(Color.PINK);
		社长学号.setFont(new Font("宋体", Font.PLAIN, 15));
		社长学号.setBackground(Color.DARK_GRAY);
		社长学号.setBounds(157, 104, 209, 25);
		contentPane.add(社长学号);
		
		JTextPane 社团类型 = new JTextPane();
		社团类型.setForeground(Color.PINK);
		社团类型.setFont(new Font("宋体", Font.PLAIN, 15));
		社团类型.setBackground(Color.DARK_GRAY);
		社团类型.setBounds(157, 155, 209, 25);
		contentPane.add(社团类型);
		
		JLabel 错误提示 = new JLabel("\u793E\u56E2\u7F16\u53F7\u9519\u8BEF\uFF01");
		错误提示.setVisible(false);
		JTextPane 社团编号 = new JTextPane();
		社团编号.setForeground(Color.PINK);
		社团编号.setFont(new Font("宋体", Font.PLAIN, 15));
		社团编号.setBackground(Color.DARK_GRAY);
		社团编号.setBounds(157, 211, 209, 25);
		contentPane.add(社团编号);
		
		JLabel lblNewLabel = new JLabel("<html>\u6CE8\u610F\u4E8B\u9879\uFF1A<br />\r\n1.\u793E\u957F\u53EF\u4EE5\u53C2\u52A0\u591A\u4E2A\u793E\u56E2\uFF0C\u4E5F\u53EF\u4EE5\u540C\u65F6\u62C5\u4EFB\u591A\u4E2A\u793E\u56E2\u7684\u793E\u957F\u3002<br />\r\n2.\u8F93\u5165\u65F6\u8BF7\u68C0\u67E5\u662F\u5426\u6B63\u786E\u3002<br />\r\n3.\u793E\u56E2\u7C7B\u578B\u4EC5\u80FD\u591F\u4E3A\u4EE5\u4E0B\u51E0\u4E2A\u7C7B\u578B\u4E4B\u4E00<br />\r\n    \u6587\u827A\u7C7B\u3001\u670D\u52A1\u7C7B\u3001\u4F53\u80B2\u7C7B<br />\r\n\u793E\u56E2\u7F16\u53F7\u4E0D\u80FD\u91CD\u590D");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(10, 275, 414, 107);
		contentPane.add(lblNewLabel);
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u793E\u56E2\u7684\u540D\u79F0");
		label.setFont(new Font("宋体", Font.PLAIN, 15));
		label.setForeground(Color.CYAN);
		label.setBounds(10, 47, 120, 25);
		contentPane.add(label);
		
		JButton 返回 = new JButton("\u8FD4\u56DE");
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				社团信息管理 stx = new 社团信息管理();
				setVisible(false);
				stx.setVisible(true);
			}
		});
		返回.setForeground(Color.GREEN);
		返回.setBackground(Color.BLACK);
		返回.setFont(new Font("宋体", Font.PLAIN, 15));
		返回.setBounds(10, 404, 93, 23);
		contentPane.add(返回);
		
		JButton 确认 = new JButton("\u786E\u8BA4");
		确认.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check a = new Check();
			if(a.checkasc(社团编号.getText()))
			{
			try {
			Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			CallableStatement cstmt = dbConn.prepareCall("{call dbo.NewAssociation(?,?,?,?)}");
			dbConn.createStatement();
			cstmt.setString(1,社团名称.getText());
			cstmt.setString(2,社长学号.getText());
			cstmt.setString(3,社团类型.getText());
			cstmt.setString(4,社团编号.getText());
			cstmt.executeUpdate();//executeUpdate()用于添加删除等实际操作,executeQuery()用于产生单个结果集的语句(存储结构，查询)
		}
			catch(Exception ea){
			ea.printStackTrace();
			}
			确认.setVisible(false);
		}
			else
				{
				错误提示.setVisible(true);
				}
			}
		});
		确认.setBackground(Color.BLACK);
		确认.setForeground(Color.CYAN);
		确认.setFont(new Font("宋体", Font.PLAIN, 15));
		确认.setBounds(331, 404, 93, 23);
		contentPane.add(确认);
		
		
		错误提示.setFont(new Font("宋体", Font.PLAIN, 15));
		错误提示.setForeground(Color.RED);
		错误提示.setBounds(314, 371, 110, 23);
		contentPane.add(错误提示);
		
		
	}

}
