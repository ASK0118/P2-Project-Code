package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;

public class WedHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedHomePage frame = new WedHomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public void openWebPage(String url){
			try {         
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
			}
			catch (java.io.IOException e) {
				System.out.println(e.getMessage());
				}
	}
	/**
	 * Create the frame.
	 */
	public WedHomePage() {
		setTitle("Romance Wedding - Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 228, 225)));
		panel.setBounds(10, 10, 688, 521);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MAINMENU MM = new MAINMENU();
				MM.setModalExclusionType(null);
				MM.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(10, 50, 99, 55);
		panel.add(btnBack);
		
		JButton btnNewButton_1 = new JButton("Facebook Link: https://www.facebook.com/theweddingseasonz/");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_1.setBounds(10, 490, 668, 21);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            openWebPage("https://www.facebook.com/theweddingseasonz/");
		        }
		});
		
		JButton btnClientsLogin = new JButton("Clients Login");
		btnClientsLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnClientsLogin.setBounds(292, 314, 120, 34);
		panel.add(btnClientsLogin);
		btnClientsLogin.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseClicked(java.awt.event.MouseEvent btnClientsLogin) {
	        	dispose();
				WedCustLogin custL = new WedCustLogin();
				custL.setModalExclusionType(null);
	            custL.setVisible(true);	
	        }
		});
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnSignUp.setBounds(430, 314, 95, 34);
		panel.add(btnSignUp);
		btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseClicked(java.awt.event.MouseEvent btnSignUp) {
	        	dispose();
				WedRegistration reg = new WedRegistration();
				reg.setModalExclusionType(null);
	            reg.setVisible(true);	
	        }
		});
		
		JButton btnNewButton = new JButton("Admin Login");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton.setBounds(161, 314, 120, 34);
		panel.add(btnNewButton);
		btnNewButton.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseClicked(java.awt.event.MouseEvent btnNewButton) {
	        	dispose();
				WedAdminLogin wedL = new WedAdminLogin();
				wedL.setModalExclusionType(null);
	            wedL.setVisible(true);	
	        }
		});
		
		JLabel lblNewLabel_2 = new JLabel("ROMANCE WEDDING");
		lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
		lblNewLabel_2.setForeground(new Color(153, 0, 255));
		lblNewLabel_2.setBounds(170, 218, 377, 64);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\image4.jpg"));
		lblNewLabel.setBounds(10, 50, 668, 461);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 668, 34);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 668, 34);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		mnNewMenu.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseClicked(java.awt.event.MouseEvent mnNewMenu) {
	        	dispose();
				WedHomePage hP = new WedHomePage();
				hP.setModalExclusionType(null);
	            hP.setVisible(true);	
	        }
		});

		
		JMenu mnNewMenu_3 = new JMenu("Wedding Packages");
		menuBar.add(mnNewMenu_3);
		mnNewMenu_3.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseClicked(java.awt.event.MouseEvent mnNewMenu_3) {
	        	dispose();
				WedCustPackage wP = new WedCustPackage();
				wP.setModalExclusionType(null);
	            wP.setVisible(true);	
	        }
		});
		
		JMenu mnNewMenu_2 = new JMenu("Promotions");
		menuBar.add(mnNewMenu_2);
		mnNewMenu_2.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseClicked(java.awt.event.MouseEvent mnNewMenu_3) {
	        	dispose();
				WedCustAds ca = new WedCustAds();
				ca.setModalExclusionType(null);
	            ca.setVisible(true);	
	        }
		});
		
		JMenu mnNewMenu_1 = new JMenu("About Us");
		menuBar.add(mnNewMenu_1);
		mnNewMenu_1.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseClicked(java.awt.event.MouseEvent mnNewMenu_1) {
	        	dispose();
				WedCustCompanyBackground c = new WedCustCompanyBackground();
				c.setModalExclusionType(null);
	            c.setVisible(true);	
	        }
		});
		
		
	}
}
