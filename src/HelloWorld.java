public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        HelloWorld obj = new HelloWorld();
        int result = obj.sum(4, 4);
        System.out.printf("The result is %d%n", result);
        System.out.printf("I have a string named %s, an integer of %d and something this much cash: $%.2f%n", "\"MyString\"", 42, 10.13);
    }

    public int sum(int first, int second) {
        return first + second;
    }
}
