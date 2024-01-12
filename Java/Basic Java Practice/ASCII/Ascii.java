import java.util.*;
class Ascii{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a cherter to know ascii value");
	char c = sc.next().charAt(0);
	int ascii = (int) c;
	System.out.println(ascii);
	}

}