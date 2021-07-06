package Project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;

public class HComfortableHomestay extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField_price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HComfortableHomestay CH = new HComfortableHomestay();
					CH.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HComfortableHomestay() {
		setTitle("Comfortable Homestay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 830, 704);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Comfortable Homestay");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(227, 10, 412, 70);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectHomestayRentalImage\\photo_27377104.jpg"));
		lblNewLabel_1.setBounds(129, 76, 561, 280);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(43, 379, 688, 311);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Size");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(22, 10, 73, 43);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(463, 10, 4, 291);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Does the homestay prepare meals");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(22, 55, 342, 43);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Does the homestay has 24 hours security");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(22, 108, 431, 43);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Rate of Homestay");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(22, 216, 431, 43);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Does the homestay has WIFI");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_2.setBounds(22, 163, 431, 43);
		panel_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Large");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(541, 10, 80, 43);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Yes");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(553, 55, 43, 43);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("No");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(553, 108, 33, 43);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Yes");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_2.setBounds(553, 161, 43, 43);
		panel_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("4.5 Stars");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_3.setBounds(530, 216, 100, 43);
		panel_1.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Price per day (RM)");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(22, 258, 431, 43);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		textField_price = new JTextField();
		JTable t = HAdminComfortableHomestay.getTable();
		String price = "";
		for(int i = 0; i<t.getRowCount(); i++) {
			price = String.valueOf(t.getValueAt(i, 0));
		}
		textField_price.setText(price);
		textField_price.setEditable(false);
		textField_price.setBackground(Color.CYAN);
		textField_price.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_price.setBounds(525, 258, 96, 43);
		panel_1.add(textField_price);
		textField_price.setColumns(10);
		
		JButton btnBack= new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		       HCustomer C = new HCustomer();
		       C.setModalExclusionType(null);
               C.setVisible(true);
               dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(706, 10, 114, 43);
		panel.add(btnBack);
	
	}
}
