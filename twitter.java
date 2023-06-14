import java.util.Scanner;

public class twitter {
    public static void main(String[] args) {

        System.out.println("Intro the name of the twitter of the celebrity:" );

        Scanner twitter = new Scanner(System.in);
        String t = twitter.nextLine();

        System.out.println("The twitter of your celebrity is: https://twitter.com/search?q=" + t);
    }
}
