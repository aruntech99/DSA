public class A1{
	int b=20;   // instance variable
	public void fun(){
		int d=90;
		System.out.println(b+" "+d);
		b++;
		d++;
	}
	static int c=30; //static variable
	public static void main(String args[]){
		int a=10;  // local variable
		System.out.println("Local variable: "+a);
		A1 ref=new A1();
		ref.fun();
		ref.fun();
		System.out.println("Instance Variable: "+ref.b);
		System.out.println("Static Variable: "+c);
	}
}