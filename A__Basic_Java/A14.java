import java.util.*;
class A14{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=10;i++){
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		System.out.println("-------------------------------------------------------------------------------");
		int c1=0;
		int num=9;
		while(num>0){
			 num=num/10;
			 c1++; 
		}
		System.out.println(c1);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Enter Your Age: ");
		int age=sc.nextInt();
		  if(age>=18)
			System.out.println("You Guys eligible to vote"); 
		 else
			System.out.println("You Guys not eligible to vote");
			
			
		 
	}
}