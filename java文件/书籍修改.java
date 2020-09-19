package 课程设计;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class 书籍修改 {

	public JFrame frame;
	private JTextField 编号;
	private JTextField 输入内容;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					书籍修改 window = new 书籍修改();
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
	public 书籍修改() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame("教材管理系统——书籍修改");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);

		JButton button = new JButton("\u4FEE\u6539\u5176\u4ED6\u4E66\u7C4D");
		JLabel 成功 = new JLabel("\u4FEE\u6539\u6210\u529F\uFF01\u662F\u5426\u7EE7\u7EED\uFF1F");
		JButton 修改 = new JButton("\u786E\u5B9A");
		JLabel 提示输入ID = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8981\u4FEE\u6539\u7684\u56FE\u4E66ID\uFF1A\r\n");
		JTextArea 书籍信息显示框 = new JTextArea();
		JButton 确定编号 = new JButton("\u67E5\u8BE2");
		JButton 返回管理界面 = new JButton("\u8FD4\u56DE\u7BA1\u7406\u754C\u9762");
		JButton 确定修改按钮 = new JButton("\u786E\u5B9A\u4FEE\u6539");
		JLabel 修改提示框 = new JLabel("\u8BF7\u9009\u62E9\u4FEE\u6539\u7C7B\u578B\u548C\u5185\u5BB9");
		JButton 继续 = new JButton("\u786E\u5B9A");
		修改提示框.setVisible(false);
		编号 = new JTextField();
		编号.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int keyChar=e.getKeyChar();
				if ((keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9  )) {

				} else {
				e.consume();
				}
			}
		});
		编号.setFont(new Font("宋体", Font.PLAIN, 15));
		编号.setColumns(10);
		
		JComboBox<String> 选项 = new JComboBox<String>();
		选项.setFont(new Font("宋体", Font.PLAIN, 15));
		选项.setForeground(new Color(0, 0, 0));
		选项.setBackground(Color.CYAN);
		选项.setVisible(false);
		
		
		书籍信息显示框.setEditable(false);
		书籍信息显示框.setFont(new Font("Monospaced", Font.PLAIN, 15));
		
		
		确定编号.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(编号.getText().equals("")!=true)
			{
				int need = Integer.parseInt(编号.getText());
				查询方式 cx = new 查询方式();
				String message = cx.BookSearchByID(need);
				if(message.equals("")!=true)
				{
				书籍信息显示框.setText("查找到内容如下 :\r\n"+message);
				确定修改按钮.setVisible(true);
				
				}
				else {
					书籍信息显示框.setText("没有找到！");
					确定修改按钮.setVisible(false);
					选项.setVisible(false);
					输入内容.setVisible(false);
					修改.setVisible(false);
					
				}
				成功.setVisible(false);
				继续.setVisible(false);
			}
				else
					书籍信息显示框.setText("请输入编号进行查询！");
			}
		});
		确定编号.setBackground(Color.CYAN);
		确定编号.setFont(new Font("宋体", Font.PLAIN, 15));
		
		
		提示输入ID.setForeground(Color.CYAN);
		提示输入ID.setFont(new Font("宋体", Font.PLAIN, 15));
		
		
		返回管理界面.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				管理员窗口 gly = new 管理员窗口();
				frame.setVisible(false);
				gly.frame.setVisible(true);
			}
		});
		返回管理界面.setFont(new Font("宋体", Font.PLAIN, 15));
		返回管理界面.setBackground(Color.CYAN);
		
		JButton 返回主界面 = new JButton("\u8FD4\u56DE\u4E3B\u754C\u9762");
		返回主界面.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				主菜单 a = new 主菜单();
				a.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		返回主界面.setFont(new Font("宋体", Font.PLAIN, 15));
		返回主界面.setBackground(Color.CYAN);
		
		JButton 查看 = new JButton("\u67E5\u770B\u56FE\u4E66ID");
		查看.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 查询窗口 b = new 查询窗口();
				 b.frame.setVisible(true);
			}
		});
		查看.setBackground(Color.CYAN);
		查看.setFont(new Font("宋体", Font.PLAIN, 15));
		
		
		书籍信息显示框.setForeground(Color.BLUE);
		书籍信息显示框.setBackground(Color.BLACK);
		
		
		 确定修改按钮.setVisible(false);
		确定修改按钮.setFont(new Font("宋体", Font.PLAIN, 15));
		确定修改按钮.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				确定编号.setEnabled(false);
				确定修改按钮.setEnabled(false);
				选项.setVisible(true);
				输入内容.setVisible(true);
				修改.setVisible(true);
				修改提示框.setVisible(true);
			}
		});
		确定修改按钮.setBackground(Color.CYAN);
		选项.setModel(new DefaultComboBoxModel(new String[] {"\u4E66\u7C4D\u540D\u79F0", "\u4E66\u7C4D\u4F5C\u8005", "\u4E66\u7C4D\u51FA\u7248\u793E", "\u4E66\u7C4D\u4EF7\u683C", "\u4E66\u7C4D\u6570\u91CF", "\u4E66\u7C4D\u7C7B\u578B"}));
		
		输入内容 = new JTextField();
		输入内容.setFont(new Font("宋体", Font.PLAIN, 15));
		输入内容.setColumns(10);
		输入内容.setVisible(false);
		
		
		修改.setBackground(Color.CYAN);
		修改.setFont(new Font("宋体", Font.PLAIN, 15));
		修改.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 选项.getSelectedIndex();
				修改和删除 xs = new 修改和删除();
				xs.File_Edit(Integer.parseInt(编号.getText()), i, 输入内容.getText(), 0);
				修改.setEnabled(false);
				成功.setVisible(true);
				继续.setVisible(true);
				button.setVisible(true);
			}
			
		});
		修改.setVisible(false);
		
		修改提示框.setForeground(Color.CYAN);
		
		成功.setFont(new Font("宋体", Font.PLAIN, 15));
		成功.setForeground(Color.CYAN);
		成功.setVisible(false);
		
		
		继续.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				继续.setVisible(false);
				修改.setEnabled(true);
				成功.setVisible(false);
				button.setVisible(false);
			}
		});
		继续.setBackground(Color.CYAN);
		继续.setFont(new Font("宋体", Font.PLAIN, 15));
		继续.setVisible(false);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				书籍修改 xg = new 书籍修改();
				xg.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setVisible(false);
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBackground(Color.CYAN);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(47, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(返回主界面)
									.addGap(30)
									.addComponent(查看, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(返回管理界面)
									.addGap(9))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(提示输入ID)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(编号, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(确定编号)
									.addGap(10)))
							.addContainerGap(27, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(确定修改按钮, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(修改提示框)
									.addComponent(书籍信息显示框, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(选项, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(输入内容, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(修改))
									.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(成功)
										.addGap(18)
										.addComponent(继续))
									.addComponent(button, Alignment.TRAILING)))
							.addGap(39))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(返回主界面)
						.addComponent(查看)
						.addComponent(返回管理界面))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(提示输入ID)
						.addComponent(编号, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(确定编号))
					.addGap(21)
					.addComponent(书籍信息显示框, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(确定修改按钮)
					.addGap(12)
					.addComponent(修改提示框)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(选项, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(输入内容, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(修改))
					.addGap(67)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(继续)
						.addComponent(成功))
					.addGap(18)
					.addComponent(button)
					.addGap(21))
		);
		frame.getContentPane().setLayout(groupLayout);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
