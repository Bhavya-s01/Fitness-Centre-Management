//to calculate bill of customer from all services
import java.util.*;
public class bill
{
    String name, email;
    double total,final_bill;

    int dis;
    int refresh_bill,med_bill,stor_bill,i=1;
    Scanner sc=new Scanner(System.in);


    public void discount(int specialpack)
    {
        if(specialpack==0)
            dis=1;
        else if(specialpack==1)
            dis=5;
        else if(specialpack==2)
            dis=15;
        else if(specialpack==3)
            dis=15;
    }

    public double total(int refresh_bill, int med_bill, int stor_bill, String name, String email)
    {
        total=refresh_bill+med_bill+stor_bill;
        final_bill=total-((dis*total)/100);
        System.out.println("Password Identified");
        System.out.println("Your bill for today is: ");
        System.out.println("Refreshments: "+refresh_bill);
        System.out.println("Medical: "+med_bill);
        System.out.println("Equipments: "+stor_bill);
        System.out.println("The expence for "+name+" is "+final_bill);
        System.out.println("It has been mailed to id "+email); 
        System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("                        Hope you had a great day today!");
        System.out.println("    REMEMBER, YOU MAY NOT BE THERE YET, BUT YOU ARE BETTER THAN YESTERDAY!");
        System.out.println("▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣ ▣█═════════█▣");
        System.out.println("\n\n\n");
        System.out.println("                    ░█▀▀▀█ ░█▀▀▀ ░█▀▀▀ 　 ░█──░█ ░█▀▀▀█ ░█─░█ 　 ▀▀█▀▀ ░█▀▀▀█ ░█▀▄▀█ ░█▀▀▀█ ░█▀▀█ ░█▀▀█ ░█▀▀▀█ ░█──░█ ");
        System.out.println("                    ─▀▀▀▄▄ ░█▀▀▀ ░█▀▀▀ 　 ░█▄▄▄█ ░█──░█ ░█─░█ 　 ─░█── ░█──░█ ░█░█░█ ░█──░█ ░█▄▄▀ ░█▄▄▀ ░█──░█ ░█░█░█ ");
        System.out.println("                    ░█▄▄▄█ ░█▄▄▄ ░█▄▄▄ 　 ──░█── ░█▄▄▄█ ─▀▄▄▀ 　 ─░█── ░█▄▄▄█ ░█──░█ ░█▄▄▄█ ░█─░█ ░█─░█ ░█▄▄▄█ ░█▄▀▄█ ");
        System.out.println("\n\n\n");
        System.out.println("                                        ▀▀█▀▀ ░█─░█ ─█▀▀█ ░█▄─░█ ░█─▄▀ 　 ░█──░█ ░█▀▀▀█ ░█─░█ ");
        System.out.println("                                        ─░█── ░█▀▀█ ░█▄▄█ ░█░█░█ ░█▀▄─ 　 ░█▄▄▄█ ░█──░█ ░█─░█ ");
        System.out.println("                                        ─░█── ░█─░█ ░█─░█ ░█──▀█ ░█─░█ 　 ──░█── ░█▄▄▄█ ─▀▄▄▀    ");
        System.out.println(" ´´´´´´´´´´´´´´´´´´´´´´¶¶¶¶¶¶¶¶¶");
        System.out.println("´´´´´´´´´´´´´´´´´´´´¶¶´´´´´´´´´´¶¶");
        System.out.println("´´´´´´¶¶¶¶¶´´´´´´´¶¶´´´´´´´´´´´´´´¶¶");
        System.out.println("´´´´´¶´´´´´¶´´´´¶¶´´´´´¶¶´´´´¶¶´´´´´¶¶");
        System.out.println("´´´´´¶´´´´´¶´´´¶¶´´´´´´¶¶´´´´¶¶´´´´´´´¶¶");
        System.out.println("´´´´´¶´´´´¶´´¶¶´´´´´´´´¶¶´´´´¶¶´´´´´´´´¶¶");
        System.out.println("´´´´´´¶´´´¶´´´¶´´´´´´´´´´´´´´´´´´´´´´´´´¶¶");
        System.out.println("´´´´¶¶¶¶¶¶¶¶¶¶¶¶´´´´´´´´´´´´´´´´´´´´´´´´¶¶");
        System.out.println("´´´¶´´´´´´´´´´´´¶´¶¶´´´´´´´´´´´´´¶¶´´´´´¶¶");
        System.out.println("´´¶¶´´´´´´´´´´´´¶´´¶¶´´´´´´´´´´´´¶¶´´´´´¶¶");
        System.out.println("´¶¶´´´¶¶¶¶¶¶¶¶¶¶¶´´´´¶¶´´´´´´´´¶¶´´´´´´´¶¶");
        System.out.println("´¶´´´´´´´´´´´´´´´¶´´´´´¶¶¶¶¶¶¶´´´´´´´´´¶¶");
        System.out.println("´¶¶´´´´´´´´´´´´´´¶´´´´´´´´´´´´´´´´´´´´¶¶");
        System.out.println("´´¶´´´¶¶¶¶¶¶¶¶¶¶¶¶´´´´´´´´´´´´´´´´´´´¶¶");
        System.out.println("´´¶¶´´´´´´´´´´´¶´´¶¶´´´´´´´´´´´´´´´´¶¶");
        System.out.println("´´´¶¶¶¶¶¶¶¶¶¶¶¶´´´´´¶¶´´´´´´´´´´´´¶¶");
        System.out.println("´´´´´´´´´´´´´´´´´´´´´´´¶¶¶¶¶¶¶¶¶¶¶");

        return final_bill;
    }

}
