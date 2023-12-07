import java.util.Scanner;

public class stringManipulate {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

                System.out.print("Enter a sentence:");
                String sentence = input.nextLine();
                int choice;

            do {
//                System.out.println("There are 4 options you can choose!");
                System.out.println("1. Count the number of characters in the sentence");
                System.out.println("2. Count the number of words in the sentence");
                System.out.println("3. Convert the sentence to uppercase");
                System.out.println("4. Convert the sentence to lowercase");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                choice = input.nextInt();

                switch(choice){
                    case 1:
                        int countChar = sentence.length();
                        System.out.println("There are " + countChar + " chars in your sentence!");
                        break;
                    case 2:
                        String[] words = sentence.split(" ");
                        int wordCount = words.length;
                        System.out.println("There are " + wordCount + " words in your sentence");
                        break;
                    case 3:
                        String upperCase = sentence.toUpperCase();
                        System.out.println("After converted to upperCase: " + upperCase);
                        break;
                    case 4:
                        String lowerCase = sentence.toLowerCase();
                        System.out.println("After converted to lowerCase: "+ lowerCase);
                        break;
                    case 5:
                        System.out.println("Exiting the program....");
                        break;
                    default:
                        System.out.println("Invalid number, please enter valid number!");
                }
            } while(choice!=5);

            input.close();
        }
}
