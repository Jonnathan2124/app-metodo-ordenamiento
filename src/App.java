
import java.util.Scanner;

public class App {

    static int[] arreglo;

    public static void main(String[] args) throws Exception {
        
        App app = new App();
        app.inicio();
    }
    public void inicio() {
        
        Metodo ordenamiento = new Metodo();
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("MENÚ:");

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Ingrese un arreglo");
            System.out.println("2. Ordenar Arreglo");
            System.out.println("0. Salir");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    ingresarArreglo(scanner);
                    break;
                case 2:
                    if(arreglo != null) {
                        ordenarArreglo(scanner, ordenamiento);
                    } else {
                        System.out.println("Primero debe ingresar un arreglo.");
                    }
                    break;
                case 0:
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while(option != 0);
        
        scanner.close();
    }

    public static void ingresarArreglo(Scanner scanner) {
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamanio = scanner.nextInt();
        arreglo = new int[tamanio];

        for(int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el valor para el elemento " + (i+1) + ":");
            arreglo[i] = scanner.nextInt();
        }
    }

    public static void ordenarArreglo(Scanner scanner, Metodo ordenamiento) {
        int opcion;

        do {
            System.out.println("Escoja un metodo de ordenamiento");
            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Metodo Seleccion");
            System.out.println("3. Metodo Insercion");
            System.out.println("4. Metodo Burbuja Mejorado");
            System.out.println("0. Regresar al menu principal");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                
                System.out.println("Escoja el tipo de orden:");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                int orden = scanner.nextInt();

                
                System.out.println("Quiere ver cada paso?");
                System.out.println("1. Si");
                System.out.println("2. No");
                int mostrarPasos = scanner.nextInt();

                
                switch(opcion) {
                    case 1:
                        System.out.println("Metodo Burbuja:");
                        ordenamiento.burbujaNormal(arreglo, orden == 1, mostrarPasos == 1);
                        break;
                    case 2:
                        System.out.println("Metodo de Seleccion:");
                        ordenamiento.seleccion(arreglo, orden == 1, mostrarPasos == 1);
                        break;
                    case 3:
                        System.out.println("Metodo de Insercion:");
                        ordenamiento.insercion(arreglo, orden == 1, mostrarPasos == 1);
                        break;
                    case 4:
                        System.out.println("Metodo Burbuja Mejorado:");
                        ordenamiento.burbujaMejorado(arreglo, orden == 1, mostrarPasos == 1);
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while(opcion != 0);
    }
}

