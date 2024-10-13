
import java.util.Scanner;

public class Menu {

    static int[] arreglo;

    public void inicio() {
        
        Metodo ordenamiento = new Metodo();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int option;

        System.out.println("MENU:");

        do{
            System.out.println("Menu principal");
            System.out.println("1. Ingrese un arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("0. Salir");
            option = scanner.nextInt();

            switch(option) {
                case 1 :
                    ingresarArreglo(scanner);
                    break;
                case 2 :
                    if(arreglo != null){
                        
                        int opcion;
                        do { 
                            System.out.println("Escoja un metodo de Ordenamiento");
                            System.out.println("1. Metodo Burbuja");
                            System.out.println("2. Metodo de Seleccion");
                            System.out.println("3. Metodo de Insercion");
                            System.out.println("4. Metodo Burbuja Mejorado");
                            System.out.println("5. Volver al Menu Principal");
                            opcion = scanner2.nextInt();
                            switch(opcion) {
                                case 1 : 
                                ordenamiento.burbujaNormal(arreglo);
                                ordenamiento.burbujaOrdenado(arreglo);
                                case 2 :
                                    System.out.println("Metodeo de Seleccion");
                                case 3 :
                                    System.out.println("Metodo de Insercion");
                                case 4 :
                                    System.out.println("Metodo Burbuja Mejorado");
                                    
                            }

                        } while (opcion == 5);
                        scanner2.close();
                        
                    }
                    else{
                        System.out.println("Primero debe ingresar un arreglo.");
                    }
                    break;
                    case 0 :
                        System.out.println("Cerrando...");
                        break;
                    default :
                        System.out.println("Opcion no valida.");
            }

        }while(option != 0 );
        scanner.close();
        
    }
    public static void ingresarArreglo(Scanner scanner) {
        System.out.println("Ingrese el tamano del arreglo: ");
        int tamanio = scanner.nextInt();
        arreglo = new  int[tamanio];

        for(int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el valor para " + (i+1) + ":");
            arreglo[i] = scanner.nextInt();
        }
    }
    
}
