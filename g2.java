import java.util.Scanner; 
public class g2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณากรอกคะแนน (0-100):");
        int score = sc.nextInt();
        
        if (score < 0 || score > 100) {
            System.out.println("คะแนนต้องอยู่ในช่วง 0-100");
        } else if (score >= 80) {
            String gradeA = "A";
            System.out.println("================");
            System.out.println("Grade:" + gradeA);
            System.out.println("================");
        } else if (score >= 75) {
            String gradeBplus = "B+";
            System.out.println("================");
            System.out.println("Grade:" + gradeBplus);
            System.out.println("================");
        } else if (score >= 70) {
            String gradeB = "B";
            System.out.println("================");
            System.out.println("Grade:" + gradeB);
            System.out.println("================");
        } else if (score >= 65) {
            String gradeCplus = "C+";
            System.out.println("================");
            System.out.println("Grade:" + gradeCplus);
            System.out.println("================");
        } else if (score >= 60) {
            String gradeC = "C";
            System.out.println("================");
            System.out.println("Grade:" + gradeC);
            System.out.println("================");
        } else if (score >= 55) {
            String gradeDplus = "D+";
            System.out.println("================");
            System.out.println("Grade:" + gradeDplus);
            System.out.println("================");
        } else if (score >= 50) {
            String gradeD = "D";
            System.out.println("================");
            System.out.println("Grade:" + gradeD);
            System.out.println("================");
        } else {
            String gradeE = "E";
            System.out.println("================"); 
            System.out.println("Grade:" + gradeE + " | grade not pass");
            System.out.println("================");
        }
        sc.close();
    }
}