import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int start =  sc.nextInt();
        int end = sc.nextInt();
        final int three = 3;
        double arithmeticAverage = 0;
        double counter = 0;
        for (int i = start; i <= end; i++) {
            if (i % three == 0) {
                arithmeticAverage = arithmeticAverage + i;
                counter++;
            }
        }
        System.out.println(arithmeticAverage / counter);
    }
}
