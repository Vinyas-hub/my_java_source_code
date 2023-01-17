package mypackage;

public class Ticket {
	String source;
	String destination;
	double price;
	
	Ticket(String s,String dest,double pr){
		source=s;
		destination=dest;
		price=pr;
	}
	
	public static void main(String[] args) {
		
		Ticket obj=new Ticket("mangalore","bangalore",1000);
		
		System.out.println(obj.source+obj.destination+obj.price);
		// TODO Auto-generated method stub

	}

}
