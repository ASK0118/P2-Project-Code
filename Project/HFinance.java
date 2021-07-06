package Project;

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class HFinance extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	
	double totalSales, totalExpenses, netProfit;
	private JTextField InventExp;
	private JTextField MaintenanceFees;
	private JTextField UtilityFees;
	private JTextField AdvertFees;
	private JTextField TotalExp;
	public  JTextField EmploySalary;
	private JTextField totalsales;
	private JTextField totalsales1;
	private JTextField totalexpenses;
	JTextField employSalary;
	private JTextField NetProfit;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HFinance F = new HFinance();
					F.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public HFinance() {
		setType(Type.POPUP);
		setTitle("Finance ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 872, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(255, 0, 255)));
		panel.setBounds(0, 0, 858, 656);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FINANCIAL STATEMENT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(287, 10, 306, 52);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.MAGENTA));
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 68, 353, 266);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.MAGENTA);
		panel_2.setBounds(0, 0, 353, 42);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Expenses");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(106, 0, 134, 42);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblInventExp = new JLabel("Inventory Expenses     :");
		lblInventExp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInventExp.setBounds(10, 52, 175, 30);
		panel_1.add(lblInventExp);
		
		InventExp = new JTextField();
		InventExp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		InventExp.setBounds(201, 52, 142, 30);
		panel_1.add(InventExp);
		InventExp.setColumns(10);
		
		JLabel lblmaintenanceFees = new JLabel("Maintenance Fees         :");
		lblmaintenanceFees.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblmaintenanceFees.setBounds(10, 92, 181, 30);
		panel_1.add(lblmaintenanceFees);
		
		MaintenanceFees = new JTextField();
		MaintenanceFees.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MaintenanceFees.setColumns(10);
		MaintenanceFees.setBounds(201, 92, 142, 30);
		panel_1.add(MaintenanceFees);
		
		UtilityFees = new JTextField();
		UtilityFees.setFont(new Font("Tahoma", Font.PLAIN, 15));
		UtilityFees.setColumns(10);
		UtilityFees.setBounds(201, 132, 142, 30);
		panel_1.add(UtilityFees);
		
		JLabel lblutilityFees = new JLabel("Utility Fees                     :");
		lblutilityFees.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblutilityFees.setBounds(10, 132, 181, 30);
		panel_1.add(lblutilityFees);
		
		JLabel lbladvertFees = new JLabel("Advertisement Fees     :");
		lbladvertFees.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbladvertFees.setBounds(10, 172, 175, 30);
		panel_1.add(lbladvertFees);
		
		AdvertFees = new JTextField();
		AdvertFees.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AdvertFees.setColumns(10);
		AdvertFees.setBounds(201, 172, 142, 30);
		panel_1.add(AdvertFees);
		
		TotalExp = new JTextField();
		TotalExp.setBackground(SystemColor.info);
		TotalExp.setEditable(false);
		TotalExp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TotalExp.setColumns(10);
		TotalExp.setBounds(201, 212, 142, 30);
		panel_1.add(TotalExp);
		
		JButton btntotalexp = new JButton("Total Expenses :");
		btntotalexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    double num1 = Double.parseDouble(InventExp.getText());
			    double num2 = Double.parseDouble(MaintenanceFees.getText());
			    double num3 = Double.parseDouble(UtilityFees.getText());
			    double num4 = Double.parseDouble(AdvertFees.getText());
			    
			    totalExpenses = num1 + num2 + num3 + num4;
			    
			    String s1 = String.valueOf(totalExpenses);
				TotalExp.setText(s1);
			}
		});
		btntotalexp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntotalexp.setBounds(10, 212, 164, 30);
		panel_1.add(btntotalexp);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(10, 357, 353, 105);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.MAGENTA);
		panel_2_1.setBounds(0, 0, 353, 42);
		panel_3.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1.setBounds(106, 0, 134, 42);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblEmploySalary = new JLabel("Employee Salary          :");
		
		lblEmploySalary.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmploySalary.setBounds(10, 55, 175, 30);
		panel_3.add(lblEmploySalary);
		
		EmploySalary = new JTextField();
		EmploySalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		EmploySalary.setEditable(false);
		EmploySalary.setColumns(10);
		EmploySalary.setBackground(SystemColor.info);
		EmploySalary.setBounds(201, 52, 142, 30);
		panel_3.add(EmploySalary);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_3_1.setBackground(Color.CYAN);
		panel_3_1.setBounds(10, 486, 353, 105);
		panel.add(panel_3_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.MAGENTA);
		panel_2_1_1.setBounds(0, 0, 353, 42);
		panel_3_1.add(panel_2_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sales");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1_1.setBounds(135, 0, 81, 42);
		panel_2_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblTotalSales = new JLabel("Total Sales                    :");
		lblTotalSales.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalSales.setBounds(10, 55, 175, 30);
		panel_3_1.add(lblTotalSales);
		
		totalsales = new JTextField();
		totalsales.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totalsales.setColumns(10);
		totalsales.setBackground(SystemColor.text);
		totalsales.setBounds(201, 52, 142, 30);
		panel_3_1.add(totalsales);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_4.setBackground(Color.CYAN);
		panel_4.setBounds(427, 72, 397, 306);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Financial Info");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(97, 10, 184, 54);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblTotalSales1 = new JLabel("Total Sales          :");
		lblTotalSales1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalSales1.setBounds(10, 74, 174, 36);
		panel_4.add(lblTotalSales1);
		
		totalsales1 = new JTextField();
		totalsales1.setEditable(false);
		totalsales1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totalsales1.setColumns(10);
		totalsales1.setBackground(SystemColor.info);
		totalsales1.setBounds(228, 74, 142, 36);
		panel_4.add(totalsales1);
		
		JLabel lblTotalExp = new JLabel("Total Expenses    :");
		lblTotalExp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalExp.setBounds(10, 120, 174, 36);
		panel_4.add(lblTotalExp);
		
		totalexpenses = new JTextField();
		totalexpenses.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totalexpenses.setEditable(false);
		totalexpenses.setColumns(10);
		totalexpenses.setBackground(SystemColor.info);
		totalexpenses.setBounds(228, 120, 142, 36);
		panel_4.add(totalexpenses);
		
		JLabel lblemploySalary1 = new JLabel("Employee Salary  :");
		lblemploySalary1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblemploySalary1.setBounds(10, 166, 174, 36);
		panel_4.add(lblemploySalary1);
		
		employSalary = new JTextField();
		employSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		employSalary.setEditable(false);
		employSalary.setColumns(10);
		employSalary.setBackground(SystemColor.info);
		employSalary.setBounds(228, 166, 142, 36);
		panel_4.add(employSalary);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.desktop);
		panel_5.setBounds(10, 229, 360, 4);
		panel_4.add(panel_5);
		
		JButton btnNetProfit = new JButton("Net Profit");
		btnNetProfit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					 totalsales1.setText(totalsales.getText());
					 totalexpenses.setText(TotalExp.getText());
					 employSalary.setText(EmploySalary.getText());
					 
				double TotalSales = Double.parseDouble(totalsales1.getText());
				double TotalExpenses = Double.parseDouble(totalexpenses.getText());
				double Employsalary = Double.parseDouble(employSalary.getText());
				      
			        netProfit = TotalSales - TotalExpenses - Employsalary;
			        NetProfit.setText(Double.toString(netProfit));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the data correctly", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNetProfit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNetProfit.setBounds(10, 253, 142, 36);
		panel_4.add(btnNetProfit);
		
		NetProfit = new JTextField();
		NetProfit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NetProfit.setEditable(false);
		NetProfit.setColumns(10);
		NetProfit.setBackground(SystemColor.text);
		NetProfit.setBounds(228, 253, 142, 36);
		panel_4.add(NetProfit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventExp.setText("");
				MaintenanceFees.setText("");
				UtilityFees.setText("");
				AdvertFees.setText("");
				TotalExp.setText("");
				totalsales.setText("");				
				totalsales1.setText("");
				totalexpenses.setText("");
				employSalary.setText("");
				NetProfit.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(427, 410, 143, 39);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance Statement", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					HHome frame = new HHome();
					frame.setModalExclusionType(null);
		            frame.setVisible(true);
		            dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(660, 410, 143, 39);
		panel.add(btnExit);
		
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
		btnBack.setBounds(692, 593, 143, 39);
		panel.add(btnBack);
		}
}
