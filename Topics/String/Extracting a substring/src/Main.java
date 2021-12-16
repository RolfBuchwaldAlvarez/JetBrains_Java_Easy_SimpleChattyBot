import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String word = sc.nextLine();
        int start = sc.nextInt();
        int stop = sc.nextInt();

        System.out.println(word.substring(start, stop + 1));
    }
}