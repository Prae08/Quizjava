import java.util.Scanner;
public class g3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Score :");
        Double score = sc.nextDouble();
     
        if ((score > 79) && (score < 99) ) {
            System.out.println("You got grade A");
        }
        else if ((score > 74) && (score < 78)) {
            System.out.println("You got grade B+");
        }
        else if ((score > 69) && (score < 73)) {
            System.out.println("You got grade B");
        }
        else if ((score > 64) && (score < 68)) {
            System.out.println("You got grade C+");
        }
        else if ((score > 59) && (score < 65 )) {
            System.out.println("You got grade C");
        }
        else if ((score > 54) && (score < 60)) {
            System.out.println("You got grade D+");
        }
        else if ((score > 49) && (score < 55)) {
            System.out.println("You got grade D");
        }
        else if ((score >= 0) || (score <= 49) ) {
            System.out.println("you didn't pass | "+score);
        }
        else{
            System.out.println("please enter score 1-100" + " | score" +score);
            
        }
        sc.close();
    }
}



