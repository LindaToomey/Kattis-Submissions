import java.util.*;
public class jumbledCompass{
	public static void main(String args[]){
			Kattio io = new Kattio(System.in);
			int num1 = io.getInt();
			int num2 = io.getInt();
			int answer = 0;

			if(num1>num2){
				answer = method1(num1,num2);
			}
			else{
				answer = method2(num1,num2);
			}

			System.out.println(answer);
	}

	public static int method1(int num1, int num2){
		int dir1 = 0;
		int dir2 = 0;
		int ans = 0;

		dir1 = -(num1-num2);
		dir2 = ((360-num1)+num2);

		if(dir1 == -dir2){
			if(dir1>1){
				ans =  dir1;
			}
			else{
				ans =  dir2;
			}
		}
		else if(Math.abs(dir1)<Math.abs(dir2)){
			ans = dir1;
		}
		else{
			ans = dir2;
		}
		return ans;
	}

	public static int method2(int num1, int num2){
		int dir3 = 0;
		int dir4 = 0;
		int toReturn = 0;

		dir3 = num2-num1;
		dir4 = -((360-num2)+num1);

		if(dir3 == -dir4){
			if(dir3>1){
				toReturn = dir3;
			}
			else{
				toReturn = dir4;
			}
		}
		else if(Math.abs(dir3)<Math.abs(dir4)){
			toReturn = dir3;
		}
		else{
			toReturn = dir4;
		}

		return toReturn;
	}
}