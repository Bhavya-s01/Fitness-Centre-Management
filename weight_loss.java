//sub class to guide- to print guidance for weight loss
import java.util.Scanner;
public class weight_loss
{
    int choice;
    int i=1;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("        YOU DON'T FIND WILL POWER, YOU CREATE IT!");
        System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("Please choose from the following: ");
        while(i==1)
        {
            System.out.println("1)Day-wise diet");
            System.out.println("2)Tips and Motivation");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                daydiet();
                i=2;
                break;
                case 2:
                tips();
                i=2;
                break;
                default:
                System.out.println("Invalid choice");
                System.out.println("Please re-enter from the following:");
                i=1;
                break;
            }
        }
    }

    void daydiet()
    {
        System.out.println("Day 1");    
        System.out.println("All fruits – except bananas");
        System.out.println("Recommended fruits are watermelon and muskmelon");
        System.out.println("8 to 12 glasses of water");
        System.out.println();
        System.out.println("Day 2");
        System.out.println("Large boiled potato");
        System.out.println("Cooked or uncooked vegetables of your choice without oil");
        System.out.println("8 to 12 glasses of water");
        System.out.println();
        System.out.println("Day 3");
        System.out.println("All fruits – except bananas");
        System.out.println("Cooked or uncooked vegetables (except potatoes) without oil");
        System.out.println("8 to 12 glasses of water");
        System.out.println();
        System.out.println("Day 4");
        System.out.println("8 to 10 bananas");
        System.out.println("3 to 4 glasses of milk");
        System.out.println("8 to 12 glasses of water");
        System.out.println();
        System.out.println("Day 5");
        System.out.println("6 tomatoes");
        System.out.println("One cup of brown rice");
        System.out.println("12 to 15 glasses of water");
        System.out.println();
        System.out.println("Day 6");
        System.out.println("One cup of brown rice");
        System.out.println("Cooked or uncooked vegetables (except potatoes) of your choice without oil");
        System.out.println("8 to 12 glasses of water");
        System.out.println();
        System.out.println("Day 7");
        System.out.println("One cup of brown rice");
        System.out.println("Any vegetables");
        System.out.println("All fruit juices");
    }

    void tips()
    {
        System.out.println("Do not skip breakfast");
        System.out.println("Eat regular meals");
        System.out.println("Drink plenty of water");
        System.out.println("Eat high fibre foods");
        System.out.println("Do not stock junk food");
        System.out.println("Plan your meals");
    }
}
 