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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class �鼮�޸� {

	public JFrame frame;
	private JTextField ���;
	private JTextField ��������;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�鼮�޸� window = new �鼮�޸�();
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
	public �鼮�޸�() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame("�̲Ĺ���ϵͳ�����鼮�޸�");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);

		JButton button = new JButton("\u4FEE\u6539\u5176\u4ED6\u4E66\u7C4D");
		JLabel �ɹ� = new JLabel("\u4FEE\u6539\u6210\u529F\uFF01\u662F\u5426\u7EE7\u7EED\uFF1F");
		JButton �޸� = new JButton("\u786E\u5B9A");
		JLabel ��ʾ����ID = new JLabel("\u8BF7\u8F93\u5165\u60A8\u60F3\u8981\u4FEE\u6539\u7684\u56FE\u4E66ID\uFF1A\r\n");
		JTextArea �鼮��Ϣ��ʾ�� = new JTextArea();
		JButton ȷ����� = new JButton("\u67E5\u8BE2");
		JButton ���ع������ = new JButton("\u8FD4\u56DE\u7BA1\u7406\u754C\u9762");
		JButton ȷ���޸İ�ť = new JButton("\u786E\u5B9A\u4FEE\u6539");
		JLabel �޸���ʾ�� = new JLabel("\u8BF7\u9009\u62E9\u4FEE\u6539\u7C7B\u578B\u548C\u5185\u5BB9");
		JButton ���� = new JButton("\u786E\u5B9A");
		�޸���ʾ��.setVisible(false);
		��� = new JTextField();
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
		
		JComboBox<String> ѡ�� = new JComboBox<String>();
		ѡ��.setFont(new Font("����", Font.PLAIN, 15));
		ѡ��.setForeground(new Color(0, 0, 0));
		ѡ��.setBackground(Color.CYAN);
		ѡ��.setVisible(false);
		
		
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
				ȷ���޸İ�ť.setVisible(true);
				
				}
				else {
					�鼮��Ϣ��ʾ��.setText("û���ҵ���");
					ȷ���޸İ�ť.setVisible(false);
					ѡ��.setVisible(false);
					��������.setVisible(false);
					�޸�.setVisible(false);
					
				}
				�ɹ�.setVisible(false);
				����.setVisible(false);
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
		
		JButton �鿴 = new JButton("\u67E5\u770B\u56FE\u4E66ID");
		�鿴.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ��ѯ���� b = new ��ѯ����();
				 b.frame.setVisible(true);
			}
		});
		�鿴.setBackground(Color.CYAN);
		�鿴.setFont(new Font("����", Font.PLAIN, 15));
		
		
		�鼮��Ϣ��ʾ��.setForeground(Color.BLUE);
		�鼮��Ϣ��ʾ��.setBackground(Color.BLACK);
		
		
		 ȷ���޸İ�ť.setVisible(false);
		ȷ���޸İ�ť.setFont(new Font("����", Font.PLAIN, 15));
		ȷ���޸İ�ť.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ȷ�����.setEnabled(false);
				ȷ���޸İ�ť.setEnabled(false);
				ѡ��.setVisible(true);
				��������.setVisible(true);
				�޸�.setVisible(true);
				�޸���ʾ��.setVisible(true);
			}
		});
		ȷ���޸İ�ť.setBackground(Color.CYAN);
		ѡ��.setModel(new DefaultComboBoxModel(new String[] {"\u4E66\u7C4D\u540D\u79F0", "\u4E66\u7C4D\u4F5C\u8005", "\u4E66\u7C4D\u51FA\u7248\u793E", "\u4E66\u7C4D\u4EF7\u683C", "\u4E66\u7C4D\u6570\u91CF", "\u4E66\u7C4D\u7C7B\u578B"}));
		
		�������� = new JTextField();
		��������.setFont(new Font("����", Font.PLAIN, 15));
		��������.setColumns(10);
		��������.setVisible(false);
		
		
		�޸�.setBackground(Color.CYAN);
		�޸�.setFont(new Font("����", Font.PLAIN, 15));
		�޸�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = ѡ��.getSelectedIndex();
				�޸ĺ�ɾ�� xs = new �޸ĺ�ɾ��();
				xs.File_Edit(Integer.parseInt(���.getText()), i, ��������.getText(), 0);
				�޸�.setEnabled(false);
				�ɹ�.setVisible(true);
				����.setVisible(true);
				button.setVisible(true);
			}
			
		});
		�޸�.setVisible(false);
		
		�޸���ʾ��.setForeground(Color.CYAN);
		
		�ɹ�.setFont(new Font("����", Font.PLAIN, 15));
		�ɹ�.setForeground(Color.CYAN);
		�ɹ�.setVisible(false);
		
		
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				����.setVisible(false);
				�޸�.setEnabled(true);
				�ɹ�.setVisible(false);
				button.setVisible(false);
			}
		});
		����.setBackground(Color.CYAN);
		����.setFont(new Font("����", Font.PLAIN, 15));
		����.setVisible(false);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�鼮�޸� xg = new �鼮�޸�();
				xg.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setVisible(false);
		button.setFont(new Font("����", Font.PLAIN, 15));
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
									.addComponent(����������)
									.addGap(30)
									.addComponent(�鿴, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(���ع������)
									.addGap(9))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(��ʾ����ID)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(���, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ȷ�����)
									.addGap(10)))
							.addContainerGap(27, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(ȷ���޸İ�ť, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(�޸���ʾ��)
									.addComponent(�鼮��Ϣ��ʾ��, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(ѡ��, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(��������, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(�޸�))
									.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(�ɹ�)
										.addGap(18)
										.addComponent(����))
									.addComponent(button, Alignment.TRAILING)))
							.addGap(39))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(����������)
						.addComponent(�鿴)
						.addComponent(���ع������))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(��ʾ����ID)
						.addComponent(���, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ȷ�����))
					.addGap(21)
					.addComponent(�鼮��Ϣ��ʾ��, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(ȷ���޸İ�ť)
					.addGap(12)
					.addComponent(�޸���ʾ��)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(ѡ��, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(��������, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(�޸�))
					.addGap(67)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(����)
						.addComponent(�ɹ�))
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
