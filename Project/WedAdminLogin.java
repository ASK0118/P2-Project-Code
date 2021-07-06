package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class WedAdminLogin extends JFrame {

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
					WedAdminLogin frame = new WedAdminLogin();
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
	public WedAdminLogin() {
		setTitle("Romance Wedding - Admin Login Session");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 204, 255)));
		panel.setBounds(10, 10, 695, 518);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		panel_1.setBounds(215, 25, 245, 47);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setBounds(66, 10, 129, 29);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(51, 153, 255)));
		panel_2.setBounds(37, 162, 122, 42);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 10, 111, 26);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 153, 255)));
		panel_2_1.setBounds(37, 266, 122, 42);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 10, 111, 26);
		panel_2_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBounds(215, 162, 272, 42);
		panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		passwordField.setBounds(215, 266, 272, 42);
		panel.add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("hide/show password");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBounds(215, 324, 137, 21);
		panel.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('0');
				}
			}
		});
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnNewButton.setBounds(281, 418, 137, 37);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(textField.getText().equals("KerYing")&& passwordField.getText().equals("ky127")) { 
						JOptionPane.showMessageDialog(null, "Login Succesfull");
					dispose();
					WedEmployee emp = new WedEmployee();
					emp.setModalExclusionType(null);
		            emp.setVisible(true);}
					else {
						JOptionPane.showMessageDialog(null, "Login Unsuccesfull");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right username and password");
				}
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnReset.setBounds(56, 418, 137, 37);
		panel.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		
		JButton btnNewButton_1 = new JButton("< Back");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(615, 10, 70, 31);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedHomePage hP = new WedHomePage();
				hP.setModalExclusionType(null);
	            hP.setVisible(true);	
				
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnExit.setBounds(511, 418, 137, 37);
		panel.add(btnExit);		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exit = JOptionPane.showConfirmDialog(null, "Do you want to exit ?", "Exit", JOptionPane.YES_NO_OPTION);
				if (exit == JOptionPane.YES_OPTION) {
				dispose();
					
				}
			}
		});
	}
}