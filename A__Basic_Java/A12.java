import java.util.*;
class A12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		System.out.println("Enter the power: ");
		int n=sc.nextInt();
		int res=a;
		for(int i=2;i<=n;i++){
		   res=res*a;
		}
		System.out.println(res);
		}
}
		