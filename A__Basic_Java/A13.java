import java.util.*;
class A13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c=sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println(a);
			}else{
				System.out.println(c);
			}
		}else{
			if(b>c){
				System.out.println(b);
			}else{
				System.out.println(c);
			}
		}
		int res=(a>b)?(a>c)? a:c:(b>c)?b:c;
		System.out.println(res);
	}
}