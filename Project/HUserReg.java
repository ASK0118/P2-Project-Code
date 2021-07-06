package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HUserReg extends JFrame {


	private JPanel contentPane;
	public JTextField username;
	public JTextField password;
	private JTextField confirmpassword;
	static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HUserReg UR = new HUserReg();
					UR.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HUserReg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(0, 0, 880, 515);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTERATION SYSTEM");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblNewLabel.setBounds(233, 10, 394, 61);
		panel.add(lblNewLabel);
		
		JLabel lblusername = new JLabel("USERNAME");
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblusername.setBounds(10, 97, 156, 45);
		panel.add(lblusername);
		
		JLabel lblpassword = new JLabel("PASSWORD");
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblpassword.setBounds(10, 164, 156, 45);
		panel.add(lblpassword);
		
		JLabel lblconfirmpassword = new JLabel("CONFIRM PASSWORD");
		lblconfirmpassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblconfirmpassword.setBounds(10, 243, 211, 45);
		panel.add(lblconfirmpassword);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.BOLD, 20));
		username.setBounds(245, 97, 146, 45);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("Tahoma", Font.BOLD, 20));
		password.setColumns(10);
		password.setBounds(245, 164, 146, 45);
		panel.add(password);
		
		confirmpassword = new JTextField();
		confirmpassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		confirmpassword.setColumns(10);
		confirmpassword.setBounds(245, 243, 146, 45);
		panel.add(confirmpassword);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText("");
				password.setText("");
				confirmpassword.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(10, 329, 146, 45);
		panel.add(btnReset);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Uname = username.getText();
				String Password = password.getText();
				String CPassword = confirmpassword.getText();
				
				if(Uname.equals(""))
					JOptionPane.showMessageDialog(null, "User name is empty\nRegisteration unsuccessful");
				
				else if(Password.equals(""))
					JOptionPane.showMessageDialog(null, "Please enter the password\nRegisteration unsuccessful");
				
				else if(!CPassword.equals(Password))
					JOptionPane.showMessageDialog(null, "Password is not same!!\nRegisteration unsuccessful");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Registeration is successful");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
							username.getText(),
							password.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Username and Password confirmed", "Registeration System",
								JOptionPane.OK_OPTION);
					}
				}
			}
			}
			});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegister.setBounds(267, 329, 146, 45);
		panel.add(btnRegister);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(443, 81, 427, 239);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 407, 219);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Password"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(UIManager.getColor("Button.background"));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Register System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Register System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(724, 329, 146, 45);
		panel.add(btnDelete);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HUserLogin UL = new HUserLogin();
				UL.setModalExclusionType(null);
				UL.setVisible(true);
				dispose();
			}
		});
		
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(724, 460, 146, 45);
		panel.add(btnBack);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Project\\HUserReg.txt");
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
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpload.setBackground(SystemColor.menu);
		btnUpload.setBounds(453, 329, 146, 45);
		panel.add(btnUpload);
		
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		HUserReg.table = table;
	}
}
