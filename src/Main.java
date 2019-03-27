import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Missing number calculator:-------\nEnter no. of elements you want in list:");
        int num= input.nextInt();
        if (num != 1) {
            int[] arr = new int[num];
            System.out.println("enter numbers(in accending order):");
            for (int in = 0; in < num; in++) {
                arr[in] = input.nextInt();
            }
            System.out.println("these are the missing numbers:");
            for (int i = arr[0], k = 0; i < arr[num - 1]; i++, k++) {
                if (i != arr[k]) {
                    System.out.println(i + " , ");
                    --k;
                } else {
                    System.out.println("there is no missing numbers");
                }
            }
        }

         else {
            System.err.println("Invalid input : missing number are found in btw two limits");

        }
    }
}