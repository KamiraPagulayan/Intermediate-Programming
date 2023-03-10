package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Code2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Code2 frame = new Code2();
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
	public Code2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 311);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterSecurityCode = new JLabel("Enter security code\r\n");
		lblEnterSecurityCode.setBounds(10, 10, 282, 36);
		lblEnterSecurityCode.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblEnterSecurityCode);
		
		JTextPane txtpnPleaseCheckYour_1 = new JTextPane();
		txtpnPleaseCheckYour_1.setText("Please check your email for a message with your code.\r\nYour code is 6 numbers long.");
		txtpnPleaseCheckYour_1.setFont(new Font("Arial", Font.PLAIN, 20));
		txtpnPleaseCheckYour_1.setBounds(10, 56, 561, 65);
		contentPane.add(txtpnPleaseCheckYour_1);
		
		JLabel lblNewLabel = new JLabel("Enter code");
		lblNewLabel.setForeground(new Color(149, 149, 149));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 139, 132, 31);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 131, 253, 52);
		contentPane.add(textField);
		
		JTextPane txtpnWeSentYour = new JTextPane();
		txtpnWeSentYour.setText("We sent your code to:\r\nk****@*******");
		txtpnWeSentYour.setFont(new Font("Arial", Font.PLAIN, 15));
		txtpnWeSentYour.setBounds(315, 131, 225, 52);
		contentPane.add(txtpnWeSentYour);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FbLogin window = new FbLogin();
				window.frame.setVisible(true);
			}
		});
		btnCancel.setForeground(new Color(78, 78, 78));
		btnCancel.setFont(new Font("Arial", Font.BOLD, 18));
		btnCancel.setBounds(315, 207, 124, 46);
		contentPane.add(btnCancel);
		
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
		btnNewButton_1.setBounds(476, 207, 124, 46);
		contentPane.add(btnNewButton_1);
	}

}
