class A6{
	public static void main(String args[]){
	    int a=5,b=10;
		int c=(a>b)?(a-b):(b-a);
		System.out.println("Value of C is: "+c);
		int d=10;
		int e=d++;
		System.out.println(e+" "+d);
		int f=++d;
		System.out.println(d+" "+f);
	}
}