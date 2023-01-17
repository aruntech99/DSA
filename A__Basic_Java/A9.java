import java.util.*;
class A9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch1=sc.next().charAt(0);
		System.out.println(ch1);
		String ch2=""+ch1;
		char ch=ch2.toUpperCase().charAt(0);
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
			System.out.println("It's Vowel");
		}else{
			System.out.println("It's Consonant");
		}
		System.out.println((int)ch1);
	}
}