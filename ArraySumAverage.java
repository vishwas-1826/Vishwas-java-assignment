public class ArraySumAverage {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }

        double average = (double) sum / 5;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
