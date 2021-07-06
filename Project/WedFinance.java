package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.text.DecimalFormat;

public class WedFinance extends JFrame {

	private JPanel contentPane;
	public JTextField employS;
	private JTextField mainF;
	private JTextField adsE;
	private JTextField uE;
	private JTextField revenue;
	private JTextField tE;
	private JTextField tR;
	private JTextField net;
	double total, totalS;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedFinance frame = new WedFinance();
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
	public WedFinance() {
		DecimalFormat df = new DecimalFormat("0.00");
		
		setTitle("Romance Wedding - Company Financial System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 173, 173)));
		panel.setBounds(10, 10, 761, 550);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 173, 173)));
		panel_1.setBounds(148, 22, 446, 56);
		panel.add(panel_1);
		
		JLabel lblFinancialSystem = new JLabel("Company Financial System");
		lblFinancialSystem.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblFinancialSystem.setBounds(100, 10, 272, 38);
		panel_1.add(lblFinancialSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 173, 173)));
		panel_2.setBounds(35, 101, 680, 190);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Expenses");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 10, 111, 30);
		panel_2.add(lblNewLabel);
		
		employS = new JTextField();
		employS.setBounds(182, 65, 125, 30);
		panel_2.add(employS);
		employS.setColumns(10);
		employS.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		String.format("{0:0.0#}", employS);
		
		JLabel lblNewLabel_1_1 = new JLabel("Maintenance Fee(RM)");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(22, 135, 177, 19);
		panel_2.add(lblNewLabel_1_1);
		
		mainF = new JTextField();
		mainF.setColumns(10);
		mainF.setBounds(182, 128, 125, 30);
		panel_2.add(mainF);
		mainF.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1_2 = new JLabel("Advertisement Expenses(RM)");
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(317, 70, 210, 19);
		panel_2.add(lblNewLabel_1_2);
		
		adsE = new JTextField();
		adsE.setColumns(10);
		adsE.setBounds(536, 65, 125, 30);
		panel_2.add(adsE);
		adsE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Utility Expenses(RM)");
		lblNewLabel_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(317, 131, 180, 19);
		panel_2.add(lblNewLabel_1_2_1);
		
		uE = new JTextField();
		uE.setColumns(10);
		uE.setBounds(536, 124, 125, 30);
		panel_2.add(uE);
		uE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JButton btnNewButton_2 = new JButton("Employee Salary(RM)");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = WedEmployee.getTable();
				String sal;
				boolean em = false;

				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						sal = String.valueOf(t.getValueAt(i, 8));
						double s = Double.parseDouble(sal);
						String emS = df.format(s);
						totalS += Double.parseDouble(emS);
						
						if(sal != null) {
							em = true;
						}
					
							if(em == true) {
							String eSal = String.valueOf(df.format(totalS));
							employS.setText(eSal);
							}
					}
				}catch (Exception e1) {
					
				}
			}
		});
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnNewButton_2.setBounds(10, 65, 162, 29);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 173, 173)));
		panel_3.setBounds(35, 317, 284, 128);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Total Sales(RM)");
		lblNewLabel_1_2_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1_1.setBounds(10, 68, 125, 19);
		panel_3.add(lblNewLabel_1_2_1_1);
		
		revenue = new JTextField();
		revenue.setColumns(10);
		revenue.setBounds(133, 62, 125, 30);
		panel_3.add(revenue);
		revenue.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JButton btnNewButton_1 = new JButton("Revenue");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = WedCustomerBilling.getTable();
				String custsales;
				boolean a = false;

				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						custsales = String.valueOf(t.getValueAt(i, 10));
						double c = Double.parseDouble(custsales);
						String cs = df.format(c);
						total = total + Double.parseDouble(cs);
						
							if(custsales != null) {
								a = true;
							}
					
							if(a == true) {
							String tS = String.valueOf(df.format(total));
							tR.setText(tS);
							revenue.setText(tS);
							}
					}
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(10, 10, 125, 30);
		panel_3.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 173, 173)));
		panel_4.setBounds(365, 317, 350, 204);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblFinancialStatement = new JLabel("Financial Statement");
		lblFinancialStatement.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblFinancialStatement.setBounds(10, 10, 203, 30);
		panel_4.add(lblFinancialStatement);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Total Expenses(RM)");
		lblNewLabel_1_2_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1_2.setBounds(20, 116, 143, 19);
		panel_4.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("Total Revenue(RM)\r\n");
		lblNewLabel_1_2_1_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1_2_1_2_1.setBounds(20, 69, 143, 19);
		panel_4.add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\black.jpg"));
		lblNewLabel_2.setBounds(21, 149, 330, 7);
		panel_4.add(lblNewLabel_2);
		
		tE = new JTextField();
		tE.setColumns(10);
		tE.setBounds(173, 109, 125, 30);
		panel_4.add(tE);
		tE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		tR = new JTextField();
		tR.setColumns(10);
		tR.setBounds(173, 62, 125, 30);
		panel_4.add(tR);
		tR.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1_2_1_2_1_1 = new JLabel("NET PROFIT(RM)\r\n");
		lblNewLabel_1_2_1_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_1_2_1_2_1_1.setBounds(21, 169, 143, 19);
		panel_4.add(lblNewLabel_1_2_1_2_1_1);
		
		net = new JTextField();
		net.setColumns(10);
		net.setBounds(174, 166, 125, 30);
		panel_4.add(net);
		net.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnNewButton.setBounds(10, 475, 115, 34);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WedPayment F = new financeCal();
				double emp = Double.parseDouble(employS.getText());
				String s = String.valueOf(df.format(emp));
				double employSalary = Double.parseDouble(s);
				
				double m = Double.parseDouble(mainF.getText());
				String mF = String.valueOf(df.format(m));
				double maintenanceFee = Double.parseDouble(mF);
				
				double ads = Double.parseDouble(adsE.getText());
				String a = String.valueOf(df.format(ads));
				double adsExpenses = Double.parseDouble(a);
				
				double u = Double.parseDouble(uE.getText());
				String uti = String.valueOf(df.format(u));
				double utilityExpenses = Double.parseDouble(uti);
				double total = F.getPayment(employSalary,maintenanceFee,adsExpenses,utilityExpenses);
				String t = String.valueOf(df.format(total));
				tE.setText(t);
				/*
				String re = revenue.getText();
				double ss = Double.parseDouble(re);
				String sales = String.valueOf(df.format(ss));
				tR.setText(sales);
				*/
				double rev = Double.parseDouble(tR.getText());
				String r = String.valueOf(df.format(rev));
				double totR = F.calNet(total, rev);
				String totalR = String.valueOf(df.format(totR));
				net.setText(totalR);
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnReset.setBounds(132, 475, 101, 34);
		panel.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				mainF.setText("");
				adsE.setText("");
				uE.setText("");
				tE.setText("");
				net.setText("");
			}
		});
		
		JButton btnBack = new JButton("< Back");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(681, 10, 70, 31);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedEmployee em = new WedEmployee();
				em.setModalExclusionType(null);
	            em.setVisible(true);		
			}
		});
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnExit.setBounds(243, 475, 101, 34);
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
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
	}

}
