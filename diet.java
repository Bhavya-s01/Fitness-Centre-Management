//sub class to guide- to print guidance for a diet
import java.util.Scanner;
public class diet
{
    int choice;
    int i=1;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Please choose from the following: ");
        while( i==1)
        {
            System.out.println("1)Proteins food items");
            System.out.println("2)Carbs food items");
            System.out.println("3)Fats food items");
            System.out.println("4)1 week balanced sample diet");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                protein();
                i=2;
                break;
                case 2:
                carbs();
                i=2;
                break;
                case 3:
                fats();
                i=2;
                break;
                case 4:
                weekplan();
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

    void protein()
    {
        System.out.println();
        System.out.println("A good protein diet should include: ");
        System.out.println("eggs");
        System.out.println("lean red meat");
        System.out.println("poultry such as chicken and turkey breasts");
        System.out.println("fish");
        System.out.println("beans and legumes");
        System.out.println("yogurt and low fat dairy products");
        System.out.println("nuts and seeds");
    }

    void carbs()
    {
        System.out.println();
        System.out.println("A good carb diet should include: ");
        System.out.println("whole grains, such as oatmeal, quinoa, rice, cereals, and popcorn");
        System.out.println("starchy vegetables, such as potatoes");
        System.out.println("fruits, such as oranges, apples, and bananas");
        System.out.println("other vegetables, such as leafy greens, cucumbers, and broccoli");
    }

    void fats()
    {
        System.out.println();
        System.out.println("A good fat diet should include: ");
        System.out.println(" nuts and seeds");
        System.out.println("healthful oils, such as olive oil");
        System.out.println("high fat fruits, such as avocado");
    }

    void weekplan()
    {
        System.out.println();
        System.out.println("Day 1");
        System.out.println("Breakfast: scrambled eggs, stir-fried veggies, and oatmeal");
        System.out.println("Snack: whey protein shake");
        System.out.println("Lunch: grilled chicken breast, mixed greens, and baked sweet potato");
        System.out.println("Snack: hard-boiled egg(s) and carrot sticks");
        System.out.println("Dinner: broiled fish, green beans with brown rice");
        System.out.println();
        System.out.println("Day 2");
        System.out.println("Breakfast: protein pancakes with fresh berries");
        System.out.println("Snack: apple slices and almonds");
        System.out.println("Lunch: lean ground beef burger on lettuce with tomato, onion, and green beans");
        System.out.println("Snack: protein shake");
        System.out.println("Dinner: shrimp stir-fried with bell pepper and brown rice over spinach");
        System.out.println();
        System.out.println("Day 3");
        System.out.println("Breakfast: Greek yogurt, almonds or walnuts, whole grain granola, and fresh berries");
        System.out.println("Snack: protein shake");
        System.out.println("Lunch: grilled fish with a spinach salad and broccoli");
        System.out.println("Snack: egg white omelet with bell peppers and mushrooms");
        System.out.println("Dinner: chicken breast topped with fresh salsa with a sweet potato and a side salad");
        System.out.println();
        System.out.println("Day 4");
        System.out.println("Breakfast: oatmeal with berries and scrambled egg whites");
        System.out.println("Snack: turkey breast with carrots and celery");
        System.out.println("Lunch: sirloin steak with broccoli and mushrooms");
        System.out.println("Snack: apples with natural nut butter");
        System.out.println("Dinner: broiled fish, brown rice, and a mixed green salad");
        System.out.println();
        System.out.println("Day 5");
        System.out.println("Breakfast: protein shake with oatmeal");
        System.out.println("Snack: hard-boiled egg whites with sliced peppers and cucumbers");
        System.out.println("Lunch: grilled chicken with white bean and tomato salad");
        System.out.println("Snack: Greek yogurt with berries and nuts");
        System.out.println("Dinner: grilled fish with quinoa and green beans");
        System.out.println();
        System.out.println("Day 6");
        System.out.println("Breakfast: scrambled egg whites with cheese, peppers, herbs, and Ezekiel bread");
        System.out.println("Snack: protein shake");
        System.out.println("Lunch: grilled chicken breast with bell peppers, black beans, and onions over romaine lettuce");
        System.out.println("Snack: apple and almonds");
        System.out.println("Dinner: sirloin steak with sweet potato and asparagus");
        System.out.println();
        System.out.println("Day 7");
        System.out.println("Breakfast: Greek yogurt with whole grain granola and berries");
        System.out.println("Snack: turkey breast with carrots and celery sticks");
        System.out.println("Lunch: grilled chicken breast over spinach with sliced strawberries and almonds");
        System.out.println("Snack: protein shake");
        System.out.println("Dinner: shrimp stir-fried with peppers, onions, and broccoli over brown rice");

    }
}
