package Stringex;

public class Operations {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="It is raining outside!Can i have a rain coat please";
		String str1=str.toUpperCase();
		int count=0;
		
		System.out.println(str1);
		
		
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U'){
				count++;
			}
		}
		System.out.println("vowels"+count);
		String str2=str1.replace("RAIN COAT", "UMBRELLA");
			
		System.out.println(str2);
			
		String[] str3=str2.split(" ");
		String str4=String.join("#", str3);
		
			System.out.println(str4);
		}

	}


