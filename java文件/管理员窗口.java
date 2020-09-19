package 课程设计;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 管理员窗口 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					管理员窗口 window = new 管理员窗口();
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
	public 管理员窗口() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("教材管理系统——管理员窗口");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0\u4E66\u7C4D\u4FE1\u606F\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				书籍添加 tj =  new 书籍添加();
				tj.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLACK);
		
		JButton button = new JButton("\u5220\u9664\u4E66\u7C4D\u4FE1\u606F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				删除书籍 sc = new 删除书籍();
				sc.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setForeground(Color.BLACK);
		button.setBackground(Color.CYAN);
		
		JButton button_1 = new JButton("\u4FEE\u6539\u4E66\u7C4D\u4FE1\u606F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				书籍修改 xg = new 书籍修改();
				xg.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 15));
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.CYAN);
		
		JLabel label = new JLabel("\u63A5\u4E0B\u6765\u60A8\u60F3\u8981\u505A\u4EC0\u4E48\uFF1F");
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setForeground(Color.CYAN);
		
		JButton button_2 = new JButton("\u7A97\u53E3\u4E0D\u60F3\u7A7A\u65F7\r\n");
		button_2.setForeground(Color.MAGENTA);
		button_2.setFont(new Font("宋体", Font.PLAIN, 15));
		button_2.setBackground(Color.CYAN);
		
		JButton button_3 = new JButton("\u591A\u52A0\u51E0\u4E2A\u6846\u6846");
		button_3.setForeground(Color.RED);
		button_3.setFont(new Font("宋体", Font.PLAIN, 15));
		button_3.setBackground(Color.CYAN);
		
		JButton button_4 = new JButton("\u751F\u6D3B\u5982\u6B64\u7E41\u5FD9");
		button_4.setForeground(Color.PINK);
		button_4.setFont(new Font("宋体", Font.PLAIN, 15));
		button_4.setBackground(Color.CYAN);
		
		JButton button_5 = new JButton("\u4F55\u5FC5\u6574\u5929\u6005\u60D8");
		button_5.setForeground(Color.BLUE);
		button_5.setFont(new Font("宋体", Font.PLAIN, 15));
		button_5.setBackground(Color.CYAN);
		
		JButton button_6 = new JButton("\u67E5\u770B\u4E66\u7C4D\u4FE1\u606F");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				查询窗口 cx = new 查询窗口();
				cx.frame.setVisible(true);
			}
		});
		button_6.setForeground(Color.BLACK);
		button_6.setFont(new Font("宋体", Font.PLAIN, 15));
		button_6.setBackground(Color.CYAN);
		
		JButton button_7 = new JButton("\u8FD4\u56DE\u4E3B\u754C\u9762");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				主菜单 z = new 主菜单();
				frame.setVisible(false);
				z.frame.setVisible(true);
			}
		});
		button_7.setForeground(Color.RED);
		button_7.setFont(new Font("宋体", Font.PLAIN, 15));
		button_7.setBackground(Color.CYAN);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(145))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(34)
										.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
									.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addGap(34)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(button_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
							.addGap(16))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(label)
					.addGap(157)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(button)
						.addComponent(button_1))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

