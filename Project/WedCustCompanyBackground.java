package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class WedCustCompanyBackground extends JFrame{

	private JPanel contentPane;
	private JTextField contacttext;
	private JTextField webtext;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedCustCompanyBackground frame = new WedCustCompanyBackground();
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
	public WedCustCompanyBackground() {
		setTitle("Romance Wedding - Company Background");
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\wedding-gif-4.gif"));
		lblNewLabel.setBounds(495, 128, 370, 432);
		panel.add(lblNewLabel);
		
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
		txtpnGrabTheBest.setText("Romance Wedding is a Malaysian wedding rental company.\r\n\r\nWhy the name of Romance Wedding? What does it really mean?\r\n\r\nThe company is carried with the mission to serve more of our clients. We aimed to bring the best and romantic memories to our clients.\r\n \r\nGrab the BEST wedding rental services at ROMANCE WEDDING !!!\r\nServices provided:\r\n- Wedding Gown Rental (without photography session)\r\n- Wedding Suit Rental (without photography session)\r\n- Wedding Rental Packages"
				);
		txtpnGrabTheBest.setBackground(UIManager.getColor("CheckBox.background"));
		txtpnGrabTheBest.setCaretPosition(0);
		txtpnGrabTheBest.setEditable(false);
		
		JButton btnNewButton = new JButton("< Back");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(795, 10, 70, 31);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Contact No : ");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(30, 386, 125, 20);
		panel.add(lblNewLabel_4);
		
		contacttext = new JTextField();
		contacttext.setBounds(165, 384, 305, 31);
		panel.add(contacttext);
		contacttext.setColumns(10);
		contacttext.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JLabel lblNewLabel_4_1 = new JLabel("Address :");
		lblNewLabel_4_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(30, 433, 125, 20);
		panel.add(lblNewLabel_4_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(165, 436, 303, 47);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 303, 47);
		panel_5.add(scrollPane_1);
		
		JTextArea addresstext = new JTextArea();
		scrollPane_1.setViewportView(addresstext);
		addresstext.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Website : ");
		lblNewLabel_4_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_4_1_1.setBounds(30, 510, 125, 20);
		panel.add(lblNewLabel_4_1_1);
		
		webtext = new JTextField();
		webtext.setColumns(10);
		webtext.setBounds(165, 507, 305, 31);
		panel.add(webtext);
		webtext.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("Contact Us");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = WedAdminComBackground.getTable();
				String cn;
				String a;
				String w;
				boolean contact = false;
				

				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						cn = String.valueOf(t.getValueAt(i, 0));
						a = String.valueOf(t.getValueAt(i, 1));
						w = String.valueOf(t.getValueAt(i, 2));
						
						if(t != null) {
							contact = true;
							contacttext.setText(cn);
							addresstext.setText(a);
							webtext.setText(w);
							
						}
					}
						
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_1.setBounds(20, 341, 125, 35);
		panel.add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedHomePage h = new WedHomePage();
				h.setModalExclusionType(null);
	            h.setVisible(true);		
			}
		});
	}
}
