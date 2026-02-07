import java.util.Scanner;
class CheckPositive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=0){
            System.out.println("The a number is positive");
        }
        if(a>=0 && a%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The a number is odd");
        }
        
        a+=20;
        System.out.println("a is:"+a);
        b=b++;

        System.out.println("The b value is:"+b);
        b=++b;
        System.out.println("After preincrement the value is:"+b);
    }
}