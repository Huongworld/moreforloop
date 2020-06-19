import java.util.Scanner;

public class More {
    public static void main(String[] args) {
        //odd numbers between 1 & 20
        for (int index = 1; index <= 20; index= index + 2) {
            System.out.println(index);
        }
        System.out.println("---------------------------");
        for(int index =2; index<=20; index= index +2){
            System.out.println(index);
        }
        //Write a program to reverse a string.
        //For example,  reverse of "Program" is "margorP"
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine(); //allows you to type a word in
        int amountOfCharacter = word.length(); //counts length of the word
        for(int counter=amountOfCharacter -1; counter >=0; counter-- ){
            System.out.print(word.charAt(counter));
        }
        System.out.println("Please input a number:");
        int userNumber = scanner.nextInt();
        for(int i=1; i<=userNumber;i++) {
            if (userNumber % i == 0) { //modulus refer to the remainder; 10 % 3 ==1;
                System.out.println(i);
            }
        }
            System.out.println("Please enter another number:");
            int userNumber2 = scanner.nextInt();
            int factorial = 1;
            for (int i =1; i<= userNumber2; i++){
                factorial = factorial * i;

            }
            System.out.println("The factorial of " + userNumber2 + " " + "is" +" " +factorial);
        }
    }
