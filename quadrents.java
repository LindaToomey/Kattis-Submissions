import java.util.*;
public class quadrents{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int x = io.getInt();
		int y = io.getInt();

		if(x>0&&y>0){
			System.out.println("1");
		}
		else if(x<0&&y>0){
			System.out.println("2");
		}
		else if(x<0&&y<0){
			System.out.println("3");
		}
		else{
			System.out.println("4");
		}

	}
}