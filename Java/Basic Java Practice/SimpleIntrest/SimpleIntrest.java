import java.util.*;
class SimpleIntrest{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Principal Amount P");
	int p = sc.nextInt();
	System.out.println("Enter Time T");
	int t = sc.nextInt();
	System.out.println("Enter Rate Of Intrest R");
	int r = sc.nextInt();
	

	int SI = ((p*t*r)/100);
	System.out.println("Simple Intrest Is : "+SI);

}


}