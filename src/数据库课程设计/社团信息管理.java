package ���ݿ�γ����;

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

public class ������Ϣ���� extends JFrame {

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
					������Ϣ���� frame = new ������Ϣ����();
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
	public ������Ϣ����() {
		setTitle("\u793E\u56E2\u4FE1\u606F\u7BA1\u7406");
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
		JButton �������� = new JButton("\u521B\u5EFA\u793E\u56E2");
		JButton ��һ�� = new JButton("\u4E0B\u4E00\u6B65");
		JButton ���� = new JButton("\u8FD4\u56DE");
		JButton ��ѯ��ť = new JButton("\u8FDB\u884C\u67E5\u8BE2");
		JTextPane ���ű�� = new JTextPane();
		JLabel ��ʾ = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8981\u64CD\u4F5C\u7684\u793E\u56E2\u7F16\u53F7");
		
		JLabel ������ʾ = new JLabel("\u67E5\u627E\u5230\u5982\u4E0B\u4FE1\u606F\uFF1A");
		
		JScrollPane ������ = new JScrollPane();
		������.setBounds(10, 209, 414, 172);
		contentPane.add(������);
		��һ��.setVisible(false);
		JTextArea ������Ϣ = new JTextArea();
		������Ϣ.setFont(new Font("����", Font.PLAIN, 15));
		������Ϣ.setForeground(Color.GREEN);
		������Ϣ.setBackground(Color.BLACK);
		������.setViewportView(������Ϣ);
		������ʾ.setFont(new Font("����", Font.PLAIN, 14));
		������ʾ.setForeground(Color.CYAN);
		������ʾ.setBounds(10, 178, 137, 16);
		contentPane.add(������ʾ);
		��ʾ.setForeground(Color.CYAN);
		��ʾ.setFont(new Font("����", Font.PLAIN, 14));
		��ʾ.setBounds(10, 26, 223, 16);
		contentPane.add(��ʾ);
		
		���ű��.setFont(new Font("����", Font.PLAIN, 15));
		���ű��.setForeground(Color.YELLOW);
		���ű��.setBackground(Color.DARK_GRAY);
		���ű��.setBounds(10, 93, 267, 27);
		contentPane.add(���ű��);
		������ʾ.setVisible(false);
		������Ϣ.setVisible(false);
		������.setVisible(false);
		��ѯ��ť.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ID = ���ű��.getText();
				try{
					������Ϣ.setText("");
					Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
					CallableStatement cstmt = dbConn.prepareCall("{call dbo.AssociationSearchByID(?)}");
					cstmt.setString(1,ID);
					ResultSet rs = cstmt.executeQuery();
					if(rs.next())
					{
						
						
						������Ϣ.append(rs.getString("result"));
						������Ϣ.append("\n");
						������ʾ.setVisible(true);
						������Ϣ.setVisible(true);
						��һ��.setVisible(true);
						������.setVisible(true);
						
					}
					else
					{
						������ʾ.setVisible(true);
						������ʾ.setText("û���ҵ�������ţ� ");
						��һ��.setVisible(false);
						������Ϣ.setVisible(false);
						������.setVisible(false);
					}
					rs.close(); 
					}
					catch(Exception ea){
					ea.printStackTrace();
					}
			}
		});
		��ѯ��ť.setBackground(Color.BLACK);
		��ѯ��ť.setForeground(Color.CYAN);
		��ѯ��ť.setFont(new Font("����", Font.PLAIN, 15));
		��ѯ��ť.setBounds(319, 93, 105, 27);
		contentPane.add(��ѯ��ť);
		
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				������ zjm = new ������();
				zjm.setVisible(true);
			}
		});
		����.setForeground(Color.CYAN);
		����.setFont(new Font("����", Font.PLAIN, 15));
		����.setBackground(Color.BLACK);
		����.setBounds(10, 402, 105, 27);
		contentPane.add(����);
		
		��һ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�޸�������Ϣ xg = new �޸�������Ϣ (���ű��.getText());
				xg.setVisible(true);
				setVisible(false);
			}
		});
		��һ��.setForeground(Color.CYAN);
		��һ��.setFont(new Font("����", Font.PLAIN, 15));
		��һ��.setBackground(Color.BLACK);
		��һ��.setBounds(319, 402, 105, 27);
		contentPane.add(��һ��);
		
		
		��������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�������� jl = new ��������();
				setVisible(false);
				jl.setVisible(true);
			}
		});
		��������.setForeground(Color.CYAN);
		��������.setFont(new Font("����", Font.PLAIN, 15));
		��������.setBackground(Color.BLACK);
		��������.setBounds(319, 144, 105, 27);
		contentPane.add(��������);
	}
}
