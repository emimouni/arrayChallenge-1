package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int grades [] = new int[1000];
    Scanner input = new Scanner(System.in);
        int grade;
        int i = 0;
        int sum = 0;
        int count=0;
    while(true)
    {
        System.out.println("Enter grade or -1");
        grade = input.nextInt();
        if(grade == -1)
            break;
        grades[i]=grade;

        sum = sum + grades[i];
        i++;
        count++;
    }

        int average = sum/count;
        System.out.println(average);
    }
}
