import java.util.*;
public class autori{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		String input = io.getWord();
		String[] array = input.split("-");
		System.out.print(array[0].charAt(0));
		for(int i = 1; i < array.length;i++){
			System.out.print(array[i].charAt(0));
		}
	}
}