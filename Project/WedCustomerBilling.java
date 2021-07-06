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
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import javax.swing.JTextPane;

public class WedCustomerBilling extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField address;
	private JTextField contactNo;
	private JTextField postcode;
	private JTextField totalPayment;
	public static JTable table;
	private JTextField rentalPeriod;
	private JTextField date;
	double total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedCustomerBilling frame = new WedCustomerBilling();
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
	public WedCustomerBilling() {
		DecimalFormat df = new DecimalFormat("0.00");
		
		setTitle("Romance Wedding - Customer Billing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 255)));
		panel.setBounds(10, 10, 882, 601);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 204, 255)));
		panel_1.setBounds(270, 10, 375, 51);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel custBillingLabel = new JLabel("Customer Billing System");
		custBillingLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		custBillingLabel.setBounds(43, 0, 288, 43);
		panel_1.add(custBillingLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 204, 255)));
		panel_2.setBounds(10, 79, 862, 196);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(21, 10, 81, 22);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(21, 55, 81, 22);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(21, 98, 81, 22);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("State");
		lblNewLabel_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(408, 57, 81, 22);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Address");
		lblNewLabel_1_2_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1_1.setBounds(408, 10, 81, 22);
		panel_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Contact No.");
		lblNewLabel_1_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setBounds(21, 151, 92, 22);
		panel_2.add(lblNewLabel_1_2_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(115, 10, 190, 23);
		panel_2.add(textField);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(575, 12, 254, 23);
		panel_2.add(address);
		
		contactNo = new JTextField();
		contactNo.setColumns(10);
		contactNo.setBounds(115, 150, 190, 23);
		panel_2.add(contactNo);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		spinner.setBounds(112, 59, 193, 20);
		panel_2.add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(115, 101, 190, 21);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select State", "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Sabah", "Sarawak", "Selangor", "Terengganu"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(575, 56, 254, 21);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Package", "Package 1", "Package 2", "Package 3", "Premium Package"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_2.setBounds(107, 343, 190, 24);
		panel.add(comboBox_2);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = String.valueOf(comboBox_2.getSelectedItem());
				
				 if(p1 == "Package 1") {
					 String rental = rentalPeriod.getText();
					 int period = Integer.parseInt(rental);
					 if(period == 1) {
					 paymentC c = new WedCustBill();
					 int wedPackage = 1;
					 double total = c.getPayment(wedPackage,p1);
					 String tP = String.valueOf(df.format(total));
					 totalPayment.setText(tP);}
					 else{
					 paymentC r = new WedCustBill();
					 String p = rentalPeriod.getText();
					 double total = r.getRent(period,p1);
					 String tP = String.valueOf(df.format(total));
					 totalPayment.setText(tP);
					 }
					 
				 } else if(p1 == "Package 2") {
					 paymentC c = new WedCustBill();
					 int wedPackage = 2;
					 double total = c.getPayment(wedPackage,p1);
					 String tP = String.valueOf(df.format(total));
					 totalPayment.setText(tP);
				 } 
				 else if(p1 == "Package 3") {
					 paymentC c = new WedCustBill();
					 int wedPackage = 3;
					 double total = c.getPayment(wedPackage,p1);
					 String tP = String.valueOf(df.format(total));
					 totalPayment.setText(tP);
				 }
				 else if(p1 == "Premium Package") {
					 paymentC c = new WedCustBill();
					 int wedPackage = 4;
					 double total = c.getPayment(wedPackage,p1);
					 String tP = String.valueOf(df.format(total));
					 totalPayment.setText(tP);
				 } 
			}
		});
		
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Payment Method", "Cash", "Debit/Credit Card"}));
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_3.setBounds(148, 386, 190, 24);
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Postcode");
		lblNewLabel_1_2_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1_2.setBounds(408, 100, 81, 22);
		panel_2.add(lblNewLabel_1_2_1_2);
		
		postcode = new JTextField();
		postcode.setColumns(10);
		postcode.setBounds(575, 100, 254, 23);
		panel_2.add(postcode);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("Date of Rental");
		lblNewLabel_1_2_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1_2_1.setBounds(408, 151, 108, 22);
		panel_2.add(lblNewLabel_1_2_1_2_1);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(575, 150, 254, 23);
		panel_2.add(date);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 204, 255)));
		panel_3.setBounds(10, 470, 862, 121);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 842, 101);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Age", "Gender", "Contact No.", "Address", "State", "Postcode", "Date of Rental", "Package", "Payment Method", "Total Payment"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Package");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel.setBounds(22, 342, 75, 22);
		panel.add(lblNewLabel);
		
		JLabel lblPaymentMethod = new JLabel("Payment Method");
		lblPaymentMethod.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblPaymentMethod.setBounds(22, 389, 116, 22);
		panel.add(lblPaymentMethod);
		
		JLabel lblTotalPayment = new JLabel("Total Payment(RM)");
		lblTotalPayment.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblTotalPayment.setBounds(22, 433, 141, 22);
		panel.add(lblTotalPayment);
		
		totalPayment = new JTextField();
		totalPayment.setColumns(10);
		totalPayment.setBounds(167, 428, 121, 32);
		panel.add(totalPayment);
		totalPayment.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
	
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		btnNewButton.setBounds(388, 411, 119, 32);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String username = textField.getText();
				Object age = spinner.getValue();
				String gender = (String) comboBox.getSelectedItem();
				String pnum = contactNo.getText();
				String state = (String) comboBox_1.getSelectedItem();
				String add = address.getText();
				String post = postcode.getText();
				String dateR = date.getText();
				String wpackage = (String) comboBox_2.getSelectedItem();
				String payment = (String) comboBox_3.getSelectedItem();				
	
				if(username.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Username", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);}
				else if(age.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Age", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(gender.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Select Gender", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(state.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Select State", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(pnum.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Contact Number", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(add.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Address", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(post.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Postcode", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(dateR.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Date of Rental", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(wpackage.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Select Package", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}
				else if(payment.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Select Payment Method", "Payment Unsuccessful",
							JOptionPane.OK_OPTION);
				}else { 
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textField.getText(),
						spinner.getValue(),
						comboBox.getSelectedItem(),
						contactNo.getText(),
						address.getText(),
						comboBox_1.getSelectedItem(),
						postcode.getText(),
						date.getText(),
						comboBox_2.getSelectedItem(),
						comboBox_3.getSelectedItem(),	
						totalPayment.getText(),
					
				});
				JOptionPane.showMessageDialog(null, "Payment Successful");
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information Update Confirmation", "New Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
				try {
					File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Project\\WedCustBilling.txt");
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
			}
		});

		
		JLabel lblRentalPeriod = new JLabel("Rental Period");
		lblRentalPeriod.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblRentalPeriod.setBounds(22, 299, 116, 22);
		panel.add(lblRentalPeriod);
		
		rentalPeriod = new JTextField();
		rentalPeriod.setColumns(10);
		rentalPeriod.setBounds(128, 293, 121, 32);
		panel.add(rentalPeriod);
		rentalPeriod.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("day/s      *if choose Package 1 * min 1 day");
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(257, 298, 304, 22);
		panel.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("< Back");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(677, 10, 70, 31);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedCustPackage h = new WedCustPackage();
				h.setModalExclusionType(null);
	            h.setVisible(true);		
			}
		});
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				spinner.setValue(0);
				comboBox.setSelectedItem("Select Gender");
				contactNo.setText("");
				address.setText("");
				comboBox_1.setSelectedItem("Select State");
				postcode.setText("");
				date.setText("");
				comboBox_2.setSelectedItem("Select Package");
				comboBox_3.setSelectedItem("Select Payment Method");	
				totalPayment.setText("");
				rentalPeriod.setText("");
			}
		});
		reset.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		reset.setBackground(new Color(255, 240, 245));
		reset.setBounds(681, 411, 119, 32);
		panel.add(reset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		btnDelete.setBackground(new Color(255, 240, 245));
		btnDelete.setBounds(538, 411, 119, 32);
		panel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Infomation System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Infomation System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				};		
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Home Page >");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(757, 10, 116, 31);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				WedHomePage hP = new WedHomePage();
				hP.setModalExclusionType(null);
	            hP.setVisible(true);
				
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
		WedCustomerBilling.table = table;
	}
}