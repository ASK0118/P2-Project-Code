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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;

public class WedAdminPack extends JFrame {

	private JPanel contentPane;
	private JTextField price;
	public static JTable table;
	private JTextArea infotxt;
	private JTextField suit;
	private JTextField gown;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WedAdminPack frame = new WedAdminPack();
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
	public WedAdminPack() {
		DecimalFormat df = new DecimalFormat("0.00");
		setTitle("Romance Wedding - Wedding Package Description");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(221, 160, 221)));
		panel.setBounds(10, 10, 705, 615);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnDelete.setBounds(449, 542, 104, 31);
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
		btnNewButton_1_1.setBackground(new Color(153, 204, 255));
		btnNewButton_1_1.setBounds(587, 10, 110, 31);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedHomePage hP = new WedHomePage();
				hP.setModalExclusionType(null);
	            hP.setVisible(true);

			}
		});

		gown = new JTextField();
		gown.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		gown.setColumns(10);
		gown.setBounds(215, 219, 176, 30);
		panel.add(gown);
		
		suit = new JTextField();
		suit.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		suit.setColumns(10);
		suit.setBounds(215, 288, 176, 30);
		panel.add(suit);
		
		JComboBox jewelrycombo = new JComboBox();
		jewelrycombo.setModel(new DefaultComboBoxModel(new String[] {"Select", "Included", "Not Included"}));
		jewelrycombo.setForeground(Color.BLACK);
		jewelrycombo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		jewelrycombo.setBackground(new Color(153, 204, 255));
		jewelrycombo.setBounds(215, 353, 176, 30);
		panel.add(jewelrycombo);
		
		JComboBox photocombo = new JComboBox();
		photocombo.setModel(new DefaultComboBoxModel(new String[] {"Select", "Included", "Not Included"}));
		photocombo.setForeground(Color.BLACK);
		photocombo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		photocombo.setBackground(new Color(153, 204, 255));
		photocombo.setBounds(215, 416, 176, 30);
		panel.add(photocombo);
		
		JPanel packagePanel_2_1_1 = new JPanel();
		packagePanel_2_1_1.setLayout(null);
		packagePanel_2_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel_2_1_1.setBounds(24, 416, 168, 30);
		panel.add(packagePanel_2_1_1);
		
		JLabel packageLabel_2_1_1 = new JLabel("Photoshooting");
		packageLabel_2_1_1.setForeground(new Color(0, 0, 153));
		packageLabel_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel_2_1_1.setBounds(10, 0, 137, 28);
		packagePanel_2_1_1.add(packageLabel_2_1_1);
		
		JPanel packagePanel_2_1 = new JPanel();
		packagePanel_2_1.setLayout(null);
		packagePanel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel_2_1.setBounds(24, 353, 168, 30);
		panel.add(packagePanel_2_1);
		
		JLabel packageLabel_2_1 = new JLabel("Jewelry Set");
		packageLabel_2_1.setForeground(new Color(0, 0, 153));
		packageLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel_2_1.setBounds(10, 0, 137, 28);
		packagePanel_2_1.add(packageLabel_2_1);
		
		JPanel packagePanel_2 = new JPanel();
		packagePanel_2.setLayout(null);
		packagePanel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel_2.setBounds(24, 288, 168, 30);
		panel.add(packagePanel_2);
		
		JLabel packageLabel_2 = new JLabel("Wedding Suit");
		packageLabel_2.setForeground(new Color(0, 0, 153));
		packageLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel_2.setBounds(10, 0, 137, 28);
		packagePanel_2.add(packageLabel_2);
		
		JPanel packagePanel_1 = new JPanel();
		packagePanel_1.setLayout(null);
		packagePanel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel_1.setBounds(24, 219, 168, 30);
		panel.add(packagePanel_1);
		
		JLabel packageLabel_1 = new JLabel("Wedding Gown");
		packageLabel_1.setForeground(new Color(0, 0, 153));
		packageLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel_1.setBounds(10, 0, 157, 28);
		packagePanel_1.add(packageLabel_1);
		
		JPanel packagePricePanel = new JPanel();
		packagePricePanel.setLayout(null);
		packagePricePanel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePricePanel.setBounds(24, 484, 147, 30);
		panel.add(packagePricePanel);
		
		JLabel packagePrice = new JLabel("Price (RM)");
		packagePrice.setForeground(new Color(0, 0, 153));
		packagePrice.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packagePrice.setBounds(14, 0, 194, 28);
		packagePricePanel.add(packagePrice);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(413, 154, 270, 369);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 271, 369);
		panel_2.add(scrollPane);
		
		table =  new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Package", "Gown", "Suit", "Jewelry", "Photoshoot", "Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JComboBox comboBoxPackage = new JComboBox();
		comboBoxPackage.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		comboBoxPackage.setBackground(new Color(153, 204, 255));
		comboBoxPackage.setModel(new DefaultComboBoxModel(new String[] {"Select Package", "Package 1", "Package 2", "Package 3", "Premium Package"}));
		comboBoxPackage.setForeground(new Color(0, 0, 0));
		comboBoxPackage.setBounds(215, 154, 176, 30);
		panel.add(comboBoxPackage);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnNewButton.setBounds(41, 542, 85, 31);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						comboBoxPackage.getSelectedItem(),
						gown.getText(),
						suit.getText(),
						jewelrycombo.getSelectedItem(),
						photocombo.getSelectedItem(),
						price.getText(),
						
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information Update Confirmation", "New Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
				try {
					File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Project\\AdminWedPackage.txt");
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
		});
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnUpdate.setBounds(166, 542, 104, 31);
		panel.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(comboBoxPackage.getSelectedItem(),i,0);
			    	model.setValueAt(gown.getText(),i,1);
			    	model.setValueAt(suit.getText(),i,2);
			    	model.setValueAt(jewelrycombo.getSelectedItem(),i,3);
			    	model.setValueAt(photocombo.getSelectedItem(),i,4);
			    	model.setValueAt(price.getText(),i,5);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		
		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		reset.setBounds(308, 542, 104, 31);
		panel.add(reset);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxPackage.setSelectedItem("Select Package");
				gown.setText("");
				suit.setText("");
				jewelrycombo.setSelectedItem("Select");
				photocombo.setSelectedItem("Select");
				price.setText("");
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("< Back");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBackground(new Color(153, 204, 255));
		btnNewButton_1.setBounds(507, 10, 70, 31);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WedEmployee h = new WedEmployee();
				h.setModalExclusionType(null);
	            h.setVisible(true);		
			}
		});
		
		
		price = new JTextField();
		price.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		price.setBounds(215, 484, 176, 30);
		panel.add(price);
		price.setColumns(10);
		
		JPanel packagePanel = new JPanel();
		packagePanel.setLayout(null);
		packagePanel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(153, 204, 255)));
		packagePanel.setBounds(24, 154, 147, 30);
		panel.add(packagePanel);
				
		JLabel packageLabel = new JLabel("Package");
		packageLabel.setForeground(new Color(0, 0, 153));
		packageLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		packageLabel.setBounds(30, 0, 127, 28);
		packagePanel.add(packageLabel);
		
		JLabel lblNewLabel = new JLabel("Wedding Package Description");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(166, 40, 406, 43);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		
		JLabel lblNewLabel_1 = new JLabel("Wedding Package Description");
		lblNewLabel_1.setForeground(new Color(0, 0, 153));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblNewLabel_1.setBounds(170, 40, 396, 43);
		panel.add(lblNewLabel_1);
		
		JLabel Background = new JLabel("");
		Background.setForeground(new Color(51, 0, 153));
		Background.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\ProjectWeddingRentalImage\\pexels-photo-2788494.jpeg"));
		Background.setBounds(-64, 0, 796, 616);
		panel.add(Background);

	}
	public static void AddRowToJtable(Object [] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		WedAdminPack.table = table;
	}
}