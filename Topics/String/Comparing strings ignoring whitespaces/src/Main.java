import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();

        System.out.println(firstLine.replace(" ", "").equals(secondLine.replace(" ", "")));
    }
}