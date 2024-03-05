package NewOneFolder;

import java.util.Scanner;

public class Validation {
    public static boolean valid(String input){
        return input.matches("^[a-zA-Z\\s]+$");
    }
    public static void main(String[] args) {

       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String n=sc.nextLine();
        int num=n.length();
        sc.close();
        if(num<=5){
        if(valid(n)){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
    else{
        System.out.println("not valid");
    }
    }

}
