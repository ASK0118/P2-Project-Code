package Project;

public class CtotalSalary implements CPayment {  //interface
	
	public double discount() {  //polymorphism (overriding)
		return 0.07;
	}
	
	public double Rentprice(String selection, String choose, int day) {  //method to calculate salary per day
		double price=0;
		
				if(selection.equals("Clerk")) {    //start selection 1
						if(choose.equals("Part Time")) {	//start choose 1
								return price=10;	
						}  //end choose 1
						
						else  
							 return price=2000;
	

					} //end selection 1
						
				 if(selection.equals("Supervisor")) {  //start selection 2
							if(choose.equals("Part Time")) {  //start choose 1
									return price=30;	
							}  //end choose 1
							
							else 
								return price=2500;	
	

						}  //end selection 2
						
				 if(selection.equals("Manager")) { //start selection 3
						if(choose.equals("Part Time")) {  //start choose 1
								return price=100;
						    }
						else 
								return price=3500;	
	
					}  //end selection 3
				
				return price;
		}  //end of method Rentprice
	
	public double getPayment(String selection,String choose, int day) {  //polymorphism (overloading)
		return day*Rentprice(selection,choose,day);
	}
	
	public double getPayment(String selection,String choose, int day, double discount) {  //polymorphism (overloading)
		day=1;
		return day*Rentprice(selection,choose,day)*(1-discount);
	}
	
}  //end totalSalary class
