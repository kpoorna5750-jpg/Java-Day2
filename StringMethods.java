import java.util.Scanner;
class StringMethods{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("length:"+str.length());
        System.out.println("Uppercase:"+ str.toLowerCase());
        System.out.println("Lowercase:"+ str.toUpperCase());
        System.out.println(str.charAt(4));
        System.out.println(str.contains("tea"));
        System.out.println(str.startsWith("tea"));
        System.out.println(str.endsWith("jhh"));
        System.out.println(str.substring(4));


         






            
    

    }
}