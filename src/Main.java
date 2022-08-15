import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Биринчи санды жаз:");
//        int s = scanner.nextInt();
//        System.out.print("Экмнчм санды жаз:");
//        int r = scanner.nextInt();
//
//        int res;
//        System.out.print("Действие");
//        String action = scanner.nextLine();
//        action = scanner.nextLine();
//
//        switch (action){
//            case "+":
//                res = s + r;
//                System.out.println("Результат:" + res);
//                break;
//
//            case "-":
//                res = s - r;
//                System.out.println("Результат:" + res);
//                break;
//
//            case "*":
//                res = s * r;
//                System.out.println("Результат:" + res);
//                break;
//            case "/":
//
//                if (r == 0)
//                    System.out.println("error");
//                else{
//                res = s / r;
//                System.out.println("Результат:" + res);
//                }
//
//                break;
//            default:
//                System.out.println("Котунду кысып сан жаз!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Канча саат?");
        int saat = scanner.nextInt();
        System.out.println("Канча мунот?");
        int munot = scanner.nextInt();
        System.out.println("Канча секунд?");
        int secund = scanner.nextInt();
        int i;
        int m;
        int f;


        i = (saat * 60) * 60;
        m = munot * 60;
        f = secund;
        int res = i + m + f;

        System.out.println("res: "+ res);






    }
}


