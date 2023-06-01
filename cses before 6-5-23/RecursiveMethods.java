import java.util.*;
public class RecursiveMethods{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Recursive Methods---");
        System.out.println();
        while(true){
        menu();
        int a = sc.nextInt();
        if(a>4){
            System.out.println("Not an option");
        }
        if(a==1){
             System.out.println("Enter the starting value for the summation (1 or more): ");
             System.out.println();
             int b = sc.nextInt();
             while(b<1){
                 System.out.println("The number is not big enough");
                    System.out.println("Enter the starting value for the summation (1 or more): ");
             System.out.println();
                 b = sc.nextInt();
             }
             System.out.println("Enter the ending number for your summation: ");
             System.out.println();
             int c = sc.nextInt();
             while(b>c){
                 System.out.println("The number must be larger than your starting number.");
                 c = sc.nextInt();
                  System.out.println("Enter the ending number for your summation: ");
             System.out.println();
             }
             int k = summation(b,c);
             System.out.println("The summation from "+b+" to "+c+" is "+ k+".");
        System.out.println();
        }
        else if(a ==2){
             System.out.println("Enter the number you want the factorial of (1 or more): ");
             int b = sc.nextInt();
             while(b<1){
                 System.out.println("The number must be positive.");
                  System.out.println("Enter the number you want the factorial of (1 or more):");
                  b= sc.nextInt();
             }
             System.out.println("The factorial of "+b+" is "+factorial(b));
        }
        else if(a ==3){
             System.out.println("Enter a base: ");
             int p = sc.nextInt();
             System.out.println("Enter the exponent: ");
             int b= sc.nextInt();
             while(b<1){
                 System.out.println("The number must be positive.");
                  System.out.println("Enter the exponent: ");
                  b= sc.nextInt();
             }
             System.out.println(p+"^"+b+ " = "+power(p,b));
        }
        else{
            System.out.println("Good Bye.");
        }
        }

        

    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. Summation");
        System.out.println("2. Factorial");
        System.out.println("3. Power");
        System.out.println("0. Exit ");
        System.out.println();
        System.out.println("Enter selection");
        System.out.println();
    }

  public static int summation(int a, int b){
      if(a==b){
          return b;
      }
      return  a+summation(a+1,b);
  }
   public static int factorial(int a){
      if(a==1){
          return 1;
      }
      return a*factorial(a-1);
  }
   public static int power( int a, int n) {
    if (n ==0) {
        return 1;
    }
    return (a* power(a,n-1));
}
}
