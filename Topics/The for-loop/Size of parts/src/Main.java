import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int n = sc.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        final int minusOne = -1;
        final int one = 1;
        final int zero = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == minusOne) {
                smaller++;
            }
            if (num == one) {
                larger++;
            }
            if (num == zero) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}