public class SortBubble {

    int comparaciones = 0;
    int cambios = 0;

    public SortBubble() {
        //System.out.println("Se creó mi clase BubbleSort\n");
    }

    public void sortBurbuja(int[] numeros, boolean ascendente, boolean pasos) {
        int len = numeros.length;
        int aux;

        for (int i = 0; i < len - 1; i++) {
            boolean hayCambio = false; // swapped
            if (pasos){
                System.out.println("i: " + i);
            }
            for (int j = 0; j < len - (i + 1); j++) {
                comparaciones++;
                if (pasos)
                    System.out.println("Compara numeros[" + j + "]: " + numeros[j] + " con numeros[" + (j + 1) + "]: " + numeros[j + 1]);
                if ((ascendente && numeros[j] > numeros[j + 1]) || (!ascendente && numeros[j] < numeros[j + 1])) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    hayCambio = true;
                    cambios++;
                    if (pasos)
                        printArray(numeros);
                    if (pasos)
                        System.out.println("Intercambia numeros[" + j + "] con numeros[" + (j + 1) + "]");
                }
            }
            if (pasos){
                System.out.println("Estado actual");
                printArray(numeros);
            }
            if (!hayCambio)
                break;
        }
    }

    public void printArray(int[] numeros) {
        int len = numeros.length;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                System.out.print("[" + numeros[i] + ",");
            } else if (i == len - 1) {
                System.out.println(numeros[i] + "]");
            } else {
                System.out.print(numeros[i] + ",");
            }
        }
    }
}
