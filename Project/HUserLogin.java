package Project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HUserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_username;
	private JTextField textField_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HUserLogin UL = new HUserLogin();
					UL.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HUserLogin() {
		setTitle("User Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 853, 428);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(74, 10, 654, 81);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(193, 10, 357, 61);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(74, 118, 211, 57);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblUsername.setBounds(48, 10, 118, 37);
		panel_2.add(lblUsername);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.CYAN);
		panel_2_1.setBounds(74, 199, 211, 57);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPassword.setBounds(44, 10, 142, 37);
		panel_2_1.add(lblPassword);
		
		textField_username = new JTextField();
		textField_username.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_username.setBounds(354, 118, 185, 57);
		panel.add(textField_username);
		textField_username.setColumns(10);
		
		textField_password = new JTextField();
		textField_password.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_password.setColumns(10);
		textField_password.setBounds(354, 199, 185, 57);
		panel.add(textField_password);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectHomestayRentalImage\\2537292-200.png"));
		lblNewLabel_3.setBounds(604, 101, 211, 176);
		panel.add(lblNewLabel_3);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_username.setText("");
				textField_password.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(74, 283, 138, 44);
		panel.add(btnReset);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = HUserReg.getTable();
				String un;
				String pw;
				boolean login = false;
				
				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						un = String.valueOf(t.getValueAt(i, 0));
						pw = String.valueOf(t.getValueAt(i, 1));
						
						if(textField_username.getText().equals(un) && textField_password.getText().equals(pw)) {
							login = true;
						}
					}
					
					if(login == true) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						HCustomer C = new HCustomer();
						C.setModalExclusionType(null);
						C.setVisible(true);
						dispose();
					}
					else 
						JOptionPane.showMessageDialog(null, "Login unsuccessful!", "Error", JOptionPane.ERROR_MESSAGE);
						
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			});

		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(273, 283, 138, 44);
		panel.add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		    HUserReg UR = new HUserReg();
		    UR.setModalExclusionType(null);
		    UR.setVisible(true);
		    dispose();
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegister.setBounds(464, 283, 138, 44);
		panel.add(btnRegister);
	}
}
