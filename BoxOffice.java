import java.util.Scanner;

public class BoxOffice {
    public static void main(String args[]){
        Scanner newScanner=new Scanner(System.in);

        String Name;
        int Children;
        int Adults;

        System.out.print("What is the name of the movie you'd like to see: ");
        Name=newScanner.nextLine();

        System.out.print("\n\nHow many adult tickets would you like to buy: ");
        Adults=newScanner.nextInt();

        System.out.print("\n\nHow many children tickets would you like to buy: ");
        Children=newScanner.nextInt();

        double childrenCost=6;
        double adultCost=10;

        double grossBoxOfficeProfit=(childrenCost*Children)+(adultCost+Adults);
        double netBoxOfficeProfit=grossBoxOfficeProfit/5;
        double distributorProfit=grossBoxOfficeProfit-netBoxOfficeProfit;

        System.out.print("\n\nMovie Name:                   "+Name+
                           "\nAdult Tickets Sold:           "+Adults+
                           "\nChild Tickets Sold:           "+Children+
                           "\nGross Box Office Profit:      $"+grossBoxOfficeProfit+
                           "\nNet Box Office Profit:        $"+netBoxOfficeProfit+
                           "\nAmount Paid to Distributor:   $"+distributorProfit);
    }
}
