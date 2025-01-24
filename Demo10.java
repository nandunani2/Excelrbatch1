public class Demo10 {
    public static void main(String[] args) {
        int number = 5;
        boolean flag = true;

        System.out.println("Original number: " + number);
        System.out.println("Unary Plus: " + (+number)); 
        System.out.println("Unary Minus: " + (-number));

        System.out.println("Post-increment: " + (number++));
        System.out.println("After Post-increment: " + number);
        System.out.println("Pre-increment: " + (++number));

        System.out.println("Post-decrement: " + (number--));
        System.out.println("After Post-decrement: " + number);
        System.out.println("Pre-decrement: " + (--number));

        System.out.println("Original flag: " + flag);
        System.out.println("Logical complement (!flag): " + (!flag));
    }
}
