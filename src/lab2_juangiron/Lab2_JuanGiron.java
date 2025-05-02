package lab2_juangiron;

import java.util.Scanner;

public class Lab2_JuanGiron {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("        MENU        ");
            System.out.println("1. Piedra, pepel o tijera ");
            System.out.println("        MENU        ");
            System.out.println("        MENU        ");
            int opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println(" Jugador 1. Elija una opcion: 1.piedra 2.papel 3.tijera ");
                int jugador1 = leer.nextInt();
                System.out.println(" Jugador 2. Elija una opcion: 1.piedra 2.papel 3.tijera ");
                int jugador2 = leer.nextInt();
                if (jugador1 == 1 && jugador2 == 2) {
                    System.out.println("El jugador 2 gana");
                } else if (jugador1 == 1 && jugador2 == 3) {
                    System.out.println("El jugador 2 gana");
                } else if (jugador1 == 2 && jugador2 == 1) {
                    System.out.println("El jugador 2 gana");
                } else if (jugador1 == 2 && jugador2 == 3) {
                    System.out.println("El jugador 2 gana");
                }else if (jugador1 == 3 && jugador2 == 1) {
                    System.out.println("El jugador 2 gana");
                }else if (jugador1 == 3 && jugador2 == 2) {
                    System.out.println("El jugador 1 gana");
                }else if (jugador1 == 1 && jugador2 == 1) {
                    System.out.println("empate");
                }else if (jugador1 == 2 && jugador2 == 2) {
                    System.out.println("empate");
                }else if (jugador1 == 3 && jugador2 == 3) {
                    System.out.println("empate");
                }
            
            }
            if (opcion == 2) {
                
            }
            
        System.out.println("Desea volver al sistema?: " + resp);
        resp = leer.next().charAt(0);
        }

    
    }
}
