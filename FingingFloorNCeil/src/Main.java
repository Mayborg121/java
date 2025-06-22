import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9,65,84,95,112,156,235,845};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its floor & ceil : ");
        int target = sc.nextInt();
        System.out.println();

        System.out.println("Floor to the given value is : " + findFloor(arr, target));
        System.out.println("Ceil to the given value is : " + findCeil(arr, target));
    }

    public static int findCeil(int [] a, int t){
        int low = 0;
        int high = a.length -1;
        int ans = -1;

        while(low < high){
            int mid = (low + high)/2;
            if(a[mid] >= t){
                ans = a[mid];
                high = mid;
            } else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int findFloor(int[] a, int t){
        int low = 0;
        int high = a.length -1;
        int ans  = -1;
         while(low < high){
             int mid = (low + high)/2;

             if(a[mid] <= t){
                 ans = a[mid];
                 low = mid + 1;
             } else {
                 high = mid;
             }
         }
         return ans;
    }
}