//To guide customer while he/she uses our gym
import java.util.*;
public class guide
{
    int choice;
    int i=1;
    Scanner sc=new Scanner (System.in);
    void input()
    {

        System.out.println("▒█▀▀▀█ ▒█░░▒█ ▒█▀▄▀█ ▒█▀▀█ ▀█▀ ▒█▀▀▀█ ▒█▀▀▀█ ▀█▀ ▒█▀▀▀█ 　 ▒█▀▀█ ▒█░▒█ ▀█▀ ▒█▀▀▄ ░█▀▀█ ▒█▄░▒█ ▒█▀▀█ ▒█▀▀▀ 　 ▒█▀▀█ ▒█▀▀▀█ ▒█▀▀█ ▀▀█▀▀ ░█▀▀█ ▒█░░░");
        System.out.println("░▀▀▀▄▄ ▒█▄▄▄█ ▒█▒█▒█ ▒█▀▀▄ ▒█░ ▒█░░▒█ ░▀▀▀▄▄ ▒█░ ░▀▀▀▄▄ 　 ▒█░▄▄ ▒█░▒█ ▒█░ ▒█░▒█ ▒█▄▄█ ▒█▒█▒█ ▒█░░░ ▒█▀▀▀ 　 ▒█▄▄█ ▒█░░▒█ ▒█▄▄▀ ░▒█░░ ▒█▄▄█ ▒█░░░");
        System.out.println("▒█▄▄▄█ ░░▒█░░ ▒█░░▒█ ▒█▄▄█ ▄█▄ ▒█▄▄▄█ ▒█▄▄▄█ ▄█▄ ▒█▄▄▄█ 　 ▒█▄▄█ ░▀▄▄▀ ▄█▄ ▒█▄▄▀ ▒█░▒█ ▒█░░▀█ ▒█▄▄█ ▒█▄▄▄ 　 ▒█░░░ ▒█▄▄▄█ ▒█░▒█ ░▒█░░ ▒█░▒█ ▒█▄▄█");
        System.out.println("                                               ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("                                                YOU DONT'T GET WHAT YOU WISH FOR, YOU GET WHAT YOU WORK FOR");
        System.out.println("                                                              WELCOME TO OUR GUIDANCE PORTAL ");
        System.out.println("                                               ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println();
        System.out.println("Please choose from the following guides: ");
        while(i==1)
        {
            System.out.println("1)Beginner's guide to Gym");
            System.out.println("2)Muscle Groups");
            System.out.println("3)Equipments and Exercises");
            System.out.println("4)Complete Guide to weight Loss");
            System.out.println("5)Diet Planning");
            System.out.print("Please enter choice: ");
            choice=sc.nextInt();
            if(choice==1)
            {
                beginner B= new beginner();
                B.input();
                i=2;
            }
            else if(choice==2)
            {
                muscles();
                i=2;
            }
            else if(choice==3)
            {
                exercise E=new exercise();
                E.input();
                i=2;
            }
            else if(choice==4)
            {
                weight_loss W=new weight_loss();
                W.input();
                i=2;
            }
            else if(choice==5)
            {
                diet D=new diet();
                D.input();
                i=2;
            }
            else
            {
                System.out.println("Invalid choice, please re-enter from the following:");
                choice=sc.nextInt();
                i=1;
                break;
            }
        }
    }

    void muscles()
    {
        System.out.println("\f");
        System.out.println("There are more than 600 muscles Trusted Source in the body. When it comes to working out, finding ways to group and target major muscles may help make a workout plan simpler.\n Some muscle groups make good pairs to work out together. These are generally muscles or muscle groups that work with each other. A person can work these groups one day, then move onto another muscle group the next day. Regarding strength training, there are generally six muscle groups that people train and exercise.\n These six major muscle groups which are:");
        System.out.println(" -The chest \n -The shoulders \n -The back \n -The arms \n -The abs \n -The legs");
        System.out.println();
        System.out.println("You can now see various exercises and equipments for different muscle groups");
        exercise  E=new exercise();
        E.input();
    }
}

