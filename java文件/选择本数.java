package �γ����;

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

public class ѡ���� {

	public JFrame frame;
	private JTextField ��������;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	
	public ѡ����(int a ) {
		initialize(a);
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize(int a) {
		frame = new JFrame("�̲Ĺ���ϵͳ����������桪��ѡ����");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		��ѯ��ʽ  c = new ��ѯ��ʽ();
		
		
		JLabel ��ʾ = new JLabel("\u9519\u8BEF\uFF01\u8BF7\u6C42\u6570\u91CF\u8D85\u51FA\u5E93\u5B58\u91CF\uFF01");
		��ʾ.setFont(new Font("����", Font.PLAIN, 15));
		��ʾ.setBackground(Color.BLACK);
		��ʾ.setForeground(Color.RED);
		��ʾ.setVisible(false);
		
		JTextArea �鼮��Ϣ��� = new JTextArea();
		�鼮��Ϣ���.setEditable(false);
		�鼮��Ϣ���.setFont(new Font("Monospaced", Font.PLAIN, 15));
		�鼮��Ϣ���.setBackground(Color.BLACK);
		�鼮��Ϣ���.setForeground(Color.CYAN);
		�鼮��Ϣ���.setText("��ѡ���ͼ����Ϣ������ʾ����ȷ��"+"\r\n"+c.BookSearchByID(a));
		StringTokenizer test = new StringTokenizer(c.BookSearchByID(a),",");
		int shengyu;
		test.nextToken();
		test.nextToken();
		shengyu = Integer.parseInt(test.nextToken());
		double price = Double.parseDouble(test.nextToken());
		JLabel ��ʾ�������� = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8981\u8D2D\u4E70\u7684\u6570\u91CF");
		��ʾ��������.setFont(new Font("����", Font.PLAIN, 15));
		��ʾ��������.setBackground(Color.BLACK);
		��ʾ��������.setForeground(Color.CYAN);
		��ʾ��������.setVisible(false);
		
		JButton ���� = new JButton("\u7EE7\u7EED");
		JButton ȷ�� = new JButton("\u786E\u5B9A");
		ȷ��.setFont(new Font("����", Font.PLAIN, 15));
		ȷ��.setBackground(Color.CYAN);
		ȷ��.setForeground(Color.BLACK);
		ȷ��.setVisible(false);
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(��������.getText());
				if(number>shengyu)
				{
					��ʾ.setVisible(true);
				}
				else
				{
					����.setVisible(true);
					��ʾ.setText("���Ķ����۸�Ϊ��"+price*number+"Ԫ��������?");
					��ʾ.setVisible(true);
					ȷ��.setEnabled(false);
					
				}
				
			}
		});
		
		JButton ȷ���鼮��Ϣ = new JButton("\u786E\u5B9A");
		ȷ���鼮��Ϣ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ȷ��.setVisible(true);
				��������.setVisible(true);
				��ʾ��������.setVisible(true);
				ȷ���鼮��Ϣ.setEnabled(false);
			}
		});
		ȷ���鼮��Ϣ.setBackground(Color.CYAN);
		ȷ���鼮��Ϣ.setForeground(Color.BLACK);
		
		
		JLabel �ɹ� = new JLabel("\u8D2D\u4E70\u6210\u529F\uFF01");
		
		
		�������� = new JTextField();
		��������.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				int keyChar=e.getKeyChar();
				if ((keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9  )||keyChar ==KeyEvent.VK_DECIMAL) {

				} else {
				e.consume();
				}
			}
		});
		��������.setFont(new Font("����", Font.PLAIN, 15));
		��������.setBackground(Color.BLACK);
		��������.setForeground(Color.GREEN);
		��������.setColumns(10);
		��������.setVisible(false);
		
		
		
		����.setBackground(Color.CYAN);
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				���麯�� h = new ���麯��();
				h.����(a,Integer.parseInt(��������.getText()));
				�ɹ�.setVisible(true);
				����.setEnabled(false);
			}
		});
		����.setVisible(false);
		����.setFont(new Font("����", Font.PLAIN, 15));
		����.setForeground(Color.BLACK);
		
		JButton �������˵� = new JButton("\u8FD4\u56DE\u4E3B\u83DC\u5355");
		�������˵�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���˵� zc = new ���˵�();
				zc.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		�������˵�.setFont(new Font("����", Font.PLAIN, 15));
		�������˵�.setBackground(Color.CYAN);
		
		
		�ɹ�.setFont(new Font("����", Font.PLAIN, 15));
		�ɹ�.setForeground(Color.CYAN);
		�ɹ�.setVisible(false);
		
		JButton button = new JButton("\u8FD4\u56DE\u8D2D\u4E70\u9875\u9762");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				������� gs = new �������();
				frame.setVisible(false);
				gs.frame.setVisible(true);
			}
		});
		button.setBackground(Color.CYAN);
		button.setFont(new Font("����", Font.PLAIN, 15));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(197)
					.addComponent(ȷ���鼮��Ϣ, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(210, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(220, Short.MAX_VALUE)
					.addComponent(�������˵�)
					.addGap(167))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(�ɹ�))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(��ʾ��������)
									.addGap(36)
									.addComponent(��������, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(ȷ��, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(��ʾ)
								.addComponent(�鼮��Ϣ���, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(button)
									.addPreferredGap(ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
									.addComponent(����, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(48, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addComponent(�鼮��Ϣ���, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(ȷ���鼮��Ϣ)
					.addGap(49)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(��ʾ��������)
						.addComponent(��������, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ȷ��))
					.addGap(18)
					.addComponent(��ʾ)
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(�������˵�)
						.addComponent(button)
						.addComponent(����))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(�ɹ�)
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
