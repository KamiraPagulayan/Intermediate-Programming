package finalExam;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Enrollment {
	

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enrollment window = new Enrollment();
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
	public Enrollment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 874, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnrollment = new JLabel("Student Enrollment Form");
		lblEnrollment.setBounds(33, 50, 399, 80);
		lblEnrollment.setForeground(new Color(0, 128, 255));
		lblEnrollment.setFont(new Font("Times New Roman", Font.BOLD, 35));
		frame.getContentPane().add(lblEnrollment);
		
		JLabel lblNewLabel_1 = new JLabel("ID Number:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(520, 143, 78, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(520, 196, 78, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(520, 249, 78, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Student Type:");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(520, 291, 94, 29);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Course:");
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setBounds(520, 344, 78, 24);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		textField = new JTextField();
		textField.setBounds(608, 144, 126, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(608, 194, 126, 31);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(608, 241, 126, 31);
		frame.getContentPane().add(textField_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(472, 113, 362, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(245, 245, 245));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(104, 293, 177, 45);
		panel.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				students st1=new students("13-0019", "Lizel", "Avillano", "Tourism", "Discounted (Gold)", 0.5);
				students st2=new students("13-0222", "Icy", "Virrey", "Computer Science", "Discounted (BLue)", 0.3);
				students st3=new students("11-1234", "Judith", "Tan", "Engineering", "Discounted (White)", 0.1);
				students st4=new students("10-0506", "Rina", "Marquez", "Nursing", "Continuing", 0.1);
				students st5=new students("23-0001", "Drake", "Dulay", "Architecture", "Walk-In", 0);
				
				String email=textField.getText();
				String password=textField_1.getText();
				
				if (email.equals(st1.firstNames) && password.equals(st1.ID)) {
					Enrollment ep = new Enrollment();
					ep.NewFrame();
				}else if (email.equals(st2.firstNames) && password.equals(st2.ID)) {
					Enrollment ep = new Enrollment();
					ep.NewFrame();
				}else if (email.equals(st3.firstNames) && password.equals(st3.ID)) {
					Enrollment ep = new Enrollment();
					ep.NewFrame();
				}else if (email.equals(st4.firstNames) && password.equals(st4.ID)) {
					Enrollment ep = new Enrollment();
					ep.NewFrame();
				}else if (email.equals(st5.firstNames) && password.equals(st5.ID)) {
					Enrollment ep = new Enrollment();
					ep.NewFrame();
				}else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid Login");
				}
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Student Type", "Gold", "Blue", "White", "Continuing", "Walk-In"}));
		comboBox.setBounds(143, 178, 163, 28);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose a Course", "Tourism", "Computer Science", "Engineering", "Nursing", "Architecture"}));
		comboBox_1.setBounds(110, 231, 136, 28);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(80, 151, 319, 301);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kalli\\Pictures\\international-state-college-of-the-philippines-logo-87B306759C-seeklogo.com.png"));
		
		
	}

	protected void NewFrame() {
		// TODO Auto-generated method stub
		
	}
}
