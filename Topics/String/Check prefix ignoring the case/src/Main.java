import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String input = sc.next();

        System.out.println(input.substring(0, 1).equalsIgnoreCase("J"));   
    }
}
