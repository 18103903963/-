package 课程设计;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class 选择本数 {

	public JFrame frame;
	private JTextField 输入数量;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	
	public 选择本数(int a ) {
		initialize(a);
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize(int a) {
		frame = new JFrame("教材管理系统——购书界面——选择本数");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		查询方式  c = new 查询方式();
		
		
		JLabel 提示 = new JLabel("\u9519\u8BEF\uFF01\u8BF7\u6C42\u6570\u91CF\u8D85\u51FA\u5E93\u5B58\u91CF\uFF01");
		提示.setFont(new Font("宋体", Font.PLAIN, 15));
		提示.setBackground(Color.BLACK);
		提示.setForeground(Color.RED);
		提示.setVisible(false);
		
		JTextArea 书籍信息输出 = new JTextArea();
		书籍信息输出.setEditable(false);
		书籍信息输出.setFont(new Font("Monospaced", Font.PLAIN, 15));
		书籍信息输出.setBackground(Color.BLACK);
		书籍信息输出.setForeground(Color.CYAN);
		书籍信息输出.setText("您选择的图书信息如下所示，请确认"+"\r\n"+c.BookSearchByID(a));
		StringTokenizer test = new StringTokenizer(c.BookSearchByID(a),",");
		int shengyu;
		test.nextToken();
		test.nextToken();
		shengyu = Integer.parseInt(test.nextToken());
		double price = Double.parseDouble(test.nextToken());
		JLabel 提示输入数量 = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8981\u8D2D\u4E70\u7684\u6570\u91CF");
		提示输入数量.setFont(new Font("宋体", Font.PLAIN, 15));
		提示输入数量.setBackground(Color.BLACK);
		提示输入数量.setForeground(Color.CYAN);
		提示输入数量.setVisible(false);
		
		JButton 继续 = new JButton("\u7EE7\u7EED");
		JButton 确定 = new JButton("\u786E\u5B9A");
		确定.setFont(new Font("宋体", Font.PLAIN, 15));
		确定.setBackground(Color.CYAN);
		确定.setForeground(Color.BLACK);
		确定.setVisible(false);
		确定.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(输入数量.getText());
				if(number>shengyu)
				{
					提示.setVisible(true);
				}
				else
				{
					继续.setVisible(true);
					提示.setText("您的订单价格为："+price*number+"元，继续吗?");
					提示.setVisible(true);
					确定.setEnabled(false);
					
				}
				
			}
		});
		
		JButton 确认书籍信息 = new JButton("\u786E\u5B9A");
		确认书籍信息.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				确定.setVisible(true);
				输入数量.setVisible(true);
				提示输入数量.setVisible(true);
				确认书籍信息.setEnabled(false);
			}
		});
		确认书籍信息.setBackground(Color.CYAN);
		确认书籍信息.setForeground(Color.BLACK);
		
		
		JLabel 成功 = new JLabel("\u8D2D\u4E70\u6210\u529F\uFF01");
		
		
		输入数量 = new JTextField();
		输入数量.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				int keyChar=e.getKeyChar();
				if ((keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9  )||keyChar ==KeyEvent.VK_DECIMAL) {

				} else {
				e.consume();
				}
			}
		});
		输入数量.setFont(new Font("宋体", Font.PLAIN, 15));
		输入数量.setBackground(Color.BLACK);
		输入数量.setForeground(Color.GREEN);
		输入数量.setColumns(10);
		输入数量.setVisible(false);
		
		
		
		继续.setBackground(Color.CYAN);
		继续.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				购书函数 h = new 购书函数();
				h.购书(a,Integer.parseInt(输入数量.getText()));
				成功.setVisible(true);
				继续.setEnabled(false);
			}
		});
		继续.setVisible(false);
		继续.setFont(new Font("宋体", Font.PLAIN, 15));
		继续.setForeground(Color.BLACK);
		
		JButton 返回主菜单 = new JButton("\u8FD4\u56DE\u4E3B\u83DC\u5355");
		返回主菜单.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				主菜单 zc = new 主菜单();
				zc.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		返回主菜单.setFont(new Font("宋体", Font.PLAIN, 15));
		返回主菜单.setBackground(Color.CYAN);
		
		
		成功.setFont(new Font("宋体", Font.PLAIN, 15));
		成功.setForeground(Color.CYAN);
		成功.setVisible(false);
		
		JButton button = new JButton("\u8FD4\u56DE\u8D2D\u4E70\u9875\u9762");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				购书界面 gs = new 购书界面();
				frame.setVisible(false);
				gs.frame.setVisible(true);
			}
		});
		button.setBackground(Color.CYAN);
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(197)
					.addComponent(确认书籍信息, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(210, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(220, Short.MAX_VALUE)
					.addComponent(返回主菜单)
					.addGap(167))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(成功))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(提示输入数量)
									.addGap(36)
									.addComponent(输入数量, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(确定, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(提示)
								.addComponent(书籍信息输出, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(button)
									.addPreferredGap(ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
									.addComponent(继续, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(48, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addComponent(书籍信息输出, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(确认书籍信息)
					.addGap(49)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(提示输入数量)
						.addComponent(输入数量, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(确定))
					.addGap(18)
					.addComponent(提示)
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(返回主菜单)
						.addComponent(button)
						.addComponent(继续))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(成功)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
