import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int start = sc.nextInt();
        int end = sc.nextInt();
        int product = 1;

        for (int i = start; i < end; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}