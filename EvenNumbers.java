public class EvenNumbers {
    public static void main(String[] args) {
        int limit = 10;

        System.out.println("Even Numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i += 2) {
            System.out.println(i);
        }
    }
}
