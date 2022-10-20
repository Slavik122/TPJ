import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void task2(){
        System.out.println("y = x^1/x");
        for (double x = -1; x < 1; x+=0.1) {
            if (x != 0) {
                double res = Math.pow(x, 1/x);
                System.out.printf("y = %.3f%n", res);
            } else {
                System.out.println("Can't divide by zero");
            }
        }
    }

    public static void task3(){
        int sum = 0, counter = 0;
        System.out.println("Enter as many numbers as you want to get their average sum(to stop the program, enter 0): ");
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                break;
            }else {
                sum += num;
                counter++;
            }
        }

        System.out.println("Average: " + sum/counter);
    }

    public static void task4(){
        ArrayList<String> strings = new ArrayList<>();
        int counter = 0, lengthLessThanTen = 0;
        System.out.println("Enter as many string as you want(to stop the program, enter \"done\"): ");
        while(true){
            strings.add(scanner.nextLine());
            if(strings.get(counter).equals("done")){
                break;
            }else{
                counter++;
                continue;
            }

        }

        for (int i = 0; i < strings.size()-1; i++) {
            if(strings.get(i).length() < 10){
                lengthLessThanTen++;
            }else{
                continue;
            }
        }
        System.out.println("String with length less than 10 is: " + lengthLessThanTen);
    }
    public static void main(String[] args) {
        //task2();
        //task3();
        //task4();
    }
}
