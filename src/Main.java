
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello this my Lab8!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        int number = multiplyTwoNumbers(2, 5);
        System.out.println("Multiply result: " + number);
    }

    public static int multiplyTwoNumbers(int n1, int n2){
        return n1 * n2;
    }
}