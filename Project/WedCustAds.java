package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WedCustAds extends JFrame {

	private JPanel contentPane;
	public JTextField discText;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedCustAds frame = new WedCustAds();
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
	public WedCustAds() {
		setTitle("Romance Wedding - Advertisement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(240, 128, 128)));
		panel.setBounds(10, 10, 605, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 153, 153)));
		panel_1.setBounds(66, 47, 466, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("!! Cheapest Wedding Gown and Suit Rental Here !! ");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNewLabel.setBounds(24, 8, 446, 35);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 134, 585, 168);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\image3.jpg"));
		lblNewLabel_2.setBounds(-64, 0, 231, 168);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\image5.jpg"));
		lblNewLabel_6.setBounds(168, 0, 154, 168);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\image6.jpg"));
		lblNewLabel_7.setBounds(305, 0, 172, 198);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\image7.jpg"));
		lblNewLabel_8.setBounds(444, 0, 141, 168);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("Get Up To ");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_4.setBounds(66, 405, 102, 31);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("* Terms and Condition Apply *");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(213, 446, 221, 22);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("< Back");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(413, 10, 77, 31);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedHomePage h = new WedHomePage();
				h.setModalExclusionType(null);
	            h.setVisible(true);		
			}
		});

		JLabel lblNewLabel_4_1 = new JLabel("% Discount For Offered Package Now !!!");
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(213, 405, 361, 31);
		panel.add(lblNewLabel_4_1);
		
		discText = new JTextField();
		discText.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		discText.setForeground(Color.RED);
		discText.setBounds(166, 405, 37, 30);
		panel.add(discText);
		discText.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("!! This Month Promotion !!");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_1.setBounds(172, 345, 262, 31);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = WedAdminAds.getTable();
				String promo;
				boolean a = false;
				
				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						promo = String.valueOf(t.getValueAt(i, 0));
						int dis = Integer.parseInt(promo);

							if(promo != null) {
								a = true;
							}
					
							if(a == true) {
							String disc = String.valueOf(dis);
							discText.setText(disc);
							}
					}
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		JButton btnContinue = new JButton("Continue >");
		btnContinue.setForeground(Color.BLACK);
		btnContinue.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnContinue.setBackground(Color.RED);
		btnContinue.setBounds(500, 10, 95, 31);
		panel.add(btnContinue);
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedCustPackage h = new WedCustPackage();
				h.setModalExclusionType(null);
	            h.setVisible(true);		
			}
		});
		
	
	}
}