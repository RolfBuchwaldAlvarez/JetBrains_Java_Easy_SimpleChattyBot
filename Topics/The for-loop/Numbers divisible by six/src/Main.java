import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int numberOfElements = sc.nextInt();
        int sum = 0;
        final int six = 6;

        for (int i = 0; i < numberOfElements; i++) {
            int num = sc.nextInt();
            if (num % six == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}