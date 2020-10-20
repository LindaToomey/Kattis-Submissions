import java.util.*;
public class areal{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		double sqrMeters = io.getDouble();
		double oneSide = Math.sqrt(sqrMeters);
		System.out.println(oneSide*4);
	}
}