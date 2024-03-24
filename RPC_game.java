import java.util.Random;
import java.util.Scanner;
//0.rock
//1.paper
//2.scissor
public class RPC_game{
    public static void main(String[] args) {
        int flag=0;
        int mark=0;
        System.out.println("0 for Rock\n1 for Paper\n2 for Scissor");
        for(int i=1;i<=5;i++){
            Random random = new Random();   
            int pc_input = random.nextInt(3);
            @SuppressWarnings("resource")
            Scanner user_input= new Scanner(System.in);
            System.out.println("<--Chance "+i+"-->\nEnter your number:");
            int your_input=user_input.nextInt();
            switch (your_input) {
                case 0:
                    System.out.println("You choose Rock");
                    break;
                case 1:
                    System.out.println("You choose Paper");
                    break;
                case 2:
                    System.out.println("You choose Scissor");
                    break;
            }
            if(your_input>2){
                System.out.println("Enter numbers as 0,1&2 ONLY!");
                continue;
            }
            else {
                if(your_input-pc_input==1 || pc_input-your_input==2){ //you win
                    flag+=1; 
                    
                }
                else if(your_input-pc_input==-1 || pc_input-your_input==-2){ //pc win
                    mark+=1; 
                    
                }
                switch (pc_input){
                    case 0:
                        System.out.println("PC input:\n" +pc_input+"(Rock)\n");
                        break;
                    case 1:
                        System.out.println("PC input:\n" +pc_input+"(Paper)\n");
                        break;
                    case 2:
                        System.out.println("PC input:\n" +pc_input+"(Scissor)\n");
                        break;
                }
            }
        }
        System.out.println("Your Score:"+flag);
        System.out.println("PC Score:"+mark);
        if(flag>mark){
            System.out.println("You won the Battle!");
        }
        else if(flag<mark){
            System.out.println("Your PC won the Battle!");
        }
        else{
            System.out.println("It's a tie!");
        }

    }
}
