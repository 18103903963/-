package �γ����;
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

public class �鼮��� {

	public JFrame frame;
	private JTextField ����;
	private JTextField ����;
	private JTextField ������;
	private JTextField �۸�;
	private JTextField ����;
	private JTextField ����;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�鼮��� window = new �鼮���();
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
	public �鼮���() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("�̲Ĺ���ϵͳ");
		frame.setTitle("\u6559\u6750\u7BA1\u7406\u7CFB\u7EDF\u2014\u2014\u4E66\u7C4D\u6DFB\u52A0");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		
		JLabel ��ʾ�������� = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u540D\u79F0\uFF1A");
		��ʾ��������.setFont(new Font("����", Font.PLAIN, 15));
		��ʾ��������.setForeground(Color.CYAN);
		
		JLabel ��ʾ�������� = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u4F5C\u8005\uFF1A");
		��ʾ��������.setForeground(Color.CYAN);
		��ʾ��������.setFont(new Font("����", Font.PLAIN, 15));
		
		JLabel ��ʾ��������� = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u51FA\u7248\u793E\uFF1A");
		��ʾ���������.setForeground(Color.CYAN);
		��ʾ���������.setFont(new Font("����", Font.PLAIN, 15));
		
		JLabel ��ʾ����۸� = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u4EF7\u683C\uFF1A");
		��ʾ����۸�.setForeground(Color.CYAN);
		��ʾ����۸�.setFont(new Font("����", Font.PLAIN, 15));
		
		JLabel ��ʾ�������� = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u6570\u91CF\uFF1A");
		��ʾ��������.setForeground(Color.CYAN);
		��ʾ��������.setFont(new Font("����", Font.PLAIN, 15));
		
		JLabel ��ʾ�������� = new JLabel("\u8BF7\u8F93\u5165\u4E66\u7C4D\u79CD\u7C7B\uFF1A");
		��ʾ��������.setForeground(Color.CYAN);
		��ʾ��������.setFont(new Font("����", Font.PLAIN, 15));
		
		���� = new JTextField();
		����.setForeground(Color.GREEN);
		����.setBackground(Color.BLACK);
		����.setColumns(10);
		
		���� = new JTextField();
		����.setForeground(Color.GREEN);
		����.setBackground(Color.BLACK);
		����.setColumns(10);
		
		������ = new JTextField();
		������.setForeground(Color.GREEN);
		������.setBackground(Color.BLACK);
		������.setColumns(10);
		
		�۸� = new JTextField();
		�۸�.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int keyChar=e.getKeyChar();
				if ((keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9  )||keyChar ==KeyEvent.VK_DECIMAL) {

				} else {
				e.consume();
				}
			}
		});
		�۸�.setForeground(Color.GREEN);
		�۸�.setBackground(Color.BLACK);
		�۸�.setColumns(10);
		
		���� = new JTextField();
		����.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				int keyChar=arg0.getKeyChar();
				if (keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9) {

				} else {
				arg0.consume();
				}
			}
		});
		����.setForeground(Color.GREEN);
		����.setBackground(Color.BLACK);
		����.setColumns(10);
		
		���� = new JTextField();
		����.setBackground(Color.BLACK);
		����.setForeground(Color.GREEN);
		����.setColumns(10);
		
		JLabel ���ƴ��� = new JLabel("*\u8BF7\u8F93\u5165\u4E66\u7C4D\u540D\u79F0\uFF01");
		���ƴ���.setFont(new Font("����", Font.PLAIN, 15));
		���ƴ���.setForeground(Color.RED);
		���ƴ���.setVisible(false);
		
		JLabel ���ߴ��� = new JLabel("*\u8BF7\u8F93\u5165\u4E66\u7C4D\u4F5C\u8005\uFF01");
		���ߴ���.setForeground(Color.RED);
		���ߴ���.setFont(new Font("����", Font.PLAIN, 15));
		���ߴ���.setVisible(false);
		
		JLabel ��������� = new JLabel("*\u8BF7\u8F93\u5165\u4E66\u7C4D\u51FA\u7248\u793E\uFF01");
		���������.setForeground(Color.RED);
		���������.setFont(new Font("����", Font.PLAIN, 15));
		���������.setVisible(false);
		
		JLabel �۸���� = new JLabel("*\u8BF7\u8F93\u5165\u6570\u5B57\u4EF7\u683C\uFF01");
		�۸����.setForeground(Color.RED);
		�۸����.setFont(new Font("����", Font.PLAIN, 15));
		�۸����.setVisible(false);
		
		JLabel �������� = new JLabel("*\u8BF7\u8F93\u5165\u6574\u6570\uFF01");
		��������.setForeground(Color.RED);
		��������.setFont(new Font("����", Font.PLAIN, 15));
		��������.setVisible(false);
		
		JLabel ������� = new JLabel("*\u8BF7\u8F93\u5165\u4E66\u7C4D\u79CD\u7C7B\uFF01");
		�������.setForeground(Color.RED);
		�������.setFont(new Font("����", Font.PLAIN, 15));
		�������.setVisible(false);
		
		JLabel �ɹ� = new JLabel("\u6DFB\u52A0\u6210\u529F\uFF01");
		�ɹ�.setForeground(Color.MAGENTA);
		�ɹ�.setVisible(false);
		
		JButton ���� = new JButton("\u7EE7\u7EED\u6DFB\u52A0");
		JButton ��� = new JButton("\u786E\u8BA4\u6DFB\u52A0");
		���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���ƴ���.setVisible(false);
				��������.setVisible(false);
				�۸����.setVisible(false);
				�������.setVisible(false);
				���������.setVisible(false);
				���ߴ���.setVisible(false);
				if(����.getText().equals("")!=true)
					
					if(����.getText().equals("")!=true)
						
						if(����.getText().equals("")!=true)
							
							if(����.getText().equals("")!=true)
								
								if(�۸�.getText().equals("")!=true)
									
									if(������.getText().equals("")!=true)
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
										w.append(i+","+����.getText()+","+����.getText()+","+�۸�.getText()+","+������.getText()+","+����.getText()+","+����.getText()+"\r\n");
										���.setEnabled(false);
										����.setVisible(true);
										w.close();
										r.close();
										�ɹ�.setVisible(true);
										}
										catch(IOException h)
										{
											
										}
									}
									else
										���������.setVisible(true);
								else
									�۸����.setVisible(true);
							else
								��������.setVisible(true);
						else
							�������.setVisible(true);
					else
						���ƴ���.setVisible(true);
				else
					���ߴ���.setVisible(true);

					
				
				
				
			}
		});
		���.setFont(new Font("����", Font.PLAIN, 15));
		���.setForeground(Color.BLACK);
		���.setBackground(Color.CYAN);
		
		JButton �������˵� = new JButton("\u8FD4\u56DE\u4E3B\u83DC\u5355");
		�������˵�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���˵� a = new ���˵�();
				a.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		�������˵�.setFont(new Font("����", Font.PLAIN, 15));
		�������˵�.setForeground(Color.BLACK);
		�������˵�.setBackground(Color.CYAN);
		
		
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���.setEnabled(true);
				����.setText("");
				����.setText("");
				�۸�.setText("");
				����.setText("");
				������.setText("");
				����.setText("");
				����.setVisible(false);
				�ɹ�.setVisible(false);
			}
		});
		����.setFont(new Font("����", Font.PLAIN, 15));
		����.setForeground(Color.BLACK);
		����.setBackground(Color.CYAN);
		����.setVisible(false);
		
		JButton button = new JButton("\u8FD4\u56DE\u7BA1\u7406\u754C\u9762");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				����Ա���� sl = new ����Ա����();
				sl.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("����", Font.PLAIN, 15));
		button.setBackground(Color.CYAN);
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(�������˵�))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(��ʾ��������, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
										.addComponent(��ʾ��������))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(����, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addComponent(����, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(��ʾ��������, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
										.addComponent(��ʾ���������, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(��ʾ����۸�, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(����, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addComponent(������, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addComponent(�۸�, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(��ʾ��������, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(�ɹ�)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(button, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
												.addComponent(���, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(����, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(����, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
											.addGap(17)))))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(��������, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
									.addComponent(�������, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(���ƴ���, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
									.addComponent(���ߴ���, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(�۸����, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
								.addComponent(���������))))
					.addGap(83))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(����, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(��ʾ��������, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(���ƴ���))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(��ʾ��������, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(����, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(���ߴ���, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(��ʾ���������, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(������, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(���������, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(��ʾ����۸�, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(�۸�, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(�۸����, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(��ʾ��������, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(����, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(��������, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(��ʾ��������, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(����, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(�������, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(�ɹ�)
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(���)
						.addComponent(����))
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(�������˵�)
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
