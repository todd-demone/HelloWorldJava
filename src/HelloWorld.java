import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int first = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int second =scanner.nextInt();
        HelloWorld obj = new HelloWorld();
        int result = obj.sum(first, second);
        System.out.printf("The sum of %d and %d is %d%n", first, second, result);
        System.out.printf("I have a string named %s, an integer of %d and something this much cash: $%.2f%n", "\"MyString\"", 42, 10.13);
    }

    public int sum(int first, int second) {
        return first + second;
    }
}
