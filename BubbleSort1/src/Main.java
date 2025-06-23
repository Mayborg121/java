public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 9, 3, 7, 5, 4, 1, 2, 6};

        int[] arey = bubbleSort(arr);

        for (int i : arey) {
            System.out.print(i + ",");
        }
    }

    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < (a.length - 1); i++) {
            for (int j = 0; j < (a.length - i - 1); j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}