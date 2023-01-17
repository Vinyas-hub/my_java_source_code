package Stringex;

public class StringBulider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="hello people !this is the string builder text";
		StringBuilder builder=new StringBuilder();
		builder.append("hello people!");
		builder.append("this is the stringbuilder text  ");
		System.out.println(builder);
		
		builder.insert(13,"welcome ");
		System.out.println(builder);
		builder.replace(6,12,"programers");
		builder.delete(33,50);
		System.out.println(builder);
		builder.insert(33,"Stringbuffer");
		System.out.println(builder);
		
		

	}

}
