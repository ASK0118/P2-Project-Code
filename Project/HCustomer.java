package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.UIManager;

public class HCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textField_firstname;
	private JTextField textField_lastname;
	private JTextField textField_age;
	private JTextField textField_day;
	private JTable table;
	private JTextField textField_phoneNum;
	double total;
	private JTextField totalamount;
	private JTextField textFieldRentPrice;
	private JTextField textFieldTotalPrice;






	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HCustomer C = new HCustomer();
					C.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HCustomer() {
		setTitle("Customer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 696);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 5, 5, 5, (Color) Color.MAGENTA));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 33, 1047, 626);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.MAGENTA);
		panel_1.setBounds(0, 0, 1047, 48);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO OUR HOMESTAY HOST CENTRE");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel.setBounds(237, 0, 604, 48);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Registration");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 46, 284, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFirstName.setBounds(10, 90, 122, 34);
		panel.add(lblFirstName);
		
		textField_firstname = new JTextField();
		textField_firstname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_firstname.setBounds(188, 90, 134, 34);
		panel.add(textField_firstname);
		textField_firstname.setColumns(10);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge.setBounds(10, 178, 99, 34);
		panel.add(lblAge);
		
		textField_lastname = new JTextField();
		textField_lastname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_lastname.setColumns(10);
		textField_lastname.setBounds(188, 134, 134, 34);
		panel.add(textField_lastname);
		
		textField_age = new JTextField();
		textField_age.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_age.setColumns(10);
		textField_age.setBounds(188, 178, 134, 34);
		panel.add(textField_age);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLastName.setBounds(10, 134, 122, 34);
		panel.add(lblLastName);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGender.setBounds(10, 222, 99, 34);
		panel.add(lblGender);
		
		JComboBox gender = new JComboBox();
		gender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gender.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Male", "Female"}));
		gender.setBounds(188, 222, 134, 34);
		panel.add(gender);
		
		JLabel lblRentLocation = new JLabel("Rent Location :");
		lblRentLocation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRentLocation.setBounds(10, 310, 150, 34);
		panel.add(lblRentLocation);
		
		JComboBox rentLocation = new JComboBox();
		rentLocation.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Sabah", "Sarawak", "Kedah", "Johor Bahru", "Pahang", "Perak", "Terengganu", "Pulau Pinang", "Selangor", "Kelantan", "Negeri Sembilan"}));
		rentLocation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rentLocation.setBounds(188, 310, 134, 34);
		panel.add(rentLocation);
		
		JLabel lblDay = new JLabel("Day :");
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDay.setBounds(10, 354, 62, 34);
		panel.add(lblDay);
		
		textField_day = new JTextField();
		textField_day.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_day.setColumns(10);
		textField_day.setBounds(188, 354, 134, 34);
		panel.add(textField_day);
		
		JLabel lblSelection = new JLabel("Selection :");
		lblSelection.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelection.setBounds(10, 398, 122, 34);
		panel.add(lblSelection);
		
		JComboBox comboBoxSelection = new JComboBox();
		comboBoxSelection.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxSelection.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Authentic Homestay", "Comfortable Homestay", "Tourist Homestay"}));
		comboBoxSelection.setBounds(188, 393, 134, 39);
		panel.add(comboBoxSelection);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(376, 104, 661, 290);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 641, 217);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "Last Name", "Age", "Gender", "Phone Num", "Rent Location", "Days", "Type of Homestay", "Rent Price", "Total Price"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(62);
		table.getColumnModel().getColumn(1).setPreferredWidth(59);
		table.getColumnModel().getColumn(2).setPreferredWidth(33);
		table.getColumnModel().getColumn(3).setPreferredWidth(56);
		table.getColumnModel().getColumn(6).setPreferredWidth(38);
		table.getColumnModel().getColumn(7).setPreferredWidth(100);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBackground(UIManager.getColor("Button.background"));
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\GUI\\src\\Project\\HCustomer");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n_____________________________________________________________________\n");
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

		btnUpload.setBounds(262, 237, 141, 34);
		panel_2.add(btnUpload);
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblPhoneNum = new JLabel("Phone Num :");
		lblPhoneNum.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhoneNum.setBounds(10, 266, 134, 34);
		panel.add(lblPhoneNum);
		
		textField_phoneNum = new JTextField();
		textField_phoneNum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_phoneNum.setColumns(10);
		textField_phoneNum.setBounds(188, 266, 134, 34);
		panel.add(textField_phoneNum);
		
		JButton btntotalAmount = new JButton("Total Amount");
		btntotalAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				// iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 9));
			        
			        total += Double.parseDouble(s);
			        String ni = String.valueOf(total);
			        totalamount.setText(ni);
			    }	
			}
		});
		btntotalAmount.setFont(new Font("Tahoma", Font.BOLD, 18));
		btntotalAmount.setBounds(656, 399, 169, 34);
		panel.add(btntotalAmount);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(10, 525, 1027, 83);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAdd = new JButton("ADD RECORD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				
						
						textField_firstname.getText(),
						textField_lastname.getText(),
						textField_age.getText(),
						gender.getSelectedItem(),
						textField_phoneNum.getText(),
						rentLocation.getSelectedItem(),
						textField_day.getText(),
						comboBoxSelection.getSelectedItem(),
						textFieldRentPrice.getText(),
						textFieldTotalPrice.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Customer Update confirmed", "Customer Registeration System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			});
		btnAdd.setBounds(10, 23, 176, 34);
		panel_3.add(btnAdd);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(UIManager.getColor("Button.background"));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_firstname.setText("");
				textField_lastname.setText("");
				textField_age.setText("");
				gender.setSelectedItem("Selection");
				textField_phoneNum.setText("");
				rentLocation.setSelectedItem("Selection");
				textField_day.setText("");
				comboBoxSelection.setSelectedItem("Selection");
				textFieldRentPrice.setText("");
				textFieldTotalPrice.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(223, 23, 141, 34);
		panel_3.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(UIManager.getColor("Button.background"));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Registeration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Registeration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(441, 23, 141, 34);
		panel_3.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBackground(UIManager.getColor("Button.background"));
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
		btnPrint.setBounds(659, 23, 141, 34);
		panel_3.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(UIManager.getColor("Button.background"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(876, 23, 141, 34);
		panel_3.add(btnExit);
		
		totalamount = new JTextField();
		totalamount.setBackground(SystemColor.info);
		totalamount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalamount.setColumns(10);
		totalamount.setBounds(861, 399, 134, 34);
		panel.add(totalamount);
		
		textFieldRentPrice = new JTextField();
		textFieldRentPrice.setEditable(false);
		textFieldRentPrice.setBackground(SystemColor.info);
		textFieldRentPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldRentPrice.setColumns(10);
		textFieldRentPrice.setBounds(188, 437, 134, 34);
		panel.add(textFieldRentPrice);
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setEditable(false);
		textFieldTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTotalPrice.setColumns(10);
		textFieldTotalPrice.setBackground(SystemColor.info);
		textFieldTotalPrice.setBounds(188, 481, 134, 34);
		panel.add(textFieldTotalPrice);
		
		JLabel lblTotalPrice = new JLabel("Total Price RM :");
		lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalPrice.setBounds(10, 480, 168, 34);
		panel.add(lblTotalPrice);
		
		JLabel lblRentPrice = new JLabel("Rent Price RM :");
		lblRentPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRentPrice.setBounds(10, 442, 168, 29);
		panel.add(lblRentPrice);
		
		
		
		JButton btnPrice = new JButton("PRICE");
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int day;
				double rentPrice;
				double totalPrice;
				double discount;
				String selection = (String)comboBoxSelection.getSelectedItem();
				day = Integer.parseInt(textField_day.getText());

				try {
				if(comboBoxSelection.getSelectedItem().equals("Authentic Homestay")) {
					if (day<7) {
					HPayment AH = new HTotalPrice();
					rentPrice  = AH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = AH.getPayment(selection, day);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
				    }
					
					else if (day>=7 && day<30) {
					HPayment AH = new HTotalPrice();
					rentPrice  = AH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = AH.getPayment(selection, day);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
					}
					
					else {
					HPayment AH = new HTotalPrice();
					discount   = AH.disc();
					rentPrice  = AH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = AH.getPayment(selection, day, discount);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
					}
				}
				
				 if(comboBoxSelection.getSelectedItem().equals("Comfortable Homestay")) {
					if (day<7) {
					HPayment CH = new HTotalPrice();
					rentPrice  = CH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = CH.getPayment(selection, day);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
				    }
					
					else if (day>=7 && day<30) {
					HPayment CH = new HTotalPrice();
					rentPrice  = CH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = CH.getPayment(selection, day);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
					}
					
					else {
					HPayment CH = new HTotalPrice();
					discount   = CH.disc();
					rentPrice  = CH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = CH.getPayment(selection, day, discount);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
					}
				}
				
				 if(comboBoxSelection.getSelectedItem().equals("Tourist Homestay")) {
					if (day<7) {
					HPayment TH = new HTotalPrice();
					rentPrice  = TH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = TH.getPayment(selection, day);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
				    }
					
					else if (day>=7 && day<30) {
					HPayment TH = new HTotalPrice();
					rentPrice  = TH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = TH.getPayment(selection, day);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
					}
					
					else {
					HPayment TH = new HTotalPrice();
					discount   = TH.disc();
					rentPrice  = TH.rentPrice(selection, day);
					textFieldRentPrice.setText(Double.toString(rentPrice));
					totalPrice = TH.getPayment(selection, day, discount);
					textFieldTotalPrice.setText(Double.toString(totalPrice));
					}
				}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the correct information", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrice.setBounds(356, 481, 134, 34);
		panel.add(btnPrice);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1047, 37);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_Home = new JMenu("Home");
		menuBar.add(mnNewMenu_Home);
		
		JMenuItem mntmNewMenuItem_Aboutus = new JMenuItem("About Us");
		mntmNewMenuItem_Aboutus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HCompanyBackground CB = new HCompanyBackground();
		      CB.setModalExclusionType(null);
              CB.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_Home.add(mntmNewMenuItem_Aboutus);
		
        JMenuItem mntmNewMenuItem_Advertisement = new JMenuItem("Advertisement");
        mntmNewMenuItem_Advertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HAdvertisementNMarketing ANM = new HAdvertisementNMarketing();
		      ANM.setModalExclusionType(null);
              ANM.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_Home.add(mntmNewMenuItem_Advertisement);
		
		JMenuItem mntmNewMenuItem_Logout = new JMenuItem("Log Out");
		mntmNewMenuItem_Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HLogin L = new HLogin();
		      L.setModalExclusionType(null);
              L.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_Home.add(mntmNewMenuItem_Logout);
		
		JMenu mnNewMenu_productDescription = new JMenu("Product Description");
		mnNewMenu_productDescription.setBackground(SystemColor.desktop);
		menuBar.add(mnNewMenu_productDescription);
		
		JMenuItem mntmAuthenticHomestay = new JMenuItem("Authentic Homestay");
		mntmAuthenticHomestay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HAuthenticHomestay AH = new HAuthenticHomestay();
		      AH.setModalExclusionType(null);
              AH.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_productDescription.add(mntmAuthenticHomestay);
		
		JMenuItem mntmComfortableHomestay = new JMenuItem("Comfortable Homestay");
		mntmComfortableHomestay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HComfortableHomestay CH = new HComfortableHomestay();
		      CH.setModalExclusionType(null);
              CH.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_productDescription.add(mntmComfortableHomestay);
		
		JMenuItem mntmTouristHomestay = new JMenuItem("Tourist Homestay");
		mntmTouristHomestay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      HTouristHomestay TH = new HTouristHomestay();
		      TH.setModalExclusionType(null);
              TH.setVisible(true);
              dispose();
			}
		});
		mnNewMenu_productDescription.add(mntmTouristHomestay);
	}
}