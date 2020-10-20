import java.util.*;
public class bijele{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int array[] = new int[6];
		int chessSet[] = new int[] {1,1,2,2,2,8};
		for(int i = 0; i < 6; i++){
			array[i] = io.getInt();
			System.out.print(chessSet[i]-array[i]+" ");
		}
		

	}
}