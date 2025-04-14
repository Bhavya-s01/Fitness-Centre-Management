//sub class to guide- to print guidance for a beginner
import java.util.Scanner;
public class beginner
{
    int choice,i=1;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("These beginner gym workouts are ideal for various goals, whether you want to lose some weight or burn fat,\n build muscle and strength or improve your fitness.");
        while(i==1)
        {
            System.out.println("Please choose from the following: ");
            System.out.println("1) Beginner gym workout for females");
            System.out.println("2) Beginner gym workout for males");
            System.out.println("3) Beginner gym workout for strength");
            System.out.println("4) Beginner gym workout for fat loss");
            System.out.println("5) Beginner gym workout for cardio equipment");
            System.out.println("6) Beginner gym circuit programme");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                female();
                i=2;
                break;
                case 2:
                male();
                i=2;
                break;
                case 3:
                strength();
                i=2;
                break;
                case 4:
                fatloss();
                i=2;
                break;
                case 5:
                cardio();
                i=2;
                break;
                case 6:
                circuit();
                i=2;
                break;
                default:
                System.out.println("Incorrect choice");
                i=1;
            }
        }
    }
    void female()
    {
       System.out.println();
       System.out.println("This workout is designed to help women tone the whole body");
       System.out.println("Seated leg press (10 reps x 3 sets)");
       System.out.println("Seated shoulder press (10 reps x 3 sets)");
       System.out.println("Close grip lat pulldown (10 reps x 3 sets)");
       System.out.println("Bodyweight lunges (10 reps x 3 sets)");
       System.out.println("Full/kneeling press ups (10 reps x 3 sets)");
       System.out.println("Plank (30 secs x 3)");
       System.out.println("Leg raises (10 reps x 3 sets)");
    }
    void male()
    {
        System.out.println();
        System.out.println("This workout is designed to help men gain strength and lean mass.");
        System.out.println("Seated chest press (10 reps x 4 sets)");
        System.out.println("Seated rows (10 reps x 4 sets)");
        System.out.println("Wide grip lat pulldown (10 reps x 4 sets)");
        System.out.println("Seated leg press (10 reps x 4 sets)");
        System.out.println("Dumbbell seated shoulder press (10 reps x 4 sets)");
        System.out.println("Dumbbell bicep curls (10 reps x 4 sets)");
        System.out.println("Close grip tricep press ups (10 reps x 4 sets)");
        System.out.println("Cable rotations/twists (10 reps x 4 sets)");
        System.out.println("Reverse crunches (10 reps x 4 sets)");
    }
    void strength()
    {
        System.out.println();
        System.out.println("This workout is for building muscles.");
        System.out.println("Barbell push press (6 reps x 4 sets)");
        System.out.println("Goblet squat (6 reps x 4 sets)");
        System.out.println("Dumbbell single arm row (6 reps x 4 sets)");
        System.out.println("Shoulder lateral raise (6 reps x 4 sets)");
        System.out.println("Bench press (6 reps x 4 sets)");
        System.out.println("Pull ups/assisted pull ups (6 reps x 4 sets)");
        System.out.println("Barbell bicep curls (8 reps x 4 sets)");
        System.out.println("Cable overhead tricep extensions (8 reps x 4 sets)");
        System.out.println("Rotating plank (30 secs x 4)");
    }
    void fatloss()
    {
        System.out.println();
        System.out.println("This workout is designed to raise your heart rate and get you sweating");
        System.out.println("Plate thrusters (15 reps x 3 sets)");
        System.out.println("Mountain climbers (20 reps x 3 sets)");
        System.out.println("Box jumps (10 reps x 3 sets)");
        System.out.println("Walk outs (10 reps x 3 sets)");
        System.out.println("Renegade rows (full plank/kneeling) (10 each side x 3 sets)");
        System.out.println("Press ups (full plank/kneeling) (15 reps x 3 sets)");
        System.out.println("Treadmill 10 min run/steep incline brisk walk (no hands)");
        System.out.println("Supermans (full plank/kneeling) (10 reps x 3 sets)");
        System.out.println("Crunches (10 reps x 3 sets)");
    }
    void cardio()
    {
        System.out.println();
        System.out.println("This workout will help mix up your workout and stop you getting bored.");
        System.out.println("5 min treadmill brisk walk (optional incline)");
        System.out.println("5 min rower (steady)");
        System.out.println("1 min run/1 min walk treadmill x 10(easy)/15(medium)/20(hard)");
        System.out.println("10 min stair master (steady)");
        System.out.println("Cross trainer (maintain one pace)");
    }
    void circuit()
    {
        System.out.println();
        System.out.println("This workout is designed to target multiple areas at once");
        System.out.println("2 min rower");
        System.out.println("Alternating side plank (45 secs)");
        System.out.println("Bicep curl to shoulder press (45 secs)");
        System.out.println("Benched tricep dips (45 secs)");
        System.out.println("Squat jumps (45 secs)");
        System.out.println("Press up into superman (full/knees) (45 secs)");
    }
}
