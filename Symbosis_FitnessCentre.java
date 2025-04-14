/*Inter-House IT Fest '22
 *SOFTWERE DEVELOPMENT SUBMISSION: Bulbuls
 *TOPIC: Fitness Centre
 *PARTICIPANTS: Bhavya Snagal  (PreSc)
 *              Venya Talwar   (A1)
 *              Aashiya Mahajan(A2)
 */             

/*The following program is developed a fitness centre, with the following features:
 * Membership portal to creat account and issue membership
 * Guidance portal to learn about various exercises and muscles
 * Refreshment centre to purchance healthy drinks and protein bars
 * Equipment Store to purchance equipments 
 * Medical Guidance to purchance first aid and also recieve advice on joint pains
 */

/*There is a sample account created under username 'sangalbhavya' and password 'prescbulbul', 
 * However, a new account can also be created
 */

import java.util.*;
public class Symbosis_FitnessCentre
{
    int choice;
    String name,email,tocontinue;
    long delay=0;
    int refresh_bill,med_bill,store_bill,specialpack;
    String user_password;
    Scanner sc=new Scanner (System.in);
    public  void entry()
    {
        profile obj=new profile();
        name=obj.details1();
        obj.details2();
        email=obj.details3();
        specialpack=obj.check();
        user_password=obj.toreturnpassword();
    }

    public void guidance()
    {
        System.out.println("\n\nPress any character to continue: ");
        String x=sc.next();
        System.out.println("\fAlong with a personal trainer, our gym provides an exclusive range of different guides");
        System.out.println();
        guide G=new guide();
        G.input();
        while(delay<10000000)
        {
            delay++;
        }
    }

    void medical_centre()
    {
        System.out.print("\n\nPress any character to continue: ");
        tocontinue=sc.next();
        System.out.println();
        System.out.print("\fWould you like to acess the medical portal? (yes:1/no:2)");
        choice=sc.nextInt();
        System.out.println();
        if(choice==1)
        {
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("             Our gym  provides a reliable medical service, with first aid and advice");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println();
            System.out.print("Would your like 1)first-aid or 2)medical advice: ");
            choice=sc.nextInt();
            if(choice==1)
            {
                medical M=new medical();
                med_bill=M.firstaid();
            }
            else
            {
                medical M=new medical();
                M.advice();
            }
        }
    }

    public void refreshments()
    {
        System.out.println("\n\nPress any character to continue: ");
        tocontinue=sc.next();
        System.out.print("\fWould you like refreshments? (yes:1/no:2)");
        choice=sc.nextInt();
        if(choice==1)
        {

            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("      In for a break? Welcome to our refreshments centre!");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println();
            refresh R=new refresh();
            System.out.println("What would you like-\n1) drinks\n2) protein bars");
            System.out.print("Enter choice: ");
            int menu=sc.nextInt();
            if(menu==1)
                refresh_bill=R.drinks();
            else
                refresh_bill=R.proteinbars();
            store();
        }
        else
        {
            store();
        }
    }

    public void store()
    {
        System.out.println("\n\nPress any character to continue: ");
        tocontinue=sc.next();
        System.out.println("\fWould you like to buy equipments? (yes:1/no:2)");
        choice=sc.nextInt();
        String dummy=sc.nextLine();
        if(choice==1)
        {
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("        Buy the best quality equipments from our store");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
            System.out.println();
            Equipments E=new Equipments();
            store_bill=E.menu();
            billing();
        }
        else
        {
            billing();
        }

    }

    public void billing()
    {
        int i=1;
        String bill_pass;
        System.out.println("        ░█▀▀█ ▀█▀ ░█─── ░█─── 　 ▀▀█▀▀ ░█▀▀▀█ ▀▀█▀▀ ─█▀▀█ ░█─── 　 ░█▀▀▀ ░█▀▀▀█ ░█▀▀█ 　 ▀▀█▀▀ ░█─░█ ░█▀▀▀ 　 ░█▀▀▄ ─█▀▀█ ░█──░█ ");
        System.out.println("        ░█▀▀▄ ░█─ ░█─── ░█─── 　 ─░█── ░█──░█ ─░█── ░█▄▄█ ░█─── 　 ░█▀▀▀ ░█──░█ ░█▄▄▀ 　 ─░█── ░█▀▀█ ░█▀▀▀ 　 ░█─░█ ░█▄▄█ ░█▄▄▄█ ");
        System.out.println("        ░█▄▄█ ▄█▄ ░█▄▄█ ░█▄▄█ 　 ─░█── ░█▄▄▄█ ─░█── ░█─░█ ░█▄▄█ 　 ░█─── ░█▄▄▄█ ░█─░█ 　 ─░█── ░█─░█ ░█▄▄▄ 　 ░█▄▄▀ ░█─░█ ──░█──");
        System.out.println("\fTo view bill, Enter account password: ");
        bill_pass=sc.nextLine();
        while(i==1)
        {
            if(bill_pass.equals(user_password)==true)
            {
                bill B=new bill();
                B.discount(specialpack);
                double total=B.total(refresh_bill,med_bill,store_bill,name,email);
                break;
            }
            else
            {
                System.out.print("Invalid input, Re-Enter account password: ");
                bill_pass=sc.nextLine();
            }
        }

    }

    public static void main(String args[])
    {
        Symbosis_FitnessCentre C=new Symbosis_FitnessCentre();
        C.entry();
        C.guidance();
        C.medical_centre();
        C.refreshments();
    }
}
