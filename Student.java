class Student {
    String name = "vishwas";
    int marks = 85;

    public String toString() {
        return name + " " + marks;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s);
    }
}
