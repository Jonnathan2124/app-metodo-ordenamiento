public class Metodo{
    

     public void burbujaNormal(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int n = arreglo.length;
        for (int i = 0; i < n -1; i++) {
             for (int j = 0 + 1; j < n-i-1; j++) {
                boolean condicion = ascendente ? arreglo[j] > arreglo[j+1] : arreglo[j] < arreglo[j=1];
                if (condicion) {
                     int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    }
                if (mostrarPasos){
                    imprimirArreglo(arreglo);

                    }   
                }
            }
            System.out.println("Arreglo ordenado");
            imprimirArreglo(arreglo);
        }

        public void seleccion(int[] arreglo, boolean ascendente, boolean mostraPasos){
            int n = arreglo.length;
            
            for(int i = 0; i< n-1; i++){
                int indiceExtremo = i;
                for(int j = i+1; j<n; j++){
                    boolean condicion = ascendente ? arreglo[j] < arreglo[indiceExtremo] : arreglo[j] > arreglo[indiceExtremo];

                    if(condicion){
                        indiceExtremo = j;

                    }

                }
                int temp = arreglo[indiceExtremo];
                arreglo[indiceExtremo] = arreglo[i];
                arreglo[i] = temp;

                if(mostraPasos){
                    imprimirArreglo(arreglo);
                }
            }
            System.out.println("Arreglo Ordenado:");
            imprimirArreglo(arreglo);
        }

        public void insercion (int[] arreglo, boolean ascendente, boolean mostrarPasos){
            int n = arreglo.length;

            for(int i = 1; i < n; ++i){
                int clave = arreglo[i];
                int j = i -1;

                 while(j >= 0 && (ascendente ? arreglo[j] > clave : arreglo[j] < clave)){
                    arreglo[j =1] = arreglo[j];
                    j = j-1;                    
                 }
                 arreglo[j + 1] = clave;
                 if(mostrarPasos){
                    imprimirArreglo(arreglo);
                 }
            }
            System.out.println("Arreglo ordenado");
            imprimirArreglo(arreglo);
        }

        public void burbujaMejorado(int[] arreglo, boolean ascendente, boolean mostrarPasos){
            int n = arreglo.length;
            boolean intercambio;

            for(int i = 0; i < n-1; i++){
                intercambio = false;
                for(int j = 0; j < n-i-1; j++){
                    boolean condicion = ascendente ? arreglo[j] > arreglo[j+1] : arreglo[j] < arreglo[j+1];
                    
                    if(condicion){
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = temp;
                        intercambio = true; 
                    }

                    if(mostrarPasos){
                        imprimirArreglo(arreglo);
                    }
                }
                if(!intercambio)
                break;
            }
            System.out.println("Arreglo ordenado: ");
            imprimirArreglo(arreglo);
        }

        public void imprimirArreglo(int[] arreglo){
            for(int i : arreglo){
                System.out.println(i + " ");

            }
            System.out.println();
        }

 }