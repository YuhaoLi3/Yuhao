// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to yuhao's tip calculator!");
        System.out.print("How many people are in your group: ");
        String people = scan.nextLine();
        System.out.print("What is the tip percentage(0-100): ");
        double tip = scan.nextDouble();
        int number = 0;
        double total = 0;
        while (number != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            number = scan.nextInt();
            total += number;

        }
        total++;
        System.out.print("Total bill before tip: $"+total);
        System.out.print("total percemtage: "+tip+"%");
        double tipTotal = 0;
        tip *=.01;
        tipTotal = total * tip;
        System.out.print("total tip: $" + tipTotal);
        total = total + tipTotal;
        System.out.print("total bill with tip: $"+ total);
        System.out.print(total);






    }
}