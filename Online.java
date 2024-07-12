import java.util.*;
public class Online
{
 
    private static final int min = 1000;
    private static final int max = 9999;
    private static boolean[] seats = new boolean[10];

    public static class user {
        private String username;
        private String password;

        Scanner sc = new Scanner(System.in);

        public String getUsername() 
        {
            System.out.println("Enter Username : ");
            username = sc.nextLine();
            return username;
        }

        public String getPassword() 
        {
            System.out.println("Enter Password : ");
            password = sc.nextLine();
            return password;
        }
    }

    public static class PnrRecord 
    {
        private int pnrNumber;
        private String passengerName;
        private String trainNumber;
        private String classType;
        private String journeyDate;
        private String from;
        private String to;

        Scanner sc = new Scanner(System.in);

        public int getpnrNumber()
         {
            Random random = new Random();
            pnrNumber = random.nextInt(max) + min;
            return pnrNumber;
        }

        public String getPassengerName() 
        {
            System.out.println("Enter the passenger name : ");
            passengerName = sc.nextLine();
            return passengerName;
        }

        public String gettrainNumber() 
        {
            System.out.println("Enter the train number : ");
            trainNumber = sc.nextLine();
            return trainNumber;
        }

        public String getclassType() 
        {
            System.out.println("Enter the class type : ");
            classType = sc.nextLine();
            return classType;
        }

        public String getjourneyDate() 
        {
            System.out.println("Enter the Journey date as 'YYYY-MM-DD' format");
            journeyDate = sc.nextLine();
            return journeyDate;
        }

        public String getfrom() 
        {
            System.out.println("Enter the starting place : ");
            from = sc.nextLine();
            return from;
        }

        public String getto() 
        {
            System.out.println("Enter the destination place :  ");
            to = sc.nextLine();
            return to;
        }
        public int getseatNumber()
        {
                Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter seat number (1-10): ");
            int seatNumber = scanner.nextInt();
            if (seatNumber < 1 || seatNumber > 10) {
                System.out.println("Invalid seat number!");
            } else if (seats[seatNumber - 1]) {
                System.out.println("Seat already reserved!");
            } else {
                seats[seatNumber - 1] = true;
            }
            return seatNumber;
        }   
    
        
    }
    public static void repeat()
    {
        
        Scanner sc = new Scanner(System.in);
        int i;

            PnrRecord p1 = new PnrRecord();
                System.out.println("Enter the choice : ");
                System.out.println("1. Reservation \n");
                System.out.println("2. Cancel Reservation \n");
                System.out.println("3. Show seat Map \n");
                System.out.println("4. Exit.\n");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:  
                    int pnr_number = p1.getpnrNumber();
                    String passengerName = p1.getPassengerName();
                    String trainNumber = p1.gettrainNumber();
                    String classType = p1.getclassType();
                    int seatNumber = p1.getseatNumber();
                    String journeyDate = p1.getjourneyDate();
                    String from = p1.getfrom();
                    String to = p1.getto();
                    System.out.println("\n Seat Reservation is Successfull.\n Here is your reservation Details:\n\n");
                    System.out.println("PNR Number: " + p1.pnrNumber);
                    System.out.println("Passenger Name: " + p1.passengerName);
                    System.out.println("Train Number: " + p1.trainNumber);
                    System.out.println("Class Type: " + p1.classType);
                    System.out.println("Journey Date: " + p1.journeyDate);
                    System.out.println("From Location: " + p1.from);
                    System.out.println("To Location: " + p1.to);
                    System.out.println("--------------"); 
                    break;


                    case 2: System.out.println("Enter the PNR number to cancel reservation : ");
                    int pnrNumber = sc.nextInt();
                    System.out.println("Reservation Cancelled successfully.");
                    break;

                    case 3:  
                    System.out.println("\n Current Seat Map:");
                    for (i = 0; i < 10; i++)
                     {
                            System.out.print((i + 1) + " ");
                    }
                    System.out.println();
                    break;

                    case 4: System.out.println("Exiting the program.\n");
                    System.exit(0);

                    default: 
                        System.out.println("Invalid Choice Entered.\n");
                        break;
                }
        }
    
    public static void main(String[] a) 
    {
        Scanner sc = new Scanner(System.in);
        user u1 = new user();
        String username = u1.getUsername();
        String password = u1.getPassword();
        int j=1;
        while(j<10)
        {
            repeat();
        }

    }
}
