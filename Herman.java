import java.util.*;
public class Herman{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int radius = io.getInt();

		System.out.println(Math.PI*Math.pow(radius,2));

		System.out.println(2*Math.pow(radius,2));
	}
}