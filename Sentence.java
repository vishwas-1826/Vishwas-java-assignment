public class Sentence {
    public static void main(String[] args) {

        String s = "I love Java";
        String[] words = s.split(" ");

        System.out.println("New format:");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
