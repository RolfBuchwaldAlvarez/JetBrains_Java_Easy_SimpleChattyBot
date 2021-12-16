import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        final int zero = 0;
        final int two = 2;
        final int three = 3;
        final int thousand = 1000;

        for (int i = zero; i <= thousand; i++) {
            if (a * Math.pow(i, three) + b * Math.pow(i, two) + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}