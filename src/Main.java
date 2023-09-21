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
        String tip = scan.nextLine();
        int number = 0;
        while (number != 1) {
            System.out.print("No silly, i said EVEN not odd! Try again: ");
            number = scan.nextInt();



        }
    }
}