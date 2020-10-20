import java.util.*;
public class cryptographersConundrum{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		String input = io.getWord();

		int noOFdays = 0;

		for(int i = 0; i < input.length(); i++){
			if((i+1)%3==1){
				if(input.charAt(i)=='P'){
					noOFdays = noOFdays;
				}
				else{
					noOFdays++;
				}

			}
			if((i+1)%3==2){
				if(input.charAt(i)=='E'){
					noOFdays = noOFdays;
				}
				else{
					noOFdays++;
				}
			}
			if((i+1)%3==0){
				if(input.charAt(i)=='R'){
					noOFdays = noOFdays;
				}
				else{
					noOFdays++;
				}
			}
	}
	System.out.println(noOFdays);
}
}