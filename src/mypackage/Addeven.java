package mypackage;

public class Addeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=1;
		int co=1;
		while(co<=10)
		{
			if(num%2==0)
			{
				sum+=num;
				co++;

				
				
			}
			num++;
		}
		System.out.println(sum);
	}

}
