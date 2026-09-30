import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Study Java");
        tasks.add("Complete Assignment");
        tasks.add("Go to College");

        tasks.remove("Go to College");

        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
