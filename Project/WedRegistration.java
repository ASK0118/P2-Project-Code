package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class WedRegistration extends JFrame {

	private JPanel contentPane;
	static JTable table;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedRegistration frame = new WedRegistration();
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
	public WedRegistration() {
		setTitle("Romance Wedding - New Customer Register Session");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 204, 255)));
		panel.setBounds(10, 10, 874, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 204, 255)));
		panel_1.setBounds(211, 22, 446, 56);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Customer Registeration");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(88, 10, 272, 38);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 204, 255)));
		panel_2.setBounds(31, 101, 310, 347);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 23, 81, 22);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 66, 81, 22);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 111, 81, 22);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("State");
		lblNewLabel_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(10, 159, 81, 22);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Contact No.");
		lblNewLabel_1_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setBounds(10, 207, 92, 22);
		panel_2.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Create Password");
		lblNewLabel_1_2_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_3.setBounds(10, 246, 131, 22);
		panel_2.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Confirm Password");
		lblNewLabel_1_2_3_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_3_1.setBounds(10, 290, 131, 22);
		panel_2.add(lblNewLabel_1_2_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(144, 23, 142, 23);
		panel_2.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(144, 292, 142, 23);
		panel_2.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField_1.setBounds(144, 248, 142, 23);
		panel_2.add(passwordField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(144, 207, 142, 23);
		panel_2.add(textField_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		spinner.setBounds(144, 70, 142, 20);
		panel_2.add(spinner);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(141, 320, 145, 21);
		panel_2.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
					passwordField_1.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('0');
					passwordField_1.setEchoChar('0');
				}
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox.setBounds(144, 114, 142, 21);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select State", "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Sabah", "Sarawak", "Selangor", "Terengganu"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(144, 162, 142, 21);
		panel_2.add(comboBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 204, 255)));
		panel_3.setBounds(380, 101, 459, 318);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(10, 10, 439, 245);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Password"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton tglbtnUpload = new JButton("Upload");
		tglbtnUpload.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		tglbtnUpload.setBounds(256, 275, 115, 33);
		panel_3.add(tglbtnUpload);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(92, 275, 115, 33);
		panel_3.add(btnUpdate);
		btnUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textField.getText(),i,0);
			    	model.setValueAt(passwordField.getText(),i,1);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		tglbtnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Project\\WedNewCustomerRegistration.txt");
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
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
			
		JButton tglbtnReset = new JButton("Reset");
		tglbtnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		tglbtnReset.setBounds(226, 477, 115, 33);
		panel.add(tglbtnReset);
		tglbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				spinner.setValue(0);
				textField_2.setText("");
				comboBox.setSelectedItem("Select Gender");
				comboBox_1.setSelectedItem("Select State");
				passwordField.setText("");
				passwordField_1.setText("");
				
			}
		});
		
		JButton tglbtnPrint = new JButton("Print");
		tglbtnPrint.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		tglbtnPrint.setBounds(388, 477, 115, 33);
		panel.add(tglbtnPrint);
		tglbtnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		
		JButton tglbtnDelete = new JButton("Delete");
		tglbtnDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		tglbtnDelete.setBounds(557, 477, 115, 33);
		panel.add(tglbtnDelete);
		tglbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"New Customer Registeration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"New Customer Registeration", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		
		JToggleButton tglbtnExit = new JToggleButton("Login");
		tglbtnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		tglbtnExit.setBounds(724, 477, 115, 33);
		panel.add(tglbtnExit);
		tglbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedCustLogin hP = new WedCustLogin();
				hP.setModalExclusionType(null);
	            hP.setVisible(true);
				
			}
		});
		
		
		
		JButton btnNewButton_1_1 = new JButton("Exit >");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(794, 10, 70, 31);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exit = JOptionPane.showConfirmDialog(null, "Do you want to exit ?", "Exit",JOptionPane.YES_NO_OPTION);
				if (exit == JOptionPane.YES_OPTION) {
				dispose();
				WedHomePage hP = new WedHomePage();
				hP.setModalExclusionType(null);
	            hP.setVisible(true);
				}
			}
		});
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnAddRecord.setBounds(30, 477, 144, 33);
		panel.add(btnAddRecord);
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				Object age = spinner.getValue();
				String gender = (String) comboBox.getSelectedItem();
				String state = (String) comboBox_1.getSelectedItem();
				String pnum = textField_2.getText();
				String pass = passwordField.getText();
				String Cpass = passwordField_1.getText();
	
				if(username.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Username", "Registration Unsuccessful",
							JOptionPane.OK_OPTION);}
				else if(age.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Age", "Registration Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(gender.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Select Gender", "Registration Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(state.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Select State", "Registration Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(pnum.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Contact Number", "Registration Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(pass.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Password", "Registration Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(!Cpass.equals(pass)) {
					JOptionPane.showMessageDialog(null, "Please Enter Same Password", "Registration Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[]{
						textField.getText(),
						passwordField.getText(),
				});
						JOptionPane.showMessageDialog(null, "Registration Successful");
						}
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information Update Confirmation", "New Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
				
				}
			}
	);}
		public static void AddRowToJtable(Object [] dataRow) {
			DefaultTableModel model = (DefaultTableModel)getTable().getModel();
			model.addRow(dataRow);
		}

		public static JTable getTable() {
			return table;
		}

		public void setTable(JTable table) {
			WedRegistration.table = table;
		}
}