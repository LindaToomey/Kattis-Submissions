import java.util.*;
public class oddities{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int input = io.getInt();
		int array[] = new int[input];
		for(int i = 0; i< input; i ++){
			array[i] = io.getInt();
		}

		for(int i = 0; i< input; i ++){
			if(array[i]%2==0){
				System.out.println(array[i] + " is even");
			}
			else{
				System.out.println(array[i] + " is odd");
			}
		}
	}
}