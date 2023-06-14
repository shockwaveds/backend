import java.util.Scanner;

public class major_and_minor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int n3 = scanner.nextInt();

        int major = Math.max(n1, Math.max(n2, n3));

        int minor = Math.min(n1, Math.min(n2, n3));

        System.out.println("The major number is " + major + ", the minor number is: " + minor);

        scanner.close();

    }

}