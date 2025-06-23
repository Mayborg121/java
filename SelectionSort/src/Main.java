
public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 6, 7, 9, 5, 3, 2, 1, 4};

        selectionSort(arr);

        for(int i : arr){
            System.out.println(i + ",");
        }
    }

    public static void selectionSort(int[] a){
        for(int i = 0; i < a.length; i++){
            int min = i;
            for(int j = i + 1; j < a.length ; j++){
                if (a[j] < a [min]){
                    min = j;
                }
            }

            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

}