package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;

public class WedAdminComBackground extends JFrame{

	private JPanel contentPane;
	private JTextField contact;
	private JTextField web;
	public static JTable table;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedAdminComBackground frame = new WedAdminComBackground();
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
	public WedAdminComBackground() {
		setTitle("Romance Wedding - Company Background (Administration)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 153, 255)));
		panel.setBounds(10, 10, 875, 570);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 204, 255)));
		panel_1.setBounds(187, 38, 468, 68);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Company Background");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(117, 14, 254, 37);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 204, 255)));
		panel_2.setBounds(49, 128, 377, 47);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("To love, laughter, and happily ever after");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(22, 10, 344, 27);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(20, 185, 450, 131);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 430, 111);
		panel_3.add(scrollPane);
		
		JTextPane txtpnGrabTheBest = new JTextPane();
		scrollPane.setViewportView(txtpnGrabTheBest);
		txtpnGrabTheBest.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtpnGrabTheBest.setText("Romance Wedding is a Malaysian wedding rental company.\r\n\r\nWhy the name of Romance Wedding? What does it really mean?\r\n\r\nThe company is carried with the mission to serve more of our clients. We aimed to bring the best and romantic memories to our clients.\r\n \r\nGrab the BEST wedding rental services at ROMANCE WEDDING !!!\r\nServices provided:\r\n- Wedding Gown Rental (without photography session)\r\n- Wedding Suit Rental (without photography session)\r\n- Wedding Rental Packages");
		txtpnGrabTheBest.setBackground(UIManager.getColor("CheckBox.background"));
		txtpnGrabTheBest.setCaretPosition(0);
		txtpnGrabTheBest.setEditable(false);
		
		JButton btnNewButton = new JButton("< Back");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(795, 10, 70, 31);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedEmployee em = new WedEmployee();
				em.setModalExclusionType(null);
	            em.setVisible(true);		
			}
		});
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 204, 255)));
		panel_4.setBounds(30, 334, 170, 31);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("CONTACT US");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(25, 5, 195, 23);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact No : ");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(30, 386, 125, 20);
		panel.add(lblNewLabel_4);
		
		contact = new JTextField();
		contact.setBounds(165, 384, 305, 31);
		panel.add(contact);
		contact.setColumns(10);
		contact.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JLabel lblNewLabel_4_1 = new JLabel("Address :");
		lblNewLabel_4_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(30, 433, 125, 20);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Website : ");
		lblNewLabel_4_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_4_1_1.setBounds(30, 510, 125, 20);
		panel.add(lblNewLabel_4_1_1);
		
		web = new JTextField();
		web.setColumns(10);
		web.setBounds(165, 507, 305, 31);
		panel.add(web);
		web.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(165, 435, 305, 55);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 305, 55);
		panel_5.add(scrollPane_2);
		
		JTextArea address = new JTextArea();
		scrollPane_2.setViewportView(address);
		address.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		address.setWrapStyleWord(true);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contact.setText("");
				address.setText("");
				web.setText("");
			}
		});
		reset.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		reset.setBounds(698, 457, 104, 31);
		panel.add(reset);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						contact.getText(),
						address.getText(),
						web.getText(),
						
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information Update Confirmation", "New Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
				try {
					File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Project\\WedAdminComBackground.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnAdd.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnAdd.setBounds(543, 457, 104, 31);
		panel.add(btnAdd);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(520, 143, 317, 304);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 317, 304);
		panel_6.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Contact No", "Address", "Website"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnDelete.setBounds(543, 505, 104, 31);
		panel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Admin Company Background", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Admin Company Background", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
			}
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnExit.setBounds(698, 507, 104, 31);
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exit = JOptionPane.showConfirmDialog(null, "Do you want to exit ?", "Exit",JOptionPane.YES_NO_OPTION);
				if (exit == JOptionPane.YES_OPTION) {
				WedHomePage h = new WedHomePage();
				dispose();
				h.setModalExclusionType(null);
				h.setVisible(true);
			}
			}
		});
		
		
	
	}
	public static void AddRowToJtable(Object [] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		WedAdminComBackground.table = table;
	}

}
