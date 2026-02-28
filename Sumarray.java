import java.util.Scanner;
class SumArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("The sum of array elements are:");
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}