import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;
public class farmer_p1 {

public static void main(String[] args){
askQuestion();
System.out.println("Would you like to start over?");
//getDifficultyLevel();
}

/*
    System.out.print("What kind of problems do you want?");
    int problemType = scan.nextInt();
    switch(problemType) {
        case 1:
            additionMethod();
            break;
        case 2:
            multiplicationMethod();
            break;
        case 3:
            subtractionMethod();
            break;
        case 4:
            divisionMethod();
            break;
        case 5:
            additionMethod();
            multiplicationMethod();
            subtractionMethod();
            divisionMethod();
            break;
    }
*/
public static void multiplicationMethod()
{
    Random secureRandom = new Random();
    int rand_int1 = secureRandom.nextInt(100);
    int rand_int2 = secureRandom.nextInt(100);
    System.out.println("What is " +rand_int1+ " times " +rand_int2+ "?");
    Scanner in = new Scanner(System.in);
    int answer = in.nextInt();
    while (answer == rand_int1 * rand_int2) {
        System.out.println("Good job!");
    }
    while(answer != rand_int1 * rand_int2) {
        System.out.println("Nope, please try again. What is " + rand_int1 + " times " + rand_int2 + "?");
        int answer1 = in.nextInt();
    }
}
public static void additionMethod()
{
    Random secureRandom = new Random();
    int rand_int1 = secureRandom.nextInt();
    int rand_int2 = secureRandom.nextInt();
    System.out.println("What is " +rand_int1+ " plus " +rand_int2+ "?");
    Scanner in = new Scanner(System.in);
    int answer = in.nextInt();
    if (answer == rand_int1 + rand_int2)
        System.out.println("Good job!");
    else
        System.out.println("Don't give up!");

}
public static void subtractionMethod()
{
    Random secureRandom = new Random();
    int rand_int1 = secureRandom.nextInt();
    int rand_int2 = secureRandom.nextInt();
    System.out.println("What is " +rand_int1+ " minus " +rand_int2+ "?");
    Scanner in = new Scanner(System.in);
    int answer = in.nextInt();
    if (answer == rand_int1 - rand_int2)
        System.out.println("Excellent!");
    else
        System.out.println("Nope, please try again.");
}
public static void divisionMethod()
{
    Random secureRandom = new Random();
    int rand_int1 = secureRandom.nextInt();
    int rand_int2 = secureRandom.nextInt();
    System.out.println("What is " +rand_int1+ " divided by " +rand_int2+ "?");
    Scanner in = new Scanner(System.in);
    int answer = in.nextInt();
    if (answer == rand_int1 / rand_int2)
        System.out.println("Nice work!");
    else
        System.out.println("Wrong, try once more.");
}
public static void askQuestion()
    {
        Random secureRandom = new Random();
        System.out.print("What is your preferred difficulty?");
        Scanner scan = new Scanner(System.in);
        int difficultyLevel = scan.nextInt();
        if (difficultyLevel == 1)
        {
            int rand_int1 = secureRandom.nextInt(10);
            int rand_int2 = secureRandom.nextInt(10);
            System.out.print("What kind of problems do you want to practice?");
            int problemType = scan.nextInt();
            switch(problemType) {
                case 1:
                    additionMethod();
                    break;
                case 2:
                    multiplicationMethod();
                    break;
                case 3:
                    subtractionMethod();
                    break;
                case 4:
                    divisionMethod();
                    break;
                case 5:
                    additionMethod();
                    multiplicationMethod();
                    subtractionMethod();
                    divisionMethod();
                    break;
            }
        }
        else if (difficultyLevel == 2)
        {

            int rand_int1 = secureRandom.nextInt(100);
            int rand_int2 = secureRandom.nextInt(100);
        }
        else if (difficultyLevel == 3)
        {

            int rand_int1 = secureRandom.nextInt(1000);
            int rand_int2 = secureRandom.nextInt(1000);
        }
        else if (difficultyLevel == 4)
        {

            int rand_int1 = secureRandom.nextInt(10000);
            int rand_int2 = secureRandom.nextInt(10000);
        }
        else if (difficultyLevel == 5)
        {

            int rand_int1 = secureRandom.nextInt(100000);
            int rand_int2 = secureRandom.nextInt(100000);
        }
        else
            System.out.println("Invalid entry");
    }

}


