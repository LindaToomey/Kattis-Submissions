import java.util.*;
public class pot{
	public static void main(String args[]){
			Kattio io = new Kattio(System.in);
			int input = io.getInt();
			int array[] = new int[input];
			for(int i = 0; i < input; i ++){
				array[i] = io.getInt();
			}

			int x = 0;

			for(int i = 0; i < input; i ++){
				x+=Math.pow(array[i]/10,array[i]%10);
			}

			System.out.println(x);

	}
}