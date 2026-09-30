public class Main {
    public static void main(String[] args) {

        int a[] = {10, 20, 30};

        try {
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
