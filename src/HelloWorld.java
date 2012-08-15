import java.util.Scanner;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please enter how many time would you like  to tell hello");
		int n = input.nextInt();
		for(int i=0; i < n; i++)
			System.out.println("Hello World");
	}

}
