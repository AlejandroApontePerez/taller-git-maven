package co.edu.icesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "! Bienvenido al taller de Git.");
        System.out.println("¡Hasta luego, " + nombre + "!");
    }
}