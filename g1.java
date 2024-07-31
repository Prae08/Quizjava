import java.util.Scanner; 
public class g1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("กรุณากรอกคะแนน (0-100):");
        int score = sc.nextInt();
        String grade = calculateGrade(score);
        System.out.println("เกรดของคุณคือ:" + grade);
        sc.close();
    }
    public static String calculateGrade(int score) 
    {
        if (score < 0 || score > 100) {
            return "คะแนนต้องอยู่ในช่วง 0-100";
        } else if (score >= 80) {
            return "A";
        } else if (score >= 75) {
            return "B+";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 65) {
            return "C+";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 55) {
            return "D+";
        } else if (score >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}