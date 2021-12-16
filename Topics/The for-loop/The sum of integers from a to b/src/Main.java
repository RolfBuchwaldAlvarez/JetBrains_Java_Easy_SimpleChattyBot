import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        while (a <= b) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}