package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Success extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Success frame = new Success();
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
	public Success() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 276);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSuccess = new JLabel("Success!");
		lblSuccess.setFont(new Font("Cambria", Font.BOLD, 30));
		lblSuccess.setBounds(10, 20, 149, 36);
		contentPane.add(lblSuccess);
		
		JTextPane txtpnYourPasswordHas = new JTextPane();
		txtpnYourPasswordHas.setFont(new Font("Arial", Font.PLAIN, 15));
		txtpnYourPasswordHas.setText("Your password has been sucessfully changed.\r\nClick below to sign in.");
		txtpnYourPasswordHas.setBounds(10, 87, 328, 59);
		contentPane.add(txtpnYourPasswordHas);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FbLogin window = new FbLogin();
				window.frame.setVisible(true);
			}
		});
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setFont(new Font("Arial", Font.BOLD, 18));
		btnSignIn.setBackground(new Color(0, 128, 255));
		btnSignIn.setBounds(197, 183, 124, 46);
		contentPane.add(btnSignIn);
	}

}
