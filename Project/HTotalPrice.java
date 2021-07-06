package Project;

import javax.swing.JTable;

public class HTotalPrice implements HPayment { //2.5 Interface


	public double disc() {
		JTable t = HAdminAdvertisementNMarketing.getTable();
		String discount = "";
		double disc;
		for(int i = 0; i<t.getRowCount(); i++) {
			discount = String.valueOf(t.getValueAt(i, 0));
		}
		disc = Double.parseDouble(discount)/100;
		
		return disc;
	}
	

		public double rentPrice(String selection, int day) {
			JTable t = HAdminAuthenticHomestay.getTable();
			String pr = "";
			double price=0;
			
			if (selection.equals("Authentic Homestay")) {
			for(int i = 0; i<t.getRowCount(); i++) {
				
				pr = String.valueOf(t.getValueAt(i, 0));
				price = Double.parseDouble(pr);
				}
			
			
				if(day<7) {
					
					return price;
				}
				else if(day>=7 && day<30) {
					return price-20;
				}
				
				else {
					return price-(price*disc());
				}
			}//end of selection 1	
		
		else if(selection.equals("Comfortable Homestay")) {
		   JTable t1 = HAdminComfortableHomestay.getTable();
		   String p = "";
		   double Price=0;
		   
		   for(int j = 0; j<t.getRowCount(); j++) {
		   if (selection.equals("Comfortable Homestay")) {   
		   p = String.valueOf(t1.getValueAt(j, 0));
		   Price = Double.parseDouble(p);
		   }
		   }
				if(day<7) {
					return Price;
					}
				
				else if(day>=7 && day<30) {
					return Price-20;
				}
				
				else {
					return Price-(Price*disc());
				}
			}// end of selection 2
			
			else {
				JTable t2 = HAdminTouristHomestay.getTable();
				   String PR = "";
				   double PRICE=0;
				   
				   for(int n = 0; n<t.getRowCount(); n++) {
				   if (selection.equals("Tourist Homestay")) {   
				   PR = String.valueOf(t2.getValueAt(n, 0));
				   PRICE = Double.parseDouble(PR);
				   }
				   }
						if(day<7) {
							return PRICE;
							}
						
						else if(day>=7 && day<30) {
							return PRICE-20;
						}
						
						else {
							return PRICE-(PRICE*disc());
						}
					}// end of selection 3
		}
		public double getPayment(String selection, int day) { //overloading method with 2 argument
			
			return rentPrice(selection, day)*day;	
	}
		
		public double getPayment(String selection, int day, double disc) { //overloading method with 3 argument
			
			return rentPrice(selection, day)*day;
		}
		
}