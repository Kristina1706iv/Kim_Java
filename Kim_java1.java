public class Main {
    public static void main(String[] args) {

        int a = 25;
        int b = 75;
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("b > a");
        } else {
            System.out.println("a = b");
        }

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}