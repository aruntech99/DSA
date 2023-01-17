import java.util.Scanner;
class A7{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("You want to Check day , Enter number 1 to 7 :");
	int n=sc.nextInt();
	switch(n){
		case 1: System.out.print("Mon");
		break;
		default: System.out.println("Not");
	}
	   
	}
}