import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.print("Principal:");
        Scanner scanner=new Scanner(System.in);
        long principal= scanner.nextLong();
        System.out.print("Time:");
        Scanner scanner1=new Scanner(System.in);
        int time=scanner1.nextInt();
        System.out.print("Interest Rate:");
        Scanner scanner2=new Scanner(System.in);
        float rate=scanner2.nextFloat();
        double simpleInterest;
        double r= rate/12/100;
        int n=time *12;
        simpleInterest=(principal * r* Math.pow((1+r),n))/((Math.pow((1+r),n))-1);
        System.out.println("The simple Interest will be"+" "+ NumberFormat.getCurrencyInstance().format(simpleInterest));


    }
}