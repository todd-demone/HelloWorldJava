public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        HelloWorld obj = new HelloWorld();
        int result = obj.sum(4, 4);
        System.out.println(result);
    }

    public int sum(int first, int second) {
        return 42;
    }
}
