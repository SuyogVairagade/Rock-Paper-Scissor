package rockpaperscissor;
import java.util.*;
public class RockPaperScissor {

    public static void main(String[] args) {
        System.out.println("Enter 1 for Rock\nEnter 2 for Scissor\nEnter 3 for Paper");
        Scanner sc = new Scanner(System.in);
        int user = 0, pc = 0;
        user = sc.nextInt(3);
        switch(user){
            case 1:
                System.out.println("User inputs -> Rock"); 
                break;
            case 2:
                System.out.println("User inputs -> Scissor");
                break;
            case 3:
                System.out.println("User inputs -> Paper");
                break;
            default:
                System.out.println("User inputs -> Wrong Action");
        }
        Random ran = new Random();
        pc = ran.nextInt(3);
        System.out.println(pc);
        switch(pc){
            case 1:
                System.out.println("PC inputs -> Rock"); 
                break;
            case 2:
                System.out.println("PC inputs -> Scissor");
                break;
            case 3:
                System.out.println("PC inputs -> Paper");
                break;
            default:
                System.out.println("PC inputs -> Wrong Action");
                /*if(pc ==0){
                    continue;
                }*/
       
        }
        if(user == pc) 
            System.out.println("Match Draw");
        
        else if((user == 1 && pc == 2)||(user == 2 && pc == 3)||(user == 3 && pc == 1))
            System.out.println("You Win");
        else if(user==0)
            System.out.println("PC wins");
        else if(pc==0)
            System.out.println("You Win");
        else
            System.out.println("PC Win");
    }
    
}
