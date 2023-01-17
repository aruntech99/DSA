import java.util.*;
class A16{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius: ");
		int r=sc.nextInt();
		double area=(Math.PI)*r*r;
		System.out.println("area of circle: "+area);
		System.out.println(String.format("%.2f",area));		
	}
}