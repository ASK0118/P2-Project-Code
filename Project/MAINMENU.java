package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MAINMENU extends JFrame {

	private JPanel contentPane;
	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAINMENU frame = new MAINMENU();
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
	public MAINMENU() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel.setBounds(0, 0, 789, 533);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO RENTAL BUSINESS SYSTEM");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		lblNewLabel.setBounds(88, 63, 610, 86);
		panel.add(lblNewLabel);
		
		JButton btnCar = new JButton("Car Rental");
		btnCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CLogin CL = new CLogin();
				CL.setModalExclusionType(null);
				CL.setVisible(true);
				dispose();
			}
		});
		btnCar.setBackground(Color.GRAY);
		btnCar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCar.setBounds(132, 235, 214, 58);
		panel.add(btnCar);
		
		JButton btnWedding = new JButton("Wedding Rental");
		btnWedding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WedHomePage WHP = new WedHomePage();
				WHP.setModalExclusionType(null);
				WHP.setVisible(true);
				dispose();
			}
		});
		btnWedding.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnWedding.setBackground(Color.GRAY);
		btnWedding.setBounds(437, 235, 214, 58);
		panel.add(btnWedding);
		
		JButton btnHomestay = new JButton("Homestay Rental");
		btnHomestay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HLogin HL = new HLogin();
				HL.setModalExclusionType(null);
				HL.setVisible(true);
				dispose();
			}
		});
		btnHomestay.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHomestay.setBackground(Color.GRAY);
		btnHomestay.setBounds(132, 343, 214, 58);
		panel.add(btnHomestay);
		
		JButton btnClothing = new JButton("Clothing Rental");
		btnClothing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin ll = new LLogin();
				ll.setModalExclusionType(null);
				ll.setVisible(true);
				dispose();
			}
		});
		btnClothing.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClothing.setBackground(Color.GRAY);
		btnClothing.setBounds(437, 343, 214, 58);
		panel.add(btnClothing);
		
		JButton btnStorage = new JButton("Storage Rental");
		btnStorage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SCover SC = new SCover();
				SC.setModalExclusionType(null);
				SC.setVisible(true);
				dispose();
			}
		});
		btnStorage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnStorage.setBackground(Color.GRAY);
		btnStorage.setBounds(294, 434, 205, 58);
		panel.add(btnStorage);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "RENTAL BUSINESS SYSTEM", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(12, 13, 90, 58);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Please choose the business you wanted");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(229, 162, 355, 38);
		panel.add(lblNewLabel_1);
	}
}
