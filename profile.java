//This class is for registration on entry
//It also allows creation of new membership
import java.util.*;
public class profile
{
    String fn,ln,name,email;
    long phno;
    String arr_password[]=new String[90];
    String arr_username[]=new String[90];
    String username,password;
    String createdpassword="";
    Scanner sc=new Scanner(System.in);
    public String details1()
    {

        System.out.println("    █▀▀▀█ ░█──░█ ░█▀▄▀█ ░█▀▀█ ▀█▀ ░█▀▀▀█ ░█▀▀▀█ ▀█▀ ░█▀▀▀█ 　 ░█▀▀▀ ▀█▀ ▀▀█▀▀ ░█▄─░█ ░█▀▀▀ ░█▀▀▀█ ░█▀▀▀█ 　 ░█▀▀█ ░█▀▀▀ ░█▄─░█ ▀▀█▀▀ ░█▀▀█ ░█▀▀▀");
        System.out.println("    ▀▀▀▄▄ ░█▄▄▄█ ░█░█░█ ░█▀▀▄ ░█─ ░█──░█ ─▀▀▀▄▄ ░█─ ─▀▀▀▄▄ 　 ░█▀▀▀ ░█─ ─░█── ░█░█░█ ░█▀▀▀ ─▀▀▀▄▄ ─▀▀▀▄▄ 　 ░█─── ░█▀▀▀ ░█░█░█ ─░█── ░█▄▄▀ ░█▀▀▀");
        System.out.println("    █▄▄▄█ ──░█── ░█──░█ ░█▄▄█ ▄█▄ ░█▄▄▄█ ░█▄▄▄█ ▄█▄ ░█▄▄▄█ 　 ░█─── ▄█▄ ─░█── ░█──▀█ ░█▄▄▄ ░█▄▄▄█ ░█▄▄▄█ 　 ░█▄▄█ ░█▄▄▄ ░█──▀█ ─░█── ░█─░█ ░█▄▄▄");
        System.out.println();
        System.out.println("                                ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("                                            WELCOME TO SYMBIOSIS FITNESS CENTRE");
        System.out.println("                                WHERE THE BODY IS UNDER CONSTRUCTION AND MIND UNDER A MISSION");
        System.out.println("                                            BUILD YOUR BODY AND CHANGE YOUR LIFE");
        System.out.println("                                ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println();
        System.out.println();
        System.out.println("Please enter you details to continue with entry registration:");
        System.out.print("First name: ");
        fn = sc.next();
        System.out.print("Last name: ");
        ln = sc.next();
        name = ln+fn;
        return name;
    }

    public void details2()
    {
        for(int i=1;i>0;i++)
        {
            System.out.print("Phone number: ");
            phno = sc.nextLong();
            String dummy=sc.nextLine();
            int count=0;
            for (;phno!=0;phno/=10)
                count++;
            if(count!=10)
                System.out.println("The phone number you have entered is incorrect! Please re-enter");
            else
                break;
        }
    }

    public String details3()
    {
        for(int i=1;i>0;i++)
        {
            System.out.print("Please enter Email id: ");
            email=sc.nextLine();
            if ((email.contains("@"))==false)

                System.out.println("The email address you have entered is incorrect! Please re-enter.");
            else
                break;
        }
        return email;
    }

    int check()
    {
        arr_username[1]= "sangalbhavya";
        arr_password[1]= "prescbulbul";
        //sample account
        boolean check=false;
        int t=1;
        int j;
        int specialpack=0;

        System.out.print("Are you  member(1:yes,2:no): ");
        int mem=sc.nextInt();

        if(mem==1)
        {

            for(j=0;j<arr_username.length;j++)
            {
                if(arr_username[j]==name)
                {
                    check=true;
                    break;
                }
            }
            if(check==true)

            {
                do
                {
                    System.out.print("Enter account password: ");
                    password=sc.nextLine();
                    if(arr_password[j]==password)
                    {
                        System.out.println("Account found, Have fun exercising.");
                        t=2;
                    }
                    else
                    {
                        System.out.println("Password incorrect");
                        t=1;
                    }
                }while(t==1);
            }
            else
            {
                System.out.println("\f");
                System.out.println("Username not found, please issue a new membership");
                System.out.println();
                Membership M=new Membership();
                createdpassword=M.create_account(name,arr_password,arr_username);
                specialpack=M.input();
            }
        }

        else
        {
            System.out.print("Entry is not permitted without membership, do you wish to become a member(1:yes/2:no): ");
            int mem2=sc.nextInt();
            if (mem2==1)
            {
                System.out.println("\f");
                Membership M=new Membership();
                createdpassword=M.create_account(name,arr_password,arr_username);
                specialpack=M.input();
            }
            else
            {
                System.out.println("Please visit our reception desk in case of further inquiry");
                System.out.println("Our gym features and membership details have been mailed to you on "+email);
                System.out.println("YOU CAN NOW ACESS OUR GYM FEATURE FOR A TRIAL, YOU WILL NOTBE CHANGED");
            }

        }
        return specialpack;
    }

    String toreturnpassword()
    {
        return createdpassword;
    }
}

