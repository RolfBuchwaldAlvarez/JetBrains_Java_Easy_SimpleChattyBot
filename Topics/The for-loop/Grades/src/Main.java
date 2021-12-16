import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int n = sc.nextInt();
        int aGrade = 0;
        int bGrade = 0;
        int cGrade = 0;
        int dGrade = 0;
        final int zero = 0;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int five = 5;

        for (int i = zero; i < n; i++) {
            int num = sc.nextInt();
            if (num == five) {
                aGrade++;
            }
            if (num == four) {
                bGrade++;
            }
            if (num == three) {
                cGrade++;
            }
            if (num == two) {
                dGrade++;
            }
        }
        System.out.printf("%d %d %d %d", dGrade, cGrade, bGrade, aGrade);
    }
}