import java.util.Scanner;

public class g20 {
    public static void main(String[] args) {

        System.out.println("==Program-Graded==");
        System.out.print("Input score : >> ... ");
        byte kbscore;
        Scanner scan = new Scanner(System.in);
        kbscore = scan.nextByte();
        System.out.println("Display score:... " + kbscore);
        if (kbscore >= 0 & kbscore < 101) {
            if (kbscore >= 0 & kbscore < 50) {
                System.out.println("Display Grade E:... " + kbscore);
            } else if (kbscore >= 80 & kbscore <= 100) {
                System.out.println("Display Grade A:... " + kbscore);
            } else if (kbscore >= 75 & kbscore <= 79) {
                System.out.println("Display Grade B+:... " + kbscore);
            } else if (kbscore >= 70 & kbscore <= 74) {
                System.out.println("Display Grade B:... " + kbscore);
            } else if (kbscore >= 65 & kbscore <= 69) {
                System.out.println("Display Grade C+:... " + kbscore);
            } else if (kbscore >= 60 & kbscore <= 64) {
                System.out.println("Display Grade C:... " + kbscore);
            } else if (kbscore >= 55 & kbscore <= 59) {
                System.out.println("Display Grade D+:... " + kbscore);
            } else {
                System.out.println("Display Grade D:... " + kbscore);
            }

        }
    }

}