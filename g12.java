import java.util.Scanner; 
public class g12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่คะแนน: ");
        double kbscoreSubject = scanner.nextDouble();
        if (kbscoreSubject >= 80) {
            System.out.println("| "+"Grade A"+" | >> scoreSubject = "+kbscoreSubject);
        } else if (kbscoreSubject >= 75)  {
            System.out.println("| "+"Grade B+"+" | >> scoreSubject = "+kbscoreSubject);
        } else if (kbscoreSubject >= 70)  {
            System.out.println("| "+"Grade B"+" | >> scoreSubject = "+kbscoreSubject);
        } else if (kbscoreSubject >= 65)  {
            System.out.println("| "+"Grade C+"+" | >> scoreSubject = "+kbscoreSubject);
        } else if (kbscoreSubject >= 60) {
            System.out.println("| "+"Grade C"+" | >> scoreSubject = "+kbscoreSubject);
        } else if (kbscoreSubject >= 55)  {
            System.out.println("| "+"Grade D+"+" | >> scoreSubject = "+kbscoreSubject);
        } else if (kbscoreSubject >= 50)  {
            System.out.println("| "+"Grade D"+" | >> scoreSubject = "+kbscoreSubject);
        } else {
            System.err.println("| "+"Grade E"+" | >> scoreSubject = "+kbscoreSubject);
            }
    }
}