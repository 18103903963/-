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

public class 删除书籍 {

	public JFrame frame;
	private JTextField 编号;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					删除书籍 window = new 删除书籍();
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
	public 删除书籍() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("教材管理系统——书籍修改");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);

		JButton 继续按钮 = new JButton("\u7EE7\u7EED");
		继续按钮.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				删除书籍 de = new 删除书籍();
				de.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		JLabel 删除成功提示框 = new JLabel("\u5220\u9664\u6210\u529F\uFF01\u7EE7\u7EED\u5417\uFF1F");
		JLabel label = new JLabel("\u786E\u5B9A\u8981\u5220\u9664\u5417\uFF1F\u5220\u9664\u540E\u4E0D\u53EF\u590D\u539F\uFF01");
		JLabel 提示输入ID = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8981\u5220\u9664\u7684\u56FE\u4E66ID\uFF1A\r\n");
		JTextArea 书籍信息显示框 = new JTextArea();
		JButton 确定编号 = new JButton("\u67E5\u8BE2");
		JButton 返回管理界面 = new JButton("\u8FD4\u56DE\u7BA1\u7406\u754C\u9762");
		JButton 确定 = new JButton("\u786E\u5B9A");
		删除成功提示框.setVisible(false);
		继续按钮.setVisible(false);
		编号 = new JTextField();
		编号.setBackground(Color.BLACK);
		编号.setForeground(Color.GREEN);
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
		

		JButton 查看 = new JButton("\u67E5\u770B\u56FE\u4E66ID");
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
				确定.setVisible(true);
				label.setVisible(true);
				}
				else {
					书籍信息显示框.setText("没有找到！");
				}
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
		
		查看.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 查询窗口 b = new 查询窗口();
				 b.frame.setVisible(true);
			}
		});
		查看.setBackground(Color.CYAN);
		查看.setFont(new Font("宋体", Font.PLAIN, 15));
		
		
		书籍信息显示框.setForeground(Color.RED);
		书籍信息显示框.setBackground(Color.BLACK);
		
		label.setFont(new Font("宋体", Font.PLAIN, 15));
		label.setForeground(Color.CYAN);
		label.setVisible(false);
		
		确定.setVisible(false);
		确定.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(编号.getText());
				修改和删除 sg = new 修改和删除();
				sg.File_Edit(id, 1, null, 1);
				确定.setEnabled(false);
				继续按钮.setVisible(true);
				删除成功提示框.setVisible(true);
			}
		});
		确定.setBackground(Color.CYAN);
		确定.setFont(new Font("宋体", Font.PLAIN, 15));
		
		删除成功提示框.setFont(new Font("宋体", Font.PLAIN, 15));
		删除成功提示框.setForeground(Color.CYAN);
		
		继续按钮.setBackground(Color.CYAN);
		继续按钮.setFont(new Font("宋体", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(54, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(书籍信息显示框, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(提示输入ID)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(编号, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(确定编号)
									.addContainerGap(30, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(返回主界面)
									.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
									.addComponent(查看, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(返回管理界面)
									.addGap(36))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(确定, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(继续按钮, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(54))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(205)
					.addComponent(删除成功提示框)
					.addContainerGap(154, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(46, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(返回管理界面)
						.addComponent(查看)
						.addComponent(返回主界面))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(提示输入ID)
						.addComponent(编号, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(确定编号))
					.addGap(36)
					.addComponent(书籍信息显示框, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(确定))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(删除成功提示框)
						.addComponent(继续按钮))
					.addGap(101))
		);
		frame.getContentPane().setLayout(groupLayout);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
