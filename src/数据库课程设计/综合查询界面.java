package ���ݿ�γ����;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �ۺϲ�ѯ���� extends JFrame {

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
					�ۺϲ�ѯ���� frame = new �ۺϲ�ѯ����("","");
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
	public �ۺϲ�ѯ����(String a,String b) {//a����洢���̣�b����������޲�����Ϊnull
		setTitle("\u7EFC\u5408\u67E5\u8BE2\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 108, 414, 208);
		contentPane.add(scrollPane);
		
		JTextArea ��Ϣ�� = new JTextArea();
		��Ϣ��.setForeground(Color.PINK);
		��Ϣ��.setBackground(Color.BLACK);
		scrollPane.setViewportView(��Ϣ��);
		
		JLabel ��ѯ��� = new JLabel("\u67E5\u8BE2\u7ED3\u679C\u5982\u4E0B\u6240\u793A");
		��ѯ���.setForeground(Color.GREEN);
		��ѯ���.setFont(new Font("����", Font.PLAIN, 15));
		��ѯ���.setBounds(10, 55, 137, 24);
		contentPane.add(��ѯ���);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2\u793E\u56E2\u4EBA\u5458\u4FE1\u606F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel cc=new JPanel();
				String ANM=JOptionPane.showInputDialog(cc,"������Ҫ��ѯ�����ű��","��Ϣ���봰��",JOptionPane.PLAIN_MESSAGE);
				if(ANM==null)//���ȡ��
					return;
				Check ck = new Check();
				if(!ck.checkasc(ANM))
				{
				�ۺϲ�ѯ���� zh = new �ۺϲ�ѯ����("{call dbo.AssociationMemberInquire(?)}",ANM);
				dispose();
				zh.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "û�в��ҵ������ţ������ԣ�","��ʾ", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setBounds(252, 326, 172, 24);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\u5176\u4ED6\u529F\u80FD");
		label.setForeground(Color.GREEN);
		label.setFont(new Font("����", Font.PLAIN, 15));
		label.setBounds(141, 326, 137, 24);
		contentPane.add(label);
		
		JButton button = new JButton("\u8FD4\u56DE\u4E3B\u754C\u9762");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				������ zjm = new ������();
				dispose();
				zjm.setVisible(true);
			}
		});
		button.setForeground(Color.CYAN);
		button.setFont(new Font("����", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(10, 403, 122, 24);
		contentPane.add(button);
		
		try {
			String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association";
			String userName="sa";//������ݿ��û���
			String userPwd="123";//�������
			Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			CallableStatement cstmt = dbConn.prepareCall(a);
			if(b!=null)
			{
			cstmt.setString(1, b);
			}
			
			ResultSet rs = cstmt.executeQuery();
			��Ϣ��.setText("");
			
			JButton button_1 = new JButton("\u67E5\u770B\u6240\u6709\u793E\u56E2\u53CA\u7F16\u53F7");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					�ۺϲ�ѯ���� zh = new �ۺϲ�ѯ����("{call dbo.AssociationInquire}",null);
					dispose();
					zh.setVisible(true);
					
				}
			});
			button_1.setForeground(Color.CYAN);
			button_1.setFont(new Font("����", Font.PLAIN, 15));
			button_1.setBackground(Color.BLACK);
			button_1.setBounds(252, 360, 172, 24);
			contentPane.add(button_1);
			
			JButton button_2 = new JButton("\u67E5\u8BE2\u6240\u6709\u5B66\u751F\u4FE1\u606F");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					�ۺϲ�ѯ���� zh = new �ۺϲ�ѯ����("{call dbo.StudentMessageInquire}",null);
					dispose();
					zh.setVisible(true);
					
				}
			});
			button_2.setForeground(Color.CYAN);
			button_2.setFont(new Font("����", Font.PLAIN, 15));
			button_2.setBackground(Color.BLACK);
			button_2.setBounds(252, 394, 172, 24);
			contentPane.add(button_2);
			while(rs.next())
			{
				��Ϣ��.append(rs.getString("result")+'\n');
			}
		}catch(Exception e)
		
	{
		e.printStackTrace();
	}
		
	}

}
