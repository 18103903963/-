package ���ݿ�γ����;

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

public class ���Ż extends JFrame {

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
					���Ż frame = new ���Ż("");
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
	public ���Ż(String AID) {
		
		String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";
		String userName="sa";//������ݿ��û���
		String userPwd="123";//�������
		
		
		setTitle("\u793E\u56E2\u6D3B\u52A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ɾ��� = new JButton("\u5220\u9664\u5DF2\u6709\u6D3B\u52A8");
		
		JLabel �������� = new JLabel("\u793E\u56E2\u540D\u79F0");
		��������.setFont(new Font("����", Font.PLAIN, 15));
		��������.setForeground(Color.PINK);
		��������.setBackground(Color.BLACK);
		��������.setBounds(10, 10, 150, 22);
		contentPane.add(��������);
		
		JScrollPane ������ = new JScrollPane();
		������.setBounds(10, 69, 414, 128);
		contentPane.add(������);
		
		JButton ɾ����� = new JButton("\u5B8C\u6210");
		ɾ�����.setVisible(false);
		
		JTextArea ��Ϣ = new JTextArea();
		��Ϣ.setEditable(false);
		��Ϣ.setFont(new Font("����", Font.PLAIN, 15));
		��Ϣ.setForeground(Color.MAGENTA);
		��Ϣ.setBackground(Color.BLACK);
		������.setViewportView(��Ϣ);
		
		
		JLabel ������Ϣ = new JLabel("\u8BE5\u793E\u56E2\u6D3B\u52A8\u4FE1\u606F\u5982\u4E0B");
		������Ϣ.setForeground(Color.GREEN);
		������Ϣ.setFont(new Font("����", Font.PLAIN, 15));
		������Ϣ.setBackground(Color.BLACK);
		������Ϣ.setBounds(10, 42, 150, 22);
		contentPane.add(������Ϣ);
		
		JLabel l1 = new JLabel("\u6D3B\u52A8\u6807\u9898");
		l1.setForeground(Color.CYAN);
		l1.setFont(new Font("����", Font.PLAIN, 15));
		l1.setBackground(Color.BLACK);
		l1.setBounds(10, 311, 66, 22);
		contentPane.add(l1);
		l1.setVisible(false);
		
		JLabel ��ʽ��ʾ = new JLabel("\u6D3B\u52A8\u65E5\u671F\u683C\u5F0F\u5982\uFF1A 2019-12-12 ");
		��ʽ��ʾ.setVisible(false);
		
		JLabel l2 = new JLabel("\u6D3B\u52A8\u7F16\u53F7");
		l2.setForeground(Color.CYAN);
		l2.setFont(new Font("����", Font.PLAIN, 15));
		l2.setBackground(Color.BLACK);
		l2.setBounds(10, 352, 66, 22);
		contentPane.add(l2);
		l2.setVisible(false);
		
		JLabel l3 = new JLabel("\u6D3B\u52A8\u7C7B\u578B");
		l3.setForeground(Color.CYAN);
		l3.setFont(new Font("����", Font.PLAIN, 15));
		l3.setBackground(Color.BLACK);
		l3.setBounds(215, 311, 66, 22);
		contentPane.add(l3);
		l3.setVisible(false);
		
		JLabel �����ڴ��� = new JLabel("\u4E0D\u5B58\u5728\u6B64\u7F16\u53F7");
		
		JLabel l4 = new JLabel("\u6D3B\u52A8\u65E5\u671F");
		l4.setForeground(Color.CYAN);
		l4.setFont(new Font("����", Font.PLAIN, 15));
		l4.setBackground(Color.BLACK);
		l4.setBounds(215, 352, 66, 22);
		contentPane.add(l4);
		l4.setVisible(false);
		
		JLabel ���ڴ��� = new JLabel("\u7F16\u53F7\u91CD\u590D\uFF01");
		JButton ��� = new JButton("\u5B8C\u6210");
		
		JTextPane ����� = new JTextPane();
		�����.setBackground(Color.DARK_GRAY);
		�����.setForeground(Color.ORANGE);
		�����.setFont(new Font("����", Font.PLAIN, 15));
		�����.setBounds(80, 312, 113, 21);
		contentPane.add(�����);
		�����.setVisible(false);
		
		JTextPane ���� = new JTextPane();
		����.setForeground(Color.ORANGE);
		����.setFont(new Font("����", Font.PLAIN, 15));
		����.setBackground(Color.DARK_GRAY);
		����.setBounds(80, 353, 113, 21);
		contentPane.add(����);
		����.setVisible(false);
		
		JTextPane ����� = new JTextPane();
		�����.setForeground(Color.ORANGE);
		�����.setFont(new Font("����", Font.PLAIN, 15));
		�����.setBackground(Color.DARK_GRAY);
		�����.setBounds(291, 312, 106, 21);
		contentPane.add(�����);
		�����.setVisible(false);
		
		JTextPane ����� = new JTextPane();
		�����.setForeground(Color.ORANGE);
		�����.setFont(new Font("����", Font.PLAIN, 15));
		�����.setBackground(Color.DARK_GRAY);
		�����.setBounds(291, 352, 106, 21);
		contentPane.add(�����);
		�����.setVisible(false);
		
		JButton ����» = new JButton("\u6DFB\u52A0\u65B0\u6D3B\u52A8");
		����».addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setVisible(true);
				l2.setVisible(true);
				l3.setVisible(true);
				l4.setVisible(true);
				�����.setVisible(true);
				�����.setVisible(true);
				�����.setVisible(true);
				����.setVisible(true);
				����».setEnabled(false);
				ɾ���.setEnabled(true);
				���.setVisible(true);
				ɾ�����.setVisible(false);
				��ʽ��ʾ.setVisible(true);
			}
		});
		����».setFont(new Font("����", Font.PLAIN, 15));
		����».setBackground(Color.BLACK);
		����».setForeground(Color.CYAN);
		����».setBounds(39, 207, 141, 23);
		contentPane.add(����»);
		
		
		���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check ck = new Check();
				if(ck.checkact(����.getText()))
				{
				try {
				Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
				CallableStatement cstmt = dbConn.prepareCall("{call dbo.NewActivity(?,?,?,?,?)}");
				cstmt.setString(1, AID);
				cstmt.setString(2, ����.getText());
				cstmt.setString(3, �����.getText());
				cstmt.setString(4, �����.getText());
				cstmt.setString(5, �����.getText());
				cstmt.executeUpdate();
				���ڴ���.setText("��ӻ�ɹ���");
				Statement ps = dbConn.createStatement();
				String inquire = "select Activity_Title,Activity_ID,Activity_Date from Activity where Association_ID='"+AID+"'";
				ResultSet rs = ps.executeQuery(inquire);
				if(rs.next())
				��������.setText(rs.getString(1));
				inquire = "select Activity_Title,Activity_ID,Activity_Date,Association_ID from Activity where Association_ID='"+AID+"'";
				rs = ps.executeQuery(inquire);
				if(rs.next())
				{
					��Ϣ.setText(rs.getString(1)+"      ");
					��Ϣ.append(rs.getString(2)+"      ");
					��Ϣ.append(rs.getString(3)+"      "+'\n');
				while(rs.next())
				{
					��Ϣ.append(rs.getString(1)+"      ");
					��Ϣ.append(rs.getString(2)+"      ");
					��Ϣ.append(rs.getString(3)+"      "+'\n');
				}}
				else
					��Ϣ.setText("������Ŀǰû�оٰ��κλ��");
				}catch(Exception ea)
				{
					ea.printStackTrace();
				}
				}
				else
				{
					���ڴ���.setText("����ظ���");
					���ڴ���.setVisible(true);
				}
			}
		});
		���.setForeground(Color.CYAN);
		���.setFont(new Font("����", Font.PLAIN, 15));
		���.setBackground(Color.BLACK);
		���.setBounds(185, 405, 66, 22);
		contentPane.add(���);
		���.setVisible(false);
		
		
		���ڴ���.setForeground(Color.RED);
		���ڴ���.setFont(new Font("����", Font.PLAIN, 15));
		���ڴ���.setBackground(Color.BLACK);
		���ڴ���.setBounds(105, 405, 78, 22);
		contentPane.add(���ڴ���);
		���ڴ���.setVisible(false);
		
		JButton ���� = new JButton("\u8FD4\u56DE");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				������ zjm = new ������();
				dispose();
				zjm.setVisible(true);
			}
		});
		����.setForeground(Color.CYAN);
		����.setFont(new Font("����", Font.PLAIN, 15));
		����.setBackground(Color.BLACK);
		����.setBounds(10, 405, 66, 22);
		contentPane.add(����);
		
		
		ɾ�����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Check ck = new Check();
				if(!ck.checkact(����.getText()))
				{
				try {
				Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
				CallableStatement cstmt = dbConn.prepareCall("{call dbo.ActivityDelete(?)}");
				cstmt.setString(1, ����.getText());
				cstmt.executeUpdate();
				�����ڴ���.setVisible(true);
				�����ڴ���.setText("ɾ����ɹ���");
				Statement ps = dbConn.createStatement();
				String inquire = "select Activity_Title,Activity_ID,Activity_Date from Activity where Association_ID='"+AID+"'";
				ResultSet rs = ps.executeQuery(inquire);
				if(rs.next())
				��������.setText(rs.getString(1));
				inquire = "select Activity_Title,Activity_ID,Activity_Date,Association_ID from Activity where Association_ID='"+AID+"'";
				rs = ps.executeQuery(inquire);
				if(rs.next())
				{
					��Ϣ.setText(rs.getString(1)+"      ");
					��Ϣ.append(rs.getString(2)+"      ");
					��Ϣ.append(rs.getString(3)+"      "+'\n');
				while(rs.next())
				{
					��Ϣ.append(rs.getString(1)+"      ");
					��Ϣ.append(rs.getString(2)+"      ");
					��Ϣ.append(rs.getString(3)+"      "+'\n');
				}}
				else
					��Ϣ.setText("������Ŀǰû�оٰ��κλ��");
				}catch(Exception ea)
				{
					ea.printStackTrace();
				}
				}
				else
				{
					�����ڴ���.setText("����ظ���");
					�����ڴ���.setVisible(true);
				}
			}
		});
		ɾ�����.setForeground(Color.CYAN);
		ɾ�����.setFont(new Font("����", Font.PLAIN, 15));
		ɾ�����.setBackground(Color.BLACK);
		ɾ�����.setBounds(358, 405, 66, 22);
		contentPane.add(ɾ�����);
		
		
		ɾ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setVisible(false);
				l2.setVisible(true);
				l3.setVisible(false);
				l4.setVisible(false);
				�����.setVisible(false);
				�����.setVisible(false);
				�����.setVisible(false);
				����.setVisible(false);
				����».setEnabled(true);
				����.setVisible(true);
				ɾ�����.setVisible(true);
				���.setVisible(false);
				ɾ���.setEnabled(false);
				��ʽ��ʾ.setVisible(false);
			}
		});
		ɾ���.setForeground(Color.CYAN);
		ɾ���.setFont(new Font("����", Font.PLAIN, 15));
		ɾ���.setBackground(Color.BLACK);
		ɾ���.setBounds(256, 207, 141, 23);
		contentPane.add(ɾ���);
		
		
		�����ڴ���.setForeground(Color.RED);
		�����ڴ���.setFont(new Font("����", Font.PLAIN, 15));
		�����ڴ���.setBackground(Color.BLACK);
		�����ڴ���.setBounds(256, 405, 92, 22);
		contentPane.add(�����ڴ���);
		
		
		��ʽ��ʾ.setForeground(Color.PINK);
		��ʽ��ʾ.setFont(new Font("����", Font.PLAIN, 15));
		��ʽ��ʾ.setBounds(185, 374, 216, 37);
		contentPane.add(��ʽ��ʾ);
		�����ڴ���.setVisible(false);
		
		
		try {
		Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
		Statement ps = dbConn.createStatement();
		String inquire = "SELECT Association_Name from Association where Association_ID ='"+AID+"'";
		ResultSet rs = ps.executeQuery(inquire);
		if(rs.next())
		��������.setText(rs.getString(1));
		inquire = "select Activity_Title,Activity_ID,Activity_Date from Activity where Association_ID='"+AID+"'";
		rs = ps.executeQuery(inquire);
		if(rs.next())
		{
			��Ϣ.setText(rs.getString(1)+"      ");
			��Ϣ.append(rs.getString(2)+"      ");
			��Ϣ.append(rs.getString(3)+"      "+'\n');
		while(rs.next())
		{
			��Ϣ.append(rs.getString(1)+"      ");
			��Ϣ.append(rs.getString(2)+"      ");
			��Ϣ.append(rs.getString(3)+"      "+'\n');
		}}
		else
			��Ϣ.setText("������Ŀǰû�оٰ��κλ��");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
