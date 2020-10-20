import java.util.*;
public class phonelist{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int cases = io.getInt();
		boolean consistent = true;
		String prefix = "";
		String number = "";


		for(int i = 0; i < cases; i++){
			consistent = true;
			int n = io.getInt();
			String[]numbers = new String[n];
			for(int j = 0; j < n; j++){
				numbers[j] = io.getWord();
			}

			Arrays.sort(numbers);

			for(int k = 1; k < numbers.length; k++){
				if(numbers[k].startsWith(numbers[k-1])){
					consistent = false;
					break;
				}
			}

			System.out.println(consistent ? "YES" : "NO");
		}
		io.close();
	}
}