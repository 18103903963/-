package 课程设计;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class 查询窗口 {

	public JFrame frame;
	private JTextField txtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					查询窗口 window = new 查询窗口();
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
	public 查询窗口() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("教材管理系统——教材查询");
		frame.getContentPane().setFont(new Font("宋体", Font.PLAIN, 15));
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		
		txtn = new JTextField();
		txtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtn.setText("");
			}
		});
		txtn.setFont(new Font("宋体", Font.PLAIN, 15));
		txtn.setText("\u5728\u6B64\u8F93\u5165\u67E5\u8BE2\u5173\u952E\u8BCD");
		txtn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u67E5\u627E\u65B9\u5F0F\uFF01\r\n");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.CYAN);
		
		JButton button = new JButton("\u5F00\u59CB\u67E5\u8BE2");
		button.setEnabled(false);
		JRadioButton radioButton = new JRadioButton("\u6839\u636E\u4E66\u540D\u67E5\u8BE2");
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				button.setEnabled(true);
				lblNewLabel.setText("请输入您想要查找的关键词！");
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\u67E5\u8BE2\u7ED3\u679C\uFF1A");
		textArea.setToolTipText("");
		textArea.setForeground(Color.RED);
		textArea.setBackground(Color.BLACK);
		textArea.setEditable(false);
		
		radioButton.setForeground(Color.CYAN);
		radioButton.setBackground(Color.BLACK);
		radioButton.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JRadioButton radioButton_1 = new JRadioButton("\u6839\u636E\u4F5C\u8005\u67E5\u8BE2");
		radioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.setEnabled(true);
				lblNewLabel.setText("请输入您想要查找的关键词！");
			}
		});
		radioButton_1.setBackground(Color.BLACK);
		radioButton_1.setForeground(Color.CYAN);
		radioButton_1.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JRadioButton radioButton_2 = new JRadioButton("\u6839\u636E\u56FE\u4E66\u79CD\u7C7B\u67E5\u8BE2");
		radioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.setEnabled(true);
				lblNewLabel.setText("请输入您想要查找的关键词！");
			}
		});
		radioButton_2.setBackground(Color.BLACK);
		radioButton_2.setForeground(Color.CYAN);
		radioButton_2.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JRadioButton rdbtnid = new JRadioButton("\u6839\u636E\u56FE\u4E66id\u67E5\u8BE2");
		rdbtnid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.setEnabled(true);
				lblNewLabel.setText("请输入您想要查找的关键词！");
			}
		});
		rdbtnid.setForeground(Color.CYAN);
		rdbtnid.setFont(new Font("宋体", Font.PLAIN, 15));
		rdbtnid.setBackground(Color.BLACK);
		ButtonGroup union = new ButtonGroup();
		union.add(radioButton);
		union.add(radioButton_1);
		union.add(radioButton_2);
		union.add(rdbtnid);
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				查询方式 a = new 查询方式();
				String ss= null;
				if(radioButton.isSelected())
				{
				
					ss = a.BookSearchByName(txtn.getText());
					if(!ss.equals(""))
					{textArea.setText("查找到以下内容：\r\n"+ss);}
					
					else
						{textArea.setText("没有找到！");}
				}
				if(radioButton_1.isSelected())
				{
					ss = a.BookSearchByAuthor(txtn.getText());
					if(!ss.equals(""))
						textArea.setText("查找到以下内容：\r\n"+ss);
					else
						textArea.setText("没有找到！");
				}
				if(radioButton_2.isSelected())
				{
					ss = a.BookSearchByType(txtn.getText());
					if(ss.equals("")==false)
						textArea.setText("查找到以下内容：\r\n"+ss);
					else
						textArea.setText("没有找到！");
				}
				if(rdbtnid.isSelected())
				{
					ss = a.BookSearchByID(Integer.parseInt(txtn.getText()));
					if(!ss.equals(""))
						textArea.setText("查找到以下内容：\r\n"+ss);
					else
						textArea.setText("没有找到！");
				}
				
			}
		});
		button.setBackground(Color.CYAN);
		button.setForeground(Color.BLACK);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JButton btnNewButton = new JButton("\u9000\u51FA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				frame.dispose();
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		
		
		
		
		
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(radioButton)
										.addGap(90)
										.addComponent(radioButton_1))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(rdbtnid, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
										.addGap(40)
										.addComponent(radioButton_2, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(txtn, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
								.addGap(73))
							.addComponent(btnNewButton, Alignment.LEADING))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(94)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButton)
						.addComponent(radioButton_1))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnid)
						.addComponent(radioButton_2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(txtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(button))
					.addGap(18)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(btnNewButton)
					.addGap(21))
		);
		frame.getContentPane().setLayout(groupLayout);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
	}
}
