package finalExam;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Choice;

@SuppressWarnings("serial")
public class Password extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password frame = new Password();
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
	public Password() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find your account");
		lblNewLabel.setBounds(163, 83, 247, 50);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 28));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter your email or mobile number to search for your account.");
		lblNewLabel_1.setBounds(127, 131, 388, 37);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("facebook");
		lblNewLabel_2.setBounds(10, 0, 192, 80);
		lblNewLabel_2.setForeground(new Color(0, 128, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 40));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email or mobile number");
		lblNewLabel_2_1.setBounds(137, 170, 169, 30);
		lblNewLabel_2_1.setForeground(new Color(226, 226, 226));
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(127, 161, 376, 51);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setColumns(10);
		contentPane.add(textField);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FbLogin window = new FbLogin();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(275, 222, 106, 43);
		btnNewButton_1.setForeground(new Color(64, 64, 64));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Search\r\n");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Reset frame = new Reset();
				frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(391, 222, 106, 43);
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(new Color(0, 128, 255));
		contentPane.add(btnNewButton_1_1);
		
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


