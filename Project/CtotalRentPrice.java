package Project;

import javax.swing.JTable;

public class CtotalRentPrice implements CPayment {  //interface
	
	public double discount() {  //polymorphism (overriding)
		JTable t = CAdminAdvertisement.getTable();
		String discount="";
		double dis;
		
			if (t==null) {
				return 0.1;
			}
		
			else {
				for(int i = 0; i<t.getRowCount(); i++) { 
				discount= String.valueOf(t.getValueAt(i, 0));}
				dis = Double.parseDouble(discount)/100;
				return dis;}
	
	}
	public double Rentprice(String selection, String choose, int day) {  //method to calculate rental price per day
		JTable t = CAdminVehicleInfo.getTable();
		String p="";
		double price=0;
			
		for(int i = 0; i<t.getRowCount(); i++) { 
			if (selection.equals(t.getValueAt(i, 0))&&choose.equals(t.getValueAt(i, 1))) {
			p= String.valueOf(t.getValueAt(i, 3));
			price = Double.parseDouble(p);}
			}
		
			if(day<=7) 
				return price;
		
				else
					return price= price - price* discount();}//end of method Rentprice
	
	public double getPayment(String selection,String choose, int day) {  //polymorphism (overloading)
		return day*Rentprice(selection,choose,day);
	}
	
	public double getPayment(String selection, String choose, int day, double discount) {  //polymorphism (overloading)
		return day*Rentprice(selection,choose,day);
	}
	
}  //end totalRentPrice class