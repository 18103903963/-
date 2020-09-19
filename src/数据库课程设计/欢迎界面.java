package 数据库课程设计;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 欢迎界面 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					欢迎界面 frame = new 欢迎界面();
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
	public 欢迎界面() {
		setTitle("\u9AD8\u6821\u793E\u56E2\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2-225, (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-238, 450, 476);
		JTextPane user = new JTextPane();
		JLabel label_3 = new JLabel("\u7BA1\u7406\u5458\u5BC6\u7801");
		JButton login = new JButton("\u767B\u5F55");
		password = new JPasswordField();
		JLabel label_2 = new JLabel("\u7BA1\u7406\u5458\u8D26\u53F7");
		JLabel tip = new JLabel("\u8BF7\u767B\u5F55\uFF01");
		JLabel label = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u9AD8\u6821\u793E\u56E2\u7BA1\u7406\u7CFB\u7EDF\uFF01");
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		label.setForeground(new Color(0, 255, 255));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		tip.setFont(new Font("宋体", Font.PLAIN, 14));
		tip.setForeground(new Color(255, 51, 51));
		
		
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setForeground(new Color(51, 255, 255));
		
		
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setForeground(new Color(51, 255, 255));
		
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!user.getText().equals("123456"))
				{
					tip.setText("账号输入错误!");
				}
				else
				{
					char[] a = password.getPassword();
					String pass = new String(a);
					if(!pass.equals("123456"))
					{
						tip.setText("密码输入错误!");
					}
					else
						tip.setText("认证通过！");
						
						主界面  zjm = new 主界面();
						zjm.setVisible(true);
						setVisible(false);
						
				}
			}
		});
		login.setFont(new Font("宋体", Font.PLAIN, 14));
		login.setBackground(new Color(0, 0, 0));
		login.setForeground(new Color(0, 255, 255));
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\chenz\\Desktop\\111.png"));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
						.addComponent(user, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tip)
						.addComponent(login))
					.addGap(26))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(83, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tip))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(login)
						.addComponent(label_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(33))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
