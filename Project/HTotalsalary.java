package Project;

public class HTotalsalary implements HPayment {  // Interface  use in class Employee
	
	public double disc() {  
		return 0.06;
	}
	
	public double rentPrice(String selection, int day) { //method for salary
		double price=0;
		
				if(selection=="Manager") {    //start selection 1
					  return price = 3599.90;
	
					} //end selection 1
						
				else if(selection=="Assistant Manager") {  //start selection 2
					  return price=2999.90;	

					}  //end selection 2
						
				else if(selection=="Supervisor") { //start selection 3
								return price=2599.90;	

					}  //end selection 3
				
				return price;
		}  //end of method rentPrice
	
	public double getPayment(String selection, int day) {
        day = 1;
		return rentPrice(selection, day);
	}
	
	public double getPayment(String selection, int day, double disc) {  //method with 4 arguments implement form class interface to calculate total salary
		day=1;
		return day*rentPrice(selection,day)*(1-disc);
	}
}
