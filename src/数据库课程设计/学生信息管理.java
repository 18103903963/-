package 数据库课程设计;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class 学生信息管理 extends JFrame {

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
					学生信息管理 frame = new 学生信息管理();
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
	public 学生信息管理() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(主界面.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		setTitle("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u4E0A\u4E00\u6B65");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				主界面 ajm = new 主界面();
				dispose();
				ajm.setVisible(true);
			}
		});
		button.setForeground(Color.CYAN);
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(10, 398, 96, 29);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5B66\u751F\u7F16\u53F7");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("宋体", Font.PLAIN, 13));
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(41, 57, 119, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u8981\u52A0\u5165\u6216\u9000\u51FA\u7684\u793E\u56E2\u7F16\u53F7");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("宋体", Font.PLAIN, 13));
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(41, 138, 254, 18);
		contentPane.add(label_2);
		
		JTextPane 学生编号 = new JTextPane();
		学生编号.setFont(new Font("宋体", Font.PLAIN, 15));
		学生编号.setForeground(Color.YELLOW);
		学生编号.setBackground(Color.DARK_GRAY);
		学生编号.setBounds(41, 85, 119, 29);
		contentPane.add(学生编号);
		
		JTextPane 社团编号 = new JTextPane();
		社团编号.setFont(new Font("宋体", Font.PLAIN, 15));
		社团编号.setForeground(Color.YELLOW);
		社团编号.setBackground(Color.DARK_GRAY);
		社团编号.setBounds(41, 166, 119, 29);
		contentPane.add(社团编号);
		
		JLabel 提示消息 = new JLabel("\u63D0\u793A\u6D88\u606F");
		提示消息.setBackground(Color.BLACK);
		提示消息.setForeground(Color.PINK);
		提示消息.setFont(new Font("宋体", Font.PLAIN, 15));
		提示消息.setBounds(41, 263, 278, 29);
		contentPane.add(提示消息);
		提示消息.setVisible(false);
		
		JButton 确认 = new JButton("\u786E\u8BA4");
		确认.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				提示消息.setVisible(true);
				提示消息.setText("正在连接数据库...");
				
				
				try {
					String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";
					String userName="sa";//你的数据库用户名
					String userPwd="123";//你的密码
					Check ck = new Check();
					if(ck.checkstu(学生编号.getText())) 
					{
						提示消息.setText("没有找到该学生！");
					}
					else
						if(ck.checkasc(社团编号.getText())) 
						{
							提示消息.setText("没有找到该社团！");
						}
						
						else {
					Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
					提示消息.setText("连接数据库成功！");
					CallableStatement cstmt = dbConn.prepareCall("{call dbo.Judge(?,?)}");
					提示消息.setText("正在调用存储过程...");
					cstmt.setString(1, 学生编号.getText());
					cstmt.setString(2, 社团编号.getText());
					cstmt.executeUpdate();
					提示消息.setText("保存成功!");
					确认.setVisible(false);
					
						}
				}catch(Exception e)
			
			{
				e.printStackTrace();
			}}
		});
		确认.setForeground(Color.CYAN);
		确认.setFont(new Font("宋体", Font.PLAIN, 15));
		确认.setBackground(Color.BLACK);
		确认.setBounds(41, 235, 96, 29);
		contentPane.add(确认);
		
		JLabel 提示 = new JLabel("<html>\u63D0\u793A\uFF1A\u5982\u679C\u8BE5\u5B66\u751F\u5DF2\u52A0\u5165\u8BE5\u793E\u56E2\uFF0C\u5219\u70B9\u51FB\u786E\u8BA4\u540E\u9000\u51FA\u793E\u56E2\uFF1B\r\n\r\n\u5982\u679C\u8BE5\u5B66\u751F\u4E0D\u5C5E\u4E8E\u8BE5\u793E\u56E2\uFF0C\u5219\u70B9\u51FB\u786E\u8BA4\u540E\u52A0\u5165\u793E\u56E2. ");
		提示.setFont(new Font("宋体", Font.PLAIN, 15));
		提示.setForeground(Color.RED);
		提示.setBounds(41, 302, 345, 86);
		contentPane.add(提示);
	}
}
