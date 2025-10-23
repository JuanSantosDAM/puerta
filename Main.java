import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int partidasganadas = 0;
        int partidasperdidas = 0;
        int contador = 0;
        while (contador < 10) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Elige 1 de las 3 puertas ");
            int eleccion1 = sc.nextInt();
            while (eleccion1 != 1 && eleccion1 != 2 && eleccion1 != 3) {
                System.out.println("Elección inválida, Elige 1 de las 3 puertas ");
                eleccion1 = sc.nextInt();
            }
            Scanner sc2 = new Scanner(System.in);
            System.out.println("La puerta estaba vacía, ¿Quieres cambiar la puerta elegida?");
            String eleccion2 = sc2.nextLine();
            Random rand = new Random();
            int ganadora = rand.nextInt(2) + 1;
            if (eleccion2.equals("si")) {
                System.out.println("Elige 1 de las 2 puertas restantes ");
                int eleccion3 = sc.nextInt();
                while (eleccion3 != 1 && eleccion3 != 2) {
                    System.out.println("Elección inválida, Elige 1 de las 3 puertas ");
                    eleccion1 = sc.nextInt();

                }

                if (eleccion3 == ganadora) {
                    System.out.println("Has ganado");
                    partidasganadas++;
                } else {
                    System.out.println("Has perdido");
                    partidasperdidas++;
                }

            }
            if (eleccion2.equals("no")) {
                if (eleccion1 == 3) {
                    Random random = new Random();
                    eleccion1 = random.nextInt(2) + 1;
                }

                if (eleccion1 == ganadora) {
                    System.out.println("Has ganado");
                    partidasganadas++;
                } else {
                    System.out.println("Has perdido");
                    partidasperdidas++;
                }
                contador++;
                System.out.println("Estadisticas: " + partidasganadas + " Partidas ganadas " + partidasperdidas + " Partidas perdidas " + contador + " Partidas jugadas");
            }

        }
    }
}

