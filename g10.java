
import java.util.Scanner; 
public class g10 {

    public static void main(String[] args) {
            //setup variable
            int score_eng,score_tha,sum;
            //process
        Scanner sc = new Scanner(System.in);
        System.out.println("Program calc");
        System.out.print("กรุณากรอกคะแนน (0-50): ของวิชา ภาษาอังกฤษ:>> ");
        score_eng = sc.nextInt();


        if((score_eng !=0) && (score_eng <=50)){
            System.out.println("แสดงคะแนนของวิชา ภาษาอังกฤษ ของคุณคือ:>> " + score_eng);
        }
        else if((score_eng == 0)||(score_eng > 50))
        {
            System.out.println("ไม่สามารถกรอกข้อมูลเป็น 0 ได้ รบกวนกรอกข้อแมูลใหม่");
            System.exit(0);
            
        }

        System.out.print("กรุณากรอกคะแนน (0-50): ของวิชา ภาษาไทย:>> ");
        score_tha = sc.nextInt();

        if((score_tha !=0) && (score_tha <=50)){
            System.out.println("แสดงคะแนนของวิชา ภาษาอังกฤษ ของคุณคือ:>> " + score_tha);
        }
        else if((score_tha == 0)||(score_tha > 50))
        {
            System.out.println("ไม่สามารถกรอกข้อมูลเป็น 0 ได้ รบกวนกรอกข้อแมูลใหม่");
            System.exit(0);
        }
        sum=score_eng+score_tha;
        System.out.println("ผลรวมของวิชาภาษาอังกฤษและภาษาไทย:>> "+sum);
        System.out.println("แสดง"+calculateGrade(sum)+"| คะแนน | >> "+sum);
        sc.close();
        System.exit(0);
    }
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