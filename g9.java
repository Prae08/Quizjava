import java.util.Scanner; 
public class g9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("กรุณากรอกคะแนน (0-100):");
        int score = sc.nextInt();
        String grade = calculateGrade(score);
        System.out.println("เกรดของคุณคือ:" + grade);
        sc.close();
    }
    /**
     * @param score
     * @return
     */
    public static String calculateGrade(int score) 
    {
        if (score <= 49) {
            return "grade = E";
           
        } 
        else if (score <= 50) {
            return "grade = D";
            
        } 
        else if (score <= 55) {
            return "grade = D+";
            
        } 
        else if (score <= 60) {
            return "grade = C";
            
        } 
        else if (score <= 65) {
            return "grade = C+";
            
        } 
        else if (score <= 70) {
            return "grade = B";
            
        }
        else if (score <= 75) {
            return "grade = B+";
            
        }
         else {
            return "grade = A";
            
        }
    }
}