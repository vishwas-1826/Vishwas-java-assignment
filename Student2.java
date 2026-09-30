class Student2 {
    String name;
    int marks;
}

public class Main {
    public static void main(String[] args) {

        Student2 s1 = new Student2();
        s1.name = "Sherol";
        s1.marks = 85;

        Student2 s2 = new Student2();
        s2.name = "Ankusha";
        s2.marks = 90;

        System.out.println(s1.name + " " + s1.marks);
        System.out.println(s2.name + " " + s2.marks);
    }
}
