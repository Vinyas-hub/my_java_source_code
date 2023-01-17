package Staticex;

public class Obj {
	static int c=0;
	static void count(){
		c++;
	}
	public static void main(String[] args) {
	
		Obj o=new Obj();
		o.count();
		Obj o1=new Obj();
		o1.count();
		Obj o2=new Obj();
		o2.count();
		System.out.println("count"+c);
	}

}
