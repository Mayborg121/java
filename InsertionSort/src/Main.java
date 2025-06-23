
public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 6, 5, 4, 3, 7, 9, 2, 1};

        insertionSort(arr);

        for(int i : arr){
            System.out.println(i + ",");
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int key = i - 1;
            while(key > 0 && arr[key] > temp){
                arr[key + 1] = arr[key];
                key--;
            }
            arr[key] = temp;
        }
    }
}