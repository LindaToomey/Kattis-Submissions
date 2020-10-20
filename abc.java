import java.util.*;
public class abc {
	public static void main(String args[]){
			Kattio io = new Kattio(System.in);
			int array[] = new int[3];
			for(int i = 0; i < 3; i ++){
				array[i] = io.getInt();
			}
			Arrays.sort(array);

			String order = io.getWord();

			for(int i = 0; i < 3; i ++){
				if(order.charAt(i)=='A'){
					System.out.print(array[0] + " ");
				}
				else if(order.charAt(i)=='B'){
					System.out.print(array[1] + " ");
				}
				else{
					System.out.print(array[2]+ " ");
				}
			}

		}
	}