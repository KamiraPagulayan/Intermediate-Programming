package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("facebook");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(41, 127, 253, 80);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnConnectWithYour = new JTextPane();
		txtpnConnectWithYour.setText("Connect with friends and the world\r\naround you");
		txtpnConnectWithYour.setFont(new Font("Arial", Font.PLAIN, 18));
		txtpnConnectWithYour.setBackground(new Color(240, 240, 240));
		txtpnConnectWithYour.setBounds(41, 217, 349, 62);
		contentPane.add(txtpnConnectWithYour);
		
		JLabel lblSignUp = new JLabel("Sign up");
		lblSignUp.setFont(new Font("Arial", Font.BOLD, 30));
		lblSignUp.setBounds(444, 85, 129, 36);
		contentPane.add(lblSignUp);
		
		JLabel lblNewLabel_2 = new JLabel("Email or phone number");
		lblNewLabel_2.setForeground(new Color(226, 226, 226));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(444, 157, 169, 30);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(434, 144, 211, 51);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setForeground(new Color(231, 231, 231));
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(444, 242, 169, 30);
		contentPane.add(lblNewLabel_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(434, 235, 211, 47);
		contentPane.add(passwordField);
		
		JTextPane txtpnByClickingSign = new JTextPane();
		txtpnByClickingSign.setForeground(new Color(192, 192, 192));
		txtpnByClickingSign.setBackground(new Color(240, 240, 240));
		txtpnByClickingSign.setFont(new Font("Arial", Font.PLAIN, 10));
		txtpnByClickingSign.setText("By clicking Sign Up, you agree to our Terms, Data Policy and Cookies \r\nPolicy. You may receive SMS Notifications from us and can opt out any \r\ntime.");
		txtpnByClickingSign.setBounds(434, 292, 366, 51);
		contentPane.add(txtpnByClickingSign);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FbLogin window = new FbLogin();
				window.frame.setVisible(true);
			}
		});
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 25));
		btnSignUp.setBackground(new Color(0, 128, 255));
		btnSignUp.setBounds(449, 373, 196, 45);
		contentPane.add(btnSignUp);
	}

}
