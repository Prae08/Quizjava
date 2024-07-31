import java.util.Scanner;

public class g8 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับคะแนนจากผู้ใช้
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        // คำนวณเกรด
        String grade;
        boolean isPass;
        
        if (score <= 49) {
            grade = "E";
            isPass = false;
        } 
        else if (score <= 50) {
            grade = "D";
            isPass = true;
        } 
        else if (score <= 55) {
            grade = "D+";
            isPass = true;
        } 
        else if (score <= 60) {
            grade = "C";
            isPass = true;
        } 
        else if (score <= 65) {
            grade = "C+";
            isPass = true;
        } 
        else if (score <= 70) {
            grade = "B";
            isPass = true;
        }
        else if (score <= 75) {
            grade = "B+";
            isPass = true;
        }
         else {
            grade = "A";
            isPass = true;
        }

        

        // แสดงผลลัพธ์
        System.out.println("Your grade is: " + grade);
        System.out.println("Pass status: " + isPass);
        scanner.close();
    }
    
}