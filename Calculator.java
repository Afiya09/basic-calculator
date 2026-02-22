import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //header
        System.out.println("====Basic Calculator====");
        //choice operation
        System.out.println("Choose an operation: ");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice(1-4): ");
        int choice = sc.nextInt();
        //enter the first number
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        //enter the second number
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        double result;
        //cases
        switch (choice){
            case 1:
                result = num1 + num2;
                System.out.println("The result is : "+result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result is : "+result);
                break;    
            case 3:
                result = num1 * num2;
                System.out.println("The result is : "+result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("The result is : "+result);
                break;   
                
            default:
                System.out.println("Invalid choice");
        }
        sc.close();    
    }

}