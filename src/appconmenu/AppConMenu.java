/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appconmenu;

/**
 *
 * @author Sala de Sistemas
 */

        import java.util.Scanner;

public class AppConMenu {
    static double[] listaNumeros = new double[10];
    static int[][] tablaNumeros = new int[4][4];
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int eleccion;

        mostrarBienvenida();

        do {
            desplegarMenu();
            System.out.print("Ingresa tu elección: ");
            eleccion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (eleccion) {
                case 1:
                    areaDelCirculo();
                    break;
                case 2:
                    llenarArray();
                    break;
                case 3:
                    mostrarArray();
                    break;
                case 4:
                    verDatoArray();
                    break;
                case 5:
                    llenarMatriz();
                    break;
                case 6:
                    mostrarMatriz();
                    break;
                case 7:
                    verDatoMatriz();
                    break;
                case 8:
                    System.out.println("Cerrando programa... ¡Gracias por usarlo!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intenta otra vez.");
            }
            System.out.println();
        } while (eleccion != 8);
    }

    static void mostrarBienvenida() {
        System.out.println("******************************************");
        System.out.println("**   Bienvenido a la aplicación JAVA    **");
        System.out.println("******************************************");
    }

    static void desplegarMenu() {
        System.out.println("\n========= MENÚ DE OPCIONES =========");
        System.out.println("1. Calcular Área de un Círculo");
        System.out.println("2. Cargar Datos en un Arreglo");
        System.out.println("3. Ver Todos los Datos del Arreglo");
        System.out.println("4. Ver Dato Específico del Arreglo");
        System.out.println("5. Cargar Datos en una Matriz");
        System.out.println("6. Ver Todos los Datos de la Matriz");
        System.out.println("7. Ver Dato Específico de la Matriz");
        System.out.println("8. Salir");
    }

    static void areaDelCirculo() {
        System.out.print("Introduce el radio: ");
        double r = entrada.nextDouble();
        double resultado = Math.PI * r * r;
        System.out.printf("Área calculada: %.3f\n", resultado);
    }

    static void llenarArray() {
        System.out.println("Cargando datos en el arreglo...");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print("Valor para posición [" + i + "]: ");
            listaNumeros[i] = entrada.nextDouble();
        }
    }

    static void mostrarArray() {
        System.out.println("Contenido del arreglo:");
        int index = 0;
        for (double val : listaNumeros) {
            System.out.println("Índice " + index + ": " + val);
            index++;
        }
    }

    static void verDatoArray() {
        System.out.print("¿Qué índice quieres ver? (0-9): ");
        int pos = entrada.nextInt();
        if (pos >= 0 && pos < listaNumeros.length) {
            System.out.println("Valor en [" + pos + "]: " + listaNumeros[pos]);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    static void llenarMatriz() {
        System.out.println("Ingresando valores en la matriz:");
        for (int f = 0; f < tablaNumeros.length; f++) {
            for (int c = 0; c < tablaNumeros[f].length; c++) {
                System.out.print("Valor en [" + f + "][" + c + "]: ");
                tablaNumeros[f][c] = entrada.nextInt();
            }
        }
    }

    static void mostrarMatriz() {
        System.out.println("Mostrando la matriz completa:");
        for (int[] fila : tablaNumeros) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    static void verDatoMatriz() {
        System.out.print("Fila (0-3): ");
        int f = entrada.nextInt();
        System.out.print("Columna (0-3): ");
        int c = entrada.nextInt();
        if (f >= 0 && f < 4 && c >= 0 && c < 4) {
            System.out.println("Valor en [" + f + "][" + c + "]: " + tablaNumeros[f][c]);
        } else {
            System.out.println("Posición fuera del límite.");
        }
    }
}
    
    
