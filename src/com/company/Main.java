package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] names = new String[1000];
        int[] grades = new int[1000];
        boolean b = true;
        int counter = 0;
        while (b==true){
            System.out.println("Enter a name.");
            String input = kb.next();
            names[counter] = input;
            System.out.println("Enter a number");
            int num = kb.nextInt();
            grades[counter] = num;
            System.out.println("Would you like to continue?");
            String response = kb.next();
            response = response.toUpperCase();
            if (response.equals("NO")){
                b = false;
            }
            counter++;
        }
        for (int i = 0; i<counter; i++){
            System.out.println(names[i]);
        }
        int j;
        int sum = 0;
        for (j = 0; j < counter; j++){
            sum = sum + grades[j];
        }
        int average = sum / counter;
        System.out.println(average);
    }
}
