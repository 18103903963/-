package �γ����;

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

public class ɾ���鼮 {

	public JFrame frame;
	private JTextField ���;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ɾ���鼮 window = new ɾ���鼮();
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
	public ɾ���鼮() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("�̲Ĺ���ϵͳ�����鼮�޸�");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);

		JButton ������ť = new JButton("\u7EE7\u7EED");
		������ť.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ɾ���鼮 de = new ɾ���鼮();
				de.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		JLabel ɾ���ɹ���ʾ�� = new JLabel("\u5220\u9664\u6210\u529F\uFF01\u7EE7\u7EED\u5417\uFF1F");
		JLabel label = new JLabel("\u786E\u5B9A\u8981\u5220\u9664\u5417\uFF1F\u5220\u9664\u540E\u4E0D\u53EF\u590D\u539F\uFF01");
		JLabel ��ʾ����ID = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8981\u5220\u9664\u7684\u56FE\u4E66ID\uFF1A\r\n");
		JTextArea �鼮��Ϣ��ʾ�� = new JTextArea();
		JButton ȷ����� = new JButton("\u67E5\u8BE2");
		JButton ���ع������ = new JButton("\u8FD4\u56DE\u7BA1\u7406\u754C\u9762");
		JButton ȷ�� = new JButton("\u786E\u5B9A");
		ɾ���ɹ���ʾ��.setVisible(false);
		������ť.setVisible(false);
		��� = new JTextField();
		���.setBackground(Color.BLACK);
		���.setForeground(Color.GREEN);
		���.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int keyChar=e.getKeyChar();
				if ((keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9  )) {

				} else {
				e.consume();
				}
			}
		});
		���.setFont(new Font("����", Font.PLAIN, 15));
		���.setColumns(10);
		

		JButton �鿴 = new JButton("\u67E5\u770B\u56FE\u4E66ID");
		�鼮��Ϣ��ʾ��.setEditable(false);
		�鼮��Ϣ��ʾ��.setFont(new Font("Monospaced", Font.PLAIN, 15));
		
		
		ȷ�����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(���.getText().equals("")!=true)
			{
				int need = Integer.parseInt(���.getText());
				��ѯ��ʽ cx = new ��ѯ��ʽ();
				String message = cx.BookSearchByID(need);
				if(message.equals("")!=true)
				{
				�鼮��Ϣ��ʾ��.setText("���ҵ��������� :\r\n"+message);
				ȷ��.setVisible(true);
				label.setVisible(true);
				}
				else {
					�鼮��Ϣ��ʾ��.setText("û���ҵ���");
				}
			}
				else
					�鼮��Ϣ��ʾ��.setText("�������Ž��в�ѯ��");
			}
		});
		ȷ�����.setBackground(Color.CYAN);
		ȷ�����.setFont(new Font("����", Font.PLAIN, 15));
		
		
		��ʾ����ID.setForeground(Color.CYAN);
		��ʾ����ID.setFont(new Font("����", Font.PLAIN, 15));
		
		
		���ع������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				����Ա���� gly = new ����Ա����();
				frame.setVisible(false);
				gly.frame.setVisible(true);
			}
		});
		���ع������.setFont(new Font("����", Font.PLAIN, 15));
		���ع������.setBackground(Color.CYAN);
		
		JButton ���������� = new JButton("\u8FD4\u56DE\u4E3B\u754C\u9762");
		����������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���˵� a = new ���˵�();
				a.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		����������.setFont(new Font("����", Font.PLAIN, 15));
		����������.setBackground(Color.CYAN);
		
		�鿴.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ��ѯ���� b = new ��ѯ����();
				 b.frame.setVisible(true);
			}
		});
		�鿴.setBackground(Color.CYAN);
		�鿴.setFont(new Font("����", Font.PLAIN, 15));
		
		
		�鼮��Ϣ��ʾ��.setForeground(Color.RED);
		�鼮��Ϣ��ʾ��.setBackground(Color.BLACK);
		
		label.setFont(new Font("����", Font.PLAIN, 15));
		label.setForeground(Color.CYAN);
		label.setVisible(false);
		
		ȷ��.setVisible(false);
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(���.getText());
				�޸ĺ�ɾ�� sg = new �޸ĺ�ɾ��();
				sg.File_Edit(id, 1, null, 1);
				ȷ��.setEnabled(false);
				������ť.setVisible(true);
				ɾ���ɹ���ʾ��.setVisible(true);
			}
		});
		ȷ��.setBackground(Color.CYAN);
		ȷ��.setFont(new Font("����", Font.PLAIN, 15));
		
		ɾ���ɹ���ʾ��.setFont(new Font("����", Font.PLAIN, 15));
		ɾ���ɹ���ʾ��.setForeground(Color.CYAN);
		
		������ť.setBackground(Color.CYAN);
		������ť.setFont(new Font("����", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(54, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(�鼮��Ϣ��ʾ��, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(��ʾ����ID)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(���, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ȷ�����)
									.addContainerGap(30, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(����������)
									.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
									.addComponent(�鿴, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(���ع������)
									.addGap(36))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ȷ��, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(������ť, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(54))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(205)
					.addComponent(ɾ���ɹ���ʾ��)
					.addContainerGap(154, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(46, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(���ع������)
						.addComponent(�鿴)
						.addComponent(����������))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(��ʾ����ID)
						.addComponent(���, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ȷ�����))
					.addGap(36)
					.addComponent(�鼮��Ϣ��ʾ��, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(ȷ��))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(ɾ���ɹ���ʾ��)
						.addComponent(������ť))
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
