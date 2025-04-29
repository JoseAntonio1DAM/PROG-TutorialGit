import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo y los demás!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número:");
        int number = sc.nextInt();
        System.out.println("El número es:" + number);

        sc.close();
    }
}