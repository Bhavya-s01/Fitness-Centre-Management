//The equipment store
import java.util.*;
public class Equipments
{    
    int ch,sum=0,q,b;
    Scanner ab = new Scanner (System.in);
    public int menu()
    {

        System.out.println("1. Weighing Scale \t Rs 500/-");            
        System.out.println("2. Skipping Rope  \t Rs 150/-");
        System.out.println("3. Cross Trainer  \t Rs 15000/-");
        System.out.println("4. Leg Press      \t Rs 10000/-");
        System.out.println("5. Bench Press    \t Rs 20000/-");
        System.out.println("6. Bouncy Ball    \t Rs 1200/-");
        System.out.println("7. Tread Mill     \t Rs 25000/-");
        System.out.println("8. Dumbles");
        do{
            System.out.print("Enter choice (1/2/3/4/5/6/7): ");
            ch=ab.nextInt();
            if (ch==1||ch==2||ch==3||ch==4||ch==5||ch==6||ch==7)
            {
                System.out.print("Enter the quantity: ");
                q=ab.nextInt();
            }
            switch (ch)
            {
                case 1: 
                sum+=(q*500);
                break;
                case 2: 
                sum+=(q*150);
                break;
                case 3: 
                sum+=(q*1500);
                break;
                case 4: 
                sum+=(q*10000);
                break;
                case 5: 
                sum+=(q*20000);
                break;
                case 6: 
                sum+=(q*1200);
                break;
                case 7:
                sum+=(q*25000);
                break;
                case 8:
                dumbles();
                break;
                default:
                System.out.println("Invalid choice");
                System.out.println("Please order from the provided options!");
                break;
            }
            System.out.print("If you want anything else from this category, press 1, else 2: ");
            b=ab.nextInt();
        }
        while(b==1);
        System.out.println("Enjoy your order!");
        return sum;
    }

    public int dumbles()
    {
        System.out.println("1. Dumbbell (750gm)\t Rs 500/-");            
        System.out.println("2. Dumbbell (1kg)  \t Rs 740/-");
        System.out.println("3. Dumbbell (5kg)  \t Rs 1000/-");
        System.out.println("4. Dumbbell (10kg) \t Rs 1500/-");
        System.out.println("5. Dumbbell (25kg) \t Rs 2500/-");
        System.out.println("6. Dumbbell (50kg) \t Rs 3000/-");
        System.out.print("Enter choice (1/2/3/4/5/6): ");
        ch=ab.nextInt();
        if (ch==1||ch==2||ch==3||ch==4||ch==5||ch==6)
        {
            System.out.print("Enter the quantity: ");
            q=ab.nextInt();
        }
        switch (ch)
        {
            case 1: 
            sum+=(q*500);
            break;
            case 2: 
            sum+=(q*740);
            break;
            case 3: 
            sum+=(q*1000);
            break;
            case 4: 
            sum+=(q*1500);
            break;
            case 5: 
            sum+=(q*2500);
            break;
            case 6: 
            sum+=(q*3000);
            break;
        }
        return sum;
    }
}
 