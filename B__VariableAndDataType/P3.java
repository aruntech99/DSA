import java.util.Scanner;
public class P3 {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
    float p=sc.nextFloat();
    float pen=sc.nextFloat();
    float era=sc.nextFloat();
    float total=p+pen+era;
    float tn=total + (total*(0.18f));
    System.out.println(tn);
        sc.close();
    }
}

