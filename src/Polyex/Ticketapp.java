package Polyex;

public class Ticketapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t=new Ticket();
		t.setDetails();
		t=new Waiting();
		t.setDetails();
		t=new Confirm();
		t.confirmDetails();
		

	}

}
