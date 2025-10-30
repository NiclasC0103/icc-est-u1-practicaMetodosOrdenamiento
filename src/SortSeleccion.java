public class SortSeleccion {
    int comparaciones = 0;
    int cambios = 0;

    public SortSeleccion(){
        //System.out.println("Se creó mi clase SortSeleccion\n");
    }

    public void sortSelection(int[] numeros, boolean ascendente, boolean pasos) {
        int len = numeros.length;
        int aux;
        for (int i = 0; i < len; i++) {
            int ind = i;
            if (pasos){
                System.out.println("i: " + i + ", ind: " + ind);
            }
            for (int j = i + 1; j < len; j++) {
                comparaciones++;
                if (pasos)
                    System.out.println("Compara numeros[" + j + "]: " + numeros[j] + " con numeros[" + ind + "]: " + numeros[ind]);
                if ((ascendente && numeros[j] < numeros[ind]) || (!ascendente && numeros[j] > numeros[ind])) {
                    ind = j;
                    if (pasos)
                        System.out.println("Nuevo índice mínimo/máximo encontrado: ind = " + ind);
                }
            }
            if (i != ind) {
                aux = numeros[ind];
                numeros[ind] = numeros[i];
                numeros[i] = aux;
                cambios++;
                if (pasos) {
                    System.out.println("Intercambia numeros[" + i + "] con numeros[" + ind + "]");
                    printArray(numeros);
                }
            }
            if (pasos) {
                System.out.println("Estado actual");
                printArray(numeros);
            }
        }
    }

    public void printArray(int[] numeros){
        int len = numeros.length;
        for(int i=0; i<len; i++)
        {
            if (i==0) {
                System.out.print("["+numeros[i]+",");
            } else if(i==len-1) {
                System.out.println(numeros[i]+"]");
            } else {
                System.out.print(numeros[i]+",");
            }
        }
    }
}
