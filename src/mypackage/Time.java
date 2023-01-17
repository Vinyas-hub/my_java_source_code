package mypackage;

public class Time {

	public static void main(String[] args) {
		int t=3;
		
		// TODO Auto-generated method stub
		if(t>5){
			System.out.println("closing time");
		}
		else if(t>4){
			System.out.println("meeting time");
		}
		else if(t>3){
			System.out.println("market review");
		}
		else if(t>2){
			System.out.println("lunch time");
		}else if(t<12){
			System.out.println("good  morning");
		}
	}

}
