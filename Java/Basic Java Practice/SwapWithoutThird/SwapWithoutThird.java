import java.util.Scanner;

public class SwapWithoutThird{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Number");
	int a = sc.nextInt();
	System.out.println("Enter Second Number");
	int b = sc.nextInt();
	swap(a,b);
	}

	static void swap(int a,int b){
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("Swapped Number");
	System.out.println("First = "+a);
	System.out.println("Second = "+b);
	}

}