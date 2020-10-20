import java.util.*;
public class aboveaverage{
	public static void main(String Args[]){
		Kattio io = new Kattio(System.in);
		int num = io.getInt();
		int num2 = 0;
		double answer = 0.0;
		double average = 0.0;
		String toPrint = "";


		//So num is how many test cases there will be
		for(int i = 0; i < num; i ++){

			//num2 is how many students are in the test case
			num2 = io.getInt();
			answer = 0.0;
			average = 0.0;
			toPrint = "";

			//Here i take in all the scores 
			int array[] = new int[num2];
			for(int j = 0; j < num2; j++){
				array[j] = io.getInt();
			}

			//Now to find average... add up all scores
			for(int k = 0; k < num2; k++){
				average+=array[k];
			}

			//divide by number of students
			average=average/num2;

			//find how many students scored above the average
			for(int l = 0; l < num2; l++){
				if(array[l]>average){
					answer++;
				}
			}

			//Here i convert the average to a string
			toPrint = Double.toString((answer/num2)*100.00);
			//System.out.println(toPrint);

			//if the length of the string is more than 3 decimal points I check if the 4th decimal is bigger than 5 and 
			//if it is i print the 3rd decimal +1 instad
			if(toPrint.length()>6){
				if(Integer.parseInt(toPrint.valueOf(toPrint.charAt(6)))>=5){
					//if number has a 9 increase the second last digit and replace last digit with 0
					if(Integer.parseInt(toPrint.valueOf(toPrint.charAt(5)))==9){
						toPrint=(toPrint.substring(0,4)+((Integer.parseInt(toPrint.valueOf(toPrint.charAt(4))))+1))+"0";

					}
					else{
					toPrint=(toPrint.substring(0,5)+((Integer.parseInt(toPrint.valueOf(toPrint.charAt(5))))+1));
					}
				}
				else{
				toPrint=(toPrint.substring(0,6));
			}
			}





			//If the length is already to 3 decimals print it
			else if(toPrint.length()==6){
				toPrint=(toPrint);
			}
			//if its 1 decimal short add a 0 and so on.....
			else if(toPrint.length()==4){
				toPrint=(toPrint+"00");
			}
			
			else if(toPrint.length()==0){
				toPrint=("0.000");
			}
			else if(toPrint.length()==3){
				toPrint = toPrint+"00";
			}
			
			if(toPrint.equals("0.00")){
				toPrint="0.000";
			}
			System.out.println(toPrint+"%");


			
			//System.out.println((answer/num2)*100.00);


		}
	}
}