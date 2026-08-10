package Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.Array.QuizApplication;
import java.util.Scanner;
import java.util.ArrayList;

class QuizApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = true;
        String[] answers = {"JOSE RIZAL", "LAGUNA", "ADOBO"};
        ArrayList<String> person = new ArrayList<>();
        do {
            System.out.println("Welcome to quiz app \n" +
                    "1. take quiz \n" +
                    "2. Result \n" +
                    "3. exit");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {

                case 1: System.out.println("1. Please enter the name of the national hero of the Philippines: ");
                person.add(in.nextLine().toUpperCase());
                System.out.println("2. what province is national hero in the Philippines was born? ");
                person.add(in.nextLine().toUpperCase());
                System.out.println("3. What is the national food in the Philippines?");
                person.add(in.nextLine().toUpperCase());
                break;

                case 2:
                    int score = 0;
                    if(person.size()!=0){
                      for(int i = 0;i < person.size();i++){
                          if(person.get(i).equals(answers[i])){
                            score++;
                          }

                      }
                    } else {
                        System.out.println("No quiz yet");
                    }
                    System.out.println("your score is: " + score);

                    break;

                case 3: System.out.println("Thank you for using our quiz");
                exit = false;
                break;

                default:System.out.println("Wrong choice");
            }



        }while(exit);
    }
    }