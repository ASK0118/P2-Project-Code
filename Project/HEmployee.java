package Project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.SystemColor;
import javax.swing.UIManager;

public class HEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField IDNo;
	private JTextField Name;
	private JTextField PhoneNum;
	private JTextField Age;
	private JTable table;
	private JTextField Salary;
	public JTextField totalamount;
	double total = 0;
	private JTextField TotalSalary;
	private JTextField textField_search;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HEmployee E = new HEmployee();
					E.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HEmployee() {
		setTitle("Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 255)));
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(0, 0, 1015, 630);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE INFORMATION SYSTEM");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblNewLabel.setBounds(280, 10, 466, 53);
		panel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(10, 249, 129, 28);
		panel.add(lblName);
		
		IDNo = new JTextField();
		IDNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		IDNo.setBounds(208, 216, 162, 28);
		panel.add(IDNo);
		IDNo.setColumns(10);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge.setBounds(10, 287, 129, 28);
		panel.add(lblAge);
		
		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Name.setColumns(10);
		Name.setBounds(208, 254, 162, 28);
		panel.add(Name);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGender.setBounds(10, 325, 129, 28);
		panel.add(lblGender);
		
		JComboBox gender = new JComboBox();
		gender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gender.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Male", "Female"}));
		gender.setBounds(208, 325, 162, 28);
		panel.add(gender);
		
		JLabel lblPhoneNum = new JLabel("Phone Number :");
		lblPhoneNum.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhoneNum.setBounds(10, 363, 162, 28);
		panel.add(lblPhoneNum);
		
		PhoneNum = new JTextField();
		PhoneNum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		PhoneNum.setColumns(10);
		PhoneNum.setBounds(208, 363, 162, 28);
		panel.add(PhoneNum);
		
		JLabel lblPosition = new JLabel("Position :");
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPosition.setBounds(10, 401, 162, 28);
		panel.add(lblPosition);
		
		JComboBox position = new JComboBox();
		position.setFont(new Font("Tahoma", Font.PLAIN, 20));
		position.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Manager", "Assistant Manager", "Supervisor"}));
		position.setBounds(208, 401, 162, 28);
		panel.add(position);
		
		JLabel lblIDNo = new JLabel("ID No :");
		lblIDNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIDNo.setBounds(10, 211, 129, 28);
		panel.add(lblIDNo);
		
		Age = new JTextField();
		Age.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Age.setColumns(10);
		Age.setBounds(208, 292, 162, 28);
		panel.add(Age);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectHomestayRentalImage\\employee-icon-5.jpeg"));
		lblNewLabel_2.setBounds(10, 10, 201, 191);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 255)));
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(391, 124, 613, 348);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 593, 275);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID No", "Name", "Age", "Gender", "Phone Number", "Position", "Salary (RM)", "Total Salary (RM)"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(42);
		table.getColumnModel().getColumn(2).setPreferredWidth(35);
		table.getColumnModel().getColumn(3).setPreferredWidth(56);
		table.getColumnModel().getColumn(4).setPreferredWidth(82);
		table.getColumnModel().getColumn(7).setPreferredWidth(104);
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Project\\HEmployee.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n_______________________________________________________________________\n");
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
		btnUpload.setBounds(248, 295, 129, 40);
		panel_1.add(btnUpload);
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(UIManager.getColor("Button.background"));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Information System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Information System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(453, 295, 129, 40);
		panel_1.add(btnDelete);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(IDNo.getText(),i,0);
			    	model.setValueAt(Name.getText(),i,1);
			    	model.setValueAt(Age.getText(),i,2);
			    	model.setValueAt(gender.getSelectedItem(),i,3);
			    	model.setValueAt(PhoneNum.getText(),i,4);
			    	model.setValueAt(position.getSelectedItem(),i,5);
			    	model.setValueAt(Salary.getText(), i, 6);
			    	model.setValueAt(TotalSalary.getText(), i, 7);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(20, 295, 129, 40);
		panel_1.add(btnUpdate);
		
		Salary = new JTextField();
		Salary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Salary.setBackground(SystemColor.info);
		Salary.setEditable(false);
		Salary.setColumns(10);
		Salary.setBounds(208, 439, 162, 33);
		panel.add(Salary);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 255)));
		panel_2.setBackground(new Color(0, 191, 255));
		panel_2.setBounds(10, 531, 994, 89);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						IDNo.getText(),
						Name.getText(),
						Age.getText(),
						gender.getSelectedItem(),
						PhoneNum.getText(),
						position.getSelectedItem(),
						Salary.getText(),
						TotalSalary.getText()
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Information System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		btnAdd.setBounds(23, 26, 108, 40);
		panel_2.add(btnAdd);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IDNo.setText("");
				Name.setText("");
				Age.setText("");
				gender.setSelectedItem("Selection");
				PhoneNum.setText("");
				position.setSelectedItem("Selection");
				Salary.setText("");
				TotalSalary.setText("");
				totalamount.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(209, 26, 129, 40);
		panel_2.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBounds(420, 26, 129, 40);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(UIManager.getColor("Button.background"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Information System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(855, 26, 129, 40);
		panel_2.add(btnExit);
		
		JButton btnFinance = new JButton("FINANCE");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String emplySalary = totalamount.getText();
				HFinance F = new HFinance();
				F.EmploySalary.setText(emplySalary);
				F.setModalExclusionType(null);
				F.setVisible(true);
				dispose();
			}
		});

		btnFinance.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFinance.setBounds(649, 26, 129, 40);
		panel_2.add(btnFinance);
		
		JButton btnTotalAmount = new JButton("Total Amount");
		btnTotalAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 7));
			        
			        total += Double.parseDouble(s);
			        
			        String ni = String.valueOf(total);
			        totalamount.setText(ni);
			        
			    }
			}
		});
		btnTotalAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTotalAmount.setBounds(401, 481, 184, 40);
		panel.add(btnTotalAmount);
		
		totalamount = new JTextField();
		totalamount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalamount.setBackground(SystemColor.info);
		totalamount.setEditable(false);
		totalamount.setColumns(10);
		totalamount.setBounds(632, 478, 162, 43);
		panel.add(totalamount);
		
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
		btnBack.setBounds(875, 17, 129, 40);
		panel.add(btnBack);
		
		JButton btnSalary = new JButton("Salary (RM) :");
		btnSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double employsalary;
				double totalSalary;
				int day = 0;
				double elaun = 600;
				double EPF;
				double SOCSO = 4.35;
				double EIS = 2.30;
				String selection = (String) position.getSelectedItem();
								
				if (position.getSelectedItem()=="Manager") {
					HPayment M = new HTotalsalary();
					employsalary = M.rentPrice(selection, day);
					Salary.setText(Double.toString(employsalary));
					EPF=M.disc();
					totalSalary = M.getPayment(selection, day, EPF)-SOCSO-EIS+elaun;
					TotalSalary.setText(Double.toString(totalSalary));
				}
					
				else if(position.getSelectedItem()=="Assistant Manager") {
					HPayment AM = new HTotalsalary();
					employsalary = AM.rentPrice(selection, day);
					Salary.setText(Double.toString(employsalary));
					EPF=AM.disc();
					totalSalary = AM.getPayment(selection, day, EPF)-SOCSO-EIS+elaun;
					TotalSalary.setText(Double.toString(totalSalary));
				}
				
				else {
					HPayment S = new HTotalsalary();
					employsalary = S.rentPrice(selection, day);
					Salary.setText(Double.toString(employsalary));
					EPF=S.disc();
					totalSalary = S.getPayment(selection, day, EPF)-SOCSO-EIS+elaun;
					TotalSalary.setText(Double.toString(totalSalary));
				}
				
				}
			}
		);
		
		btnSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalary.setBounds(10, 439, 170, 33);
		panel.add(btnSalary);
		
		JLabel lblTotalSalary = new JLabel("Total Salary (RM) :");
		lblTotalSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalSalary.setBounds(10, 482, 201, 39);
		panel.add(lblTotalSalary);
		
		TotalSalary = new JTextField();
		TotalSalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TotalSalary.setEditable(false);
		TotalSalary.setColumns(10);
		TotalSalary.setBackground(SystemColor.info);
		TotalSalary.setBounds(208, 482, 162, 39);
		panel.add(TotalSalary);
		
		JLabel lblSearch = new JLabel("Search :");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSearch.setBounds(391, 70, 94, 44);
		panel.add(lblSearch);
		
		textField_search = new JTextField();
		textField_search.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				DefaultTableModel Table = (DefaultTableModel)table.getModel();
		        String search = textField_search.getText();
		        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(Table);
		        table.setRowSorter(tr);
		        tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
		textField_search.setBounds(516, 73, 184, 41);
		panel.add(textField_search);
		textField_search.setColumns(10);
	}
}
