package application;

public class Program {

	public static void main(String[] args) {
		
	//exemplo de box e unboxing 
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		
		//o compilador não reconhece o Y como mesmo tipo que o obj entao precisa por o casting ->  '(int)' para poder meio que transformar o obj no tipo do int
		int y = (int) obj;
		
		System.out.println(y);
		
		
		
		

	}

}
