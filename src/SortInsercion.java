public class SortInsercion {
    int comparaciones = 0;
    int cambios = 0;

    public SortInsercion(){
        //System.out.println("Se creó mi clase SortInsercion\n");
    }

    public void sortInsertion(int[] numeros, boolean ascendente, boolean pasos){
        int aux, j;
        int len = numeros.length;
        for(int i=1; i<len; i++)
        {
            aux=numeros[i];
            j=i-1;
            if (pasos){
                System.out.println("i: " + i + ", j: " + j + ", aux: "+ aux);
            }
            while(j>=0 && ((ascendente && aux < numeros[j]) || (!ascendente && aux > numeros[j])))
            {
                comparaciones++;
                if (pasos)
                    System.out.println("Compara aux: " + aux + " con numeros["+ j +"]: " + numeros[j]);

                numeros[j+1]=numeros[j];
                cambios++;
                if (pasos)
                    printArray(numeros);
                j--;
                if (pasos)
                    System.out.println("Mueve numeros[" + (j + 1) + "] a numeros[" + (j + 2) + "]");
            }
            numeros[j+1]=aux;
            if (pasos){
                System.out.println("Inserta aux: "+ aux + " en la posicion " + (j+1));
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
