package com.company;

/* This program is a 5 question quiz that uses equalIgnoreCase method to
compare user's answers with the correct answer. The program tell the users if they got the
right answer or not. At the end of the quiz the amount of correct and incorrect answers
 are displayed.
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //code to read user input
        //declare variables
        int correct = 0;
        int incorrect = 0;
        String userAnswer1;
        String userAnswer2;
        String userAnswer3;
        String userAnswer4;
        String userAnswer5;

        System.out.println("Fill in the blank spaces with the correct answer!");
         System.out.println("_________ is the Capital of Illinois.");
         userAnswer1 = scanner.nextLine(); //get user input
         userAnswer1 = userAnswer1.trim();  // this code is used to remove white spaces

        if(userAnswer1.equalsIgnoreCase("Springfield")){
            System.out.println("Correct answer!");
            correct++; //counter for correct answers
        }
        else{
            System.out.println("Wrong answer!");
            incorrect++; //counter for incorrect answers

        }

        System.out.println("There are  _________ Continents in the world.");
        userAnswer2 = scanner.nextLine();
        userAnswer2 = userAnswer2.trim();

        if(userAnswer2.equalsIgnoreCase("seven")){
            System.out.println("Correct answer!");
            correct++;
        }
        else{
            System.out.println("Wrong answer!");
            incorrect++;
        }

        System.out.println("The United States is one of the countries in the continent of ___________.");
        userAnswer3 = scanner.nextLine();
        userAnswer3 = userAnswer3.trim();

        if(userAnswer3.equalsIgnoreCase("North America")){
            System.out.println("Correct answer!");
            correct++;
        }
        else{
            System.out.println("Wrong answer!");
            incorrect++;
        }

        System.out.println("The United States has  __________ states.");
        userAnswer4 = scanner.nextLine();
        userAnswer4 = userAnswer4.trim();

        if(userAnswer4.equalsIgnoreCase("fifty")){
            System.out.println("Correct answer!");
            correct++;
        }
        else{
            System.out.println("Wrong answer!");
            incorrect++;
        }

        System.out.println(" __________ was the 16th President of the United States.");
        userAnswer5 = scanner.nextLine();
        userAnswer5 = userAnswer5.trim();

        if(userAnswer5.equalsIgnoreCase("Abraham Lincoln")){
            System.out.println("Correct answer!");
            correct++;
        }
        else{
            System.out.println("Wrong answer!");
            incorrect++;
        }
        System.out.println("End of Quiz.");
        System.out.println("You got " + correct + " correct and " + incorrect + " incorrect answers!");

    }
}