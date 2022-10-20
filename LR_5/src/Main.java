import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void task2(){

        int userNum1, userNum2, userNum3;

        System.out.println("Enter first number");
        userNum1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter second number");
        userNum2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter third number");
        userNum3 = Integer.parseInt(scanner.nextLine());

        if((userNum1 > 10 || userNum1 < 0) || (userNum2 > 10 || userNum2 < 0) || (userNum3 > 10 || userNum3 < 0)){
            System.err.println("You should enter a number in range from 1 to 10");
        } else{
            int randomNum1 = (int)(Math.random() * 10);
            int randomNum2 = (int)(Math.random() * 10);
            int randomNum3 = (int)(Math.random() * 10);
            if(userNum1 == randomNum1 && userNum2 == randomNum2 && userNum3 == randomNum3){
                System.out.printf("Congrats, you win. Your sequence was {%d,%d,%d}, random sequence was {%d,%d,%d}%n", userNum1, userNum2, userNum3, randomNum1,randomNum2,randomNum3);
            }else{
                System.out.printf("Unfortunately, you lose. Your sequence was {%d,%d,%d}, random sequence was {%d,%d,%d}%n", userNum1, userNum2, userNum3, randomNum1,randomNum2,randomNum3);
            }
        }
    }

    public static void task3(){
        System.out.println("Enter your string");
        String userString = scanner.nextLine();
        String simpleString = new String("Hello");

        if(userString.startsWith(simpleString)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        task2();
        task3();
    }
}
