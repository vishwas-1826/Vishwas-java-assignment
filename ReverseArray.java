public class ReverseArray {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};

        int i = 0, j = 4;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < 5; k++)
            System.out.print(a[k] + " ");
    }
}
