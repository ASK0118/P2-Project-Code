package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HAdminTouristHomestay extends JFrame {

	private JPanel contentPane;
	private JTextField textField_price;
	public static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HAdminTouristHomestay AT = new HAdminTouristHomestay();
					AT.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HAdminTouristHomestay() {
		setTitle("Tourist Homestay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 830, 745);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tourist Homestay");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(249, 10, 412, 70);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectHomestayRentalImage\\567564_16100420150047369808.jpg"));
		lblNewLabel_1.setBounds(78, 74, 677, 280);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(67, 376, 688, 312);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Size");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(22, 10, 73, 43);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(463, 10, 4, 292);
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
		
		JLabel lblNewLabel_3 = new JLabel("Medium");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(532, 10, 89, 43);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Yes");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(553, 55, 43, 43);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Yes");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(553, 108, 43, 43);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Yes");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_2.setBounds(553, 161, 43, 43);
		panel_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("4.0 Stars");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_3.setBounds(532, 216, 101, 43);
		panel_1.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Price per day (RM)");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(22, 259, 431, 43);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		textField_price = new JTextField();
		textField_price.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_price.setBounds(532, 259, 101, 43);
		panel_1.add(textField_price);
		textField_price.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HHome H = new HHome();
		      H.setModalExclusionType(null);
              H.setVisible(true);
              dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(706, 10, 114, 43);
		panel.add(btnBack);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(771, 252, -3, -3);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = textField_price.getText();
				
				if(p.equals(""))
					JOptionPane.showMessageDialog(null, "Price is empty\nPlease fill it!!");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Price is confirmed");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
							textField_price.getText(),
									
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Price confirmed", "Tourist Homestay",
								JOptionPane.OK_OPTION);
					}
				}
			}
			}
			});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConfirm.setBounds(565, 698, 149, 37);
		panel.add(btnConfirm);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		HAdminTouristHomestay.table = table;
	}

}