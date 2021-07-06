package Project;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class HAdvertisementNMarketing extends JFrame {

	private JPanel contentPane;
	private JTextField textField_discount;
    static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HAdvertisementNMarketing ANM = new HAdvertisementNMarketing();
					ANM.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HAdvertisementNMarketing() {
		setTitle("Advertisement and Marketing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 749);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel.setBackground(new Color(233, 150, 122));
		panel.setBounds(0, 0, 947, 712);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Have a Homestay???");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(288, 30, 376, 79);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Pictures\\icon\\Screenshot 2021-06-23 213600.png"));
		lblNewLabel_1.setBounds(10, 120, 311, 202);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Pictures\\icon\\Screenshot 2021-06-23 210449.png"));
		lblNewLabel_2.setBounds(345, 191, 253, 241);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("The Lower Price For Homestay Host Is Only  RM 159.90 !!!");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(114, 495, 728, 41);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("You will get");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_4.setBounds(50, 546, 200, 41);
		panel.add(lblNewLabel_4);
		
		textField_discount = new JTextField();
		JTable t = HAdminAdvertisementNMarketing.getTable();
		String disc = "";
		for(int j = 0; j<t.getRowCount(); j++) {
			disc = String.valueOf(t.getValueAt(j, 0));
		}
		textField_discount.setText(disc);
		textField_discount.setForeground(Color.BLACK);
		textField_discount.setBackground(new Color(233, 150, 122));
		textField_discount.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField_discount.setBounds(251, 546, 79, 41);
		panel.add(textField_discount);
		textField_discount.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("% if you rent for more than 30 Days");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_5.setBounds(328, 546, 584, 41);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ASUS\\Pictures\\icon\\Screenshot 2021-06-23 213645.png"));
		lblNewLabel_6.setBounds(628, 120, 309, 200);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Come And Rent The Homestay!!!");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_7.setBounds(237, 434, 511, 51);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("For more information, please visit");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(10, 673, 405, 29);
		panel.add(lblNewLabel_8);
		
		JButton btninformation = new JButton("https://www.homestay.com/");
		btninformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://www.homestay.com/"));
				}
				
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btninformation.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btninformation.setBounds(358, 673, 295, 29);
		panel.add(btninformation);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HCustomer C = new HCustomer();
				C.setModalExclusionType(null);
				C.setVisible(true);
				dispose();
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnback.setBounds(10, 10, 133, 51);
		panel.add(btnback);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(713, 387, 66, -44);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"discount"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		HAdminAdvertisementNMarketing.table = table;
	}
}