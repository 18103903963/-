package 数据库课程设计;

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

public class 主界面 extends JFrame {

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
					主界面 frame = new 主界面();
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
	public 主界面() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(主界面.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		setTitle("\u9009\u62E9\u64CD\u4F5C\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\u63A5\u4E0B\u6765\uFF0C\u60A8\u60F3\u8981\u505A\u4EC0\u4E48\uFF1F");
		label.setFont(new Font("宋体", Font.PLAIN, 15));
		label.setForeground(Color.CYAN);
		label.setBackground(Color.BLACK);
		
		JButton 返回 = new JButton("\u8FD4\u56DE\u767B\u5F55");
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				欢迎界面 hy = new 欢迎界面();
				hy.setVisible(true);
			}
		});
		返回.setBackground(Color.BLACK);
		返回.setForeground(Color.GREEN);
		
		JButton 查看各社团人数 = new JButton("\u67E5\u770B\u5404\u793E\u56E2\u4EBA\u6570");
		查看各社团人数.setFont(new Font("宋体", Font.PLAIN, 15));
		查看各社团人数.setBackground(Color.BLACK);
		查看各社团人数.setForeground(Color.CYAN);
		查看各社团人数.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				综合查询界面 zh = new 综合查询界面("{call dbo.StudentNumberInquire}",null);
				dispose();
				zh.setVisible(true);
			}
		});
		
		JButton 按院查社团信息 = new JButton("\u6309\u9662\u67E5\u793E\u56E2\u4FE1\u606F");
		按院查社团信息.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel cc=new JPanel();
				String ANM=JOptionPane.showInputDialog(cc,"输入想要查询的学院名称","信息输入窗口",JOptionPane.PLAIN_MESSAGE);
				if(ANM==null)//点击取消
					return;
				Check ck = new Check();
				if(!ck.checkacd(ANM))
				{
				综合查询界面 zh = new 综合查询界面("{call dbo.InquireNumberByAcademy(?)}",ANM);
				dispose();
				zh.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "没有查找到该学院，请重试！","提示", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		按院查社团信息.setForeground(Color.CYAN);
		按院查社团信息.setFont(new Font("宋体", Font.PLAIN, 15));
		按院查社团信息.setBackground(Color.BLACK);
		
		JButton 按月份查询活动 = new JButton("\u6309\u6708\u4EFD\u67E5\u8BE2\u6D3B\u52A8");
		按月份查询活动.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel cc=new JPanel();
				String ANM=JOptionPane.showInputDialog(cc,"输入想要查询的月份名称","信息输入窗口",JOptionPane.PLAIN_MESSAGE);
				if(ANM==null)//点击取消
					return;
				String CK="[^0-9]";
				Pattern p = Pattern.compile(CK);
				Matcher m =p.matcher(ANM);
				if(m.replaceAll("").trim().equals("")||Integer.parseInt(m.replaceAll("").trim())>12||Integer.parseInt(m.replaceAll("").trim())<1)
				{
					JOptionPane.showMessageDialog(contentPane, "月份输入错误！","提示", JOptionPane.PLAIN_MESSAGE);
				}
				else
				{
				综合查询界面 zh = new 综合查询界面("{call dbo.InquireActivityByMonth(?)}",m.replaceAll("").trim());
				dispose();
				zh.setVisible(true);
				}
			}
		});
		按月份查询活动.setForeground(Color.CYAN);
		按月份查询活动.setFont(new Font("宋体", Font.PLAIN, 15));
		按月份查询活动.setBackground(Color.BLACK);
		
		JButton 退出程序 = new JButton("\u9000\u51FA\u7A0B\u5E8F");
		退出程序.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		退出程序.setForeground(Color.RED);
		退出程序.setFont(new Font("宋体", Font.PLAIN, 15));
		退出程序.setBackground(Color.BLACK);
		
		JButton 社团信息管理 = new JButton("\u793E\u56E2\u4FE1\u606F\u7BA1\u7406");
		社团信息管理.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				社团信息管理 st = new 社团信息管理();
				setVisible(false);
				st.setVisible(true);
			}
		});
		社团信息管理.setForeground(Color.CYAN);
		社团信息管理.setFont(new Font("宋体", Font.PLAIN, 15));
		社团信息管理.setBackground(Color.BLACK);
		
		JButton 社团职务管理 = new JButton("\u793E\u56E2\u804C\u52A1\u7BA1\u7406");
		社团职务管理.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JPanel cc=new JPanel();
				 String AID=JOptionPane.showInputDialog(cc,"输入想要修改职位的社团编号","信息输入窗口",JOptionPane.PLAIN_MESSAGE);
				 if(AID==null)//点击取消
					 return;
				 String SID=JOptionPane.showInputDialog(cc,"输入想要修改职位的社员编号","信息输入窗口",JOptionPane.PLAIN_MESSAGE);
				 if(SID==null)//点击取消
					 return;
				 if(!AID.equals("") && !SID.equals(""))//没有输入
				 {
					 Check ck = new Check();
					 if(ck.checkasc(AID))
						 JOptionPane.showMessageDialog(contentPane, "没有查找到该社团编号，请重试！","提示", JOptionPane.PLAIN_MESSAGE);
					 else if(ck.checkstu(SID))
						 JOptionPane.showMessageDialog(contentPane, "没有查找到该学生编号，请重试！","提示", JOptionPane.PLAIN_MESSAGE);
					 else
						 {try {
				  Connection dbConn=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Student_association","sa","123");
					CallableStatement cs = dbConn.prepareCall("{call dbo.AssociationLeaderChange(?,?)}");
					cs.setString(1,AID);
					cs.setString(2,SID);
					cs.executeUpdate();
					cs.close();
				 JOptionPane.showMessageDialog(contentPane, "修改成功！","提示", JOptionPane.PLAIN_MESSAGE);
				 }catch(Exception e)
				 {
					 e.printStackTrace();
				 }
						 }
					 }
				 else
					 JOptionPane.showMessageDialog(contentPane, "请输入编号进行查询！","提示", JOptionPane.PLAIN_MESSAGE);
			}
		});
		社团职务管理.setForeground(Color.CYAN);
		社团职务管理.setFont(new Font("宋体", Font.PLAIN, 15));
		社团职务管理.setBackground(Color.BLACK);
		
		JButton 学生信息管理 = new JButton("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406");
		学生信息管理.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				学生信息管理 xs = new 学生信息管理();
				dispose();
				xs.setVisible(true);
			}
		});
		学生信息管理.setForeground(Color.CYAN);
		学生信息管理.setFont(new Font("宋体", Font.PLAIN, 15));
		学生信息管理.setBackground(Color.BLACK);
		
		JButton 社团活动管理 = new JButton("\u793E\u56E2\u6D3B\u52A8\u7BA1\u7406");
		社团活动管理.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel cc=new JPanel();
				String AID=JOptionPane.showInputDialog(cc,"输入想要添加活动的社团编号","信息输入窗口",JOptionPane.PLAIN_MESSAGE);
				if(AID!=null)
				{
					Check ck = new Check();
					if(!ck.checkasc(AID))
					{
				社团活动 st = new 社团活动(AID);
				dispose();
				st.setVisible(true);
					}
					else
					JOptionPane.showMessageDialog(contentPane, "没有查找到该社团编号，请重试！","提示", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		社团活动管理.setForeground(Color.CYAN);
		社团活动管理.setFont(new Font("宋体", Font.PLAIN, 15));
		社团活动管理.setBackground(Color.BLACK);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(127, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(返回)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addGap(118))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(社团信息管理, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(学生信息管理, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(查看各社团人数, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(按月份查询活动, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(社团活动管理, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(社团职务管理, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(按院查社团信息, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(退出程序, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
					.addGap(36))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(社团信息管理, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(社团职务管理, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(学生信息管理, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(社团活动管理, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(按院查社团信息, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(查看各社团人数, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(退出程序, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(按月份查询活动, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addComponent(返回)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
