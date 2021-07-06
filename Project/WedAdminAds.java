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

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WedAdminAds extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static JTable table;
	int disc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedAdminAds frame = new WedAdminAds();
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
	public WedAdminAds() {
		setTitle("Romance Wedding - Admin Control Page (Advertisement)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 709);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(240, 128, 128)));
		panel.setBounds(10, 10, 605, 662);
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
		lblNewLabel_7.setBounds(305, 0, 165, 198);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\image7.jpg"));
		lblNewLabel_8.setBounds(431, 0, 134, 168);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("!! This Month Promotion !! ");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(189, 364, 232, 31);
		panel.add(lblNewLabel_3);
		
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
		btnNewButton.setBounds(514, 10, 70, 31);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedEmployee h = new WedEmployee();
				h.setModalExclusionType(null);
	            h.setVisible(true);		
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.RED);
		textArea.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textArea.setBounds(169, 405, 36, 31);
		panel.add(textArea);

		JLabel lblNewLabel_4_1 = new JLabel("% Discount For Offered Package Now !!!");
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(213, 405, 361, 31);
		panel.add(lblNewLabel_4_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 153, 153)));
		panel_3.setBounds(66, 522, 407, 101);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Discount Given:");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 10, 434, 35);
		panel_3.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		textField.setBounds(10, 51, 149, 35);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		btnNewButton_1.setBounds(237, 37, 92, 35);
		panel_3.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textField.getText(),
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information Update Confirmation", "New Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
				
				for(int i = 0; i <model.getRowCount(); i++) {
				String dis = String.valueOf(model.getValueAt(i,0));
				disc = Integer.parseInt(dis);
				}
				String d = String.valueOf(disc);
				textArea.setText(d);
				
			}
		});
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(407, 446, 1, 1);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 117, 46);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Discount"
			}
		));
		scrollPane.setViewportView(table);
		panel_4.setVisible(false);
		table.setVisible(false);
		scrollPane.setVisible(false);
		
	
		
	}
	
	public static void AddRowToJtable(Object [] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		WedAdminAds.table = table;
	}

}
