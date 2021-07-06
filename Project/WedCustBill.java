package Project;

import javax.swing.JTable;

class WedCustBill implements paymentC{
	public double getPayment(int wedPackage,String p) { // method of implementation //calPrice according the package
		JTable t = WedAdminPack.getTable();
		String rp = "";
		double rentPrice = 0;
		
		if(t == null) {
			if(wedPackage == 1) {
				return rentPrice = 1599;
			}else if(wedPackage == 2){
				return rentPrice = 3999* (1-rateOfDiscount(wedPackage));
			}else if(wedPackage == 3) {
				return rentPrice = 1899;
			}else if(wedPackage == 4) {
				return rentPrice = 9999* (1-rateOfDiscount(wedPackage));
			}
		}
		else {
			for(int i = 0; i< t.getRowCount(); i++) {
			String.valueOf(t.getValueAt(i, 0));
			rp = String.valueOf(t.getValueAt(i, 5));
		
		if(wedPackage == 1 && p == String.valueOf(t.getValueAt(i, 0))) {
			//pack = "Package 1";
			rentPrice = Double.parseDouble(rp);
			return rentPrice;
		}else if(wedPackage == 2 && p == String.valueOf(t.getValueAt(i, 0))) {
			//pack = "Package 2";
			rentPrice = Double.parseDouble(rp);
			return rentPrice * (1-rateOfDiscount(wedPackage));
		}else if(wedPackage == 3 && p == String.valueOf(t.getValueAt(i, 0))) {
			//pack = "Package 3";
			rentPrice = Double.parseDouble(rp);
			return rentPrice;
		}else if(wedPackage == 4 && p == String.valueOf(t.getValueAt(i, 0))) {
			 //pack = "Premium Package";
			rentPrice = Double.parseDouble(rp);
			return rentPrice * (1-rateOfDiscount(wedPackage));
		}
		}
		}
		return rentPrice;
	}
	
	public double getRent(int rentPeriod, String pack) { //calPrice according the rentPeriod //rentPeriod >2 small fees will be charged
		double smallFee = 3.5;
		JTable t = WedAdminPack.getTable();
		String rp = "";
		double rentPrice = 0;
			if(t == null) {
				rentPrice = 1599;
			}
			else {
			for(int i = 0; i< t.getRowCount(); i++) {
			
			rp = String.valueOf(t.getValueAt(i, 5));
			
			if(pack == String.valueOf(t.getValueAt(i, 0))) {
				rentPrice = Double.parseDouble(rp);
				}
				
			}
			}
			
			
		return rentPrice + (rentPeriod * smallFee);
		
	}
	
	public double rateOfDiscount(int wedPackage) {  // different package have different rate of discount 
		JTable t = WedAdminAds.getTable();
		String d = "";
		double dis = 0;		
		if(t == null) {
			if(wedPackage == 2) { 
				dis = 0.1;}
				else if(wedPackage == 4) {
					dis = 0.2;}
		}
		else{
		for(int i = 0; i< t.getRowCount(); i++) {
			d = String.valueOf(t.getValueAt(i, 0));
		}
		if(wedPackage == 2) { 
		dis = (Double.parseDouble(d)/2)/100;}
		else if(wedPackage == 4) {
			dis = Double.parseDouble(d)/100;}
		}

		
		return dis;
	}
}
	//for employee
class employSal implements paymentE{
		
		public double getPayment(char position) { // calSalary according to the position
			double salary = 0;
			
			if(position == 'S')
				return salary = 2250 + (2250 * rateOfAllowance(position));
			else if(position == 'P')
				return salary = 1950 + (1950 * rateOfAllowance(position));
			else if(position == 'M')
				return salary = 1850 + (1850 * rateOfAllowance(position));
			else if (position == 'O')
				return salary = 1790 + (1790 * rateOfAllowance(position));
			return salary;
		}
		
		public double getPayment(int jobType, int hour) { //calSalary depends on full time/part time 
			double salary = 0;
			double epf = 0.11;
			
			if(jobType == 1)
				return salary = 9*hour;
			else if(jobType == 2)
				return salary = 1200 - (1200 * epf);
			
			return salary;
		}
		
		public double rateOfAllowance(char position) { // different position have different rate of allowance
			double allowance = 0;
			
			if(position == 'S')
				return allowance = 0.2;
			else if(position == 'P')
				return allowance = 0.15;
			else if(position == 'M')
				return allowance = 0.11;
			else if (position == 'O')
				return allowance = 0.05;
			
			return allowance;
		}
	}
class financeCal implements WedPayment{
	
	public double getPayment(double e, double a, double m, double u) {
		double employSalary = e, maintenanceFee = m, adsExpenses = a, utilityExpenses = u;
		
		return employSalary + maintenanceFee + adsExpenses + utilityExpenses;
	}
	
	public double calNet(double tE, double tR) {
		double totalexpenses = tE, totalRevenue = tR;
		
		return tR - tE;
	}
}