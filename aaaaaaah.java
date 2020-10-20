public class aaaaaaah{
	public static void main(String args[]){
		Kattio io = new Kattio(System.in);
		String jon = io.getWord();
		String doc = io.getWord();

		if(jon.lastIndexOf('h')<doc.lastIndexOf('h')){
			System.out.println("no");
		}
		else{
			System.out.println("go");
		}
	}
}