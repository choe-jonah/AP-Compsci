/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("You're a student packing for school");
        System.out.println("1. Put your backpack");
        System.out.println("2. Choose yuor outfit ");
        System.out.println("3. Eat a healthy breakfist");
        
        int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.println("You have chosen the backpack");
        }
        else if(answer1 == 2){
            System.out.println("You have chosen a nice outfit");
        }
        else if(answer1 == 3){
            System.out.println("You ate some cereal and a banana");
        }
        else{
            System.out.println("Wrong input, try again");
        }
        if(answer1 == 1){
            System.out.println("What do you put in your backpack");
        
        System.out.println("1. books");
        System.out.println("2. lunchbox");
        System.out.println("3. gun");
        }
        int answer2 = sc.nextInt();
            
        if(answer2 == 1){
            System.out.println("You put your thick bio book in your bag");
        }
        else if(answer2 == 2){
            System.out.println("Yum");
        }
        else if(answer2 == 3){
            System.out.println("cool");
        }
        else{
            System.out.println("bad output");
        }
        if(answer1 == 2){
            System.out.println("What do you put on for your outfit?");
        
        System.out.println("1. a sweatshirt");
        System.out.println("2. a suit");
        System.out.println("3. swim trunks no shirt");}
        int answer3 = sc.nextInt();
        if(answer3 == 1){
            System.out.println("It must be cold");
        }
        else if(answer3 == 2){
            System.out.println("Must be an important day");
        }
        else if(answer3 == 3){
            System.out.println("bold of you");
        }
    }
}