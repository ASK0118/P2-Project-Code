package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

public class HHome extends JFrame {

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HHome H = new HHome();
					H.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HHome() {
		setType(Type.POPUP);
		setTitle("Home");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 504);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 23, 707, 443);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(205, 133, 63));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HEmployee E = new HEmployee();
		      E.setModalExclusionType(null);
              E.setVisible(true);
              dispose();
			}
		});
		btnEmployee.setBounds(129, 164, 157, 49);
		btnEmployee.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEmployee.setBackground(UIManager.getColor("Button.background"));
		panel.add(btnEmployee);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HFinance f = new HFinance();
		      f.setModalExclusionType(null);
              f.setVisible(true);
              dispose();
			}
		});
		btnFinance.setBounds(412, 164, 157, 49);
		btnFinance.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnFinance.setBackground(UIManager.getColor("Button.background"));
		panel.add(btnFinance);
		
		JButton btnAdvertisement = new JButton("Advertisement");
		btnAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HAdminAdvertisementNMarketing HANM = new HAdminAdvertisementNMarketing();
		      HANM.setModalExclusionType(null);
              HANM.setVisible(true);
              dispose();
			}
		});
		btnAdvertisement.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnAdvertisement.setBackground(UIManager.getColor("Button.background"));
		btnAdvertisement.setBounds(223, 277, 234, 49);
		panel.add(btnAdvertisement);
		
		JLabel lblNewLabel = new JLabel("MAIN MENU");
		lblNewLabel.setBounds(234, 59, 234, 65);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(UIManager.getColor("Button.background"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Homepage", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBackground(Color.MAGENTA);
		btnExit.setBounds(265, 372, 157, 49);
		panel.add(btnExit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 707, 24);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_Home = new JMenu("Home");
		menuBar.add(mnNewMenu_Home);
		
		JMenuItem mntmNewMenuItem_Aboutus = new JMenuItem("About Us");
		mntmNewMenuItem_Aboutus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HAdminCompanyBackground AB = new HAdminCompanyBackground();
		      AB.setModalExclusionType(null);
              AB.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_Home.add(mntmNewMenuItem_Aboutus);
		
		JMenuItem mntmNewMenuItem_Logout = new JMenuItem("Log Out");
		mntmNewMenuItem_Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HLogin L = new HLogin();
		      L.setModalExclusionType(null);
              L.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_Home.add(mntmNewMenuItem_Logout);
		
		JMenu mnNewMenu_productDescription = new JMenu("Product Description");
		mnNewMenu_productDescription.setBackground(SystemColor.desktop);
		menuBar.add(mnNewMenu_productDescription);
		
		JMenuItem mntmAuthenticHomestay = new JMenuItem("Authentic Homestay");
		mntmAuthenticHomestay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HAdminAuthenticHomestay AA = new HAdminAuthenticHomestay();
		      AA.setModalExclusionType(null);
              AA.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_productDescription.add(mntmAuthenticHomestay);
		
		JMenuItem mntmComfortableHomestay = new JMenuItem("Comfortable Homestay");
		mntmComfortableHomestay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HAdminComfortableHomestay AC = new HAdminComfortableHomestay();
		      AC.setModalExclusionType(null);
              AC.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_productDescription.add(mntmComfortableHomestay);
		
		JMenuItem mntmTouristHomestay = new JMenuItem("Tourist Homestay");
		mntmTouristHomestay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HAdminTouristHomestay AT = new HAdminTouristHomestay();
		      AT.setModalExclusionType(null);
              AT.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_productDescription.add(mntmTouristHomestay);
		
	}
}