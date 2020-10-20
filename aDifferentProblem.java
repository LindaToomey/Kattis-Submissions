import java.util.*;
public class aDifferentProblem{
	public static void main(String args[]){
	Kattio io = new Kattio(System.in);

	/*long[] array = new long[2];
	for(int i = 0; i < 2; i++){
		array[i] = io.getLong();
	}

	long num1 = array[0];
	long num2 = array[1];
	
	System.out.println(Math.abs(num1-num2)); */

	long a = 0;
	long b = 0;

	do{
		a = io.getLong();
		b = io.getLong();
		System.out.println(Math.abs(a-b));
	}while(io.hasMoreTokens());

	}
}