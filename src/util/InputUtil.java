package util;

import java.util.Scanner;

public class InputUtil {
    public static int requiredInputInt(String msg){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.print(msg);
            return scanner.nextInt();
        }catch (Exception ex){
            System.out.println("Wrong option...");
        }
        return 0;

    }
    public static Long requiredInputLong(String msg){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.print(msg);
            return scanner.nextLong();
        }catch (Exception ex){
            System.out.println("Wrong value...");
        }
        return null;
    }
    public static String  requiredInputString(String msg){
        Scanner scanner=new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
}
