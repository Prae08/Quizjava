import java.util.Scanner;

public class g17
 {
    public static void main (String [] args) {
        //Variable setup
        int score;
        char grade1,note;

        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter your score: >> ");
        score = scan.nextInt();
        grade1 = (0);
        note = (0);

        if ( score <= 100 && score >= 80 ) {
            grade1 = 'A';
        }

        else if ( score <=79  & score >= 70 ) {
            grade1 = 'B';
            if (score <= 79 & score >= 75) {
                note = '+';
            }
        }

        else if ( score <= 69 & score >= 60 ) {
            grade1 = 'C';
            if (score <= 69 & score >= 65) {
                note = '+';
            }
        }

        else if ( score <= 59 & score >= 50 ) {
            grade1 = 'D';
            if (score <= 59 & score >= 55) {
                note = '+';
            }
        }

        else if ( score <= 49 ) {
            grade1 = 'E';
        }
        System.out.println("You have grade " + grade1 + note);
        scan.close();
        System.exit(0);

    }
}