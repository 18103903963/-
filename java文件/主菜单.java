//�������˵�

package �γ����;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JPasswordField;


public class ���˵� {

	public JFrame frame;
	private JTextField q3;
	private JPasswordField q5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					���˵� window = new ���˵�();
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
	public ���˵�() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("�̲Ĺ���ϵͳ");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		frame.setBounds(screenWidth/2-250,screenHeight/2-250,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel t3 = new JLabel("*�¹���Աע����Ҫ��Ȩ��");
		JLabel t2 = new JLabel("*����Ա��½�������ʺ�����");
		JLabel t1 = new JLabel("*��Ҫ�����鼮��ѡ���ο�ģʽ");
		JLabel q1 = new JLabel("CR�鼮����ϵͳ");
		JLabel q2 = new JLabel("�˺ţ�");
		JButton q7 = new JButton("ע��");
		JLabel q4 = new JLabel("���룺");
		JButton b1 = new JButton("����̲�");
		JButton b2 =  new JButton("��ѯ�̲�");
		JButton b4 = new JButton("���ص�¼");
		JLabel lblNewLabel_1 = new JLabel("��ǰ״̬���ȴ�ѡ��...");
		JButton q6 = new JButton("��¼");
		JButton b3 = new JButton("����̲�");
		b1.setVisible(false);
		b2.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
		
		JButton q8 = new JButton("�ο�ģʽ");
		q8.setFont(new Font("����", Font.PLAIN, 15));
		q8.setForeground(Color.BLACK);
		q8.setBackground(Color.CYAN);
		q8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_1.setText("�ο�ģʽֻ�ܽ��в�ѯ����̲Ĳ�����");
				q1.setVisible(false);
				q2.setVisible(false);
				q3.setVisible(false);
				q4.setVisible(false);
				q5.setVisible(false);
				q6.setVisible(false);
				q7.setVisible(false);
				q8.setVisible(false);
				b1.setVisible(true);
				b2.setVisible(true);
				b4.setVisible(true);
				t1.setVisible(false);
				t2.setVisible(false);
				t3.setVisible(false);
			}
		});
		q2.setFont(new Font("����", Font.PLAIN, 15));
		q2.setForeground(Color.CYAN);
		q7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ע�ᴰ�� a = new ע�ᴰ��();
				a.frame.setVisible(true);
			}
		});
		q7.setFont(new Font("����", Font.PLAIN, 15));
		q7.setBackground(Color.CYAN);
		q4.setFont(new Font("����", Font.PLAIN, 15));
		q4.setForeground(Color.CYAN);
		q3 = new JTextField();
		q3.setFont(new Font("����", Font.PLAIN, 15));
		q3.setColumns(10);
		q1.setFont(new Font("����", Font.PLAIN, 20));
		q1.setHorizontalAlignment(SwingConstants.CENTER);
		q1.setForeground(Color.CYAN);
		b1.setBackground(Color.CYAN);
		b1.setFont(new Font("����", Font.PLAIN, 15));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				������� gs = new �������();
				frame.setVisible(false);
				gs.frame.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				��ѯ����  require = new ��ѯ����();
				require.frame.setVisible(true);
			}
		});
		b2.setBackground(Color.CYAN);
		b2.setFont(new Font("����", Font.PLAIN, 15));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//����Ա����ģ�鰴ť
				����Ա���� gly = new ����Ա����();
				gly.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		b3.setBackground(Color.CYAN);
		b3.setFont(new Font("����", Font.PLAIN, 15));
		b3.setForeground(Color.RED);
		b4.setBackground(Color.CYAN);
		b4.setFont(new Font("����", Font.PLAIN, 15));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				���˵� z = new ���˵�();
				frame.setVisible(false);
				z.frame.setVisible(true);
			}
		});
		
		t1.setFont(new Font("����", Font.PLAIN, 15));
		t1.setForeground(Color.RED);
		
		t2.setFont(new Font("����", Font.PLAIN, 15));
		t2.setForeground(Color.RED);
		
		t3.setFont(new Font("����", Font.PLAIN, 15));
		t3.setForeground(Color.RED);
		
		
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.CYAN);
		
		q5 = new JPasswordField();
		q5.setFont(new Font("����", Font.PLAIN, 15));
		
		
		q6.setFont(new Font("����", Font.PLAIN, 15));
		q6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f = new File("user.txt");
				try{
				FileReader read = new FileReader(f);
				BufferedReader rd = new BufferedReader(read);
				String user;
				user = rd.readLine();
				String username = q3.getText();
				@SuppressWarnings("deprecation")
				String password = q5.getText();
				if(user==null)
				{
					lblNewLabel_1.setText("Ŀǰ��û���˺Ż��˺��Ѿ�����գ�����ע���˺ţ�");
					ע�ᴰ�� g = new ע�ᴰ��();
					frame.setVisible(false);
					g.frame.setVisible(true);
				}
				else{
				StringTokenizer apart = new StringTokenizer(user,",");
				String User = apart.nextToken();
				String ss = apart.nextToken();
				while(user!=null)
				{
					if(User.equals(username))
					{
						if(ss.equals(password))
						{
							
							q1.setVisible(false);
							q2.setVisible(false);
							q3.setVisible(false);
							q4.setVisible(false);
							q5.setVisible(false);
							q6.setVisible(false);
							q7.setVisible(false);
							q8.setVisible(false);
							b1.setVisible(true);
							b2.setVisible(true);
							b3.setVisible(true);
							b4.setVisible(true);
							t1.setVisible(false);
							t2.setVisible(false);
							t3.setVisible(false);
							lblNewLabel_1.setVisible(false);
						}
						else
						{
							lblNewLabel_1.setText("������󣡵�¼ʧ�ܣ�");
						}
						break;
					}
					else
					{
						user = rd.readLine();
						if(user!=null){
						apart = new StringTokenizer(user,",");
						User = apart.nextToken();
						ss = apart.nextToken();
						}
					}
				}
				if(user==null)
					lblNewLabel_1.setText("�û���δ�ҵ�����¼ʧ�ܣ�");
				rd.close();
				}}
				catch(IOException p)
				{
					
				}
				
			}
		});
		q6.setBackground(Color.CYAN);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(34)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(t1, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(19)
											.addComponent(q4)
											.addGap(18)
											.addComponent(q5, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(60)
										.addComponent(q1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
									.addComponent(t3)
									.addComponent(t2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(53)
								.addComponent(q2)
								.addGap(18)
								.addComponent(q3, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(q6)
									.addGap(14)
									.addComponent(q7)
									.addGap(18)
									.addComponent(q8)))))
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(b3)
						.addComponent(b2)
						.addComponent(b1)
						.addComponent(b4))
					.addGap(26))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(q1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(q3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(q2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(b1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(q4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(q5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(q6)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(q7)
									.addComponent(q8))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(b2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(58)
							.addComponent(t1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(t2)
							.addGap(18)
							.addComponent(t3)
							.addContainerGap(56, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(17)
							.addComponent(b3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
							.addComponent(b4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(29))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
