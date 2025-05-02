package lab2_juangiron;

import java.util.Scanner;

public class Lab2_JuanGiron {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("        MENU        ");
            System.out.println("1. Piedra, pepel o tijera");
            System.out.println("2. Facturacion Interactiva");
            System.out.println("3. Sumas y Promedios");
            System.out.println("4. Salida");
            //
            int opcion = leer.nextInt();
            if (opcion == 1) {

                System.out.println(" Jugador 1. Elija una opcion: 1.piedra 2.papel 3.tijera ");
                int jugador1 = leer.nextInt();
                System.out.println(" Jugador 2. Elija una opcion: 1.piedra 2.papel 3.tijera ");
                int jugador2 = leer.nextInt();
                while (opcion < 1 || opcion > 3) {
                    System.out.println(" Elija la opcion correcta");
                }
                if (jugador1 == 1 && jugador2 == 2) {
                    System.out.println("El jugador 2 gana");
                } else if (jugador1 == 1 && jugador2 == 3) {
                    System.out.println("El jugador 1 gana");
                } else if (jugador1 == 2 && jugador2 == 1) {
                    System.out.println("El jugador 2 gana");
                } else if (jugador1 == 2 && jugador2 == 3) {
                    System.out.println("El jugador 2 gana");
                } else if (jugador1 == 3 && jugador2 == 1) {
                    System.out.println("El jugador 2 gana");
                } else if (jugador1 == 3 && jugador2 == 2) {
                    System.out.println("El jugador 1 gana");
                } else if (jugador1 == 1 && jugador2 == 1) {
                    System.out.println("empate");
                } else if (jugador1 == 2 && jugador2 == 2) {
                    System.out.println("empate");
                } else if (jugador1 == 3 && jugador2 == 3) {
                    System.out.println("empate");
                }
            }
            if (opcion == 2) {
                System.out.println("Ingrese el monto de su billetera: ");
                double billetera = leer.nextInt();

                while (billetera > 0) {
                    System.out.println("Ingrese el valor de la factura: ");
                    int factura = leer.nextInt();
                    System.out.println("Desea dividir la factura? presione 1 si asi lo desea. ");
                    int division_factura = leer.nextInt();
                    if (division_factura == 1) {
                        System.out.println("escriba el numero de amigos con los que divira la factura: ");
                        int amigos = leer.nextInt();
                        double division_personas = factura / amigos;
                        System.out.println("Desea agregar propina?: ");
                        int propina = leer.nextInt();
                        double divicion_personas_propina = (factura / amigos) + propina;
                        billetera = (billetera - ((factura / amigos) + propina));
                        System.out.println(" Su billetera queda en: " + billetera);

                    } else {
                        System.out.println("error.Ingrese la opcion correcta ");
                        System.out.println("Desea agregar propina? presione 1 si asi lo desea.: ");
                        int propina = leer.nextInt();
                    }
                    if (billetera < 0) {
                        billetera = 0;
                        System.out.println("Se quedo sin dinero. Tendra que lavar platos");
                    }

                    // factura / amigos 
                    // (factura / amigos)+ propina 
                    // billetera-((factura / amigos)+ propina)
                }
            }
            if (opcion == 3) {
                int numero;
                int contador = 1;
                int pares = 0;
                int impares = 0;
                int contador_pares = 0;
                int contador_impares = 0;
                double suma_numeros = 0;
                while (contador <= 20) {
                    System.out.println("Ingrese un numero: ");
                    numero = leer.nextInt();
                    if (numero < 0) {
                        System.out.println("Ingrese un numero mayor de 0");
                    } else {
                        if (numero % 2 == 0) {
                            suma_numeros = suma_numeros + numero;
                            pares = pares + numero;
                            contador_pares = contador_pares + 1;
                        } else {
                            suma_numeros = suma_numeros + numero;
                            impares = impares + numero;
                            contador_impares = contador_impares + 1;
                        }

                        contador++;
                    }
                }
                double promedio = suma_numeros / 20;
                System.out.println("Total de numeros pares: " + contador_pares);
                System.out.println("Total de numeros impares: " + contador_impares);
                System.out.println("La suma de todos los numeros es de: " + suma_numeros);
                System.out.println("El promedio de los numeros es de: " + promedio);

            }
            if (opcion == 4) {
                System.out.println(" Ha salido del sistema. Gracias. ");
                resp = 'n';
            }

        }

    }

}
