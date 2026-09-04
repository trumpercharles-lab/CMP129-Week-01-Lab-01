import java.util.Scanner;

public class InterestEarned {
    public static void main(String args[]){
        Scanner newScanner=new Scanner(System.in);

        double principle, rate, T, amount;
        System.out.print("What is the Principle: ");
        principle=newScanner.nextDouble();

        System.out.print("\nWhat is the Rate: ");
        rate=newScanner.nextDouble();

        System.out.print("\nHow many times is it Compiled per Year: ");
        T=newScanner.nextDouble();

        amount=principle*(1+(rate/T));

        System.out.print("\n\nInterest Rate:                %"+rate+
                           "\nTimes Compounded:              "+T+
                           "\nPrinciple:                    $"+principle+
                           "\nInterest:                     $"+(principle/100)*rate+
                           "\nAmount in Savings:            $"+amount);
    }
}
