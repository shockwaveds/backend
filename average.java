import java.util.Scanner;
    public class average {

        public static void main(String[] args) {

            System.out.println("Intro 3 numbers: ");
            Scanner n = new Scanner(System.in);


            int n1 = n.nextInt();
            int n2 = n.nextInt();
            int n3 = n.nextInt();

            int  av = (n1 + n2 + n3) / 3;

            System.out.println("The average is: " + av);


        }
    }


