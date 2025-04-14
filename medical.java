import java.util.*;
public class medical
{    
    int ch,sum=0,q,b;
    Scanner sc = new Scanner (System.in);
    int choice;
    int i=1;
    int firstaid()
    {
        
            System.out.println("1. Cotton Wool    \t Rs 40/-");            
            System.out.println("2. Crepe bandage  \t Rs 30/-");
            System.out.println("3. Antiseptic     \t Rs 100/-");
            System.out.println("4. Band Aid       \t Rs 10/-");
            System.out.println("5. Medical Tape   \t Rs 50/-");
            do{
            System.out.print("Enter choice: ");
            ch=sc.nextInt();
            if (ch==1||ch==2||ch==3||ch==4||ch==5)
            {
                System.out.print("Enter the quantity: ");
                q=sc.nextInt();
            }
            switch (ch)
            {
                case 1: 
                sum+=(q*40);
                break;
                case 2: 
                sum+=(q*30);
                break;
                case 3: 
                sum+=(q*100);
                break;
                case 4: 
                sum+=(q*10);
                break;
                case 5: 
                sum+=(q*50);
                break;
                default:
                System.out.println("invalid choice");
                System.out.println("Please order from the provided options!");
            }
            System.out.print("If you want anything else from this category, press 1, else 2: ");
            b=sc.nextInt();
        }
        while(b==1);
        return sum;
    }

    void advice()
    {
        System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("                  PUSH THROUGH THE PAIN!");
        System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("Welcome to our medical advice portal. Please choose from the following guides:");
        while(i==1)
        {
            System.out.println("1)Back pain");
            System.out.println("2)Knee pain");
            System.out.println("3)Neck and Shoulder");
            System.out.println("4)Pregnancy");
            System.out.print("Please enter choice: ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                back();
                i=2;
                break;
                case 2:
                knee();
                i=2;
                break;
                case 3:
                neck();
                i=2;
                break;
                case 4:
                pregnency();
                i=2;
                break;
                default:
                System.out.println("Invalid choice, please re-enter from the following:");
                choice=sc.nextInt();
                i=1;
                break;
            }
        }
    }

    void back()
    {
        System.out.println();
        System.out.println("The following are some exercises that help strengthen back and stomach muscles:");
        System.out.println("Partial crunches");
        System.out.println("Hamstring Stretches");
        System.out.println("Wall Sits");
        System.out.println("Press up back extensions");
        System.out.println("Bird dog");
        System.out.println("Bridging");
    }

    void knee()
    {
        System.out.println();
        System.out.println("The follwing are some knee strengthening and stretching exercises to relieve knee pain:");
        System.out.println("Heel and Calf Stretch");
        System.out.println("Quadriceps Stretch");
        System.out.println("Hamstring Stretch");
        System.out.println("Half Squat");
        System.out.println("Calf Raises");
        System.out.println("Leg Extensions");
    }

    void neck()
    {
        System.out.println();
        System.out.println("The following are some exercises that help relieve shoulder and neck pain:");
        System.out.println("Chest Expansion");
        System.out.println("Eagle arms spinal rolls");
        System.out.println("Seated Twist");
        System.out.println("Doorway shoulder stretch");
        System.out.println("Downward dog pose");
        System.out.println("Arm circle");
    }

    void pregnency()
    {
        System.out.println();
        System.out.println("The following are some exercises that help releive stress during pregnancy:");
        System.out.println("Ellipticals");
        System.out.println("Stair climbers");
        System.out.println("Rowing machine");
        System.out.println("Indoor cycling");
        System.out.println("Kickboxing");
        System.out.println("High-intensity interval training workouts");
    }
}

