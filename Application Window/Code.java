package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Code extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Code frame = new Code();
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
	public Code() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 314);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterSecurityCode = new JLabel("Enter security code\r\n");
		lblEnterSecurityCode.setBounds(30, 10, 296, 36);
		lblEnterSecurityCode.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblEnterSecurityCode);
		
		JTextPane txtpnPleaseCheckYour = new JTextPane();
		txtpnPleaseCheckYour.setText("Please check your phone for a text  message with your code.\r\nYour code is 6 character long.");
		txtpnPleaseCheckYour.setFont(new Font("Arial", Font.PLAIN, 20));
		txtpnPleaseCheckYour.setBounds(22, 64, 561, 65);
		contentPane.add(txtpnPleaseCheckYour);
		
		JLabel lblNewLabel = new JLabel("Enter code");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(149, 149, 149));
		lblNewLabel.setBounds(44, 149, 132, 31);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(32, 139, 253, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnWeSendYour = new JTextPane();
		txtpnWeSendYour.setFont(new Font("Arial", Font.PLAIN, 15));
		txtpnWeSendYour.setText("We sent your code to:\r\n+123456789");
		txtpnWeSendYour.setBounds(344, 139, 225, 52);
		contentPane.add(txtpnWeSendYour);
		
		JButton btnNewButton_1 = new JButton("Continue");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetNewPass frame = new SetNewPass();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.setBounds(469, 201, 124, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FbLogin window = new FbLogin();
				window.frame.setVisible(true);
			}
		});
		btnCancel.setForeground(new Color(78, 78, 78));
		btnCancel.setFont(new Font("Arial", Font.BOLD, 18));
		btnCancel.setBounds(321, 201, 124, 46);
		contentPane.add(btnCancel);
	}
}
