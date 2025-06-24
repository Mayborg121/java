
public class Main {
    public static void main(String[] args) {
     int[] arr = {6,5,4,2,9,1,8,3,7};

     mergeSort(arr);

     for(int i : arr){
         System.out.println(i + ",");
     }
    }

    public static void mergeSort(int[] a){
        int length = a.length;
        if(a.length > 1){
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length-mid];

        int i = 0;
        int j = 0;

        for(; i < length; i++){
            if(i < mid){
                left[i] = a[i];
            } else{
                right[j] = a[i];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,a);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}