import java.util.Scanner;

public class g19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score : ");
        int score = scanner.nextInt();
        if (score > 79) {
            System.out.println(" grade A");
        } else if (score > 74)  {
            System.out.println("grade B+");
        } else if (score > 69) {
            System.out.println("grade B");
        } else if (score > 64)  {
            System.out.println(" grade C+");
        } else if (score > 59) {
            System.out.println("grade C");
        } else if (score > 54){
            System.out.println("grade D+");
        } else if (score > 49) {
            System.out.println("grade D");
        }  else {
            System.out.println("grade F");
        }
    }
}