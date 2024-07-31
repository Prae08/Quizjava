import java.util.Scanner;

public class g5 {
    public static void main(String[] args) {      
        Scanner sn = new Scanner(System.in);

        System.out.println("Score Grade Program");

        System.out.print("Enter your score between 0 - 100: ");
        int score = sn.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("You must enter a correct score, try again later.");
        } 
        else {

            if (score >= 80) {
                System.out.println("You grant grade A");
            } 
            else if ((score >= 80)&&(score >= 79)) {
                System.out.println("You grant grade B+");
            } 
            else if ((score >= 70)&&(score >= 74)) {
                System.out.println("You grant grade B");
            } 
            else if ((score >= 65)&&(score >= 69)) {
                System.out.println("You grant grade C+");
            } 
            else if ((score >= 60)&&(score >= 64)) {
                System.out.println("You grant grade C");
            } 
            else if ((score >= 55)&&(score >= 59)) {
                System.out.println("You grant grade D+");
            } 
            else if ((score >= 50)&&(score >= 54)) {
                System.out.println("You grant grade D");
            } 
            else {
                System.out.println("You grant grade E.");
            }

        }
        sn.close();
    }
}