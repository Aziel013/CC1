/*
* Created: January 13, 2021
* Instructions: Write a java class that prompt the user to input starting and ending number.
* The starting number should always be lesser than the ending number, if no, the program should prompt 
* the user to try again. At the end of the program, you should ask the user if he / she wants to try again.
* Use while loop. Use scanner class.
*/

import java.util.Scanner; 
import java.io.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); 
        char choice = 'Y';
        boolean retry = true;
        int start = 0, end = 0, step = 0, sum;
        String input = " ";
        do{
        BufferedReader in = new BufferedReader(new
        InputStreamReader(System.in));
        try{
        System.out.print("Input starting number: ");
        input = in.readLine();
        start = Integer.parseInt(input);
        System.out.print("Input ending number: ");
        input = in.readLine();
        end = Integer.parseInt(input);
        System.out.print("Input step number: ");
        input = in.readLine();
        step = Integer.parseInt(input);
        }catch(IOException e){
        System.out.println("“Error!”");
        }
        if(start >= end){
        System.out.print("Starting number should be lesser ");
        System.out.println("than the ending number. ");
        System.out.println("Try again.");
        System.exit(0);
        }
        if(step <= 0){
        System.out.print("Step number should be greater ");
        System.out.println("than zero. ");
        System.out.println("Try again.");
        System.exit(0);
        }
        if(start == 0)
        {
        start = start + start;
        }
        sum = 0;
        sum = start + step;
        System.out.println(start);
        while(sum <= end)
        {
        System.out.println(sum);
        sum += step;
        }
        System.out.println("Do you want to try again (Y/N)?  ");
            choice = sc.nextLine().charAt(0);
        }
        while(choice == 'Y' || choice == 'y');
    }
}
