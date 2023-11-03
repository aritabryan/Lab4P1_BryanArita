/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_bryanarita;

import java.util.Scanner;

public class Lab4P1_BryanArita {

    public static void main(String[] args) {

        Scanner duki = new Scanner(System.in);

        System.out.println("[1]Inversion especial");
        System.out.println("[2] Balanza de cadenas");
        System.out.println("[3] cifrado de mensajes");
        System.out.print("Ingrese la opcion: ");
        int opcion = duki.nextInt();

        while (opcion != 4) {
            switch (opcion) {

                case 1:
                    System.out.println("\nIngrese la cadena:");
                    duki.nextLine();
                    String cad = duki.nextLine();

                    String lol = "";
                    String invert = "";
                    if (cad.length() >= 5) {

                        for (int i = cad.length() - 1; i >= 0; i--) {
                            invert += cad.charAt(i);

                            if (cad.charAt(i) == ' ' || i == 0) {
                                if (i == 0) {
                                    lol = invert + lol;
                                } else {

                                    lol = " " + invert + lol;
                                }

                                invert = "";
                            }
                        }
                        System.out.println(lol);

                    } else {
                        System.out.println("Debe de tener al menos 5 caracteres en la cadena");
                    }

                    break;

                case 2:

                    System.out.print("Ingrese la cadena 1: ");
                    duki.nextLine();
                    String palabra = duki.nextLine();
                    int acum = 0;

                    for (int i = 0; i < palabra.length(); i++) {
                        char cod = palabra.charAt(i);
                        int num = cod;

                        acum += num;
                    }

                    System.out.print("Ingrese la cadena 2: ");
                    palabra = duki.nextLine();
                    int acum2 = 0;

                    for (int i = 0; i < palabra.length(); i++) {
                        char cod = palabra.charAt(i);
                        int num2 = cod;

                        acum2 += num2;
                    }
                    System.out.print("Ingrese la cadena 3: ");
                    palabra = duki.nextLine();
                    int acum3 = 0;

                    for (int i = 0; i < palabra.length(); i++) {
                        char cod = palabra.charAt(i);
                        int num3 = cod;

                        acum3 += num3;
                    }

                    System.out.println("Peso cadena 1: " + acum);
                    System.out.println("Peso cadena 2: " + acum2);
                    System.out.println("Peso cadena 3: " + acum3);

                    if (acum > acum2 && acum > acum3) {
                        System.out.println("La cadena 1 es la mas pesada");
                    } else if (acum2 > acum && acum2 > acum3) {
                        System.out.println("La cadena 2 es la mas pesada");
                    } else if (acum3 > acum && acum3 > acum2) {
                        System.out.println("La cadena 3 es la mas pesada");
                    }
                    break;

                case 3:

                    System.out.println("\nIngrese el mensaje que desea cifrar:");
                    duki.nextLine();
                    String msg = duki.nextLine();

                    String cif = "";

                    for (int i = 0; i < msg.length(); i++) {
                        int acumu = 0;
                        char cod = msg.charAt(i);
                        acumu += cod + 2;
                        cif += (char) acumu;
                    }
                    System.out.println("Mensaje cifrado: " + cif);
                    break;

                default:
                    System.out.println("****INGRESE SOLO UNA LAS OPCIONES MOSTRADAS****");

            }// fin del switch
            System.out.println("\n[1]Inversion especial");
            System.out.println("[2] Balanza de cadenas");
            System.out.println("[3] cifrado de mensajes");
            System.out.print("Ingrese la opcion: ");
            opcion = duki.nextInt();
        }// fin del while
    }//fin del main

}// fin de la clase
