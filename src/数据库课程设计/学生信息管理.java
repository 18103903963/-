package ���ݿ�γ����;

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

public class ѧ����Ϣ���� extends JFrame {

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
					ѧ����Ϣ���� frame = new ѧ����Ϣ����();
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
	public ѧ����Ϣ����() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(������.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
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
				������ ajm = new ������();
				dispose();
				ajm.setVisible(true);
			}
		});
		button.setForeground(Color.CYAN);
		button.setFont(new Font("����", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(10, 398, 96, 29);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5B66\u751F\u7F16\u53F7");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("����", Font.PLAIN, 13));
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(41, 57, 119, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u8981\u52A0\u5165\u6216\u9000\u51FA\u7684\u793E\u56E2\u7F16\u53F7");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("����", Font.PLAIN, 13));
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(41, 138, 254, 18);
		contentPane.add(label_2);
		
		JTextPane ѧ����� = new JTextPane();
		ѧ�����.setFont(new Font("����", Font.PLAIN, 15));
		ѧ�����.setForeground(Color.YELLOW);
		ѧ�����.setBackground(Color.DARK_GRAY);
		ѧ�����.setBounds(41, 85, 119, 29);
		contentPane.add(ѧ�����);
		
		JTextPane ���ű�� = new JTextPane();
		���ű��.setFont(new Font("����", Font.PLAIN, 15));
		���ű��.setForeground(Color.YELLOW);
		���ű��.setBackground(Color.DARK_GRAY);
		���ű��.setBounds(41, 166, 119, 29);
		contentPane.add(���ű��);
		
		JLabel ��ʾ��Ϣ = new JLabel("\u63D0\u793A\u6D88\u606F");
		��ʾ��Ϣ.setBackground(Color.BLACK);
		��ʾ��Ϣ.setForeground(Color.PINK);
		��ʾ��Ϣ.setFont(new Font("����", Font.PLAIN, 15));
		��ʾ��Ϣ.setBounds(41, 263, 278, 29);
		contentPane.add(��ʾ��Ϣ);
		��ʾ��Ϣ.setVisible(false);
		
		JButton ȷ�� = new JButton("\u786E\u8BA4");
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				��ʾ��Ϣ.setVisible(true);
				��ʾ��Ϣ.setText("�����������ݿ�...");
				
				
				try {
					String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";
					String userName="sa";//������ݿ��û���
					String userPwd="123";//�������
					Check ck = new Check();
					if(ck.checkstu(ѧ�����.getText())) 
					{
						��ʾ��Ϣ.setText("û���ҵ���ѧ����");
					}
					else
						if(ck.checkasc(���ű��.getText())) 
						{
							��ʾ��Ϣ.setText("û���ҵ������ţ�");
						}
						
						else {
					Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
					��ʾ��Ϣ.setText("�������ݿ�ɹ���");
					CallableStatement cstmt = dbConn.prepareCall("{call dbo.Judge(?,?)}");
					��ʾ��Ϣ.setText("���ڵ��ô洢����...");
					cstmt.setString(1, ѧ�����.getText());
					cstmt.setString(2, ���ű��.getText());
					cstmt.executeUpdate();
					��ʾ��Ϣ.setText("����ɹ�!");
					ȷ��.setVisible(false);
					
						}
				}catch(Exception e)
			
			{
				e.printStackTrace();
			}}
		});
		ȷ��.setForeground(Color.CYAN);
		ȷ��.setFont(new Font("����", Font.PLAIN, 15));
		ȷ��.setBackground(Color.BLACK);
		ȷ��.setBounds(41, 235, 96, 29);
		contentPane.add(ȷ��);
		
		JLabel ��ʾ = new JLabel("<html>\u63D0\u793A\uFF1A\u5982\u679C\u8BE5\u5B66\u751F\u5DF2\u52A0\u5165\u8BE5\u793E\u56E2\uFF0C\u5219\u70B9\u51FB\u786E\u8BA4\u540E\u9000\u51FA\u793E\u56E2\uFF1B\r\n\r\n\u5982\u679C\u8BE5\u5B66\u751F\u4E0D\u5C5E\u4E8E\u8BE5\u793E\u56E2\uFF0C\u5219\u70B9\u51FB\u786E\u8BA4\u540E\u52A0\u5165\u793E\u56E2. ");
		��ʾ.setFont(new Font("����", Font.PLAIN, 15));
		��ʾ.setForeground(Color.RED);
		��ʾ.setBounds(41, 302, 345, 86);
		contentPane.add(��ʾ);
	}
}
