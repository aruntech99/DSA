import java.util.Scanner;
class A8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Any Number: ");
		int n=sc.nextInt();
		System.out.println("------------------------------");
		if(n%2==0){
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is odd");
		}
		System.out.println("------------------------------");
		int sum=0;
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("Sum of n number: "+sum);
		
		
	}
}