import java.util.*;
class A17{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side value of Triangle: ");
		int a=sc.nextInt(); 
		int b=sc.nextInt(); 
		int c=sc.nextInt();
		int s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle: "+area);
		System.out.println(a+" "+b);
		 a=b^a;
		 b=b^a;
		 a=b^a;
		System.out.println(a+" "+b);
	}
}
		