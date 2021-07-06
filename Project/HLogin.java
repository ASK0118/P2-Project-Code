package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;

public class HLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HLogin L = new HLogin();
					L.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HLogin() {
		setTitle("Front");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setForeground(new Color(0, 128, 0));
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(0, 0, 660, 376);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO HOMESTAY HOST CENTRE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(78, 10, 502, 59);
		panel.add(lblNewLabel);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
		      HAdminLogin AL = new HAdminLogin();
		      AL.setModalExclusionType(null);
              AL.setVisible(true);
              dispose();
			}
		});
		btnAdmin.setForeground(new Color(0, 0, 0));
		btnAdmin.setBackground(UIManager.getColor("Button.background"));
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnAdmin.setBounds(78, 255, 149, 45);
		panel.add(btnAdmin);
		
		JButton btnUser = new JButton("USER");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		     HUserLogin UL = new HUserLogin();
		     UL.setModalExclusionType(null);
             UL.setVisible(true);
             dispose();
		   }
		});
		btnUser.setBackground(UIManager.getColor("Button.background"));
		btnUser.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnUser.setBounds(431, 255, 149, 45);
		panel.add(btnUser);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MAINMENU MM = new MAINMENU();
				MM.setModalExclusionType(null);
				MM.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack.setBounds(260, 309, 124, 45);
		panel.add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectHomestayRentalImage\\images.png"));
		lblNewLabel_2.setBounds(153, 82, 322, 156);
		panel.add(lblNewLabel_2);
	}
}
