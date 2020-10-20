import java.util.*;

public class plantingTrees{
	public static void main(String args[]){
	Kattio io = new Kattio(System.in);
	int n = io.getInt();
	Integer days[] = new Integer[n];

	for(int i = 0; i < n; i++){
		days[i] = io.getInt();
	}
	//String input = io.getWord();

	//String days[] = input.split(" ");
	//int days2[] = new int[n];

	int longestTime = 0;
	int newLongest = 0;
	int time = 0;

	//for(int i = 0; i < n; i++){
	//	days2[i] = Integer.parseInt(days[i]);
	//}
	Arrays.sort(days);
	reverse(days);

	for(int i = 0; i < n; i++){
		time = days[i] + i;

		if(time>longestTime){
			longestTime = time;
			time = 0;
		}
	}

	System.out.println(longestTime+2);

	}


 	public static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
    } 
    
}