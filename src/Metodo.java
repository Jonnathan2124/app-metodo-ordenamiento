public class Metodo{
    

     public int[] burbujaNormal(int[] arreglo) {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio; i++) {
             for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] > arreglo[j]) {
                     int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    }
                }
            }
            return arreglo;
        }
    
     public void burbujaOrdenado(int[] arreglo) {
        for (int elemento : arreglo) {
             System.out.print(elemento + " ");
            }
        }

 }