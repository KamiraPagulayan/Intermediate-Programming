package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FbLogin {

	JFrame frame;
	private JTextField txtEmailOrPhone;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FbLogin window = new FbLogin();
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
	public FbLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(246, 246, 246));
		frame.setBounds(100, 100, 864, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(450, 56, 341, 390);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Email or phone number");
		lblNewLabel_2.setForeground(new Color(226, 226, 226));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(69, 54, 169, 30);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Enrollment window = new Enrollment();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(31, 200, 265, 45);
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 25));
		
		txtEmailOrPhone = new JTextField();
		txtEmailOrPhone.setBounds(59, 44, 211, 51);
		panel.add(txtEmailOrPhone);
		txtEmailOrPhone.setForeground(new Color(0, 0, 0));
		txtEmailOrPhone.setFont(new Font("Arial", Font.PLAIN, 15));
		txtEmailOrPhone.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setForeground(new Color(231, 231, 231));
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(69, 112, 169, 30);
		panel.add(lblNewLabel_2_1);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(59, 105, 211, 47);
		panel.add(passwordField);
		passwordField.setToolTipText("");
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setBounds(6, 158, 133, 36);
		panel.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		
		
		
		JButton btnNewButton_1 = new JButton("Create new account");
		btnNewButton_1.setBounds(69, 303, 202, 56);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 185, 47));
		
		JButton btnNewButton_2 = new JButton("Forgot password?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Password window = new Password();
				window.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(0, 128, 255));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_2.setBounds(97, 255, 141, 21);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("facebook");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(41, 140, 253, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnConnectWithYour = new JTextPane();
		txtpnConnectWithYour.setBackground(new Color(244, 244, 244));
		txtpnConnectWithYour.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnConnectWithYour.setText("Connect with friends and the world\r\naround you");
		txtpnConnectWithYour.setBounds(35, 216, 349, 62);
		frame.getContentPane().add(txtpnConnectWithYour);
		

	}
}
