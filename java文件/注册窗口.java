//注册
package 课程设计;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class 注册窗口 {

	JFrame frame;
	private JTextField textField;
	private JTextField txtThebdmmndmnd;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					注册窗口 window = new 注册窗口();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 注册窗口() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("教材管理系统——用户注册");
		frame.setResizable(false);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.BLACK);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label_2 = new JLabel("\u63D0\u793A\uFF1A\u56E0\u4E3A\u662F\u8BFE\u8BBE\u6240\u4EE5\u6388\u6743\u7801\u76F4\u63A5\u6253\u4E0A\u53BB\u4E86\u3002");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("宋体", Font.PLAIN, 15));
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.PLAIN, 15));
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("宋体", Font.PLAIN, 15));
		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				@SuppressWarnings("deprecation")
				String conqure = passwordField_1.getText();
				if(conqure.equals(password))
				{
				try{
					File a = new File("user.txt");
					FileReader rd = new FileReader(a);
					FileWriter wt = new FileWriter(a,true);
					BufferedReader read = new BufferedReader(rd);
					BufferedWriter write = new BufferedWriter(wt);
					String Read = read.readLine();
					String Password = password.toString();
					if(Read!=null)
					{
					StringTokenizer detection = new StringTokenizer(Read,",");
					String apply = detection.nextToken();
					
					while(apply != null)
					{
						
						
						if((apply.equals(username)==true)||(conqure.equals(password)!=true)||(username.equals("")==true)||(password.equals("")==true))
						{
							if(apply.equals(username)==true)
							//用户名重复需要另外重新选择用户名
							label_2.setText("提示：用户名重复！");
							if(password.equals("")==true)
								label_2.setText("提示：密码不能为空！");
							if(username.equals("")==true)
								label_2.setText("提示：用户名不能为空！");
							else
								label_2.setText("提示：两次输入密码不同！");
							break;
						}
						Read = read.readLine();
						if(Read!=null)
						{
							detection = new StringTokenizer(Read);
							apply = detection.nextToken();
						}
						else
							break;
					}
					if(Read==null)
					{
						write.append(username+","+Password+"\r\n");//账户信息写入文件
						
					}
					}
					else
					{
						write.append(username+","+Password+"\r\n");//账户信息写入文件
						
					}
						read.close();
						write.close();
				}
				catch (IOException f)
				{
					
				}
				frame.setVisible(false);
				主菜单 b = new 主菜单();
				b.frame.setVisible(true);
				}
				else
				{
					label_2.setText("提示：两次输入的密码不同！");
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.CYAN);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.CYAN);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.CYAN);
		
		JLabel lblNewLabel_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JLabel label = new JLabel("");
		
		textField = new JTextField();
		lblNewLabel.setLabelFor(textField);
		textField.setFont(new Font("宋体", Font.PLAIN, 15));
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u6388\u6743\u7801\uFF1A");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("宋体", Font.PLAIN, 15));
		
		txtThebdmmndmnd = new JTextField();
		txtThebdmmndmnd.setForeground(Color.RED);
		txtThebdmmndmnd.setEditable(false);
		txtThebdmmndmnd.setText("T18HE-1BD8M-1MND9-1MND2");
		label_1.setLabelFor(txtThebdmmndmnd);
		txtThebdmmndmnd.setFont(new Font("宋体", Font.PLAIN, 15));
		txtThebdmmndmnd.setColumns(10);
		
		JButton button = new JButton("\u8FD4\u56DE\u4E3B\u83DC\u5355");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				主菜单 sl = new 主菜单();
				sl.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setBackground(Color.CYAN);
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(label)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(label_1)
										.addComponent(lblNewLabel_2))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField_1)
								.addComponent(passwordField)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
								.addComponent(txtThebdmmndmnd)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(88)
							.addComponent(label_2)))
					.addContainerGap(106, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtThebdmmndmnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addGap(10)
					.addComponent(label)
					.addGap(62)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(button))
					.addGap(38)
					.addComponent(label_2)
					.addGap(81))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
