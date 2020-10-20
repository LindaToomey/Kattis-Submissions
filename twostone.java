import java.util.*;
public class twostone{
	public static void main(String args[]){
			Kattio io = new Kattio(System.in);
			int input = io.getInt();
			if(input%2==0){
				System.out.println("Bob");
			}
			else{
				System.out.println("Alice");
			}
		}
	}