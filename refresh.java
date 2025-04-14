//The refreshments store
import java.util.*;
class refresh
{
    int ch,sum=0,q,b;
    Scanner ab = new Scanner (System.in);
    public int drinks()
    {
        System.out.println("1. Lipton Herbal Green Tea \t Rs 100/-");            
        System.out.println("2. Davidoff Black Coffee   \t Rs 300/-");
        System.out.println("3. Banana Protein Shake    \t Rs 150/-");
        System.out.println("4. Whey Protein Shake      \t Rs 150/-");
        System.out.println("5. Detox Water             \t Rs 800/-");
        System.out.println("6. Charcoal Water          \t Rs 400/-");
        do
        {
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
                sum+=(q*100);
                break;
                case 2: 
                sum+=(q*300);
                break;
                case 3: 
                sum+=(q*150);
                break;
                case 4: 
                sum+=(q*150);
                break;
                case 5: 
                sum+=(q*800);
                break;
                case 6: 
                sum+=(q*400);
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

    public int proteinbars()
    {

        System.out.println("1. Granola Bar          \t Rs 150/-");            
        System.out.println("2. Max Bar              \t Rs 100/-");
        System.out.println("3. Patanjali Shakti Bar  \t Rs 50/-");
        System.out.println("4. Cashew Walnut Bar     \t Rs 200/-");
        System.out.println("5. Kellogs Bar            \t Rs 150/-");
        do{
            System.out.print("Enter choice (1/2/3/4/5): ");
            ch=ab.nextInt();
            if (ch==1||ch==2||ch==3||ch==4||ch==5)
            {
                System.out.print("Enter the quantity: ");
                q=ab.nextInt();
            }
            switch (ch)
            {
                case 1: 
                sum+=(q*150);
                break;
                case 2: 
                sum+=(q*100);
                break;
                case 3: 
                sum+=(q*50);
                break;
                case 4: 
                sum+=(q*200);
                break;
                case 5: 
                sum+=(q*150);
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
}
 