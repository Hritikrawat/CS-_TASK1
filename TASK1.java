// import java.math.*;
import java.util.Random;
import java.util.Scanner;
class TASK1
{
    static int rn,num,life=3;
    static float score=10;
    static Scanner sc= new Scanner(System.in);
    

    static void TryAgain( int rn)
    {
        
        score/=2;
        if(life>0)                   //player can have only 3 attempts
        {
            num=sc.nextInt();
            if(rn==num)
            {
                System.out.println("Congratulation you have scored : "+ (score)+"points");
                
            }
            else {
                life--;
                if(num<rn-5)
                {
                    System.out.println("Too Low "+life+" life remaining");
                    // System.out.println("Try again");
                    TryAgain(rn);
                }
                else if(num>rn+5)
                {
                    System.out.println("Too High "+life+" life remaining");
                    TryAgain(rn);
                }
                else 
                {   
                    System.out.println("Close Enough "+life+" life remaining");
                    TryAgain(rn);

                }
                
            }
        }
        else {System.out.print("OUT");}
    }
    public static void main(String[] args) 
    {
        
        Random randum=new Random();
        rn=randum.nextInt(100);

        System.out.println("Guess the generated number from 1 to 100: ");
        System.out.println("random is "+rn);
        num=sc.nextInt();
            
            if(rn==num)
            {
                System.out.println("Congratulation you have scored : "+score+"points");
                
            }
            else
            {
                life--;
                System.out.println("Try again "+ (life)+" life remaining");
                // count++;
                TryAgain(rn);
            }
            // System.out.print("\033[H\033[2J");  
            // System.out.flush();  
            

        // System.out.println(rn);
    }
}