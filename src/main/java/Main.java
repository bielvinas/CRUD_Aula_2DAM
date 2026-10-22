import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcio = 0;

        while (opcio != 3) {
            System.out.println("MENÚ:");
            System.out.println("1 - Gestionar professors");
            System.out.println("2 - Gestionar mòduls professionals");
            System.out.println("3 - Sortir");
            System.out.print("Escull una opció: ");
            opcio = Integer.parseInt(scanner.nextLine());

            switch (opcio) {
                case 1:
                    menuGestio(scanner, "professors");
                    break;
                case 2:
                    menuGestio(scanner, "mòduls professionals");
                    break;
                case 3:
                    System.out.println("Adéu!");
                    break;
                default:
                    System.out.println("Opció no vàlida");
            }
        }
    }

    //menú per a professors i mòduls
    public static void menuGestio(Scanner scanner, String gestio) {
        int opcio = 0;

        while (opcio != 5) {
            System.out.println("MENÚ " + gestio);
            System.out.println("1 - Alta");
            System.out.println("2 - Llistar");
            System.out.println("3 - Actualitzar");
            System.out.println("4 - Eliminar");
            System.out.println("5 - Tornar al menú");
            System.out.print("Escull una opció: ");
            opcio = Integer.parseInt(scanner.nextLine());

            switch (opcio) {
                case 1:
                    // Aquí anirà la crida al controlador (alta)
                    System.out.println("Alta de " + gestio);
                    break;
                case 2:
                    // Aquí anirà la crida al controlador (llistar)
                    System.out.println("Llistar " + gestio);
                    break;
                case 3:
                    // Aquí anirà la crida al controlador (actualitzar)
                    System.out.println("Actualitzar " + gestio);
                    break;
                case 4:
                    // Aquí anirà la crida al controlador (eliminar)
                    System.out.println("Eliminar " + gestio);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opció no vàlida");
            }
        }
    }
}