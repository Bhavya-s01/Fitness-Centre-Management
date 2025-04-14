//This class is to allow user to join our gym membership
import java.util.Scanner;
public class Membership
{
    int member_ct=3;//number of accounts
    int ch_package;
    int ch2;
    int ppl;
    double m_bill;
    String password;
    int specialpack;//variable to sent package choice to billing class
    String password_arr[]=new String [90]; 
    String username_arr[]=new String [90]; 
    Scanner sc=new Scanner(System.in);

    String create_account(String name,String password_arr[],String username_arr[])
    {

        System.out.println("    ░█▀▄▀█ ░█▀▀▀ ░█▀▄▀█ ░█▀▀█ ░█▀▀▀ ░█▀▀█ ░█▀▀▀█ ░█─░█ ▀█▀ ░█▀▀█ 　 ░█▀▀█ ░█▀▀▀█ ░█▀▀█ ▀▀█▀▀ ─█▀▀█ ░█───"); 
        System.out.println("    ░█░█░█ ░█▀▀▀ ░█░█░█ ░█▀▀▄ ░█▀▀▀ ░█▄▄▀ ─▀▀▀▄▄ ░█▀▀█ ░█─ ░█▄▄█ 　 ░█▄▄█ ░█──░█ ░█▄▄▀ ─░█── ░█▄▄█ ░█───");
        System.out.println("    ░█──░█ ░█▄▄▄ ░█──░█ ░█▄▄█ ░█▄▄▄ ░█─░█ ░█▄▄▄█ ░█─░█ ▄█▄ ░█─── 　 ░█─── ░█▄▄▄█ ░█─░█ ─░█── ░█─░█ ░█▄▄█");
        System.out.println("                    ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("                        WELCOME TO SYMBOSIS FITNESS CENTRE MEMBERSHIP PORTAL");
        System.out.println("                            THE WAY TO GET AHEAD IS TO GET STARTED");
        System.out.println("                            THANK YOU FOR CHOOSING US AS YOUR GYM");
        System.out.println("                    ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println();
        System.out.print("Please create a password for your account: ");
        password=sc.nextLine();
        password_arr [++member_ct]=password; 
        // Assign new password to the last element
        username_arr [++member_ct]=name; 
        // Assign new username to the last element
        return password;
    }

    int input()
    {
        System.out.println();
        System.out.print("Please enter the number of memberships to be issued: ");
        ppl=sc.nextInt();
        System.out.println();
        System.out.println("Our normal fees per month accouts for Rs.2500 per person");
        System.out.println("\n");
        System.out.println("We also offer some special offers as follows:");
        System.out.println("1)Golden (Rs.5000): 1 month package with 5% discount on all servises");
        System.out.println("2)Silver (Rs.7500): 2 month package with 15% discount on all servises");
        System.out.println("3)Platnium (Rs.10000): 6 month package with 15% discount on all servises");
        System.out.print("Would you like our special memberships?(1:yes/2:no): ");
        ch_package=sc.nextInt();
        if(ch_package==2)
            simple();
        else
        {
            specialpack=premium();
        }
        return specialpack;
    }

    void simple()
    {
        long m_bill=2500*ppl;
        System.out.println("Your membership bill is: "+m_bill);
        System.out.println("Welcome to our Gym, have fun exercising!");
        System.out.println("◨██══════██◧ ◨██══════██◧ ◨██══════██◧ ◨██══════██◧ ◨██══════██◧");
        System.out.println();
        System.out.println();
        System.out.println();

    }

    int premium()
    {
        System.out.print("Please enter choice: ");
        ch2=sc.nextInt();
        switch (ch2)
        {
            case 1:
            m_bill=ppl*5000;
            break;
            case 2:
            m_bill=ppl*7500;
            break;
            case 3:
            m_bill=ppl*10000;
            break;
        }
        System.out.println("◨██══════██◧ ◨██══════██◧ ◨██══════██◧ ◨██══════██◧ ◨██══════██◧");
        System.out.println("                     Your membership bill is: "+m_bill);
        System.out.println("                   Welcome to our Gym, have fun exercising!");
        System.out.println("◨██══════██◧ ◨██══════██◧ ◨██══════██◧ ◨██══════██◧ ◨██══════██◧");
        System.out.println();
        System.out.println();
        System.out.println();
        return ch2;
    } 

}

