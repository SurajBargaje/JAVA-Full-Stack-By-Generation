import java.util.*;
public class CircleArea{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Radius : ");
	int r = sc.nextInt();
	area(r);
}
	static void area(int r){
	double area = ((Math.PI)*r*r);
	System.out.print(area);


}

}