
import java.util.Scanner; 
public class g11 {

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
        else if((score_eng == 0)||(score_eng >50))
        {
            System.out.println("ไม่สามารถกรอกข้อมูลเป็น 0 ได้ รบกวนกรอกข้อมูลใหม่");
            System.exit(0);
            
        }

        System.out.print("กรุณากรอกคะแนน (0-50): ของวิชา ภาษาไทย:>> ");
        score_tha = sc.nextInt();

        if((score_tha !=0) && (score_tha <=50)){
            System.out.println("แสดงคะแนนของวิชา ภาษาอังกฤษ ของคุณคือ:>> " + score_tha);
        }

        else if((score_tha == 0)||(score_tha >50))
        {
            System.out.println("ไม่สามารถกรอกข้อมูลเป็น 0 ได้ รบกวนกรอกข้อมูลใหม่");
            System.exit(0);
        }
        sum=score_eng+score_tha;
        System.out.println("ผลรวมของวิชาภาษาอังกฤษและภาษาไทย:>> "+sum);
        if (sum <= 49) {
            
            System.out.println("แสดงเกรด = E"+"| คะแนน | >> "+sum);
        } 
        else if (sum <= 50) {
            
            System.out.println("แสดงเกรด = D"+"| คะแนน | >> "+sum);
        } 
        else if (sum <= 55) {
            
            System.out.println("แสดงเกรด = D+"+"| คะแนน | >> "+sum);
        } 
        else if (sum <= 60) {
            
            System.out.println("แสดงเกรด = C"+"| คะแนน | >> "+sum);
        } 
        else if (sum <= 65) {
            
            System.out.println("แสดงเกรด = C+"+"| คะแนน | >> "+sum);
        } 
        else if (sum <= 70) {
            
            System.out.println("แสดงเกรด = B"+"| คะแนน | >> "+sum);
        }
        else if (sum <= 75) {
            
            System.out.println("แสดงเกรด = B+"+"| คะแนน | >> "+sum);
        }
        else if ((sum > 100)&&(sum<0)) {
            System.out.println("แสดงคะแนน | >> "+sum);
        }
         else {

            System.out.println("แสดงเกรด = A"+"| คะแนน | >> "+sum);
        }
        System.out.println("| List score grade |");
        System.out.println("|                  |");
        System.out.println("| A = 100-80 | \n| B+ = 75-79 | \n| B = 70-74  | \n| C+= 65-69  | \n| C = 60-64  | \n| D+= 55-59  | \n| D = 50-54  | \n| E = 0-49   | \n");
        System.out.println(">> EXIT PROGRAM");
        sc.close();
        System.exit(0);
        
    }


    
}