import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 5, 6, 2, 8, 8, 6, 9, 34, 5, 21};

        System.out.print("Enter an Element to search in an Array : ");
        int target = sc.nextInt();
        System.out.println();

        linearSearch(arr,target);


    }

    public static int linearSearch(int[] a, int t){
        for(int i = 0; i < a.length; i++){
            if( a[i] == t) {
                System.out.println("Element " + a[i] + " found at : "+ (i+1)  + " position");
                return t;
            }
        }
        return -1;
    }
}
