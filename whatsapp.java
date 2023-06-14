import java.util.Scanner;

public class whatsapp {

    public static void main(String[] args) {

        System.out.println("Write the code of country:");
        Scanner country = new Scanner(System.in);
        double c = country.nextDouble();

        System.out.println("Write the number:");
        Scanner whatsapp = new Scanner(System.in);
        double w = whatsapp.nextDouble();


        System.out.println("The number of whatsapp is: https://api.whatsapp.com/send?phone=" + c + w);


    }
}
