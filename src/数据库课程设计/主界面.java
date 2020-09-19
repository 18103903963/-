package ���ݿ�γ����;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class ������ extends JFrame {

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
					������ frame = new ������();
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
	public ������() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(������.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		setTitle("\u9009\u62E9\u64CD\u4F5C\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\u63A5\u4E0B\u6765\uFF0C\u60A8\u60F3\u8981\u505A\u4EC0\u4E48\uFF1F");
		label.setFont(new Font("����", Font.PLAIN, 15));
		label.setForeground(Color.CYAN);
		label.setBackground(Color.BLACK);
		
		JButton ���� = new JButton("\u8FD4\u56DE\u767B\u5F55");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				��ӭ���� hy = new ��ӭ����();
				hy.setVisible(true);
			}
		});
		����.setBackground(Color.BLACK);
		����.setForeground(Color.GREEN);
		
		JButton �鿴���������� = new JButton("\u67E5\u770B\u5404\u793E\u56E2\u4EBA\u6570");
		�鿴����������.setFont(new Font("����", Font.PLAIN, 15));
		�鿴����������.setBackground(Color.BLACK);
		�鿴����������.setForeground(Color.CYAN);
		�鿴����������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				�ۺϲ�ѯ���� zh = new �ۺϲ�ѯ����("{call dbo.StudentNumberInquire}",null);
				dispose();
				zh.setVisible(true);
			}
		});
		
		JButton ��Ժ��������Ϣ = new JButton("\u6309\u9662\u67E5\u793E\u56E2\u4FE1\u606F");
		��Ժ��������Ϣ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel cc=new JPanel();
				String ANM=JOptionPane.showInputDialog(cc,"������Ҫ��ѯ��ѧԺ����","��Ϣ���봰��",JOptionPane.PLAIN_MESSAGE);
				if(ANM==null)//���ȡ��
					return;
				Check ck = new Check();
				if(!ck.checkacd(ANM))
				{
				�ۺϲ�ѯ���� zh = new �ۺϲ�ѯ����("{call dbo.InquireNumberByAcademy(?)}",ANM);
				dispose();
				zh.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "û�в��ҵ���ѧԺ�������ԣ�","��ʾ", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		��Ժ��������Ϣ.setForeground(Color.CYAN);
		��Ժ��������Ϣ.setFont(new Font("����", Font.PLAIN, 15));
		��Ժ��������Ϣ.setBackground(Color.BLACK);
		
		JButton ���·ݲ�ѯ� = new JButton("\u6309\u6708\u4EFD\u67E5\u8BE2\u6D3B\u52A8");
		���·ݲ�ѯ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel cc=new JPanel();
				String ANM=JOptionPane.showInputDialog(cc,"������Ҫ��ѯ���·�����","��Ϣ���봰��",JOptionPane.PLAIN_MESSAGE);
				if(ANM==null)//���ȡ��
					return;
				String CK="[^0-9]";
				Pattern p = Pattern.compile(CK);
				Matcher m =p.matcher(ANM);
				if(m.replaceAll("").trim().equals("")||Integer.parseInt(m.replaceAll("").trim())>12||Integer.parseInt(m.replaceAll("").trim())<1)
				{
					JOptionPane.showMessageDialog(contentPane, "�·��������","��ʾ", JOptionPane.PLAIN_MESSAGE);
				}
				else
				{
				�ۺϲ�ѯ���� zh = new �ۺϲ�ѯ����("{call dbo.InquireActivityByMonth(?)}",m.replaceAll("").trim());
				dispose();
				zh.setVisible(true);
				}
			}
		});
		���·ݲ�ѯ�.setForeground(Color.CYAN);
		���·ݲ�ѯ�.setFont(new Font("����", Font.PLAIN, 15));
		���·ݲ�ѯ�.setBackground(Color.BLACK);
		
		JButton �˳����� = new JButton("\u9000\u51FA\u7A0B\u5E8F");
		�˳�����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		�˳�����.setForeground(Color.RED);
		�˳�����.setFont(new Font("����", Font.PLAIN, 15));
		�˳�����.setBackground(Color.BLACK);
		
		JButton ������Ϣ���� = new JButton("\u793E\u56E2\u4FE1\u606F\u7BA1\u7406");
		������Ϣ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				������Ϣ���� st = new ������Ϣ����();
				setVisible(false);
				st.setVisible(true);
			}
		});
		������Ϣ����.setForeground(Color.CYAN);
		������Ϣ����.setFont(new Font("����", Font.PLAIN, 15));
		������Ϣ����.setBackground(Color.BLACK);
		
		JButton ����ְ����� = new JButton("\u793E\u56E2\u804C\u52A1\u7BA1\u7406");
		����ְ�����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JPanel cc=new JPanel();
				 String AID=JOptionPane.showInputDialog(cc,"������Ҫ�޸�ְλ�����ű��","��Ϣ���봰��",JOptionPane.PLAIN_MESSAGE);
				 if(AID==null)//���ȡ��
					 return;
				 String SID=JOptionPane.showInputDialog(cc,"������Ҫ�޸�ְλ����Ա���","��Ϣ���봰��",JOptionPane.PLAIN_MESSAGE);
				 if(SID==null)//���ȡ��
					 return;
				 if(!AID.equals("") && !SID.equals(""))//û������
				 {
					 Check ck = new Check();
					 if(ck.checkasc(AID))
						 JOptionPane.showMessageDialog(contentPane, "û�в��ҵ������ű�ţ������ԣ�","��ʾ", JOptionPane.PLAIN_MESSAGE);
					 else if(ck.checkstu(SID))
						 JOptionPane.showMessageDialog(contentPane, "û�в��ҵ���ѧ����ţ������ԣ�","��ʾ", JOptionPane.PLAIN_MESSAGE);
					 else
						 {try {
				  Connection dbConn=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association","sa","123");
					CallableStatement cs = dbConn.prepareCall("{call dbo.AssociationLeaderChange(?,?)}");
					cs.setString(1,AID);
					cs.setString(2,SID);
					cs.executeUpdate();
					cs.close();
				 JOptionPane.showMessageDialog(contentPane, "�޸ĳɹ���","��ʾ", JOptionPane.PLAIN_MESSAGE);
				 }catch(Exception e)
				 {
					 e.printStackTrace();
				 }
						 }
					 }
				 else
					 JOptionPane.showMessageDialog(contentPane, "�������Ž��в�ѯ��","��ʾ", JOptionPane.PLAIN_MESSAGE);
			}
		});
		����ְ�����.setForeground(Color.CYAN);
		����ְ�����.setFont(new Font("����", Font.PLAIN, 15));
		����ְ�����.setBackground(Color.BLACK);
		
		JButton ѧ����Ϣ���� = new JButton("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406");
		ѧ����Ϣ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ѧ����Ϣ���� xs = new ѧ����Ϣ����();
				dispose();
				xs.setVisible(true);
			}
		});
		ѧ����Ϣ����.setForeground(Color.CYAN);
		ѧ����Ϣ����.setFont(new Font("����", Font.PLAIN, 15));
		ѧ����Ϣ����.setBackground(Color.BLACK);
		
		JButton ���Ż���� = new JButton("\u793E\u56E2\u6D3B\u52A8\u7BA1\u7406");
		���Ż����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel cc=new JPanel();
				String AID=JOptionPane.showInputDialog(cc,"������Ҫ��ӻ�����ű��","��Ϣ���봰��",JOptionPane.PLAIN_MESSAGE);
				if(AID!=null)
				{
					Check ck = new Check();
					if(!ck.checkasc(AID))
					{
				���Ż st = new ���Ż(AID);
				dispose();
				st.setVisible(true);
					}
					else
					JOptionPane.showMessageDialog(contentPane, "û�в��ҵ������ű�ţ������ԣ�","��ʾ", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		���Ż����.setForeground(Color.CYAN);
		���Ż����.setFont(new Font("����", Font.PLAIN, 15));
		���Ż����.setBackground(Color.BLACK);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(127, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(����)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addGap(118))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(������Ϣ����, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(ѧ����Ϣ����, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(�鿴����������, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(���·ݲ�ѯ�, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(���Ż����, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(����ְ�����, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(��Ժ��������Ϣ, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(�˳�����, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
					.addGap(36))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(������Ϣ����, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(����ְ�����, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(ѧ����Ϣ����, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(���Ż����, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(��Ժ��������Ϣ, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(�鿴����������, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(�˳�����, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(���·ݲ�ѯ�, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addComponent(����)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
