import java.util.*;
public class Number
{
    public static void main(String s[])
   {
    Scanner sc = new Scanner(System.in);
        int RNo,Guessno,i,j,Total_score=0;
        
        int Round;
        System.out.println("Welcome to Random No. Guessing Challenge:\n\n");
        for(i=1;i<=3;i++)
        {   
            Random random= new Random();
            RNo = random.nextInt(100);
            int Attempt= 7;
            System.out.println("Round "+i+":");
            for(j=1;j<=7;j++)
            {
                System.out.println("No. of Attempt u have left :"+Attempt);
                System.out.println("Enter ur guessed no. in Between 1-100: ");
                Guessno = sc.nextInt();
                if(Guessno == RNo)
                {
                    System.out.println("Hurry!! U got it..!");
                    System.out.println("Your score for Round "+i+" is "+Attempt);
                    Total_score = Total_score + Attempt;
                    break;
                }
                else if(Guessno > RNo)
                {
                    int p= Guessno -RNo;
                    if(p<3)
                    {
                        System.out.println("Well Try, you are Very closer to it.");
                    }
                    System.out.println("Your Guessed No. is greater than Random no. value, Try Again!");
                    Attempt--;
                }
                else if(Guessno < RNo)
                {
                    int q= RNo -Guessno;
                    if(q<3)
                    {
                        System.out.println("Well Try, you are Very closer to it.");
                    }
                    System.out.println("Your Guessed No. is smaller than Random no. value, Try Again!");
                    Attempt--;
                }
                if(Attempt ==0)
                {
                    System.out.println("U lose this round. Let's Begins the next round..!");
                }
            }
        }

        System.out.println("Ur Total Score for all Round is :"+Total_score);
    }
}
