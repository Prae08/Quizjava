

public class g15 {
    public static void main(String[] args) {
        double score = 66.5;
        if ((score >= 80) && (score <= 100)) {
            System.out.println("Grade is A.."+score);
        } else if ((score >= 75) && (score <= 80)) {
            System.out.println("Grade is B+.."+score);
        } else if ((score >= 70) && (score <= 75)) {
            System.out.println("Grade is B.."+score);
        } else if ((score >= 65) && (score <= 69)) {
            System.out.println("Grade is C+.."+score);
        } else if ((score >= 60) && (score <= 64)) {
            System.out.println("Grade is C.."+score);
        } 
        else if ((score >= 55) && (score <= 60)) 
        {
            System.out.println("Grade is D+.."+score);
        } else if ((score >= 50) && (score <= 54)) {
            System.out.println("Grade is D.."+score);
        } else {
            System.out.println("Grade is E.."+score);
        }
    }
}