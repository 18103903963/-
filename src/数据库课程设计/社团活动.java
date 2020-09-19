package 数据库课程设计;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 社团活动 extends JFrame {

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
					社团活动 frame = new 社团活动("");
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
	public 社团活动(String AID) {
		
		String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";
		String userName="sa";//你的数据库用户名
		String userPwd="123";//你的密码
		
		
		setTitle("\u793E\u56E2\u6D3B\u52A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton 删除活动 = new JButton("\u5220\u9664\u5DF2\u6709\u6D3B\u52A8");
		
		JLabel 社团名称 = new JLabel("\u793E\u56E2\u540D\u79F0");
		社团名称.setFont(new Font("宋体", Font.PLAIN, 15));
		社团名称.setForeground(Color.PINK);
		社团名称.setBackground(Color.BLACK);
		社团名称.setBounds(10, 10, 150, 22);
		contentPane.add(社团名称);
		
		JScrollPane 滚动条 = new JScrollPane();
		滚动条.setBounds(10, 69, 414, 128);
		contentPane.add(滚动条);
		
		JButton 删除完成 = new JButton("\u5B8C\u6210");
		删除完成.setVisible(false);
		
		JTextArea 信息 = new JTextArea();
		信息.setEditable(false);
		信息.setFont(new Font("宋体", Font.PLAIN, 15));
		信息.setForeground(Color.MAGENTA);
		信息.setBackground(Color.BLACK);
		滚动条.setViewportView(信息);
		
		
		JLabel 社团信息 = new JLabel("\u8BE5\u793E\u56E2\u6D3B\u52A8\u4FE1\u606F\u5982\u4E0B");
		社团信息.setForeground(Color.GREEN);
		社团信息.setFont(new Font("宋体", Font.PLAIN, 15));
		社团信息.setBackground(Color.BLACK);
		社团信息.setBounds(10, 42, 150, 22);
		contentPane.add(社团信息);
		
		JLabel l1 = new JLabel("\u6D3B\u52A8\u6807\u9898");
		l1.setForeground(Color.CYAN);
		l1.setFont(new Font("宋体", Font.PLAIN, 15));
		l1.setBackground(Color.BLACK);
		l1.setBounds(10, 311, 66, 22);
		contentPane.add(l1);
		l1.setVisible(false);
		
		JLabel 格式提示 = new JLabel("\u6D3B\u52A8\u65E5\u671F\u683C\u5F0F\u5982\uFF1A 2019-12-12 ");
		格式提示.setVisible(false);
		
		JLabel l2 = new JLabel("\u6D3B\u52A8\u7F16\u53F7");
		l2.setForeground(Color.CYAN);
		l2.setFont(new Font("宋体", Font.PLAIN, 15));
		l2.setBackground(Color.BLACK);
		l2.setBounds(10, 352, 66, 22);
		contentPane.add(l2);
		l2.setVisible(false);
		
		JLabel l3 = new JLabel("\u6D3B\u52A8\u7C7B\u578B");
		l3.setForeground(Color.CYAN);
		l3.setFont(new Font("宋体", Font.PLAIN, 15));
		l3.setBackground(Color.BLACK);
		l3.setBounds(215, 311, 66, 22);
		contentPane.add(l3);
		l3.setVisible(false);
		
		JLabel 不存在错误 = new JLabel("\u4E0D\u5B58\u5728\u6B64\u7F16\u53F7");
		
		JLabel l4 = new JLabel("\u6D3B\u52A8\u65E5\u671F");
		l4.setForeground(Color.CYAN);
		l4.setFont(new Font("宋体", Font.PLAIN, 15));
		l4.setBackground(Color.BLACK);
		l4.setBounds(215, 352, 66, 22);
		contentPane.add(l4);
		l4.setVisible(false);
		
		JLabel 存在错误 = new JLabel("\u7F16\u53F7\u91CD\u590D\uFF01");
		JButton 完成 = new JButton("\u5B8C\u6210");
		
		JTextPane 活动标题 = new JTextPane();
		活动标题.setBackground(Color.DARK_GRAY);
		活动标题.setForeground(Color.ORANGE);
		活动标题.setFont(new Font("宋体", Font.PLAIN, 15));
		活动标题.setBounds(80, 312, 113, 21);
		contentPane.add(活动标题);
		活动标题.setVisible(false);
		
		JTextPane 活动编号 = new JTextPane();
		活动编号.setForeground(Color.ORANGE);
		活动编号.setFont(new Font("宋体", Font.PLAIN, 15));
		活动编号.setBackground(Color.DARK_GRAY);
		活动编号.setBounds(80, 353, 113, 21);
		contentPane.add(活动编号);
		活动编号.setVisible(false);
		
		JTextPane 活动类型 = new JTextPane();
		活动类型.setForeground(Color.ORANGE);
		活动类型.setFont(new Font("宋体", Font.PLAIN, 15));
		活动类型.setBackground(Color.DARK_GRAY);
		活动类型.setBounds(291, 312, 106, 21);
		contentPane.add(活动类型);
		活动类型.setVisible(false);
		
		JTextPane 活动日期 = new JTextPane();
		活动日期.setForeground(Color.ORANGE);
		活动日期.setFont(new Font("宋体", Font.PLAIN, 15));
		活动日期.setBackground(Color.DARK_GRAY);
		活动日期.setBounds(291, 352, 106, 21);
		contentPane.add(活动日期);
		活动日期.setVisible(false);
		
		JButton 添加新活动 = new JButton("\u6DFB\u52A0\u65B0\u6D3B\u52A8");
		添加新活动.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setVisible(true);
				l2.setVisible(true);
				l3.setVisible(true);
				l4.setVisible(true);
				活动日期.setVisible(true);
				活动标题.setVisible(true);
				活动类型.setVisible(true);
				活动编号.setVisible(true);
				添加新活动.setEnabled(false);
				删除活动.setEnabled(true);
				完成.setVisible(true);
				删除完成.setVisible(false);
				格式提示.setVisible(true);
			}
		});
		添加新活动.setFont(new Font("宋体", Font.PLAIN, 15));
		添加新活动.setBackground(Color.BLACK);
		添加新活动.setForeground(Color.CYAN);
		添加新活动.setBounds(39, 207, 141, 23);
		contentPane.add(添加新活动);
		
		
		完成.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check ck = new Check();
				if(ck.checkact(活动编号.getText()))
				{
				try {
				Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
				CallableStatement cstmt = dbConn.prepareCall("{call dbo.NewActivity(?,?,?,?,?)}");
				cstmt.setString(1, AID);
				cstmt.setString(2, 活动编号.getText());
				cstmt.setString(3, 活动日期.getText());
				cstmt.setString(4, 活动标题.getText());
				cstmt.setString(5, 活动类型.getText());
				cstmt.executeUpdate();
				存在错误.setText("添加活动成功！");
				Statement ps = dbConn.createStatement();
				String inquire = "select Activity_Title,Activity_ID,Activity_Date from Activity where Association_ID='"+AID+"'";
				ResultSet rs = ps.executeQuery(inquire);
				if(rs.next())
				社团名称.setText(rs.getString(1));
				inquire = "select Activity_Title,Activity_ID,Activity_Date,Association_ID from Activity where Association_ID='"+AID+"'";
				rs = ps.executeQuery(inquire);
				if(rs.next())
				{
					信息.setText(rs.getString(1)+"      ");
					信息.append(rs.getString(2)+"      ");
					信息.append(rs.getString(3)+"      "+'\n');
				while(rs.next())
				{
					信息.append(rs.getString(1)+"      ");
					信息.append(rs.getString(2)+"      ");
					信息.append(rs.getString(3)+"      "+'\n');
				}}
				else
					信息.setText("该社团目前没有举办任何活动！");
				}catch(Exception ea)
				{
					ea.printStackTrace();
				}
				}
				else
				{
					存在错误.setText("编号重复！");
					存在错误.setVisible(true);
				}
			}
		});
		完成.setForeground(Color.CYAN);
		完成.setFont(new Font("宋体", Font.PLAIN, 15));
		完成.setBackground(Color.BLACK);
		完成.setBounds(185, 405, 66, 22);
		contentPane.add(完成);
		完成.setVisible(false);
		
		
		存在错误.setForeground(Color.RED);
		存在错误.setFont(new Font("宋体", Font.PLAIN, 15));
		存在错误.setBackground(Color.BLACK);
		存在错误.setBounds(105, 405, 78, 22);
		contentPane.add(存在错误);
		存在错误.setVisible(false);
		
		JButton 返回 = new JButton("\u8FD4\u56DE");
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				主界面 zjm = new 主界面();
				dispose();
				zjm.setVisible(true);
			}
		});
		返回.setForeground(Color.CYAN);
		返回.setFont(new Font("宋体", Font.PLAIN, 15));
		返回.setBackground(Color.BLACK);
		返回.setBounds(10, 405, 66, 22);
		contentPane.add(返回);
		
		
		删除完成.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Check ck = new Check();
				if(!ck.checkact(活动编号.getText()))
				{
				try {
				Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
				CallableStatement cstmt = dbConn.prepareCall("{call dbo.ActivityDelete(?)}");
				cstmt.setString(1, 活动编号.getText());
				cstmt.executeUpdate();
				不存在错误.setVisible(true);
				不存在错误.setText("删除活动成功！");
				Statement ps = dbConn.createStatement();
				String inquire = "select Activity_Title,Activity_ID,Activity_Date from Activity where Association_ID='"+AID+"'";
				ResultSet rs = ps.executeQuery(inquire);
				if(rs.next())
				社团名称.setText(rs.getString(1));
				inquire = "select Activity_Title,Activity_ID,Activity_Date,Association_ID from Activity where Association_ID='"+AID+"'";
				rs = ps.executeQuery(inquire);
				if(rs.next())
				{
					信息.setText(rs.getString(1)+"      ");
					信息.append(rs.getString(2)+"      ");
					信息.append(rs.getString(3)+"      "+'\n');
				while(rs.next())
				{
					信息.append(rs.getString(1)+"      ");
					信息.append(rs.getString(2)+"      ");
					信息.append(rs.getString(3)+"      "+'\n');
				}}
				else
					信息.setText("该社团目前没有举办任何活动！");
				}catch(Exception ea)
				{
					ea.printStackTrace();
				}
				}
				else
				{
					不存在错误.setText("编号重复！");
					不存在错误.setVisible(true);
				}
			}
		});
		删除完成.setForeground(Color.CYAN);
		删除完成.setFont(new Font("宋体", Font.PLAIN, 15));
		删除完成.setBackground(Color.BLACK);
		删除完成.setBounds(358, 405, 66, 22);
		contentPane.add(删除完成);
		
		
		删除活动.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setVisible(false);
				l2.setVisible(true);
				l3.setVisible(false);
				l4.setVisible(false);
				活动日期.setVisible(false);
				活动标题.setVisible(false);
				活动类型.setVisible(false);
				活动编号.setVisible(false);
				添加新活动.setEnabled(true);
				活动编号.setVisible(true);
				删除完成.setVisible(true);
				完成.setVisible(false);
				删除活动.setEnabled(false);
				格式提示.setVisible(false);
			}
		});
		删除活动.setForeground(Color.CYAN);
		删除活动.setFont(new Font("宋体", Font.PLAIN, 15));
		删除活动.setBackground(Color.BLACK);
		删除活动.setBounds(256, 207, 141, 23);
		contentPane.add(删除活动);
		
		
		不存在错误.setForeground(Color.RED);
		不存在错误.setFont(new Font("宋体", Font.PLAIN, 15));
		不存在错误.setBackground(Color.BLACK);
		不存在错误.setBounds(256, 405, 92, 22);
		contentPane.add(不存在错误);
		
		
		格式提示.setForeground(Color.PINK);
		格式提示.setFont(new Font("宋体", Font.PLAIN, 15));
		格式提示.setBounds(185, 374, 216, 37);
		contentPane.add(格式提示);
		不存在错误.setVisible(false);
		
		
		try {
		Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
		Statement ps = dbConn.createStatement();
		String inquire = "SELECT Association_Name from Association where Association_ID ='"+AID+"'";
		ResultSet rs = ps.executeQuery(inquire);
		if(rs.next())
		社团名称.setText(rs.getString(1));
		inquire = "select Activity_Title,Activity_ID,Activity_Date from Activity where Association_ID='"+AID+"'";
		rs = ps.executeQuery(inquire);
		if(rs.next())
		{
			信息.setText(rs.getString(1)+"      ");
			信息.append(rs.getString(2)+"      ");
			信息.append(rs.getString(3)+"      "+'\n');
		while(rs.next())
		{
			信息.append(rs.getString(1)+"      ");
			信息.append(rs.getString(2)+"      ");
			信息.append(rs.getString(3)+"      "+'\n');
		}}
		else
			信息.setText("该社团目前没有举办任何活动！");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
