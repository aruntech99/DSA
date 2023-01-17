import java.util.*;
class A11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		String s=(a>b) ? "a is greater value" : "b is Greater  value ";
		System.out.println(s);
	}
}