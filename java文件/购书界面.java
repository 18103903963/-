package 课程设计;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class 购书界面 {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					购书界面 window = new 购书界面();
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
	public 购书界面() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("教材管理系统");
		frame.setTitle("\u6559\u6750\u7BA1\u7406\u7CFB\u7EDF\u2014\u2014\u8D2D\u4E66\u754C\u9762");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		
		JLabel label = new JLabel(" \u8BF7\u8F93\u5165\u67E5\u627E\u4E66\u7C4D\u7684\u540D\u79F0");
		label.setFont(new Font("宋体", Font.PLAIN, 15));
		label.setBackground(Color.BLACK);
		label.setForeground(Color.CYAN);
		
		textField = new JTextField();
		textField.setForeground(Color.GREEN);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("宋体", Font.PLAIN, 15));
		textField.setColumns(10);
		
		JLabel lblid = new JLabel("\u6CE8\u610F\uFF01\u8BA2\u8D2D\u6559\u6750\u76EE\u524D\u4EC5\u652F\u6301\u540D\u79F0\u67E5\u627E\uFF01\u5E76\u4E14\u901A\u8FC7ID\u8BA2\u8D2D\uFF01");
		lblid.setFont(new Font("宋体", Font.PLAIN, 15));
		lblid.setForeground(new Color(255, 0, 0));
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBackground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setForeground(Color.BLUE);
		textArea.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				int keyChar=e.getKeyChar();
				if ((keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9  )||keyChar ==KeyEvent.VK_DECIMAL) {

				} else {
				e.consume();
				}
			}
		});
		textField_1.setForeground(Color.GREEN);
		textField_1.setFont(new Font("宋体", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		textField_1.setVisible(false);
		
		JButton button_1 = new JButton("\u70B9\u51FB\u8D2D\u4E70");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(textField_1.getText());
						选择本数 b = new 选择本数(a);
						frame.setVisible(false);
						b.frame.setVisible(true);
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("宋体", Font.PLAIN, 15));
		button_1.setBackground(Color.CYAN);
		button_1.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8D2D\u4E70\u7684\u56FE\u4E66\u7F16\u53F7\uFF1A");
		lblNewLabel.setLabelFor(textField_1);
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setVisible(false);
		
		JButton button = new JButton("\u5F00\u59CB\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String require;
				require = textField.getText();
				if(require.equals(""))
				{
					lblid.setText("请输入内容！");
				}
				else
				{
					String ss = null;
					查询方式 a = new 查询方式();
					ss = a.BookSearchByName(textField.getText());
					if(ss.equals("")!=true)
					{
						lblid.setText("查找到如下结果！");
						textArea.setVisible(true);
						button_1.setVisible(true);
						lblNewLabel.setVisible(true);
						textField_1.setVisible(true);
						textArea.setText(ss);}
						
					else
						{lblid.setText("没有找到！");}
				}
			}
		});
		button.setBackground(Color.CYAN);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JButton button_2 = new JButton("\u67E5\u770B\u4E66\u7C4D\u4FE1\u606F");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				查询窗口 cx = new 查询窗口();
				cx.frame.setVisible(true);
			}
		});
		button_2.setFont(new Font("宋体", Font.PLAIN, 15));
		button_2.setBackground(Color.CYAN);
		button_2.setForeground(Color.BLACK);
		
		JButton button_3 = new JButton("\u8FD4\u56DE\u4E3B\u83DC\u5355");
		button_3.setFont(new Font("宋体", Font.PLAIN, 15));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				主菜单 acd = new 主菜单 ();
				acd.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button_3.setBackground(Color.CYAN);
		
		JButton button_4 = new JButton("\u8FD4\u56DE\u7BA1\u7406\u754C\u9762");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				管理员窗口 sl = new 管理员窗口();
				sl.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button_4.setFont(new Font("宋体", Font.PLAIN, 15));
		button_4.setBackground(Color.CYAN);
		
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_2)
							.addGap(36)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
											.addGap(46)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(button_3)
										.addComponent(button)))
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblid)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(button_1)))))))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_4)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_3)
						.addComponent(button_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblid)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
