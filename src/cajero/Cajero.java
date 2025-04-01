 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero;

import java.util.Scanner;

/**
 *
 * @author pc-linx
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Otrovalor = 2;
        int claveingresada;
        int menu = 0;
        int saldo = 20000;
        int tarjeta = 0;
        int claveantigua = 1;
        int nuevaclave = 3;
        int confirmarclave;
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("1.retiro con tarjeta\n2.cambio de clave\n3.salir");//un prompt se usa para mostrar un dialogo que solicita el usario para introducir un texto//
            menu = teclado.nextInt();

            if (menu == 1) {
                System.out.println("1. 20.000\n2. 30.000\n3. 50.000\n4. 10.000\n5. 100.000\n6. Otro valor\n7cancelar");
                tarjeta = teclado.nextInt();
                if (tarjeta == 1) {
                    System.out.println("ingresa la clave");
                    claveingresada = teclado.nextInt();
                    if (claveingresada == 1) {
                        System.out.println("retire su dinero " + saldo); // un alert se usa para mostrar un mensaje en una ventana//
                    } else {
                        System.out.println("clave incorrecta");
                    }

                } else if (tarjeta == 2) {
                    System.out.println("ingresa la clave");
                    claveingresada = teclado.nextInt();
                    if (claveingresada == 1) {
                        System.out.println("retire su dinero " + saldo);
                    } else {
                        System.out.println("clave incorrecta");
                    }
                } else if (tarjeta == 3) {
                    System.out.println("ingresa la clave");
                    claveingresada = teclado.nextInt();
                    if (claveingresada == 1) {
                        System.out.println("retire su dinero " + saldo);
                    } else {
                        System.out.println("clave incorrecta");
                    }
                } else if (tarjeta == 4) {
                    System.out.println("ingresa la clave");
                    claveingresada = teclado.nextInt();
                    if (claveingresada == 1) {
                        System.out.println("retire su dinero " + saldo);
                    } else {
                        System.out.println("clave incorrecta");
                    }
                } else if (tarjeta == 5) {
                    System.out.println("ingresa la clave");
                    claveingresada = teclado.nextInt();
                    if (claveingresada == 1) {
                        System.out.println("retire su dinero " + saldo);
                    } else {
                        System.out.println("clave incorrecta");
                    }
                } else if (tarjeta == 6) {
                    System.out.println("ingresa el monto");
                    Otrovalor = teclado.nextInt();
                    System.out.println("ingresa la clave");
                    claveingresada = teclado.nextInt();
                    if (claveingresada == 1) {
                        System.out.println("retire su dinero " + Otrovalor);
                    } else {
                        System.out.println("clave incorrecta");
                    }

                } else if (tarjeta == 7) {
                    System.out.println("cancelar");
                }
            } else if (menu == 2) {
                System.out.println("clave anterior");
                claveantigua = teclado.nextInt();
                if (claveantigua == 1) {
                    System.out.println("nueva clave " + 3);
                } else {
                    System.out.println("confirmar clave");
                }
            } else if (menu == 3) {
                System.out.println("Gracias");
            } else {
                System.out.println("Opcion no valida");
            }
        }

    }

}
