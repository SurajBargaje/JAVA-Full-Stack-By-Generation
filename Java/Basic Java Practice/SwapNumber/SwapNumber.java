import java.util.Scanner;
public class SwapNumber{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
	int a = sc.nextInt();
	System.out.println("Enter second number");
	int b = sc.nextInt();
	swap(a,b);

	}
	static void swap(int a,int b){
	int temp = a;
	a=b;
	b=temp;
	System.out.println("Swapped Number");
	System.out.println("First = "+a);
	System.out.println("Second = "+b);

	}

}