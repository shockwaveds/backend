import java.util.Scanner;

public class history {

    public static void main(String[] args) {

        System.out.println("This is the History:");

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: ");
        System.out.println("Tienes 2 opciones, Tu cual opcion escoges: 1 o b ? ");
        Scanner a1 = new Scanner(System.in);
        int h = a1.nextInt();



            if  (h == 1) {
                System.out.println("Exploras la oscuridad en busca de la fuente de un susurro escalofriante;");
            } else if (h == 2) {
                System.out.println("Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
            }

        System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                "1) Entras por la puerta de la izquierda \n" +
                "2) Optas por la puerta de la derecha\n");

            System.out.println("Escoje la opcion: 1 o 2");
            Scanner a2 = new Scanner(System.in);
            int h2 = a2.nextInt();

            if (h2 == 1 ) {
                System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!");
            } else if ( h2 == 2) {
                System.out.println("Al abrir la otra puerta encontraras la vida eterna");
            }

    }
}
