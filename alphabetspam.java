import java.util.*;
public class alphabetspam{
	public static void main(String args[]){
			Kattio io = new Kattio(System.in);
			String input = io.getWord();
			String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lower = "abcdefghijklmnopqrstuvwxyz";

			double whiteSpace = 0.0;
			double upperCase = 0.0;
			double lowerCase = 0.0;
			double special = 0.0;
			double length = input.length();


			for(int i = 0; i < input.length(); i ++){
				if(input.charAt(i)=='_'){
					whiteSpace++;
				}
				else if(upper.indexOf(input.charAt(i))!=-1){
					upperCase++;
				}
				else if(lower.indexOf(input.charAt(i))!=-1){
					lowerCase++;
				}
				else{
					special++;
				}

			}
			System.out.println(whiteSpace/length);
			System.out.println(lowerCase/length);
			System.out.println(upperCase/length);			
			System.out.println(special/length);

	}
}