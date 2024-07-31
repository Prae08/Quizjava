import java.util.Scanner; 
public class g16
 {
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
     if ((score>=50)&&(score<=54)) 
     {
        return "Grade D | Score >> .. "+score;
     }
     else if (score>=0 & score<=49) 
     {
        return "Grade E | Score >> .. "+score;
     }
     else if (score<=59 & score>=55) {
        return "Grade D+ | Score >> .. "+score;
     }
     else if (score<=100 & score>=80) {
        return "Grade A | Score >> .. "+score;
     }
     else if (score<=79 & score>=75) {
        return "Grade B+ | Score >> .. "+score;
     }
     else if (score<=69 & score>=65) {
        return "Grade C+ | Score >> .. "+score;
     }
     else if (score<=64 & score>=60) {
        return "Grade C | Score >> .. "+score;
     }
     else 
     {
        return "Grade B | Score >> .. "+score;
     }

        
    }
}