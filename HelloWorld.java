public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, world!")

        int result = addNumbers(10, "20");
        System.out.println("Result: " + result);

        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i)
        }

        greetUser();
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void greetUser {
        System.out.println("Welcome, user!");
    }
}
