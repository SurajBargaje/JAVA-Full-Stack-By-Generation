import java.util.*;
public class Calculator{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number");
	int a = sc.nextInt();
	System.out.println("Enter Second Number");
	int b = sc.nextInt();
	Sum(a,b);
	Multiply(a,b);
	Substract(a,b);
	Divide(a,b,sc);
	Remainder(a,b);
	

	}

	static void Sum(int a,int b){
		int result = a+b;
		System.out.println("Sum is :"+result);
		System.out.println();
	}
		static void Multiply(int a,int b){
		int result = a*b;
		System.out.println("Multiplication is :"+result);
		System.out.println();
	}
		static void Substract(int a,int b){
		int result = a-b;
		System.out.println("Subtraction is :"+result);
		System.out.println();
	}
		static void Divide(int a,int b,Scanner sc){
		if(b==0){
		System.out.println("Cannot divide by zero. Enter a non-zero divisor:");
		b =sc.nextInt();
		Divide(a,b,sc);
	}
		else{
		int result = a/b;
		System.out.println("Division is :"+result);
		System.out.println();}
	}
		static void Remainder(int a,int b){
		if (b != 0) {
            	int result = a % b;
            	System.out.println("Remainder is: " + result);
            	System.out.println();
        } 	else {
            	System.out.println("Cannot calculate remainder when divisor is zero.");
        }

}
}