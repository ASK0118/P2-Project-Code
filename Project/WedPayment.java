package Project;

interface WedPayment { //for finance
	double getPayment(double e, double a, double m, double u);
	double calNet(double tE, double tR);
}

interface paymentC{ //for customer
	
	double getPayment(int wedPackage, String p); //method without body but with 1 parameter
	
	double getRent(int rentPeriod,String pack); 
	
	double rateOfDiscount(int wedPackage); //method for discount

}
interface paymentE{ //for employee
	
	double getPayment(char position);
	
	double getPayment(int jobType, int hour);
	
	double rateOfAllowance(char position);
	
}