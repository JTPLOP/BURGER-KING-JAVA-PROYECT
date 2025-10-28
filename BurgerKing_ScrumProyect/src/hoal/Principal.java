package hoal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean completado = false;

        while (!completado) {
            System.out.println("===================================");
            System.out.println("🍔 BIENVENIDO A BURGER GAMES 🍔");
            System.out.println("===================================");
            System.out.println("Te despiertas en un restaurante vacío...");
            System.out.println("Una voz misteriosa dice: \"Para escapar, debes preparar la hamburguesa perfecta.\"");
            System.out.println("¿Qué ingrediente pones primero?");
            System.out.println("Opciones: pan / carne / lechuga / queso");
            System.out.print("> ");

            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("pan")) {
                System.out.println("\nCorrecto... el pan es la base de todo.");
                System.out.println("Ahora el segundo paso...");
                System.out.println("¿Qué viene después?");
                System.out.println("Opciones: carne / tomate / ketchup");
                System.out.print("> ");
                String paso2 = sc.nextLine().toLowerCase();

                if (paso2.equals("carne")) {
                    System.out.println("\n🥩 Perfecto, la carne jugosa está lista.");
                    System.out.println("Una luz se enciende y aparece una puerta...");
                    System.out.println("✨ ¡Has superado la sección de Burger Games! ✨");
                    completado = true;
                } else {
                    System.out.println("\n❌ Fallaste... esa no era la combinación correcta.");
                    System.out.println("La hamburguesa se quema y todo se reinicia...\n");
                }

            } else {
                System.out.println("\n❌ Error... sin el pan no hay hamburguesa.");
                System.out.println("Vuelves al inicio del Burger Games...\n");
            }
        }

        System.out.println("\n🏁 Fin del mini Undertale. Gracias por jugar.");
        sc.close();
    }
}
