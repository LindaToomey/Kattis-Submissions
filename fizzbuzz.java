import java.util.*;
public class fizzbuzz{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int x = io.getInt();
		int y = io.getInt();
		int n = io.getInt();

		for(int i = 1; i < n+1; i++){
			if(i%x == 0 && i%y == 0){
				System.out.println("FizzBuzz");
			}
			else if(i%x == 0){
				System.out.println("Fizz");
			}
			else if(i%y == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}