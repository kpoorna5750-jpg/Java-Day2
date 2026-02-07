import java.util.Scanner;
class Logical{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the students:");
        int a=sc.nextInt();
        if(a>=90 && a<=100){
            System.out.println("A Grade");
        }
        else if(a>=80 && a<=89){
            System.out.println("B Grade");
        }
        else if(a>=50 && a<=79){
            System.out.println("D grade");
        }
        else{
            System.out.println("Fail");

        }

        }
        }

    
