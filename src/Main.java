import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr=new int[100];
        System.out.print("Missing number calculator:-------\nEnter no. of elements you want in list:");
        int num= input.nextInt();
        System.out.println("enter numbers(in accending order):");
        for(int in=0; in<num;in++){
            arr[in]=input.nextInt();
        }
        System.out.println("enter initial and last number of the array:");
        int ini =input.nextInt();
        int last =input.nextInt();
        System.out.println("these are the missing number:");
   for(int i=ini, k=0;i<last;i++,k++){
         if(i!=arr[k]){
           System.out.print(i+" , ");
         --k;
       }
         else {
       }
   }
}
}