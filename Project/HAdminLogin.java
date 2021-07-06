package Project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
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

public class HAdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_adminname;
	private JTextField textField_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HAdminLogin AL = new HAdminLogin();
					AL.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HAdminLogin() {
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 128, 0)));
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 788, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 128, 0)));
		panel_1.setBackground(new Color(0, 255, 0));
		panel_1.setBounds(59, 25, 670, 71);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN LOGIN SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(159, 10, 350, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 128, 0)));
		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(59, 126, 172, 53);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbladminname = new JLabel("ADMIN NAME");
		lbladminname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lbladminname.setBounds(10, 10, 152, 33);
		panel_2.add(lbladminname);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 128, 0)));
		panel_2_1.setBackground(Color.GREEN);
		panel_2_1.setBounds(59, 200, 172, 53);
		panel.add(panel_2_1);
		
		JLabel lblpassword = new JLabel("PASSWORD");
		lblpassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblpassword.setBounds(23, 10, 139, 33);
		panel_2_1.add(lblpassword);
		
		textField_adminname = new JTextField();
		textField_adminname.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_adminname.setBounds(291, 126, 181, 53);
		panel.add(textField_adminname);
		textField_adminname.setColumns(10);
		
		textField_password = new JTextField();
		textField_password.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_password.setColumns(10);
		textField_password.setBounds(291, 200, 181, 53);
		panel.add(textField_password);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectHomestayRentalImage\\admin-settings-male.png"));
		lblNewLabel_2.setBounds(533, 106, 209, 231);
		panel.add(lblNewLabel_2);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_adminname.setText("");
				textField_password.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(95, 282, 136, 41);
		panel.add(btnReset);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(textField_adminname.getText().equals("Aaron") && textField_password.getText().equals("abc123")) {
						JOptionPane.showMessageDialog(null, "Login successful.");
					    HHome H = new HHome();
					    H.setModalExclusionType(null);
					    H.setVisible(true);
					    dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Login unsuccessful.");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the correct Admin Name and Password.");
				}
			}
		});

		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(336, 282, 136, 41);
		panel.add(btnLogin);
	}

}