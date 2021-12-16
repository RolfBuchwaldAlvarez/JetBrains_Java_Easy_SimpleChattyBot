import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int input = sc.nextInt();
        final int zero = 0;
        final int four = 4;
        int max = 0;

        for (int i = zero; i < input; i++) {
            int num = sc.nextInt();
            if (num % four == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}