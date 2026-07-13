import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice = 0;

        while (choice!=3){
            System.out.println("/n--- Menu ---");
            System.out.println("1. Check Even/Odd");
            System.out.println("2. Simple Calculator");
            System.out.println("3.Exit");
            System.out.print("Enter you choice: ");
            choice = sc.nextInt();

            switch (choice){
            case 1:
                System.out.print("Enter a number:  ");
                int num=sc.nextInt();
                if (num%2==0){
                    System.out.println(num +" is even");
                }else{
                    System.out.println(num +" is odd");
                }
                break;
            case 2:
                System.out.print("Enter first number:");
                double num1=sc.nextDouble();
                System.out.print("Enter secnd number:");
                double num2=sc.nextDouble();
                System.out.println("Enter Operator: ");
                char op= sc.next().charAt(0);

                if (op == '+') {
                    System.out.println("Result: " + (num1 + num2));
                } else if (op == '-'){
                    System.out.println("Result: " + (num1 - num2));
                }
                   else {                  
                    System.out.println("Invalid operator!");
                }
                break;

            case 3:
                System.out.println("Exiting program...");
                break;
            
            default:
                System.out.println("Invalid choice, try again.");

        }
        
        }

        sc.close();
    }
}