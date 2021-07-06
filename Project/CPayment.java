package Project;

public interface CPayment {  //interface
	double discount();
	double Rentprice(String selection,String choose, int day);
	double getPayment(String selection,String choose,int day);
	double getPayment(String selection,String choose, int day, double discount);
	
}
