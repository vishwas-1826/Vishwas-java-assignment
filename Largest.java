public class Largest {
    public static void main(String[] args) {

        int a[] = {10, 25, 5, 40, 30};
        int largest = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("Largest = " + largest);
    }
}
