import java.util.*;
public class threeDPrintedStatues{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		int n = io.getInt();
		int numberOfPrinters = 1;
		int count = 0;

		int days = 0;

		while (numberOfPrinters*2 <n){ 
			numberOfPrinters = numberOfPrinters*2;
			days++;
		}

		count = n/numberOfPrinters;

		if(n%numberOfPrinters!=0){
			count++;
		}

		System.out.println(count + days);
	}
}