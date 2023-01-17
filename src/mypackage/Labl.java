package mypackage;

public class Labl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] str={{"car","truck","lorry"},
		{"bike","scooter"},};
		outer:for(String[] x:str)
		{
			for(String y:x)
			{
				if(y.equals("lorry")){
					
				}
				break outer;
				
			}
			System.out.println(y);
		}			

		System.out.println("");
	}

}
