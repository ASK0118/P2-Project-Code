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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class WedCustPackage extends JFrame {

	private JPanel contentPane;
	JTextArea textArea;
	JTextField priceTextField;
	private JTextField gowntext;
	private JTextField suittext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedCustPackage frame = new WedCustPackage();
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
	public WedCustPackage() {
		setTitle("Romance Wedding - Wedding Package Description");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(221, 160, 221)));
		panel.setBounds(10, 10, 705, 518);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox photocombo = new JComboBox();
		photocombo.setForeground(Color.BLACK);
		photocombo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		photocombo.setModel(new DefaultComboBoxModel(new String[] {"Select", "Included", "Not Included"}));
		photocombo.setBackground(new Color(153, 204, 255));
		photocombo.setBounds(209, 338, 176, 30);
		panel.add(photocombo);
		
		JPanel packagePanel_2_1_1 = new JPanel();
		packagePanel_2_1_1.setLayout(null);
		packagePanel_2_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel_2_1_1.setBounds(24, 338, 168, 30);
		panel.add(packagePanel_2_1_1);
		
		JLabel packageLabel_2_1_1 = new JLabel("Photoshooting");
		packageLabel_2_1_1.setForeground(new Color(0, 0, 153));
		packageLabel_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel_2_1_1.setBounds(10, 0, 137, 28);
		packagePanel_2_1_1.add(packageLabel_2_1_1);
		
		JComboBox jewelrycombo = new JComboBox();
		jewelrycombo.setForeground(Color.BLACK);
		jewelrycombo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		jewelrycombo.setModel(new DefaultComboBoxModel(new String[] {"Select", "Included", "Not Included"}));
		jewelrycombo.setBackground(new Color(153, 204, 255));
		jewelrycombo.setBounds(209, 286, 176, 30);
		panel.add(jewelrycombo);
		
		JPanel packagePanel_2_1 = new JPanel();
		packagePanel_2_1.setLayout(null);
		packagePanel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel_2_1.setBounds(24, 286, 168, 30);
		panel.add(packagePanel_2_1);
		
		JLabel packageLabel_2_1 = new JLabel("Jewelry Set");
		packageLabel_2_1.setForeground(new Color(0, 0, 153));
		packageLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel_2_1.setBounds(10, 0, 137, 28);
		packagePanel_2_1.add(packageLabel_2_1);
		
		suittext = new JTextField();
		suittext.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		suittext.setColumns(10);
		suittext.setBounds(209, 230, 176, 30);
		panel.add(suittext);
		
		JPanel packagePanel_2 = new JPanel();
		packagePanel_2.setLayout(null);
		packagePanel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel_2.setBounds(24, 230, 168, 30);
		panel.add(packagePanel_2);
		
		JLabel packageLabel_2 = new JLabel("Wedding Suit");
		packageLabel_2.setForeground(new Color(0, 0, 153));
		packageLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel_2.setBounds(10, 0, 137, 28);
		packagePanel_2.add(packageLabel_2);
		
		gowntext = new JTextField();
		gowntext.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		gowntext.setColumns(10);
		gowntext.setBounds(209, 175, 176, 30);
		panel.add(gowntext);
		
		JPanel packagePanel_1 = new JPanel();
		packagePanel_1.setLayout(null);
		packagePanel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel_1.setBounds(24, 175, 168, 30);
		panel.add(packagePanel_1);
		
		JLabel packageLabel_1 = new JLabel("Wedding Gown");
		packageLabel_1.setForeground(new Color(0, 0, 153));
		packageLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel_1.setBounds(10, 0, 157, 28);
		packagePanel_1.add(packageLabel_1);
		
		JComboBox comboBoxPackage = new JComboBox();
		comboBoxPackage.setForeground(Color.BLACK);
		comboBoxPackage.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		comboBoxPackage.setModel(new DefaultComboBoxModel(new String[] {"Select Package", "Package 1", "Package 2", "Package 3", "Premium Package"}));
		comboBoxPackage.setBackground(new Color(153, 204, 255));
		comboBoxPackage.setBounds(209, 116, 176, 30);
		panel.add(comboBoxPackage);
		comboBoxPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = WedAdminPack.getTable();
				String pack;
				String g;
				String s;
				String j;
				String photo;
				String price;
				boolean option = false;

				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						pack = String.valueOf(t.getValueAt(i, 0));
						g = String.valueOf(t.getValueAt(i, 1));
						s = String.valueOf(t.getValueAt(i, 2));
						j = String.valueOf(t.getValueAt(i, 3));
						photo = String.valueOf(t.getValueAt(i, 4));
						price = String.valueOf(t.getValueAt(i, 5));
						
						if(t != null) {
							option = true;
							if(comboBoxPackage.getSelectedItem().equals(pack)) {
								gowntext.setText(g);
								suittext.setText(s);
								jewelrycombo.setSelectedItem(j);
								photocombo.setSelectedItem(photo);
								priceTextField.setText(price);
							}
							else if(comboBoxPackage.getSelectedItem().equals(pack)) {
								gowntext.setText(g);
								suittext.setText(s);
								jewelrycombo.setSelectedItem(j);
								photocombo.setSelectedItem(photo);
								priceTextField.setText(price);
							}
							else if(comboBoxPackage.getSelectedItem().equals(pack)) {
								gowntext.setText(g);
								suittext.setText(s);
								jewelrycombo.setSelectedItem(j);
								photocombo.setSelectedItem(photo);
								priceTextField.setText(price);
							}
							else if(comboBoxPackage.getSelectedItem().equals(pack)) {
								gowntext.setText(g);
								suittext.setText(s);
								jewelrycombo.setSelectedItem(j);
								photocombo.setSelectedItem(photo);
								priceTextField.setText(price);
							}
							
						}
					}
						
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		
		JPanel packagePricePanel = new JPanel();
		packagePricePanel.setLayout(null);
		packagePricePanel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePricePanel.setBounds(24, 383, 147, 30);
		panel.add(packagePricePanel);
		
		JLabel packagePrice = new JLabel("Price (RM)");
		packagePrice.setForeground(new Color(0, 0, 153));
		packagePrice.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packagePrice.setBounds(14, 0, 194, 28);
		packagePricePanel.add(packagePrice);
		
		JButton btnNewButton_1 = new JButton("< Back");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBackground(new Color(153, 204, 255));
		btnNewButton_1.setBounds(625, 10, 70, 31);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedHomePage h = new WedHomePage();
				h.setModalExclusionType(null);
	            h.setVisible(true);		
			}
		});
		
		JButton btnNewButton = new JButton("Grab Your Package Now !!!");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnNewButton.setBounds(209, 449, 251, 30);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedCustomerBilling cust = new WedCustomerBilling();
				cust.setModalExclusionType(null);
	            cust.setVisible(true);		
			}
		});
		
		
		priceTextField = new JTextField();
		priceTextField.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		priceTextField.setBounds(209, 383, 176, 30);
		panel.add(priceTextField);
		priceTextField.setColumns(10);
		
		JPanel packagePanel = new JPanel();
		packagePanel.setLayout(null);
		packagePanel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel.setBounds(24, 116, 147, 30);
		panel.add(packagePanel);
		
		JLabel packageLabel = new JLabel("Package");
		packageLabel.setForeground(new Color(0, 0, 153));
		packageLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel.setBounds(30, 0, 127, 28);
		packagePanel.add(packageLabel);
		
		JLabel lblNewLabel = new JLabel("Wedding Package Description");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(166, 40, 406, 43);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		
		JLabel lblNewLabel_1 = new JLabel("Wedding Package Description");
		lblNewLabel_1.setForeground(new Color(0, 0, 153));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblNewLabel_1.setBounds(170, 40, 396, 43);
		panel.add(lblNewLabel_1);
		
		JLabel Background = new JLabel("");
		Background.setForeground(new Color(51, 0, 153));
		Background.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\pexels-photo-2788494.jpeg"));
		Background.setBounds(-71, 0, 796, 518);
		panel.add(Background);
	}
}
