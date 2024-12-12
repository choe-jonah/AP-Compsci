/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    
    public static void printAnimal(){
        System.out.println(" -----");
        System.out.println("((ovo))");
        System.out.println("():::()");
        System.out.println("  VVV ");
    }
    public static void greeting(String name){
        System.out.println("hi "+name);
        return;
    }
    public static double raise(double salary, int percent){
        double amount = salary+(salary * (percent/100.0));
        return amount;
    }
    
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        System.out.println("Enter a name:");
        Scanner sc = new Scanner(System.in);
        String nameInput = sc.nextLine();
        greeting(nameInput);
        double num = raise(10000, 15);
        System.out.println(num);
        num = raise(num,15);
        System.out.println(num);
        
	}
}