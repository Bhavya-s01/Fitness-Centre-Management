//exercise guide for the users
import java.util.*;
public class exercise
{
    int choice;
    int choice2,i=1;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("What guide would you like-1)Exercise or 2)Equipment guide?");
        System.out.print("Enter choice: ");
        choice=sc.nextInt();
        if(choice==2)
        {
            System.out.println("Which workout would you like to do?");
            System.out.println(" 1)Cardio \n 2)resistance area \n 3)Flexiblity");
            System.out.print("Enter choice: ");
            choice2=sc.nextInt();
            machine();
        }
        else if(choice==1)
        {
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("                    HUSTLE FOR THE MUSCLE!");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("What muscle would you like to focus on?");
            while(i==1)
            {
                System.out.println(" 1)the chest \n 2)the shoulders \n 3)the back \n 4)the arms \n 5)the abs \n 6)the legs");
                System.out.print("Enter choice: ");
                choice2=sc.nextInt();
                System.out.println();
                System.out.println("The following exercise are deemed best for the criteria: ");
                switch (choice2)
                {
                    case 1:
                    System.out.println(" Bench press \n Push-ups \n Band chest press");
                    i=2;
                    break;
                    case 2:
                    System.out.println(" Seated shoulder press \n Resistance band shoulder press \n Plank with arms straight");
                    i=2;
                    break;
                    case 3:
                    System.out.println(" One-arm dumbbell row \n Resistance band pull apart \n Superman");
                    i=2;
                    break;
                    case 4:
                    System.out.println(" Bicep curls \n Tricep kickbags \n Side raise \n Dumbell Row \n Palms-up wrist curl");
                    i=2;
                    break;
                    case 5:
                    System.out.println(" Plank \n Mountain Climber\n Bird-dog \n Dead bug \n Knee raise \n Bicycle crunch"); 
                    i=2;
                    break;
                    case 6:
                    System.out.println(" Lateral Lunge\n Back squat \n Leg press \n Romanian Deadlift \n Walking Lunges \n Reverse Lunge");
                    i=2;
                    break;
                    default:
                    System.out.println("Invalid choice, please re-enter from the following:");
                    choice2=sc.nextInt();
                    i=1;
                    break;
                }
            }
        }
    }
    void machine()
    {
        System.out.println();
        System.out.println("The following machines are deemed best for the criteria: ");
        switch(choice2)
        {
            case 1:
            System.out.println("TREADMILL");
            System.out.println("ELLIPTICAL CROSS TRAINER");
            System.out.println("ROWING MACHINE");
            System.out.println("EXERCISE BIKE");
            System.out.println("STAIR CLIMBER (OR ‘STEPPER’)");
            break;
            
            case 2:
            System.out.println("CHEST PRESS");
            System.out.println("CHIN-UP MACHINE");
            System.out.println("BICEP CURL");
            System.out.println("TRICEP PRESS");
            System.out.println("CABLE MACHINE");
            System.out.println("LEG PRESS");
            break;
            
            case 3:
            System.out.println("KETTLEBELLS");
            System.out.println("MEDICINE BALLS");
            System.out.println("TRX (flexible suspension system)");
            System.out.println("WEIGHTED SLED");
            break;
            
            default:
            System.out.println("Invalid choice");
            break;
        }
    }
}
    