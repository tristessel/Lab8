
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello this my and my friend Lab8!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        int number = multiplyThreeNumbers(2, 5, 2);
        System.out.println("Multiply result: " + number);
    }

    public static int multiplyThreeNumbers(int n1, int n2, int n3){
        return n1 * n2 * n3;
    }
}