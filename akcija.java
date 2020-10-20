import java.util.*;
public class akcija{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);

		int book = io.getInt();
		Integer books[] = new Integer[book];
		for(int i = 0; i < book; i++){
			books[i] = io.getInt();
		}

		int total = 0;

		Arrays.sort(books);
		reverse(books);


		for(int i = 0; i < book; i++){
			if((i+1)%3!=0){
				total+=books[i];
			}
		}

		System.out.println(total);
	}

	public static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
       	//System.out.println(a);
    } 

}