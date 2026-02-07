import java.util.Scanner;
class StringCamparision{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        if (str1.length()==str2.length()){
            for(int i=0;i<=str1.length();i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    System.out.println("The entered string is equal");
                }
            }
        System.out.println("The two strings are unequal");
        }
        
    }
}