import java.util.*;
public class solvingForCarrots{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int input[] = new int[2];
		for(int i = 0; i < 2 ; i++){
			input[i] = io.getInt();
		}

		int n = input[0];
		String array[] = new String[n];
		for(int i = 0; i < n; i++){
			array[i] = io.getWord();
		}

		System.out.println(input[1]);

	}
}