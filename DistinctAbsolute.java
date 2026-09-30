import java.util.HashSet;

public class DistinctAbsolute {
    public static void main(String[] args) {

        int a[] = {-5, 5, -2, 2, 3};

        HashSet<Integer> set = new HashSet<>();

        for (int x : a)
            set.add(Math.abs(x));

        System.out.println("Count = " + set.size());
    }
}
