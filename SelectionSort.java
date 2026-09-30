public class SelectionSort {
    public static void main(String[] args) {

        int a[] = {5, 3, 8, 1, 2};

        for (int i = 0; i < 4; i++) {
            int min = i;

            for (int j = i + 1; j < 5; j++) {
                if (a[j] < a[min])
                    min = j;
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for (int i = 0; i < 5; i++)
            System.out.print(a[i] + " ");
    }
}
