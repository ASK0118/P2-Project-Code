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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.text.DecimalFormat;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WedEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField address;
	public static JTable table;
	private JTextField contact;
	private JTextField salary;
	private JTextField hour;
	public JTextPane saltextPane;
	double total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedEmployee frame = new WedEmployee();
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
	public WedEmployee() {
		DecimalFormat df = new DecimalFormat("0.00");
		setTitle("Romance Wedding - Employee Infomation System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 153)));
		panel.setBounds(10, 10, 908, 673);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(51, 51, 153)));
		panel_1.setBounds(263, 49, 446, 56);
		panel.add(panel_1);
		
		JLabel lblEmployeeInfomationSystem = new JLabel("Employee Infomation System");
		lblEmployeeInfomationSystem.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblEmployeeInfomationSystem.setBounds(88, 10, 272, 38);
		panel_1.add(lblEmployeeInfomationSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(51, 51, 153)));
		panel_2.setBounds(30, 134, 846, 160);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 23, 81, 22);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 63, 81, 22);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 105, 81, 22);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("State");
		lblNewLabel_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(423, 23, 81, 22);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Address");
		lblNewLabel_1_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setBounds(423, 63, 92, 22);
		panel_2.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Contact No.");
		lblNewLabel_1_2_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_3.setBounds(423, 105, 131, 22);
		panel_2.add(lblNewLabel_1_2_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(144, 23, 192, 23);
		panel_2.add(textField);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.PLAIN, 15));
		address.setColumns(10);
		address.setBounds(547, 63, 207, 23);
		panel_2.add(address);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		spinner.setBounds(144, 63, 192, 20);
		panel_2.add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(144, 105, 192, 21);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select State", "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Sabah", "Sarawak", "Selangor", "Terengganu"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(547, 24, 207, 21);
		panel_2.add(comboBox_1);
		
		contact = new JTextField();
		contact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contact.setColumns(10);
		contact.setBounds(547, 105, 207, 23);
		panel_2.add(contact);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(51, 0, 153)));
		panel_4.setBounds(30, 311, 846, 97);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		hour = new JTextField();
		hour.setBounds(238, 10, 131, 23);
		panel_4.add(hour);
		hour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hour.setColumns(10);
		
		JLabel lblNewLabel_1_2_3_1_1_1_1 = new JLabel("Working Hour (Part Time Only)");
		lblNewLabel_1_2_3_1_1_1_1.setBounds(10, 10, 218, 22);
		panel_4.add(lblNewLabel_1_2_3_1_1_1_1);
		lblNewLabel_1_2_3_1_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Job Type");
		lblNewLabel_1_2_3_1.setBounds(10, 48, 131, 22);
		panel_4.add(lblNewLabel_1_2_3_1);
		lblNewLabel_1_2_3_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JComboBox jobT = new JComboBox();
		jobT.setModel(new DefaultComboBoxModel(new String[] {"Select Job Type", "Part Time", "Full Time", " Full Time with Higher Position"}));
		jobT.setBounds(95, 48, 207, 23);
		jobT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(jobT);
		jobT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jobT.getSelectedItem() == "Part Time") {
					paymentE eS = new employSal();
					int t = 1;
					int h = Integer.parseInt(hour.getText());
					double s = eS.getPayment(t, h);
					String sS = String.valueOf(df.format(s));
					salary.setText(sS);
				}
				else if(jobT.getSelectedItem() == "Full Time") {
					paymentE eS = new employSal();
					int t = 2;
					double s = eS.getPayment(t, 0);
					String sS = String.valueOf(df.format(s));
					salary.setText(sS);
				}
				else if(jobT.getSelectedItem() == "Full Time with Higher Position") {
					JOptionPane.showMessageDialog(null, "Choose Your Position");
				}
			}
		});
		
		JLabel netSal = new JLabel("Net Salary(RM)");
		netSal.setBounds(417, 10, 131, 22);
		panel_4.add(netSal);
		netSal.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		salary = new JTextField();
		salary.setBounds(550, 10, 142, 23);
		panel_4.add(salary);
		salary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		salary.setColumns(10);
		
		JLabel lblNewLabel_1_2_3_1_1 = new JLabel("Position");
		lblNewLabel_1_2_3_1_1.setBounds(417, 48, 131, 22);
		panel_4.add(lblNewLabel_1_2_3_1_1);
		lblNewLabel_1_2_3_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JComboBox position = new JComboBox();
		position.setModel(new DefaultComboBoxModel(new String[] {"Select Position", "Supervisor", "Photographer", "Makeup Artist", "Other Administrator"}));
		position.setBounds(523, 48, 207, 23);
		position.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(position);
		position.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(position.getSelectedItem() == "Supervisor") {
					paymentE eS = new employSal();
					char pos = 'S';
					double s = eS.getPayment(pos);
					String sS = String.valueOf(df.format(s));
					salary.setText(sS);
				}
				else if(position.getSelectedItem() == "Photographer") {
					paymentE eS = new employSal();
					char pos = 'P';
					double s = eS.getPayment(pos);
					String sS = String.valueOf(df.format(s));
					salary.setText(sS);
				}
				else if(position.getSelectedItem() == "Makeup Artist") {
					paymentE eS = new employSal();
					char pos = 'M';
					double s = eS.getPayment(pos);
					String sS = String.valueOf(df.format(s));
					salary.setText(sS);
				}
				else if(position.getSelectedItem() == "Other Administrator") {
					paymentE eS = new employSal();
					char pos = 'O';
					double s = eS.getPayment(pos);
					String sS = String.valueOf(df.format(s));
					salary.setText(sS);
				}
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(51, 51, 153)));
		panel_3.setBounds(30, 430, 846, 166);
		panel.add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(10, 10, 826, 98);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "State", "Address", "Contact No.", "Job Type", "Position", "Salary"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(235, 118, 115, 33);
		panel_3.add(btnUpdate);
		btnUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textField.getText(),i,0);
			    	model.setValueAt(spinner.getValue(),i,1);
			    	model.setValueAt(comboBox.getSelectedItem(),i,2);
			    	model.setValueAt(comboBox_1.getSelectedItem(),i,3);
			    	model.setValueAt(address.getText(),i,4);
			    	model.setValueAt(contact.getText(),i,5);
			    	model.setValueAt(jobT.getSelectedItem(),i,6);
			    	model.setValueAt(position.getSelectedItem(),i,7);
			    	model.setValueAt(salary.getText(),i,8);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		
		
		JButton tglbtnUpload = new JButton("Upload");
		tglbtnUpload.setBounds(460, 118, 115, 33);
		panel_3.add(tglbtnUpload);
		tglbtnUpload.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		tglbtnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Project\\WedEmployeeReg.txt");
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
		tglbtnReset.setBounds(30, 618, 115, 33);
		panel.add(tglbtnReset);
		tglbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				textField.setText("");
		    	spinner.setValue(0);
		    	comboBox.setSelectedItem("Select Gender");
		    	comboBox_1.setSelectedItem("Select State");
		    	address.setText("");
		    	contact.setText("");
		    	jobT.setSelectedItem("Select Job Type");
		    	position.setSelectedItem("Select Position");
		    	salary.setText("");
		    	hour.setText("");
			}
		});
		
		JButton tglbtnPrint = new JButton("Print");
		tglbtnPrint.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		tglbtnPrint.setBounds(200, 618, 115, 33);
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
		tglbtnDelete.setBounds(582, 618, 115, 33);
		panel.add(tglbtnDelete);
		tglbtnDelete.addActionListener(new ActionListener() {
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
				}
			}
		});
		
		
		JToggleButton tglbtnExit = new JToggleButton("Exit");
		tglbtnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		tglbtnExit.setBounds(761, 618, 115, 33);
		panel.add(tglbtnExit);
		tglbtnExit.addActionListener(new ActionListener() {
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
		btnAddRecord.setBounds(372, 618, 144, 33);
		panel.add(btnAddRecord);
		btnAddRecord.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 10, 888, 22);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 888, 22);
		panel_5.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Company Background");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WedAdminComBackground ac = new WedAdminComBackground();
				ac.setVisible(true);
				ac.setModalExclusionType(null);
				dispose();
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_3 = new JMenu("Packages");
		menuBar.add(mnNewMenu_3);
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WedAdminPack ap = new WedAdminPack();
				ap.setVisible(true);
				ap.setModalExclusionType(null);
				dispose();
			}
		});
		
		JMenu mnNewMenu_2 = new JMenu("Advertisement");
		menuBar.add(mnNewMenu_2);
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WedAdminAds aa = new WedAdminAds();
				aa.setVisible(true);
				aa.setModalExclusionType(null);
				dispose();
			}
		});
		
		JMenu mnNewMenu_1 = new JMenu("Finance");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WedFinance f = new WedFinance();
				f.setVisible(true);
				f.setModalExclusionType(null);
				dispose();
			}
		});
		menuBar.add(mnNewMenu_1);
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textField.getText(),
				    	spinner.getValue(),
				    	comboBox.getSelectedItem(),
				    	comboBox_1.getSelectedItem(),
				    	address.getText(),
				    	contact.getText(),
				    	jobT.getSelectedItem(),
				    	position.getSelectedItem(),
				    	salary.getText(),
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information Update Confirmation", "New Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
	}
	public static void AddRowToJtable(Object [] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		WedEmployee.table = table;
	
	}

}
