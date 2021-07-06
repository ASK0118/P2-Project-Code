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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;

public class WedCustLogin extends JFrame {

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
					WedCustLogin frame = new WedCustLogin();
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
	public WedCustLogin() {
		setTitle("Romance Wedding - Customer Login Session");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 204, 255)));
		panel.setBounds(10, 0, 705, 528);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 204, 255)));
		panel_1.setBounds(199, 27, 279, 51);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Login");
		lblNewLabel.setBounds(69, 10, 200, 31);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnNewButton.setBounds(199, 407, 137, 37);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = WedRegistration.getTable();
				String un;
				String pw;
				boolean login = false;
				
				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						un = String.valueOf(t.getValueAt(i, 0));
						pw = String.valueOf(t.getValueAt(i, 1));
						
						if(textField.getText().equals(un) && passwordField.getText().equals(pw)) {
							login = true;
						}
					}
					
					if(login == true) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						WedCustAds ca = new WedCustAds();
						ca.setModalExclusionType(null);
						ca.setVisible(true);
						dispose();
					}
					else 
						JOptionPane.showMessageDialog(null, "Login unsuccessful!", "Error", JOptionPane.ERROR_MESSAGE);
						
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USERNAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedRegistration reg = new WedRegistration();
				reg.setModalExclusionType(null);
	            reg.setVisible(true);
			}
		});
		btnRegister.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnRegister.setBounds(378, 407, 137, 37);
		panel.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnReset.setBounds(27, 407, 137, 37);
		panel.add(btnReset);		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				passwordField.setText("");
			}
		});
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		textField.setBounds(186, 165, 272, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(204, 204, 255)));
		panel_2.setBounds(42, 165, 122, 42);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(10, 10, 111, 26);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(204, 204, 255)));
		panel_2_1.setBounds(42, 253, 122, 42);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(10, 10, 111, 26);
		panel_2_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		passwordField.setBounds(186, 253, 272, 42);
		panel.add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("hide/show password");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBounds(199, 312, 137, 21);
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
		btnExit.setBounds(545, 407, 137, 37);
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
