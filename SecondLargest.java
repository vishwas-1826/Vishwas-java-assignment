public class SecondLargest {
    public static void main(String[] args) {

        int a[] = {10, 25, 5, 40, 30};

        int largest = a[0];
        int second = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            }
            else if (a[i] > second) {
                second = a[i];
            }
        }

        System.out.println("Second largest = " + second);
    }
}
