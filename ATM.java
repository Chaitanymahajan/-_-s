import java.util.*;
public class ATM
{
    int Balance= 10000;
    int Pin=1234;
    Scanner sc= new Scanner(System.in);
    public void Checkpin()
    {
        System.out.println("Enter ur ATM Pin: ");
        if(sc.nextInt()== Pin)
        {
            System.out.println("Logged In Successfully !\n");
            System.out.println("Please Wait...!\n\n");
            menu();
        }
        else
        {
            System.out.println("Enter The Valid Pin !!");
            Checkpin();
        }
    }
    public void menu()
    {
    
            System.out.println("Enter your choice: ");
            System.out.println(" 1.Check Balance \n 2.Withdraw Money \n 3.Deposit \n 4.Generate New Pin ");
            int c=sc.nextInt();
            switch(c)
            {
                case 1: 
                    System.out.println("Your balance : "+Balance);
                    Repeat();
                    break;
                case 2: 
                    Withdraw();
                    break;
                case 3: 
                    Deposit(); 
                    break;
                case 4:
                    ChangePin();
                    break;
                default:
                    System.out.println("Plz Enter The Valid Choice.");
            }

    }
    
    public void Withdraw()
    {
        System.out.println("Enter the Amount for Withdraw: ");
        int W= sc.nextInt();
        if(W>Balance)
        {
            System.out.println("You have insufficient Balance to Withdraw...!");
            System.out.println("Deposit Some amount in your Bank Account !");
            Deposit();
        }
        else
        {
            System.out.println("Collect your Cash...!");
            Balance-=W;
        }
        Repeat();
    }
    public void Deposit()
    {
        System.out.println("Enter the Amount for Deposit: ");
        int D= sc.nextInt();
        Balance+=D;
        System.out.println("Money Deposited Successfully...!");
        Repeat();
    }
    public void Repeat()
    {
        char s;
        System.out.println("Do u want to perform another task:");
        System.out.println("Enter Y or N");
        do
        {
            s = sc.next().charAt(0);
            if(s == 'Y'|| s =='y')
            {
                menu();
            }
            else if(s== 'N'|| s == 'n')
            {
                System.out.println("Logged out Successfully..!!");
                System.out.println("Thank You for using ATM service..! ");
                System.exit(0);
            }    
        }
        while(s!='N' || s == 'n');
    }
    public void ChangePin()
    {
        System.out.println("Enter the New Pin :");
        Pin =sc.nextInt();
        System.out.println("Pin is Changed Successfully...!");
        Checkpin();
    }
    public static void main(String s[])
        {
            ATM A1 = new ATM();
            A1.Checkpin();
        }
}