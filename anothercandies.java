import java.util.*;
import java.math.BigInteger; 
import java.math.BigInteger;

public class anothercandies{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		//BigInteger output = new BigInteger("0.0");
		int cases = Integer.parseInt(io.getWord());
		//int students = 0;
		
		
		//String space = "";
		

		//for(int i = 0; i < cases; i++){
		while(cases-- > 0){
			int students = Integer.parseInt(io.getWord());

			BigInteger candies = BigInteger.ZERO;
			//students=io.getInt();
			//space = io.getWord();
			for(int j = 0; j < students; j++){
				BigInteger sweet = new BigInteger(io.getWord());
				candies = candies.add(sweet);
				//candies = candies.add(BigInteger.valueOf(sweet));
			}
			BigInteger modulus = candies.mod(BigInteger.valueOf(students));
			//if((modulus.toString()).equals("0")){
			//	System.out.println("YES");
			//}
			//else{
			//	System.out.println("NO");
			//}

			System.out.println((modulus.toString()).equals("0")?"YES":"NO");

			//students = 0;
			//candies = ("0");
		}
	}
}