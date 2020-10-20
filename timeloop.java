import java.util.*;
public class timeloop{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int times = io.getInt();
		for(int i = 0; i < times; i++){
			System.out.println(i+1 + " " + "Abracadabra");
		}
	}
}