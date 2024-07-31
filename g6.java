import java.util.Scanner;

public class g6 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // รับคะแนนจากผู้ใช้
    System.out.print("Enter your score: ");
    double score = scanner.nextDouble();

    // คำนวณเกรด
    String grade;
    if (score >= 80) {
        grade = "A";
    } 
    else if (score >= 75) {
        grade = "B+";
    } 
    else if (score >= 70) {
        grade = "B";
    } 
    else if (score <= 65) {
        grade = "C+";
    } 
    else if (score >= 60) {
        grade = "C";
    } 
    else if (score >= 55) {
        grade = "D+";
    }
    else if (score >= 50) {
        grade = "D";
    }
    else {
        grade = "E";
    }

    // เช็คว่าเกรดผ่านหรือไม่
    boolean isPass = (grade != "E");

    // แสดงผลลัพธ์
    System.out.println("Your grade is: " + grade);
    System.out.println("Check grade status: " + isPass);
    scanner.close();
}
}