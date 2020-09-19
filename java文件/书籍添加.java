package 课程设计;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 书籍添加 {

	public JFrame frame;
	private JTextField 名称;
	private JTextField 作者;
	private JTextField 出版社;
	private JTextField 价格;
	private JTextField 数量;
	private JTextField 种类;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					书籍添加 window = new 书籍添加();
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
	public 书籍添加() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("教材管理系统");
		frame.setTitle("\u6559\u6750\u7BA1\u7406\u7CFB\u7EDF\u2014\u2014\u4E66\u7C4D\u6DFB\u52A0");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		
		JLabel 提示输入名称 = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u540D\u79F0\uFF1A");
		提示输入名称.setFont(new Font("宋体", Font.PLAIN, 15));
		提示输入名称.setForeground(Color.CYAN);
		
		JLabel 提示输入作者 = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u4F5C\u8005\uFF1A");
		提示输入作者.setForeground(Color.CYAN);
		提示输入作者.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JLabel 提示输入出版社 = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u51FA\u7248\u793E\uFF1A");
		提示输入出版社.setForeground(Color.CYAN);
		提示输入出版社.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JLabel 提示输入价格 = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u4EF7\u683C\uFF1A");
		提示输入价格.setForeground(Color.CYAN);
		提示输入价格.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JLabel 提示输入数量 = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u6570\u91CF\uFF1A");
		提示输入数量.setForeground(Color.CYAN);
		提示输入数量.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JLabel 提示输入种类 = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u79CD\u7C7B\uFF1A");
		提示输入种类.setForeground(Color.CYAN);
		提示输入种类.setFont(new Font("宋体", Font.PLAIN, 15));
		
		名称 = new JTextField();
		名称.setForeground(Color.GREEN);
		名称.setBackground(Color.BLACK);
		名称.setColumns(10);
		
		作者 = new JTextField();
		作者.setForeground(Color.GREEN);
		作者.setBackground(Color.BLACK);
		作者.setColumns(10);
		
		出版社 = new JTextField();
		出版社.setForeground(Color.GREEN);
		出版社.setBackground(Color.BLACK);
		出版社.setColumns(10);
		
		价格 = new JTextField();
		价格.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int keyChar=e.getKeyChar();
				if ((keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9  )||keyChar ==KeyEvent.VK_DECIMAL) {

				} else {
				e.consume();
				}
			}
		});
		价格.setForeground(Color.GREEN);
		价格.setBackground(Color.BLACK);
		价格.setColumns(10);
		
		数量 = new JTextField();
		数量.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				int keyChar=arg0.getKeyChar();
				if (keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9) {

				} else {
				arg0.consume();
				}
			}
		});
		数量.setForeground(Color.GREEN);
		数量.setBackground(Color.BLACK);
		数量.setColumns(10);
		
		种类 = new JTextField();
		种类.setBackground(Color.BLACK);
		种类.setForeground(Color.GREEN);
		种类.setColumns(10);
		
		JLabel 名称错误 = new JLabel("*\u8BF7\u8F93\u5165\u4E66\u7C4D\u540D\u79F0\uFF01");
		名称错误.setFont(new Font("宋体", Font.PLAIN, 15));
		名称错误.setForeground(Color.RED);
		名称错误.setVisible(false);
		
		JLabel 作者错误 = new JLabel("*\u8BF7\u8F93\u5165\u4E66\u7C4D\u4F5C\u8005\uFF01");
		作者错误.setForeground(Color.RED);
		作者错误.setFont(new Font("宋体", Font.PLAIN, 15));
		作者错误.setVisible(false);
		
		JLabel 出版社错误 = new JLabel("*\u8BF7\u8F93\u5165\u4E66\u7C4D\u51FA\u7248\u793E\uFF01");
		出版社错误.setForeground(Color.RED);
		出版社错误.setFont(new Font("宋体", Font.PLAIN, 15));
		出版社错误.setVisible(false);
		
		JLabel 价格错误 = new JLabel("*\u8BF7\u8F93\u5165\u6570\u5B57\u4EF7\u683C\uFF01");
		价格错误.setForeground(Color.RED);
		价格错误.setFont(new Font("宋体", Font.PLAIN, 15));
		价格错误.setVisible(false);
		
		JLabel 数量错误 = new JLabel("*\u8BF7\u8F93\u5165\u6574\u6570\uFF01");
		数量错误.setForeground(Color.RED);
		数量错误.setFont(new Font("宋体", Font.PLAIN, 15));
		数量错误.setVisible(false);
		
		JLabel 种类错误 = new JLabel("*\u8BF7\u8F93\u5165\u4E66\u7C4D\u79CD\u7C7B\uFF01");
		种类错误.setForeground(Color.RED);
		种类错误.setFont(new Font("宋体", Font.PLAIN, 15));
		种类错误.setVisible(false);
		
		JLabel 成功 = new JLabel("\u6DFB\u52A0\u6210\u529F\uFF01");
		成功.setForeground(Color.MAGENTA);
		成功.setVisible(false);
		
		JButton 继续 = new JButton("\u7EE7\u7EED\u6DFB\u52A0");
		JButton 添加 = new JButton("\u786E\u8BA4\u6DFB\u52A0");
		添加.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				名称错误.setVisible(false);
				数量错误.setVisible(false);
				价格错误.setVisible(false);
				种类错误.setVisible(false);
				出版社错误.setVisible(false);
				作者错误.setVisible(false);
				if(作者.getText().equals("")!=true)
					
					if(名称.getText().equals("")!=true)
						
						if(种类.getText().equals("")!=true)
							
							if(数量.getText().equals("")!=true)
								
								if(价格.getText().equals("")!=true)
									
									if(出版社.getText().equals("")!=true)
									{
										File f = new File("Stock.txt");
										try {
											FileReader rd = new FileReader(f);
											BufferedReader r = new BufferedReader(rd);
										FileWriter wt = new FileWriter(f,true);
										BufferedWriter w = new BufferedWriter(wt);
										int i=1;
										while(r.readLine()!=null)
										{
											i++;
										}
										w.append(i+","+名称.getText()+","+数量.getText()+","+价格.getText()+","+出版社.getText()+","+种类.getText()+","+作者.getText()+"\r\n");
										添加.setEnabled(false);
										继续.setVisible(true);
										w.close();
										r.close();
										成功.setVisible(true);
										}
										catch(IOException h)
										{
											
										}
									}
									else
										出版社错误.setVisible(true);
								else
									价格错误.setVisible(true);
							else
								数量错误.setVisible(true);
						else
							种类错误.setVisible(true);
					else
						名称错误.setVisible(true);
				else
					作者错误.setVisible(true);

					
				
				
				
			}
		});
		添加.setFont(new Font("宋体", Font.PLAIN, 15));
		添加.setForeground(Color.BLACK);
		添加.setBackground(Color.CYAN);
		
		JButton 返回主菜单 = new JButton("\u8FD4\u56DE\u4E3B\u83DC\u5355");
		返回主菜单.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				主菜单 a = new 主菜单();
				a.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		返回主菜单.setFont(new Font("宋体", Font.PLAIN, 15));
		返回主菜单.setForeground(Color.BLACK);
		返回主菜单.setBackground(Color.CYAN);
		
		
		继续.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				添加.setEnabled(true);
				名称.setText("");
				种类.setText("");
				价格.setText("");
				数量.setText("");
				出版社.setText("");
				作者.setText("");
				继续.setVisible(false);
				成功.setVisible(false);
			}
		});
		继续.setFont(new Font("宋体", Font.PLAIN, 15));
		继续.setForeground(Color.BLACK);
		继续.setBackground(Color.CYAN);
		继续.setVisible(false);
		
		JButton button = new JButton("\u8FD4\u56DE\u7BA1\u7406\u754C\u9762");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				管理员窗口 sl = new 管理员窗口();
				sl.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBackground(Color.CYAN);
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(返回主菜单))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(提示输入作者, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
										.addComponent(提示输入名称))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(作者, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addComponent(名称, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(提示输入数量, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
										.addComponent(提示输入出版社, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(提示输入价格, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(数量, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addComponent(出版社, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addComponent(价格, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(提示输入种类, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(成功)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(button, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
												.addComponent(添加, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(种类, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(继续, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
											.addGap(17)))))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(数量错误, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
									.addComponent(种类错误, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(名称错误, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
									.addComponent(作者错误, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(价格错误, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
								.addComponent(出版社错误))))
					.addGap(83))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(名称, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(提示输入名称, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(名称错误))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(提示输入作者, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(作者, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(作者错误, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(提示输入出版社, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(出版社, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(出版社错误, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(提示输入价格, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(价格, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(价格错误, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(提示输入数量, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(数量, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(数量错误, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(提示输入种类, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(种类, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(种类错误, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(成功)
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(添加)
						.addComponent(继续))
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(返回主菜单)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
