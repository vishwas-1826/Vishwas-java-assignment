class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Fox extends Animal {
    void sound() {
        System.out.println("Fox makes sound");
    }
}

class Rabbit extends Animal {
    void sound() {
        System.out.println("Rabbit makes sound");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Fox f = new Fox();
        Rabbit r = new Rabbit();

        d.eat();
        d.sound();

        f.eat();
        f.sound();

        r.eat();
        r.sound();
    }
}
