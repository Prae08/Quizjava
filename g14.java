
public class g14 {
    public static void main(String[] args) {
        System.out.println("Fixed Score is : 80");
        int score = 80;
        if (score >= 80) {
            System.out.println(" grade A >> Score : "+score);
        } else if (score >= 75)  {
            System.out.println("grade B+ >> Score : "+score);
        } else if (score >= 70) {
            System.out.println("grade B >> Score : "+score);
        } else if (score >= 65)  {
            System.out.println(" grade C+ >> Score : "+score);
        } else if (score >= 60) {
            System.out.println("grade C >> Score : "+score);
        } else if (score >= 55){
            System.out.println("grade D+ >> Score : "+score);
        } else if (score >= 50) {
            System.out.println("grade D >> Score : "+score);
        } else if (score < 49) {
            System.out.println("Grade E >> Score : "+score);
        } else {
            System.out.println("please enter score 1-100");
            System.exit(0);
        }
    }
}