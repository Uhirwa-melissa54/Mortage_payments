import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long principal=0;
     while(true) {
         System.out.print("Principal(1K_1M):");

         principal = scanner.nextLong();
         if (principal > 1_000 && principal < 1_000_000) {
            break;
         }
         System.out.println("We only lend between 1k and 1M");
     }

            System.out.print("Time:");
            Scanner scanner1 = new Scanner(System.in);
           int time=0;
            while (true) {
                 time = scanner1.nextInt();
                if (time > 0 && time <= 30)
                    break;
                System.out.println("Time must be between 0 and 30");


            }

            System.out.print("Interest Rate:");
            Scanner scanner2 = new Scanner(System.in);
            float rate=0;
            while (true) {
                rate= scanner2.nextFloat();
                if(rate >= 3 && rate <=60)
                    break;
                System.out.println("The interest rate must be between 3 and 60");



            }
            double r = rate / 12 / 100;
            double simpleInterest;
            int n = time * 12;
            simpleInterest = (principal * r * Math.pow((1 + r), n)) / ((Math.pow((1 + r), n)) - 1);
            System.out.println("The simple Interest will be" + " " + NumberFormat.getCurrencyInstance().format(simpleInterest));


        }
    }
