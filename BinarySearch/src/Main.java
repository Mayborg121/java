import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,11,12,16,14,17,18,154,155,157,158,160,161,162,163,164,167,168,169,174,175,178,179,194};

        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter number you want to search : ");
        int target  = sc.nextInt();
        System.out.println();

        System.out.println("Element present at : " + binarySearch(arr, target));
    }

    public static int binarySearch(int[] a, int t){
        int rigth = 0;
        int left = a.length;

        while(left > rigth){
            int mid = (left + rigth)/2;

            if(a[mid] == t){
                return mid+1;
            } else if(a[mid] > t){
                left = mid-1;
            } else{
                rigth = mid;
            }
        }
        return -1;
    }
}