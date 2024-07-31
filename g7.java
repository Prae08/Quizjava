import java.util.Scanner;

public class g7 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับคะแนนจากผู้ใช้
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        // คำนวณเกรด
        String grade;
        boolean isPass;
        
        if (score >= 80) {
            grade = "A";
            isPass = true;
        } 
        else if (score >= 75) {
            grade = "B+";
            isPass = true;
        } 
        else if (score >= 70) {
            grade = "B";
            isPass = true;
        } 
        else if (score >= 65) {
            grade = "C+";
            isPass = true;
        } 
        else if (score >= 60) {
            grade = "C";
            isPass = true;
        } 
        else if (score >= 55) {
            grade = "D+";
            isPass = true;
        }
        else if (score >= 50) {
            grade = "D";
            isPass = true;
        }
         else {
            grade = "E";
            isPass = false;
        }

        

        // แสดงผลลัพธ์
        System.out.println("Your grade is: " + grade);
        System.out.println("Pass status: " + isPass);
        scanner.close();
    }
    
}