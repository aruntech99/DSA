import java.util.*;
class A15{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operator: ");
		char op=sc.next().charAt(0);
		switch(op){
			case '+':
			System.out.println("Sum of A and B is "+(a+b));
			break;
			case '-':
			System.out.println("sub of A and B is "+(a-b));
			break;
			case '*':
			System.out.println("mul of A and B is "+(a*b));
			break;
			case '/':
			System.out.println("div of A and B is "+(a/b));
			break;
			default:
			System.out.println("Operator is invaild");
			
		}
	}
}