package ���ݿ�γ����;

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

public class �������� extends JFrame {

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
					�������� frame = new ��������();
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
	public ��������() {
		setTitle("\u5EFA\u7ACB\u793E\u56E2");
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u793E\u957F\u7684\u5B66\u53F7");
		label_1.setForeground(Color.CYAN);
		label_1.setFont(new Font("����", Font.PLAIN, 15));
		label_1.setBounds(10, 106, 120, 23);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u793E\u56E2\u7684\u7C7B\u578B");
		label_3.setForeground(Color.CYAN);
		label_3.setFont(new Font("����", Font.PLAIN, 15));
		label_3.setBounds(10, 155, 120, 23);
		contentPane.add(label_3);
		
		JLabel lblid = new JLabel("\u8BF7\u8F93\u5165\u793E\u56E2\u7684\u7F16\u53F7");
		lblid.setForeground(Color.CYAN);
		lblid.setFont(new Font("����", Font.PLAIN, 15));
		lblid.setBounds(10, 213, 120, 23);
		contentPane.add(lblid);
		
		JTextPane �������� = new JTextPane();
		��������.setBackground(Color.DARK_GRAY);
		��������.setForeground(Color.PINK);
		��������.setFont(new Font("����", Font.PLAIN, 15));
		��������.setBounds(157, 47, 209, 25);
		contentPane.add(��������);
		
		JTextPane �糤ѧ�� = new JTextPane();
		�糤ѧ��.setForeground(Color.PINK);
		�糤ѧ��.setFont(new Font("����", Font.PLAIN, 15));
		�糤ѧ��.setBackground(Color.DARK_GRAY);
		�糤ѧ��.setBounds(157, 104, 209, 25);
		contentPane.add(�糤ѧ��);
		
		JTextPane �������� = new JTextPane();
		��������.setForeground(Color.PINK);
		��������.setFont(new Font("����", Font.PLAIN, 15));
		��������.setBackground(Color.DARK_GRAY);
		��������.setBounds(157, 155, 209, 25);
		contentPane.add(��������);
		
		JLabel ������ʾ = new JLabel("\u793E\u56E2\u7F16\u53F7\u9519\u8BEF\uFF01");
		������ʾ.setVisible(false);
		JTextPane ���ű�� = new JTextPane();
		���ű��.setForeground(Color.PINK);
		���ű��.setFont(new Font("����", Font.PLAIN, 15));
		���ű��.setBackground(Color.DARK_GRAY);
		���ű��.setBounds(157, 211, 209, 25);
		contentPane.add(���ű��);
		
		JLabel lblNewLabel = new JLabel("<html>\u6CE8\u610F\u4E8B\u9879\uFF1A<br />\r\n1.\u793E\u957F\u53EF\u4EE5\u53C2\u52A0\u591A\u4E2A\u793E\u56E2\uFF0C\u4E5F\u53EF\u4EE5\u540C\u65F6\u62C5\u4EFB\u591A\u4E2A\u793E\u56E2\u7684\u793E\u957F\u3002<br />\r\n2.\u8F93\u5165\u65F6\u8BF7\u68C0\u67E5\u662F\u5426\u6B63\u786E\u3002<br />\r\n3.\u793E\u56E2\u7C7B\u578B\u4EC5\u80FD\u591F\u4E3A\u4EE5\u4E0B\u51E0\u4E2A\u7C7B\u578B\u4E4B\u4E00<br />\r\n    \u6587\u827A\u7C7B\u3001\u670D\u52A1\u7C7B\u3001\u4F53\u80B2\u7C7B<br />\r\n\u793E\u56E2\u7F16\u53F7\u4E0D\u80FD\u91CD\u590D");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(10, 275, 414, 107);
		contentPane.add(lblNewLabel);
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u793E\u56E2\u7684\u540D\u79F0");
		label.setFont(new Font("����", Font.PLAIN, 15));
		label.setForeground(Color.CYAN);
		label.setBounds(10, 47, 120, 25);
		contentPane.add(label);
		
		JButton ���� = new JButton("\u8FD4\u56DE");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				������Ϣ���� stx = new ������Ϣ����();
				setVisible(false);
				stx.setVisible(true);
			}
		});
		����.setForeground(Color.GREEN);
		����.setBackground(Color.BLACK);
		����.setFont(new Font("����", Font.PLAIN, 15));
		����.setBounds(10, 404, 93, 23);
		contentPane.add(����);
		
		JButton ȷ�� = new JButton("\u786E\u8BA4");
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check a = new Check();
			if(a.checkasc(���ű��.getText()))
			{
			try {
			Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			CallableStatement cstmt = dbConn.prepareCall("{call dbo.NewAssociation(?,?,?,?)}");
			dbConn.createStatement();
			cstmt.setString(1,��������.getText());
			cstmt.setString(2,�糤ѧ��.getText());
			cstmt.setString(3,��������.getText());
			cstmt.setString(4,���ű��.getText());
			cstmt.executeUpdate();//executeUpdate()�������ɾ����ʵ�ʲ���,executeQuery()���ڲ�����������������(�洢�ṹ����ѯ)
		}
			catch(Exception ea){
			ea.printStackTrace();
			}
			ȷ��.setVisible(false);
		}
			else
				{
				������ʾ.setVisible(true);
				}
			}
		});
		ȷ��.setBackground(Color.BLACK);
		ȷ��.setForeground(Color.CYAN);
		ȷ��.setFont(new Font("����", Font.PLAIN, 15));
		ȷ��.setBounds(331, 404, 93, 23);
		contentPane.add(ȷ��);
		
		
		������ʾ.setFont(new Font("����", Font.PLAIN, 15));
		������ʾ.setForeground(Color.RED);
		������ʾ.setBounds(314, 371, 110, 23);
		contentPane.add(������ʾ);
		
		
	}

}
